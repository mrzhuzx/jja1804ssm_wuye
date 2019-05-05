package com.ssm.wuye.controller;
import com.ssm.wuye.domain.ComplainInfo;
import com.ssm.wuye.service.ComplainService;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\4\25 0025
 * version:
 */
@Controller
@RequestMapping("/complain")
public class ComplainController {
    @Resource
    ComplainService complainService;
    @RequestMapping("/findall")
    public ModelAndView search() {
        ModelAndView mv = new ModelAndView();
        List<ComplainInfo> complainInfolist = complainService.selectByExample(null);
        System.out.println("客户投诉表：" + complainInfolist.size());
        mv.addObject("complainInfolist", complainInfolist);
        System.out.println(complainInfolist.size());
        mv.setViewName("pages/huoduan/complain");
        return mv;
    }

    /**
     * 删除
     *
     * @param cid
     * @return
     */
    @RequestMapping("/delete")
    public ModelAndView delete(@RequestParam Integer cid) {
        System.out.println("进来了");
        ModelAndView mv = new ModelAndView();
        int i = complainService.deleteByPrimaryKey(cid);
        System.out.println("删除数据" + i + "条");
//        List<ComplainInfo> list = complainService.selectByExample(null);
//        mv.addObject("list",list);
        mv.setViewName("forward:/complain/findall.do");
        return mv;
    }

    /**
     * 修改
     *
     * @param
     * @return
     */
    @RequestMapping("/findone")
    public ModelAndView findone(@RequestParam Integer cid) {
        System.out.println("进来findone 了");
        ModelAndView mv = new ModelAndView();
        ComplainInfo com = complainService.selectByPrimaryKey(cid);
        List<ComplainInfo> list = complainService.selectByExample(null);
        mv.addObject("com", com);
        mv.setViewName("pages/huoduan/complainupdate");
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView update(@ModelAttribute ComplainInfo complainInfo) {
        System.out.println("进来update了");
        ModelAndView mv = new ModelAndView();
        int i = complainService.updateByPrimaryKeySelective(complainInfo);
        List<ComplainInfo> list = complainService.selectByExample(null);
        mv.addObject("list",list);
        mv.setViewName("forward:/complain/findall.do");
        return mv;

    }

    /**
     * 添加
     * @param complainInfo
     * @return
     */

    @RequestMapping("/save")
    public ModelAndView save(@ModelAttribute ComplainInfo complainInfo) {
        System.out.println("进来save了");
        ModelAndView mv = new ModelAndView();
        int i = complainService.insert(complainInfo);
        System.out.println("添加成功" + i + "条");
        List<ComplainInfo> list = complainService.selectByExample(null);
        mv.addObject(list);
        mv.setViewName("forward:/complain/findall.do");
        return mv;
    }

}
