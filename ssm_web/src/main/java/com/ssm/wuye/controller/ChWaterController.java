package com.ssm.wuye.controller;


import com.ssm.wuye.domain.ChWaterMeter;
import com.ssm.wuye.domain.ChWaterMeterExample;

import com.ssm.wuye.domain.MyHouse;
import com.ssm.wuye.service.ChWaterService;
import com.ssm.wuye.service.MyHouseService;
import com.ssm.wuye.vo.WaterAndOwer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * time：2019/4/27--16:21
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Controller
@RequestMapping("water")
public class ChWaterController {
    @Resource
    ChWaterService chWaterService;
    @Resource
    MyHouseService myHouseService;

    /**
     * 查询全部水费
     * @return
     */
    @RequestMapping("searchAll")
    public ModelAndView searchAll(){
        ModelAndView view=new ModelAndView("pages/huoduan/shoufei/waterAll");
        List<WaterAndOwer> waterAndOwerList = chWaterService.selectAll();

        view.addObject("waterAndOwerList",waterAndOwerList);
        return view;
    }

    @RequestMapping("searchOne")
    public ModelAndView searchOne(@RequestParam Integer waterid){
        ModelAndView view=new ModelAndView("pages/huoduan/shoufei/waterUpdate");
        ChWaterMeter chWaterMeter = chWaterService.selectByPrimaryKey(waterid);
        List<MyHouse> myHouseList = myHouseService.selectByExample(null);
        view.addObject("myHouseList",myHouseList);
        view.addObject("chWaterMeter",chWaterMeter);
        return view;
    }

    @RequestMapping("insertOne")
    public ModelAndView insertOne(@ModelAttribute ChWaterMeter chWaterMeter){
        ModelAndView view=new ModelAndView("redirect:/water/searchAll.do");
        chWaterMeter.setWnumber("water"+chWaterMeter.getHouseid());
        int i = chWaterService.insertSelective(chWaterMeter);
        if (i>=0){
            System.out.println(i+"添加成功！！");
        }else {
            System.out.println(i+"添加失败！！！");

        }
        return view;
    }
    @RequestMapping("updateOne")
    public ModelAndView updateOne(@ModelAttribute ChWaterMeter chWaterMeter){
        ModelAndView view=new ModelAndView("redirect:/water/searchAll.do");
        ChWaterMeterExample chWaterMeterExample=new ChWaterMeterExample();
        chWaterMeter.setWnumber("water"+chWaterMeter.getHouseid());
        chWaterMeterExample.createCriteria().andWateridEqualTo(chWaterMeter.getWaterid());
        int i = chWaterService.updateByExampleSelective(chWaterMeter, chWaterMeterExample);
        if (i>=0){
            System.out.println("修改成功！！");
        }else {
            System.out.println("修改失败！！！");

        }
        return  view;
    }

    @RequestMapping("deleteOne")
    public ModelAndView deleteOne(@RequestParam Integer waterid){
        ModelAndView view=new ModelAndView("redirect:/water/searchAll.do");
        int i = chWaterService.deleteByPrimaryKey(waterid);
        if (i>=0){
            System.out.println("删除成功！！！");

        }else {
            System.out.println("删除失败！！");

        }
        return view;
    }
}
