package com.ssm.wuye.controller;


import com.ssm.wuye.domain.MyHouse;
import com.ssm.wuye.domain.MyHouseExample;
import com.ssm.wuye.domain.OwerHouseType;
import com.ssm.wuye.service.MyHouseService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("house")
public class MyhouseController {

    @Resource
    MyHouseService myHouseService;

    @RequestMapping("")
    public ModelAndView quer(@RequestParam Integer pageNum){
        ModelAndView m=new ModelAndView();
        MyHouseExample myHouseExample=new MyHouseExample();
        Integer Size=6;
        long l =myHouseService.countByExample(myHouseExample);
        Integer con =(int)l;
        Integer pageAll= con%Size==0?con/Size:con/Size+1 ;
        if (pageNum<=1){
            pageNum = 1;
        }
        if (pageNum>pageAll){
            pageNum=pageAll;
        }
        Integer Num =Size*(pageNum-1);
        List<MyHouse> myHouseList = myHouseService.selectByExampleWithRowbounds(myHouseExample,new RowBounds(pageNum, Size));
        return  m;
    }
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
