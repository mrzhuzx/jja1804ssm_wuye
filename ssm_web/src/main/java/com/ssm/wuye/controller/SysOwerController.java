package com.ssm.wuye.controller;


import com.ssm.wuye.domain.SysOwer;
import com.ssm.wuye.domain.SysOwerExample;
import com.ssm.wuye.service.SysOwerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
@RequestMapping("/ower")
public class SysOwerController {
    @Autowired
    SysOwerService sysOwerService;

    @RequestMapping("login")
    public ModelAndView selectByExample(@RequestParam String account, @RequestParam String phone ) {
        ModelAndView m =new  ModelAndView("pages/gitqian/index");
        SysOwerExample sysOwerExample = new SysOwerExample();
        sysOwerExample.createCriteria().andOlaccountEqualTo(account);
        sysOwerExample.createCriteria().andOlphoneEqualTo(phone);
        List<SysOwer> sysOwerList = sysOwerService.selectByExample(sysOwerExample);
        for (SysOwer ow : sysOwerList) {
            System.out.println(ow.toString());
        }
        m.addObject("ower",sysOwerList);
        return  m;
    }



}
