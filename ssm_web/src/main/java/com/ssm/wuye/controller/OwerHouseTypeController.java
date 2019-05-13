package com.ssm.wuye.controller;


import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.domain.OwerHouseType;
import com.ssm.wuye.domain.OwerHouseTypeExample;
import com.ssm.wuye.domain.ProgramType;
import com.ssm.wuye.service.NewsTypeService;
import com.ssm.wuye.service.OwerHouseTypeService;
import com.ssm.wuye.service.ProgramTypeService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

//吴佳毅 2019年4月29日 17:50:24 房屋的租售

@Controller
@RequestMapping("ohtc")
public class OwerHouseTypeController {
    @Resource
    OwerHouseTypeService oHTService;
    @Autowired
    NewsTypeService newsTypeService;
    @Resource
    ProgramTypeService programTypeService;


    public OwerHouseTypeController(){
        System.out.println("进入OwerHouseTypeController方法");
    }
    @RequestMapping("/qtcxhstate")//查找待售房屋的信息
    public ModelAndView qtcxHstate(@RequestParam Integer pageNum){
        ModelAndView m = new ModelAndView("/pages/gitqian/housestate");
        OwerHouseTypeExample ohte = new OwerHouseTypeExample();
        ohte.createCriteria().andHstateEqualTo("待售");
        ohte.createCriteria().andLoanEqualTo(2);
        long l =oHTService.countByExample(ohte);
        Integer con =(int)l;
        Integer Size=6;
        Integer pageAll= con%Size==0?con/Size:con/Size+1 ;
        if (pageNum<=1){
            pageNum = 1;
        }
        if (pageNum>pageAll){
            pageNum=pageAll;
        }
        Integer Num =Size*(pageNum-1);
        List<OwerHouseType> owerHouseTypes = oHTService.selectByExampleWithRowbounds(ohte,new RowBounds(Num, Size));
        List<NewsType> newstypeList = newsTypeService.selectByExample(null);
        List<ProgramType> programTypes = programTypeService.selectByExample(null);
        m.addObject("programTypes", programTypes);
        m.addObject("newstypeList", newstypeList);
        m.addObject("pageAll", pageAll);
        m.addObject("pageNum", pageNum);
       m.addObject("hstate", owerHouseTypes);
        return m;
    }

    @RequestMapping("/qtcxloan")//查询待租的房屋信息
    public ModelAndView qtcxLoan(@RequestParam Integer pageNum){
        ModelAndView m = new ModelAndView("/pages/gitqian/houseloan");
        OwerHouseTypeExample ohte = new OwerHouseTypeExample();
        ohte.createCriteria().andLoanEqualTo(2);
        Integer Size=6;
        long l =oHTService.countByExample(ohte);
        Integer con =(int)l;
        Integer pageAll= con%Size==0?con/Size:con/Size+1 ;
        if (pageNum<=1){
            pageNum = 1;
        }
        if (pageNum>pageAll){
            pageNum=pageAll;
        }
        Integer Num =Size*(pageNum-1);
        List<OwerHouseType> owerHouseTypes = oHTService.selectByExampleWithRowbounds(ohte,new RowBounds(Num, Size));
        List<NewsType> newstypeList = newsTypeService.selectByExample(null);
        List<ProgramType> programTypes = programTypeService.selectByExample(null);
        m.addObject("programTypes", programTypes);
        m.addObject("newstypeList", newstypeList);
        m.addObject("pageAll", pageAll);
        m.addObject("pageNum", pageNum);
        m.addObject("loan", owerHouseTypes);
        return m;
    }





}
