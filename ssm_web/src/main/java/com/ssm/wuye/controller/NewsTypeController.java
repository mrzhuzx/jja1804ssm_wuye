package com.ssm.wuye.controller;


import com.ssm.wuye.domain.News;
import com.ssm.wuye.domain.NewsExample;
import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.service.NewsService;
import com.ssm.wuye.service.NewsTypeService;
import org.apache.ibatis.session.RowBounds;
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
        //根据类别id查询该类下的所有内容
        NewsExample newsExample = new NewsExample();
        newsExample.createCriteria().andNctypeidEqualTo(id);

//        List<News> news1 = newsService.selectByExample(newsExample);
//        m.addObject("news1", news1);

        Integer pageNum = 1;
        Integer pageSize = 2;
        long countAll = newsService.countByExample(newsExample);

        long pageAll=countAll%pageSize==0?countAll/pageSize:countAll/pageSize+1;
        RowBounds rowBounds = new RowBounds(pageNum, pageSize);
        List<News> news = newsService.selectByExampleWithRowbounds(newsExample, rowBounds);
        long l = newsService.countByExample(newsExample);
        System.out.println(l+"************************");
        System.out.println(news.toString()+"...............................");
        m.addObject("news1", news);


//        NewsType newsType = newstypeService.selectByPrimaryKey(id);
//        m.addObject("newsType", newsType);


        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        m.addObject("newstypeList", newstypeList);


        m.setViewName("pages/gitqian/news");
        return m;
    }

}