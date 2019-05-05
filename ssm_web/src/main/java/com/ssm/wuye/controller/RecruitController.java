package com.ssm.wuye.controller;

import com.ssm.wuye.domain.Recruit;
import com.ssm.wuye.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */


@Controller
@RequestMapping("recruit")
public class RecruitController {

    @Resource
    RecruitService recruitService;

    /**
     * 查询全部
     */
    @RequestMapping("research")
    public ModelAndView research() {
        ModelAndView m = new ModelAndView("pages/huoduan/recruit");
        List<Recruit> recruitList = recruitService.selectByExample(null);
        for ( Recruit recruit : recruitList) {
            System.out.println(recruit.toString());
        }
        m.addObject("recruitList",recruitList);
        return m;
    }

    /**
     * 增加一条数据
     *
     */
    @RequestMapping("resave")
    public ModelAndView resave(@ModelAttribute Recruit re ){
        ModelAndView m = new ModelAndView("redirect:/recruit/research.do");
        int i=recruitService.insertSelective(re);
        if(i==0){
            System.out.println("增加失败");
        }else {
            System.out.println("增加成功:"+i+"条数据");
        }

        return  m;
    }


    /**
     * 获取一条数据
     * @return
     */
    @RequestMapping("reone")
    public ModelAndView searchone(@RequestParam Integer recruitid ){
        ModelAndView m=new ModelAndView("pages/huoduan/recruitupdate");
        Recruit recruit = recruitService.selectByPrimaryKey(recruitid);
        m.addObject("recruit",recruit);
        System.out.println("获取到了一条数据-----------");
        return  m;
    }

    /**
     *根据主键ID修改
     * @return
     */
    @RequestMapping("reupdate")
    public ModelAndView reupdate(@ModelAttribute Recruit re){
        ModelAndView m=new ModelAndView("redirect:/recruit/research.do");
        int i=recruitService.updateByPrimaryKeySelective(re);
        if(i==0){
            System.out.println("修改失败");
        }else {
            System.out.println("修改成功:"+i+"条数据");
        }
        List<Recruit> recruitList = recruitService.selectByExample(null);
        m.addObject("recruitList",recruitList);
        return  m;
    }

    /**
     *根据主键ID删除
     * @return
     */
    @RequestMapping("redelete")
    public  ModelAndView redelete(@RequestParam Integer recruitid){
        ModelAndView m=new ModelAndView("redirect:/recruit/research.do");
        int i=recruitService.deleteByPrimaryKey(recruitid);
        if(i==0){
            System.out.println("删除失败");
        }else {
            System.out.println("删除成功:"+i+"条数据");
        }
        return m;
    }



}
