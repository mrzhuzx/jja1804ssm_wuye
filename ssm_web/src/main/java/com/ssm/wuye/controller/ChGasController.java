package com.ssm.wuye.controller;

import com.ssm.wuye.domain.ChElectricMeter;
import com.ssm.wuye.domain.ChGasMeter;
import com.ssm.wuye.service.ChElectricSercice;
import com.ssm.wuye.service.ChGasService;
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
@RequestMapping("gas")
public class ChGasController {
    @Resource
    ChGasService chGasService;

    /**
     * 查询全部燃气
     * @return
     */
    @RequestMapping("searchAll")
    public ModelAndView searchAll(){
        ModelAndView view=new ModelAndView("");
        List<ChGasMeter> meterList = chGasService.selectByExample(null);
        view.addObject("meterList",meterList);
        return view;
    }
}
