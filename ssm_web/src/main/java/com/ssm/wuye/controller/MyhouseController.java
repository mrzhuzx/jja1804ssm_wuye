package com.ssm.wuye.controller;


import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("house")
public class MyhouseController {

//吴佳毅 2019年4月29日 17:41:50
    @Resource
    MyHouseService myHouseService;
    @Resource
    MyHouseTypeService myHouseTypeService;
    @Resource
    OwerHouseTypeService oHTService;
    @Autowired
    SysOwerService sysOwerService;


    @RequestMapping("/querht")//查询房屋的信息
    public ModelAndView querHT(){
        ModelAndView m=new ModelAndView("pages/huoduan/myhouse");
        OwerHouseTypeExample ohte = new OwerHouseTypeExample();
        List<OwerHouseType> owerHouseTypes = oHTService.selectByExample(ohte);
        m.addObject("hstate", owerHouseTypes);
        return m;
    }
    @RequestMapping("tzaddhouse")//跳转到增加房屋
    public ModelAndView tzaddhouse(){
        ModelAndView m=new ModelAndView("pages/huoduan/houseadd");
        MyHouseTypeExample myHouseTypeExample=new MyHouseTypeExample();
        SysOwerExample sysOwerExample=new SysOwerExample();
        List<MyHouseType> myHouseTypeList = myHouseTypeService.selectByExample(myHouseTypeExample);
        List<SysOwer> sysOwerList = sysOwerService.selectByExample(sysOwerExample);
        m.addObject("ower", sysOwerList);
        m.addObject("myHouseTypeList", myHouseTypeList);
        return m;
    }


    @RequestMapping("addhouse")//增加房屋
    public ModelAndView addhouse(@ModelAttribute  MyHouse myHouse){
        ModelAndView m=new ModelAndView("forward:querht.do");
        int i = myHouseService.insertSelective(myHouse);
        return m;
    }
    @RequestMapping("houset")//跳转修改房屋
    public ModelAndView house(@RequestParam Integer hid){
        ModelAndView m=new ModelAndView("pages/huoduan/houseupdate");
        MyHouse myHouse = myHouseService.selectByPrimaryKey(hid);
        MyHouseTypeExample myHouseTypeExample=new MyHouseTypeExample();
        SysOwerExample sysOwerExample=new SysOwerExample();
        List<MyHouseType> myHouseTypeList = myHouseTypeService.selectByExample(myHouseTypeExample);
        List<SysOwer> sysOwerList = sysOwerService.selectByExample(sysOwerExample);
        m.addObject("ower", sysOwerList);
        m.addObject("myHouseTypeList", myHouseTypeList);
        m.addObject("myhouse", myHouse);
        return m;
    }
    @RequestMapping("updethouse")//修改房屋
    public ModelAndView updethouse(@ModelAttribute  MyHouse myHouse){
        ModelAndView m=new ModelAndView("forward:querht.do");
        myHouseService.updateByPrimaryKeySelective(myHouse);
        return m;
    }
    @RequestMapping("deletedhouse")//删除房屋
    public ModelAndView deletedhouse(@RequestParam Integer hid){
        ModelAndView m=new ModelAndView("forward:/house/querht.do");
        int i = myHouseService.deleteByPrimaryKey(hid);
        return m;
    }
    /**
     * 蓝鑫杰 业务流程方法
     */
    @RequestMapping("weg")
    public ModelAndView weg(@RequestParam String op){
        ModelAndView modelAndView=new ModelAndView();
        if ("water".equals(op)){
            modelAndView.setViewName("pages/huoduan/shoufei/waterAdd");
        }if ("gas".equals(op)){
            modelAndView.setViewName("pages/huoduan/shoufei/gasAdd");
        }if ("electric".equals(op)){
            modelAndView.setViewName("pages/huoduan/shoufei/electricAdd");
        }else {
            System.out.println("错误请求！！！！");
        }
        List<MyHouse> myHouseList = myHouseService.selectByExample(null);
        modelAndView.addObject("myHouseList",myHouseList);
        return modelAndView;
    }
}
