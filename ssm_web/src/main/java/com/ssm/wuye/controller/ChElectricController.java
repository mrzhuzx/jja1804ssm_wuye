package com.ssm.wuye.controller;

import com.ssm.wuye.domain.ChElectricMeter;
import com.ssm.wuye.domain.ChElectricMeterExample;
import com.ssm.wuye.service.ChElectricSercice;
import com.ssm.wuye.vo.ElectricAndOwer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
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
        ModelAndView view=new ModelAndView("pages/huoduan/shoufei/electricAdd");
        ChElectricMeter chElectricMeter=chElectricSercice.selectByPrimaryKey(electricid);
        view.addObject("chElectricMeter",chElectricMeter);
        return view;
    }

    @RequestMapping("insertOne")
    public ModelAndView insertOne(@ModelAttribute ChElectricMeter chElectricMeter){
        ModelAndView view=new ModelAndView("");
        int i = chElectricSercice.insertSelective(chElectricMeter);
        if (i>=0){
            System.out.println("添加失败！！");
        }else {
            System.out.println("添加成功！！！");

        }
        return view;
    }
    @RequestMapping("updateOne")
    public ModelAndView updateOne(@ModelAttribute ChElectricMeter chElectricMeter){
        ModelAndView view=new ModelAndView("");
        ChElectricMeterExample chElectricMeterExample=new ChElectricMeterExample();
        chElectricMeterExample.createCriteria().andElectricidEqualTo(chElectricMeter.getElectricid());
        int i = chElectricSercice.updateByExampleSelective(chElectricMeter, chElectricMeterExample);
        if (i>=0){
            System.out.println("修改失败！！");
        }else {
            System.out.println("修改成功！！！");

        }
        return  view;
    }

}
