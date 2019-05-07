package com.ssm.wuye.controller;/*
 * desc:
 * author:tanghuaming
 * time:2019\5\5 0005
 */

import com.ssm.wuye.domain.PuGas;
import com.ssm.wuye.domain.PuWater;
import com.ssm.wuye.service.IGasService;
import com.ssm.wuye.service.IWaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/pugas")
public class PuGasController {
    @Autowired
    IGasService gasService;
    //查询全部产品----未分页
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<PuGas> electricList = gasService.findAll();
        System.out.println(electricList.toString());
        mv.addObject("electricList",electricList);
        mv.setViewName("pages/huoduan/pu_meter/gas-list");
        return mv;
    }

    //查询一条数据
    @RequestMapping("/findById.do")
    public ModelAndView findById(String id){
        ModelAndView mv = new ModelAndView();
        PuGas electrics=gasService.findById(id);
//        System.out.println(electrics.toString());
        mv.addObject("electrics",electrics);
        mv.setViewName("pages/huoduan/pu_meter/gas-up-datetable");
        return mv;

    }


    @RequestMapping("delete.do")
    public String delete(@RequestParam(name = "id") Integer id){

        gasService.delete(id);
        return "redirect:findAll.do";
    }

    @RequestMapping("/updata.do")
    public String updata(PuGas electric){

        System.out.println(electric.toString());
//        System.out.println("aaaaa---------");
        gasService.updata(electric);


        return "redirect:findAll.do";

    }
    @RequestMapping("/addpage.do")
    public ModelAndView addpage(){
        ModelAndView mv = new ModelAndView();
        PuGas electrics=gasService.findIdMax();
//        System.out.println(electrics.toString());
        mv.addObject("electrics",electrics);
        mv.setViewName("pages/huoduan/pu_meter/gas-add");
        return mv;

    }
    @RequestMapping("/add.do")
    public String add(PuGas electric){

        System.out.println(electric.toString());
        gasService.add(electric);


        return "redirect:findAll.do";

    }
}
