package com.ssm.wuye.controller;

import com.ssm.wuye.domain.TbCharge;
import com.ssm.wuye.domain.TbChargeExample;
import com.ssm.wuye.service.TbChargeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * time：2019/4/27--16:21
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Controller
@RequestMapping("tbch")
public class TbChargeController {
    @Resource
    TbChargeService tbChargeService;

    @RequestMapping("searchAll")
    public String searchAll(Model model){
        TbChargeExample tbChargeExample=new TbChargeExample();
        TbChargeExample tbChargeExample1=new TbChargeExample();
        tbChargeExample.createCriteria().andChargenameEqualTo("水费");
        tbChargeExample1.createCriteria().andChargenameEqualTo("电费");
        List<TbCharge> tbCharges = tbChargeService.selectByExample(tbChargeExample);
        List<TbCharge> tbCharges1 = tbChargeService.selectByExample(tbChargeExample1);
        if (tbCharges.size()>=tbCharges1.size()){
            TbChargeExample tbChargeExample2=new TbChargeExample();
            tbChargeExample2.createCriteria().andChargenameEqualTo("燃气费");
            List<TbCharge> tbCharges2 = tbChargeService.selectByExample(tbChargeExample2);
            if (tbCharges.size()>=tbCharges2.size()){
                model.addAttribute("tbCharges",tbCharges);
                System.out.println("1");
            }else {
                TbChargeExample tbChargeExample3=new TbChargeExample();
                tbChargeExample3.createCriteria().andChargenameEqualTo("物业费");
                List<TbCharge> tbCharges3 = tbChargeService.selectByExample(tbChargeExample3);
                if(tbCharges2.size()>=tbCharges3.size()){
                    model.addAttribute("tbCharges",tbChargeExample2);
                    System.out.println("2");
                }else {
                    model.addAttribute("tbCharges",tbChargeExample3);
                    System.out.println("3");
                }

            }
        }else {
            TbChargeExample tbChargeExample2=new TbChargeExample();
            tbChargeExample.createCriteria().andChargenameEqualTo("物业费");
            List<TbCharge> tbCharges2 = tbChargeService.selectByExample(tbChargeExample2);
            if (tbCharges1.size()>=tbCharges2.size()){
                model.addAttribute("tbCharges",tbCharges1);
                System.out.println("4");
            }else {
                TbChargeExample tbChargeExample3=new TbChargeExample();
                tbChargeExample3.createCriteria().andChargenameEqualTo("燃气费");
                List<TbCharge> tbCharges3 = tbChargeService.selectByExample(tbChargeExample3);
                if(tbCharges2.size()>=tbCharges3.size()){
                    model.addAttribute("tbCharges",tbChargeExample2);
                    System.out.println("5");
                }else {
                    model.addAttribute("tbCharges",tbChargeExample3);
                    System.out.println("6");
                }
            }
        }
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String createdate = sdf.format(date);
        TbChargeExample tbChargeExamples=new TbChargeExample();
        tbChargeExamples.createCriteria().andChargeyearEqualTo(createdate);
        List<TbCharge> tbChargess = tbChargeService.selectByExample(tbChargeExamples);
        model.addAttribute("tbChargessearch",tbChargess);
        return "pages/huoduan/shoufei/tbChargeAll";
    }
}
