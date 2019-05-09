package com.ssm.wuye.controller;

import com.ssm.wuye.domain.TbCharge;
import com.ssm.wuye.domain.TbChargeExample;
import com.ssm.wuye.service.TbChargeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String searchAll(Model model,@RequestParam String year){
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
            tbChargeExample2.createCriteria().andChargenameEqualTo("物业费");
            List<TbCharge> tbCharges2 = tbChargeService.selectByExample(tbChargeExample2);
            if (tbCharges1.size()>=tbCharges2.size()){
                model.addAttribute("tbCharges",tbCharges1);
                System.out.println("4");
            }else {
                TbChargeExample tbChargeExample3=new TbChargeExample();
                tbChargeExample3.createCriteria().andChargenameEqualTo("燃气费");
                List<TbCharge> tbCharges3 = tbChargeService.selectByExample(tbChargeExample3);
                if(tbCharges2.size()>=tbCharges3.size()){
                    System.out.println(tbCharges2.size());
                    model.addAttribute("tbCharges",tbCharges2);
                    System.out.println("5");
                }else {
                    model.addAttribute("tbCharges",tbCharges3);
                    System.out.println("6");
                }
            }
        }


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String createdate=year;
        if ("1".equals(year )){
            Date date = new Date();
            createdate = sdf.format(date);
        }

        TbChargeExample tbChargeExamples=new TbChargeExample();
        tbChargeExamples.createCriteria().andChargeyearEqualTo(createdate);
        List<TbCharge> tbChargess = tbChargeService.selectByExample(tbChargeExamples);
        model.addAttribute("tbChargessearch",tbChargess);
        model.addAttribute("createdate",createdate);
        return "pages/huoduan/shoufei/tbChargeAll";
    }
    @RequestMapping("tbChargeAdd")
    public String tbChargeAdd(Model model, @RequestParam String year,@RequestParam Double shui,@RequestParam Double dian,@RequestParam Double qi,@RequestParam Double wuye){


        TbCharge tbCharge=new TbCharge();
        TbCharge tbCharge1=new TbCharge();
        TbCharge tbCharge2=new TbCharge();
        TbCharge tbCharge3=new TbCharge();
        tbCharge.setChargeyear(year);
        tbCharge.setChargename("水费");
        tbCharge.setChargestandard(shui);
        tbCharge.setChargedescription(shui+"元/吨");

        tbCharge1.setChargeyear(year);
        tbCharge1.setChargename("电费");
        tbCharge1.setChargestandard(dian);
        tbCharge1.setChargedescription(dian+"元/度");

        tbCharge2.setChargeyear(year);
        tbCharge2.setChargename("燃气费");
        tbCharge2.setChargestandard(qi);
        tbCharge2.setChargedescription(qi+"元/立方");

        tbCharge3.setChargeyear(year);
        tbCharge3.setChargename("物业费");
        tbCharge3.setChargestandard(wuye);
        tbCharge3.setChargedescription(wuye+"元");
        TbChargeExample tbChargeExample=new TbChargeExample();
        tbChargeExample.createCriteria().andChargenameEqualTo("水费").andChargeyearEqualTo(year);
        TbChargeExample tbChargeExample1=new TbChargeExample();

        tbChargeExample1.createCriteria().andChargenameEqualTo("电费").andChargeyearEqualTo(year);
        TbChargeExample tbChargeExample2=new TbChargeExample();

        tbChargeExample2.createCriteria().andChargenameEqualTo("燃气费").andChargeyearEqualTo(year);
        TbChargeExample tbChargeExample3=new TbChargeExample();

        tbChargeExample3.createCriteria().andChargenameEqualTo("物业费").andChargeyearEqualTo(year);
        List<TbCharge> tbCharges = tbChargeService.selectByExample(tbChargeExample);
        if (tbCharges==null){
            tbChargeService.insertSelective(tbCharge);
        }
        List<TbCharge> tbCharges1 = tbChargeService.selectByExample(tbChargeExample1);
        if (tbCharges1==null){
            tbChargeService.insertSelective(tbCharge1);
        }
        List<TbCharge> tbCharges2 = tbChargeService.selectByExample(tbChargeExample2);
        if (tbCharges2==null){
            tbChargeService.insertSelective(tbCharge2);
        }
        List<TbCharge> tbCharges3 = tbChargeService.selectByExample(tbChargeExample3);
        if (tbCharges3==null){
            tbChargeService.insertSelective(tbCharge3);
        }

        return "redirect:/tbch/searchAll.do";
    }

    @RequestMapping("searchOne")
    public String searchOne(Model model,@RequestParam Integer id){
        TbChargeExample tbChargeExample=new TbChargeExample();
        tbChargeExample.createCriteria().andChargeidEqualTo(id);
        List<TbCharge> tbCharges = tbChargeService.selectByExample(tbChargeExample);
        TbCharge charge=new TbCharge();
        for (TbCharge tbCharge: tbCharges) {
            charge=tbCharge;
        }
        model.addAttribute("tbCharges",charge);
        return "pages/huoduan/shoufei/tbChargeUpdate";
    }

    @RequestMapping("tbChargeUpdate")
    public String tbChargeUpdate(Model model,@RequestParam Integer id,@RequestParam String name,@RequestParam Double charge){
        TbCharge tbCharge=new TbCharge();
        tbCharge.setChargestandard(charge);
        tbCharge.setChargeid(id);
        if ("水费".equals(name)){
            tbCharge.setChargedescription(charge+"元/吨");
        }else if ("电费".equals(name)){
            tbCharge.setChargedescription(charge+"元/度");
        }else if ("燃气费".equals(name)){
            tbCharge.setChargedescription(charge+"元/立方米");
        }else if ("物业费".equals(name)){
            tbCharge.setChargedescription(charge+"元");
        }else {
            System.out.println("错误收费项！！");
        }
        System.out.println(tbCharge.getChargeid()+"  "+tbCharge.getChargestandard()+"  "+tbCharge.getChargedescription());
        int i = tbChargeService.updateByPrimaryKeySelective(tbCharge);

        return "redirect:/tbch/searchAll.do";
    }



}
