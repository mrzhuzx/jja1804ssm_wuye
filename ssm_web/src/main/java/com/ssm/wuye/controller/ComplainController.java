package com.ssm.wuye.controller;


import com.ssm.wuye.domain.ComplainInfo;
import com.ssm.wuye.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
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

    @Resource
    ComplainService complainService;
    @RequestMapping("/findAll")
    public ModelAndView search() {
        ModelAndView mv = new ModelAndView();
        List<ComplainInfo> complainInfolist = complainService.selectByExample(null);
        System.out.println("客户投诉表："+complainInfolist.size());

        mv.addObject("complainInfolist", complainInfolist);
        System.out.println(complainInfolist.size());
        mv.setViewName("pages/huoduan/complain.jsp");
        return mv;
    }
}
