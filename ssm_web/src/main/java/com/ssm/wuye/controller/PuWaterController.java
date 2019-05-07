package com.ssm.wuye.controller;/*
 * desc:
 * author:tanghuaming
 * time:2019\5\5 0005
 */

import com.ssm.wuye.domain.PuElectric;
import com.ssm.wuye.domain.PuWater;
import com.ssm.wuye.service.IElectricService;
import com.ssm.wuye.service.IWaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/puwater")
public class PuWaterController {
    @Autowired
    IWaterService waterService;
    //查询全部产品----未分页
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<PuWater> electricList = waterService.findAll();
        System.out.println(electricList.toString());
        mv.addObject("electricList",electricList);
        mv.setViewName("pages/huoduan/pu_meter/water-list");
        return mv;
    }

    //查询一条数据
    @RequestMapping("/findById.do")
    public ModelAndView findById(String id){
        ModelAndView mv = new ModelAndView();
        PuWater electrics=waterService.findById(id);
//        System.out.println(electrics.toString());
        mv.addObject("electrics",electrics);
        mv.setViewName("pages/huoduan/pu_meter/water-up-datetable");
        return mv;

    }


    @RequestMapping("delete.do")
    public String delete(@RequestParam(name = "id") Integer id){

        waterService.delete(id);
        return "redirect:findAll.do";
    }

    @RequestMapping("/updata.do")
    public String updata(PuWater electric){

        System.out.println(electric.toString());
//        System.out.println("aaaaa---------");
        waterService.updata(electric);


        return "redirect:findAll.do";

    }
    @RequestMapping("/addpage.do")
    public ModelAndView addpage(){
        ModelAndView mv = new ModelAndView();
        PuWater electrics=waterService.findIdMax();
//        System.out.println(electrics.toString());
        mv.addObject("electrics",electrics);
        mv.setViewName("pages/huoduan/pu_meter/water-add");
        return mv;

    }
    @RequestMapping("/add.do")
    public String add(PuWater electric){

        System.out.println(electric.toString());
        waterService.add(electric);


        return "redirect:findAll.do";

    }
}
