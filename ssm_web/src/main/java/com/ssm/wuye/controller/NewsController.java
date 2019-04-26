package com.ssm.wuye.controller;

import com.ssm.wuye.domain.News;
import com.ssm.wuye.domain.NewsExample;
import com.ssm.wuye.service.NewsService;
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

    @RequestMapping("one")
    public ModelAndView news(@RequestParam String   ntid){

        System.out.println(ntid);
        ModelAndView  m = new ModelAndView("pages/gitqian/news");
        Integer id = Integer.valueOf(ntid);
        NewsExample newsExample = new NewsExample();
        newsExample.createCriteria().andNctypeidBetween(id,id);
        List<News> news1 = newsService.selectByExample(newsExample);
        m.addObject("news1",news1);
        return  m;
    }
}
