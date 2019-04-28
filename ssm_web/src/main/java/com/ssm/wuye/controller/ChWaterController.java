package com.ssm.wuye.controller;

import com.ssm.wuye.domain.ChGasMeter;
import com.ssm.wuye.domain.ChWaterMeter;
import com.ssm.wuye.service.ChGasService;
import com.ssm.wuye.service.ChWaterService;
import com.ssm.wuye.vo.WaterAndOwer;
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
@RequestMapping("water")
public class ChWaterController {
    @Resource
    ChWaterService chWaterService;

    /**
     * 查询全部水费
     * @return
     */
    @RequestMapping("searchAll")
    public ModelAndView searchAll(){
        ModelAndView view=new ModelAndView("");
        List<WaterAndOwer> waterAndOwerList = chWaterService.selectAll();
        view.addObject("waterAndOwerList",waterAndOwerList);
        return view;
    }
}
