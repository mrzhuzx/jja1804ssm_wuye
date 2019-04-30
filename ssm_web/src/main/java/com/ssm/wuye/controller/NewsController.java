package com.ssm.wuye.controller;

import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.NewsService;
import com.ssm.wuye.service.NewsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.awt.event.MouseAdapter;
import java.util.Date;
import java.util.List;

/**
 * desc:
 * author:zhs
 * time:time
 */
@Controller
@RequestMapping("news")
public class NewsController {

    @Resource
    NewsService newsService;
    @Resource
    NewsTypeService newstypeService;

    @RequestMapping("one")
    public ModelAndView news(@RequestParam String ncid) {
        System.out.println(ncid);
        ModelAndView m = new ModelAndView("pages/gitqian/new_list");
        Integer id = Integer.valueOf(ncid);
        News news = newsService.selectByPrimaryKey(id);
        m.addObject("news", news);

        //所有新闻类
        List<NewsType> newsTypes = newstypeService.selectByExample(null);
        m.addObject("newsTypes", newsTypes);
        return m;
    }

    //后台
    @RequestMapping("htnews")
    public ModelAndView htnews() {
        ModelAndView m = new ModelAndView("pages/huoduan/ht_news");
        List<News> news = newsService.selectByExample(null);
        m.addObject("news", news);
        return m;

    }

    @RequestMapping("htndelet")
    public ModelAndView htndelet(@RequestParam String ncid) {
        ModelAndView m = new ModelAndView("pages/huoduan/ht_news");
        Integer id = Integer.valueOf(ncid);
        int i = newsService.deleteByExample(id);
        if (i == 1) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        List<News> news = newsService.selectByExample(null);
        m.addObject("news", news);
        return m;
    }

    @RequestMapping("htnupdate")
    public ModelAndView htnupdate(@RequestParam String ncid) {
        ModelAndView m = new ModelAndView("pages/huoduan/ht_newsupdate");
        Integer id = Integer.valueOf(ncid);
        News upnews = newsService.selectByPrimaryKey(id);
        m.addObject("upnews", upnews);

        List<NewsType> newsTypes = newstypeService.selectByExample(null);
        m.addObject("newsTypes", newsTypes);
        return m;

    }

    @RequestMapping("htnUpate")
    public ModelAndView htn_update(@RequestParam String ncid,@RequestParam String nctitle, @RequestParam String nccontent,@RequestParam Date nctime,@RequestParam String ntid){
        ModelAndView m = new ModelAndView("pages/huoduan/ht_news");
        Integer id = Integer.valueOf(ncid);
        Integer tid = Integer.valueOf(ntid);
        System.out.println(tid + "777777777777777777777777777777777");
        News news = new News();
        news.setNcid(id);
        news.setNctitle(nctitle);
        news.setNccontent(nccontent);
        news.setNctime(nctime);
        news.setNctypeid(tid);
        int i = newsService.updateByPrimaryKeySelective(news);
        if (i==1){
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
        List<News> newsList = newsService.selectByExample(null);
        m.addObject("news", newsList);
        return m;
    }
    //@ModelAttribute News news
    @RequestMapping("htn_add")
     public ModelAndView htnadd(@RequestParam String nctitle, @RequestParam String nccontent,@RequestParam Date nctime,@RequestParam String ntid) {
        ModelAndView m = new ModelAndView("pages/huoduan/ht_news");
        Integer tid = Integer.valueOf(ntid);


        News news = new News();
        news.setNctitle(nctitle);
        news.setNccontent(nccontent);
        news.setNctime(nctime);
        news.setNctypeid(tid);
        int i = newsService.insert(news);

        if (i==1){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

        List<News> newsList = newsService.selectByExample(null);
        m.addObject("news", newsList);
        return m;
    }
    }