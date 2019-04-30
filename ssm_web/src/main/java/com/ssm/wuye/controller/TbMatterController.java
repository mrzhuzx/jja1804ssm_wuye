package com.ssm.wuye.controller;

import com.ssm.wuye.domain.TbMatter;
import com.ssm.wuye.domain.TbMatterExample;
import com.ssm.wuye.service.TbMatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
@Controller
@RequestMapping("/fantai")
public class TbMatterController {
    @Autowired
    TbMatterService tbMatterService;

    @RequestMapping("/search")
    public ModelAndView search() {
        ModelAndView m = new ModelAndView("pages/huoduan/typhoon");
        TbMatterExample tbMatterExample = new TbMatterExample();
        List<TbMatter> tbMatterList = tbMatterService.selectByExample(tbMatterExample);
        m.addObject("tbMatterList", tbMatterList);
        return m;
    }

    @RequestMapping("add")
    public ModelAndView tametteradd(@ModelAttribute TbMatter tbMatter) {

        System.out.println(tbMatter.toString());
        ModelAndView m = new ModelAndView("forward:/fantai/search.do");
        int i = tbMatterService.insertSelective(tbMatter);
        if (i == 0) {
            System.out.println("增加失败");
        } else {
            System.out.println("增加成功:" + i + "条数据");
        }
        return m;
    }
@RequestMapping("/delete")
    public  ModelAndView delete(@ModelAttribute TbMatter tbMatter){
    ModelAndView m = new ModelAndView("forward:/fantai/search.do");
    int i = tbMatterService.updateByPrimaryKeySelective(tbMatter);
    if(i==0){
        System.out.println("修改失败");
    }else {
        System.out.println("修改成功:"+i+"条数据");
    }
    List<TbMatter> tbMatterList=tbMatterService.selectByExample(null);
    m.addObject("tbMatterList",tbMatterList);
       return m;
}
}