package com.ssm.wuye.controller;

import com.ssm.wuye.domain.RepairInfo;
import com.ssm.wuye.service.RepairService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\5\5 0005
 * version:
 */
@Controller
@RequestMapping("/repair")
public class RepairController {
    @Resource
    RepairService repairService;
    @RequestMapping("/findall")
    public ModelAndView findall(){
        ModelAndView mv = new ModelAndView();
        List<RepairInfo> repairInfos = repairService.selectByExample(null);
        System.out.println(repairInfos.size());
        mv.addObject("repairInfos",repairInfos);



        return null;
    }

}
