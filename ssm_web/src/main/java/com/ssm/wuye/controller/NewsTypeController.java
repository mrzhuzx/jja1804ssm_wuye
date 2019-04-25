package com.ssm.wuye.controller;


import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.service.NewsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:  新闻类型模块
 * author : tzhu
 * time :2019/4/18 0018
 * version: 1.2.3
 */
@Controller
@RequestMapping("nt")
public class NewsTypeController {

   @Resource
   NewsTypeService newstypeService;

    public NewsTypeController() {
        System.out.println(" NewsTypeController springmvc is ok................................. ");
    }
    /**
     * 查询全部分类
     * @return
     */
    @RequestMapping("search")
    public ModelAndView search() {
        System.out.println("3##########################################");
        ModelAndView m = new ModelAndView();
        System.out.println("  查询全部分类   ");
        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        m.addObject("newstypeList",newstypeList);
        System.out.println(" newstypeList : "+newstypeList.size());
        m.setViewName("pages/gitqian/index");
        return m;

    }    /**
     * 根据id查询分类
     * @return
     */
    @RequestMapping("search.do")
    public ModelAndView searchone() {
        ModelAndView m = new ModelAndView();
        System.out.println("  查询全部分类   ");
        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        m.addObject("newstypeList",newstypeList);
        System.out.println(" newstypeList : "+newstypeList.size());
        m.setViewName("/pages/gitqian/index");
        return m;

    }


}
