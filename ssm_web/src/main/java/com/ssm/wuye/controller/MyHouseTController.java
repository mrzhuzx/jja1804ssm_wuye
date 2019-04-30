package com.ssm.wuye.controller;


import com.ssm.wuye.domain.MyHouseType;
import com.ssm.wuye.domain.MyHouseTypeExample;
import com.ssm.wuye.service.MyHouseTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("mht")
public class MyHouseTController {
    @Resource
    MyHouseTypeService myHouseTypeService;

    @RequestMapping("querymht")
    public ModelAndView querymht(){
        ModelAndView m=new ModelAndView("");
        MyHouseTypeExample myHouseTypeExample=new MyHouseTypeExample();
        List<MyHouseType> mhtList = myHouseTypeService.selectByExample(myHouseTypeExample);
        m.addObject("mhtList", mhtList);
        return m;
    }
    @RequestMapping("addmht")
    public ModelAndView addmht(@RequestParam String htypename,@RequestParam String htpropertyright){
        ModelAndView m=new ModelAndView("forward:/mht/querymht.do");
        MyHouseType myHouseType=new MyHouseType(htypename, htpropertyright);
        myHouseTypeService.insertSelective(myHouseType);
        return m;
    }
    @RequestMapping("tzmht")
    public ModelAndView tzmht(@RequestParam Integer htypeid){
        ModelAndView m=new ModelAndView();
        MyHouseType myHouseType = myHouseTypeService.selectByPrimaryKey(htypeid);
        m.addObject("mht", myHouseType);
        return m;
    }
    @RequestMapping("updatemht")
    public ModelAndView updatemht(@RequestParam Integer htypeid,@RequestParam String htypename,@RequestParam String htpropertyright){
        ModelAndView m=new ModelAndView("forward:/mht/querymht.do");
        MyHouseType myHouseType=new MyHouseType(htypeid, htypename, htpropertyright);
        int i = myHouseTypeService.updateByPrimaryKeySelective(myHouseType);
        return m;
    }
    @RequestMapping("deletemht")
    public ModelAndView deletemht(@RequestParam Integer htypeid){
        ModelAndView m=new ModelAndView("forward:/mht/querymht.do");
        int i = myHouseTypeService.deleteByPrimaryKey(htypeid);
        return m;
    }


}
