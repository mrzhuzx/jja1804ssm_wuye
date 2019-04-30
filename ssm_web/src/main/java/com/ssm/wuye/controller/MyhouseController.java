package com.ssm.wuye.controller;


import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.*;
import org.apache.ibatis.session.RowBounds;
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


//    @RequestMapping("/querht")//查找待售房屋的信息
//    public ModelAndView querHT(@RequestParam Integer pageNum){
//        ModelAndView m = new ModelAndView("");
//        OwerHouseTypeExample ohte = new OwerHouseTypeExample();
//        Integer Size=6;
//        long l =oHTService.countByExample(ohte);
//        Integer con =(int)l;
//        Integer pageAll= con%Size==0?con/Size:con/Size+1 ;
//        if (pageNum<=1){
//            pageNum = 1;
//        }
//        if (pageNum>pageAll){
//            pageNum=pageAll;
//        }
//        Integer Num =Size*(pageNum-1);
//        List<OwerHouseType> owerHouseTypes = oHTService.selectByExampleWithRowbounds(ohte,new RowBounds(pageNum, Size));
//        m.addObject("pageAll", pageAll);
//        m.addObject("pageNum", pageNum);
//        m.addObject("hstate", owerHouseTypes);
//        return m;
//    }
//    @RequestMapping("tzaddhouse")//跳转到增加房屋
//    public ModelAndView tzaddhouse(){
//        ModelAndView m=new ModelAndView("");
//        MyHouseTypeExample myHouseTypeExample=new MyHouseTypeExample();
//        SysOwerExample sysOwerExample=new SysOwerExample();
//        List<MyHouseType> myHouseTypeList = myHouseTypeService.selectByExample(myHouseTypeExample);
//        List<SysOwer> sysOwerList = sysOwerService.selectByExample(sysOwerExample);
//        m.addObject("ower", sysOwerList);
//        m.addObject("myHouseTypeList", myHouseTypeList);
//        return m;
//    }
//
//
//    @RequestMapping("addhouse")//增加房屋
//    public ModelAndView addhouse(@ModelAttribute  MyHouse myHouse,@RequestParam Integer pageNum){
//        ModelAndView m=new ModelAndView();
//        int i = myHouseService.insertSelective(myHouse);
//        return m;
//    }
//    @RequestMapping("house")//跳转修改房屋
//    public ModelAndView house(@RequestParam Integer hid){
//        ModelAndView m=new ModelAndView();
//        MyHouse myHouse = myHouseService.selectByPrimaryKey(hid);
//        MyHouseTypeExample myHouseTypeExample=new MyHouseTypeExample();
//        SysOwerExample sysOwerExample=new SysOwerExample();
//        List<MyHouseType> myHouseTypeList = myHouseTypeService.selectByExample(myHouseTypeExample);
//        List<SysOwer> sysOwerList = sysOwerService.selectByExample(sysOwerExample);
//        m.addObject("ower", sysOwerList);
//        m.addObject("myHouseTypeList", myHouseTypeList);
//        m.addObject("myhouse", myHouse);
//        return m;
//    }
//    @RequestMapping("updethouse")//修改房屋
//    public ModelAndView updethouse(@ModelAttribute  MyHouse myHouse,@RequestParam Integer pageNum){
//        ModelAndView m=new ModelAndView();
//        myHouseService.updateByPrimaryKeySelective(myHouse);
//        return m;
//    }
//    @RequestMapping("deletedhouse")//删除房屋
//    public ModelAndView deletedhouse(@RequestParam Integer hid,@RequestParam Integer pageNum){
//        ModelAndView m=new ModelAndView("forward:/house/querht.do");
//        int i = myHouseService.deleteByPrimaryKey(hid);
//        return m;
//    }
    /**
     * 蓝鑫杰 业务流程方法
     */
    @RequestMapping("weg")
    public ModelAndView weg(@RequestParam String op){
        System.out.println(op);
        ModelAndView modelAndView=new ModelAndView();
        if ("water".equals(op)){
            System.out.println(op);
            modelAndView.setViewName("pages/huoduan/shoufei/waterAdd");
        }else if ("gas".equals(op)){
            modelAndView.setViewName("pages/huoduan/shoufei/gasAdd");
        }else if ("electric".equals(op)){
            modelAndView.setViewName("pages/huoduan/shoufei/electricAdd");
        }else {
            System.out.println("错误请求！！！");
        }
        List<MyHouse> myHouseList = myHouseService.selectByExample(null);
        modelAndView.addObject("myHouseList",myHouseList);
        return modelAndView;
    }
}
