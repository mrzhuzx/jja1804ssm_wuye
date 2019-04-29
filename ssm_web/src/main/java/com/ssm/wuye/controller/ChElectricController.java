package com.ssm.wuye.controller;

import com.ssm.wuye.domain.ChElectricMeter;
import com.ssm.wuye.service.ChElectricSercice;
import com.ssm.wuye.vo.ElectricAndOwer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
