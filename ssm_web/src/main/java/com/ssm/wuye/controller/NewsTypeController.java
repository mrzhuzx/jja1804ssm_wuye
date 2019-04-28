package com.ssm.wuye.controller;


import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.NewsService;
import com.ssm.wuye.service.NewsTypeService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Resource
    NewsService newsService;

    public NewsTypeController() {
        System.out.println(" NewsTypeController springmvc is ok................................. ");
    }

    /**
     * 查询全部分类
     *
     * @return
     */
    @RequestMapping("search")
    public ModelAndView search() {
        ModelAndView m = new ModelAndView();

        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        m.addObject("newstypeList", newstypeList);
        m.setViewName("pages/gitqian/index");
        return m;
    }

    @RequestMapping("searchnes")
    public ModelAndView searchnews(@RequestParam String ntid) {
        ModelAndView m = new ModelAndView();


        System.out.println(ntid);
        Integer id = Integer.valueOf(ntid);
        //根据typeid查询news类下的所有内容
        NewsExample newsExample = new NewsExample();
        newsExample.createCriteria().andNctypeidEqualTo(id);
        List<News> news1 = newsService.selectByExample(newsExample);
        m.addObject("news1", news1);


        //根据typeid查询typename（来源：）
        NewsTypeExample newsTypeExample = new NewsTypeExample();
        newsTypeExample.createCriteria().andNtidEqualTo(id);
        List<NewsType> newsTypes = newstypeService.selectByExample(newsTypeExample);
        m.addObject("newst", newsTypes);


        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        m.addObject("newstypeList", newstypeList);



        m.setViewName("pages/gitqian/news");
        return m;
    }

}