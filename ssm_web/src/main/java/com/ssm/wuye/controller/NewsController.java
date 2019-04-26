package com.ssm.wuye.controller;

import com.ssm.wuye.domain.News;
import com.ssm.wuye.domain.NewsExample;
import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.service.NewsService;
import com.ssm.wuye.service.NewsTypeService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.awt.event.MouseAdapter;
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
    NewsService  newsService;
    @Resource
    NewsTypeService newstypeService;

    @RequestMapping("one")
    public ModelAndView news(@RequestParam String   nid){
        System.out.println(nid);
        ModelAndView  m = new ModelAndView("pages/gitqian/new_list");
        Integer id = Integer.valueOf(nid);
        News news = newsService.selectByPrimaryKey(id);
        m.addObject("news",news);

        //所有新闻类
        List<NewsType> newsTypes = newstypeService.selectByExample(null);
        m.addObject("newsTypes",newsTypes);
        return  m;
    }
}
