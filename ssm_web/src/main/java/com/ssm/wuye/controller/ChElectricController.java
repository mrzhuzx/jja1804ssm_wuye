package com.ssm.wuye.controller;

import com.ssm.wuye.domain.ChElectricMeter;
import com.ssm.wuye.domain.ChElectricMeterExample;
import com.ssm.wuye.domain.MyHouse;
import com.ssm.wuye.service.ChElectricSercice;
import com.ssm.wuye.service.MyHouseService;
import com.ssm.wuye.vo.ElectricAndOwer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.util.Date;
import java.util.List;

/**
 * time：2019/4/27--16:21
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Controller
@RequestMapping("ele")
public class ChElectricController {
    @Resource
    ChElectricSercice chElectricSercice;
    @Resource
    MyHouseService myHouseService;

    /**
     * 查询全部电费
     * @return
     */
    @RequestMapping("searchAll")
    public ModelAndView searchAll(){
        ModelAndView view=new ModelAndView("pages/huoduan/shoufei/electricAll");
        List<ElectricAndOwer> electricAndOwers = chElectricSercice.selectAll();
        System.out.println(electricAndOwers.toString()+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        view.addObject("electricAndOwers",electricAndOwers);
        return view;
    }
    @RequestMapping("searchOne")
    public ModelAndView searchOne(@RequestParam Integer electricid){
        ModelAndView view=new ModelAndView("pages/huoduan/shoufei/electricUpdate");
        ChElectricMeter chElectricMeter=chElectricSercice.selectByPrimaryKey(electricid);
        List<MyHouse> myHouseList = myHouseService.selectByExample(null);
        view.addObject("myHouseList",myHouseList);
        view.addObject("chElectricMeter",chElectricMeter);
        return view;
    }

    @RequestMapping("insertOne")
    public ModelAndView insertOne(@RequestParam Integer houseid, @RequestParam double electric, @RequestParam Date month){
        ModelAndView view=new ModelAndView("redirect:/ele/searchAll.do");
        ChElectricMeter chElectricMeter=new ChElectricMeter();
        chElectricMeter.setHouseid(houseid);
        chElectricMeter.setElectric(electric);
        chElectricMeter.setMonth(month);
        chElectricMeter.setEnumber("electric"+houseid);
        int i = chElectricSercice.insertSelective(chElectricMeter);
        if (i>=0){
            System.out.println("添加成功！！");
        }else {
            System.out.println("添加失败！！！");

        }
        return view;
    }
    @RequestMapping("updateOne")
    public ModelAndView updateOne(@ModelAttribute ChElectricMeter chElectricMeter){
        ModelAndView view=new ModelAndView("redirect:/ele/searchAll.do");
        ChElectricMeterExample chElectricMeterExample=new ChElectricMeterExample();
        chElectricMeterExample.createCriteria().andElectricidEqualTo(chElectricMeter.getElectricid());
        chElectricMeter.setEnumber("electric"+chElectricMeter.getHouseid());
        int i = chElectricSercice.updateByExampleSelective(chElectricMeter, chElectricMeterExample);
        if (i>=0){
            System.out.println("修改成功！！！");

        }else {
            System.out.println("修改失败！！");

        }
        return  view;
    }

    @RequestMapping("deleteOne")
    public ModelAndView deleteOne(@RequestParam Integer electricid){
        ModelAndView view=new ModelAndView("redirect:/ele/searchAll.do");
        int i = chElectricSercice.deleteByPrimaryKey(electricid);
        if (i>=0){
            System.out.println("删除成功！！！");

        }else {
            System.out.println("删除失败！！");

        }
        return view;
    }

}
