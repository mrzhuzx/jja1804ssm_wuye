package com.ssm.wuye.controller;/*
 * desc:
 * author:tanghuaming
 * time:2019\4\25 0025
 */

import com.ssm.wuye.domain.Electric;
import com.ssm.wuye.service.IElectricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/electric")
public class ElectricController {
    @Autowired
    IElectricService electricService;
        //查询全部产品----未分页
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Electric> electricList = electricService.findAll();
        System.out.println(electricList.toString());
        mv.addObject("electricList",electricList);
        mv.setViewName("electrics-list");
        return mv;
    }

    //查询一条数据
    @RequestMapping("/findById.do")
    public ModelAndView findById(String id){
        ModelAndView mv = new ModelAndView();
        Electric electrics=electricService.findById(id);
//        System.out.println(electrics.toString());
        mv.addObject("electrics",electrics);
        mv.setViewName("electrics-up-datetable");
        return mv;

    }


    @RequestMapping("delete.do")
    public String delete(@RequestParam(name = "id") Integer id){

        electricService.delete(id);
        return "redirect:findAll.do";
    }

    @RequestMapping("/updata.do")
    public String updata(Electric electric){

        System.out.println(electric.toString());
        System.out.println("aaaaa---------");
        electricService.updata(electric);


        return "redirect:findAll.do";

    }
    @RequestMapping("/add.do")
    public String add(Electric electric){

        System.out.println(electric.toString());
        System.out.println("aaaaa---------");
        electricService.add(electric);
        List<Integer> allhouseid=electricService.findAllhouseid();


        return "redirect:findAll.do";

    }
//    @RequestMapping("/add.do")
//    public ModelAndView add(Electric electric){
//        ModelAndView mv = new ModelAndView();
//        System.out.println(electric.toString());
//        System.out.println("aaaaa---------");
//        electricService.add(electric);
//        List<Integer> allhouseid=electricService.findAllhouseid();
//        System.out.println(allhouseid.toString());
//        mv.addObject("allhouseid",allhouseid);
//        mv.setViewName("redirect:findAll.do");
//        return mv;
//
//    }

}
