package com.ssm.wuye.controller;


import com.ssm.wuye.domain.ComplainInfo;
import com.ssm.wuye.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\4\25 0025
 * version:
 */
@Controller
@RequestMapping("/complain")
public class ComplainController {

    @Autowired
    ComplainService complainService;
    @RequestMapping("/findAll.do")
    public ModelAndView search(){
        ModelAndView mv = new ModelAndView();
         List<ComplainInfo> complainInfolist =complainService.selectByExample(null);
         mv.addObject("complainInfolist",complainInfolist);
        mv.setViewName("pages/huoduan/assets/complain");

        return mv;
    }


}
