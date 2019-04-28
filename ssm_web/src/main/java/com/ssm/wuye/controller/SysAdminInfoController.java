package com.ssm.wuye.controller;

/*
 *desc: 安保模块
 *author:wjs
 *time:2019/4/26 0026
 *version:1.2.3
 */

import com.ssm.wuye.domain.SysAdminInfo;
import com.ssm.wuye.domain.SysAdminInfoExample;
import com.ssm.wuye.service.SysAdminInfoService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("ai")
public class SysAdminInfoController {

    @Resource
    SysAdminInfoService sysAdminInfoService;

    /**
     * 带条件分页查询
     * @return
     */
    @RequestMapping("infosearch")
    public ModelAndView search() {

        ModelAndView m = new ModelAndView("");
        SysAdminInfoExample sysAdminInfoExample = new SysAdminInfoExample();
        Integer pageNum = 1; //页码
        Integer Size = 10; //每页条数
        Integer Num = Size * (pageNum - 1);
        List<SysAdminInfo> sysAdminInfoList = sysAdminInfoService.selectByExampleWithRowbounds(sysAdminInfoExample, new RowBounds(Num, Size));
        for (SysAdminInfo sai : sysAdminInfoList) {
            System.out.println(sai.toString());
        }
        return m;
    }

    /**
     * 添加
     * @return
     */
    @RequestMapping("infosave")
    public ModelAndView save(@ModelAttribute SysAdminInfo sai) {

        ModelAndView m = new ModelAndView("");
        int i = sysAdminInfoService.insertSelective(sai);
        if (i == 0) {
            System.out.println("添加失败...........");
        } else {
            System.out.println("添加成功：" + i + "条数据");
        }
        SysAdminInfoExample sysAdminInfoExample=new SysAdminInfoExample();
        List<SysAdminInfo> sysAdminInfoList=sysAdminInfoService.selectByExample(sysAdminInfoExample);
        m.addObject("sysAdminInfoList",sysAdminInfoList);

        return m;
    }


}



























