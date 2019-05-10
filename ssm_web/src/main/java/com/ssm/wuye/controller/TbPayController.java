package com.ssm.wuye.controller;

import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * time：2019/4/27--16:29
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Controller
@RequestMapping("tbpa")
public class TbPayController {

    @Resource
    NewsTypeService newstypeService;
    @Resource
    ProgramTypeService programTypeService;
    @Resource
    OwerHouseTypeService owerHouseTypeService;
    @Resource
    TbPayService tbPayService;
    @Resource
    MyHouseService myHouseService;

    @RequestMapping("searchFei")
    public String search(Model model, @RequestParam Integer olid){
        ProgramTypeExample programTypeExample=new ProgramTypeExample();
        List<ProgramType> programTypes = programTypeService.selectByExample(programTypeExample);
        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        OwerHouseTypeExample owerHouseTypeExample=new OwerHouseTypeExample();
        owerHouseTypeExample.createCriteria().andOlidEqualTo(olid);
        List<OwerHouseType> owerHouseTypes = owerHouseTypeService.selectByExample(owerHouseTypeExample);

        model.addAttribute("programTypes",programTypes);
        model.addAttribute("newstypeList",newstypeList);
        model.addAttribute("owerHouseTypes",owerHouseTypes);


        return "pages/gitqian/jiaofei";
    }
    @RequestMapping("searchFeiBy")
    public String searchi(Model model,@RequestParam Integer olid,@RequestParam Integer hid,@RequestParam String chargename,@RequestParam Integer paystate ){
        ProgramTypeExample programTypeExample=new ProgramTypeExample();
        List<ProgramType> programTypes = programTypeService.selectByExample(programTypeExample);
        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        OwerHouseTypeExample owerHouseTypeExample=new OwerHouseTypeExample();
        owerHouseTypeExample.createCriteria().andOlidEqualTo(olid);
        List<OwerHouseType> owerHouseTypes = owerHouseTypeService.selectByExample(owerHouseTypeExample);
        List<PayCharge> payCharges = tbPayService.selectByExample(hid, chargename, paystate);
        model.addAttribute("programTypes",programTypes);
        model.addAttribute("newstypeList",newstypeList);
        model.addAttribute("owerHouseTypes",owerHouseTypes);
        model.addAttribute("payCharges",payCharges);

        return "pages/gitqian/jiaofei";
    }
    @RequestMapping("update")
    public  String updateByPrimaryKeySelective(Model model, @RequestParam Integer payid,@RequestParam String olname,@RequestParam Integer olid){
        TbPay tbPay=new TbPay();
        tbPay.setPayid(payid);
        tbPay.setPaystate(1);
        tbPay.setChargetime(new Date());
        tbPay.setPayname(olname);
        tbPayService.updateByPrimaryKeySelective(tbPay);

        ProgramTypeExample programTypeExample=new ProgramTypeExample();
        List<ProgramType> programTypes = programTypeService.selectByExample(programTypeExample);
        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        OwerHouseTypeExample owerHouseTypeExample=new OwerHouseTypeExample();
        owerHouseTypeExample.createCriteria().andOlidEqualTo(olid);
        List<OwerHouseType> owerHouseTypes = owerHouseTypeService.selectByExample(owerHouseTypeExample);

        model.addAttribute("programTypes",programTypes);
        model.addAttribute("newstypeList",newstypeList);
        model.addAttribute("owerHouseTypes",owerHouseTypes);

        return"pages/gitqian/jiaofei";
    }

    @RequestMapping("selectHouse")
    public  String selectHouse(Model model){
        List<MyHouse> myHouseList = myHouseService.selectByExample(null);
        model.addAttribute("myHouseList",myHouseList);
        return "pages/huoduan/shoufei/tbPayAll";
    }

    @RequestMapping("searchFeiByHou")
    public String searchFeiByHou(Model model,@RequestParam Integer hid,@RequestParam String chargename,@RequestParam Integer paystate ){
        List<PayCharge> payCharges = tbPayService.selectByExample(hid, chargename, paystate);
        model.addAttribute("payCharges",payCharges);
        List<MyHouse> myHouseList = myHouseService.selectByExample(null);
        model.addAttribute("myHouseList",myHouseList);
        return "pages/huoduan/shoufei/tbPayAll";
    }

}
