package com.ssm.wuye.controller;

import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.NewsService;
import com.ssm.wuye.service.NewsTypeService;
import com.ssm.wuye.service.NewsTypeVoiwService;
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
    @Resource
    NewsTypeVoiwService newsTypeVoiwService;

    @RequestMapping("one")
    public ModelAndView news(@RequestParam String   ncid){
        System.out.println(ncid);
        ModelAndView  m = new ModelAndView("pages/gitqian/new_list");
        Integer id = Integer.valueOf(ncid);
        News news = newsService.selectByPrimaryKey(id);
        m.addObject("news",news);

        //所有新闻类
        List<NewsType> newsTypes = newstypeService.selectByExample(null);
        m.addObject("newsTypes",newsTypes);


//        NewsTypeVoiwExample newsTypeVoiwExample = new NewsTypeVoiwExample();
//        newsTypeVoiwExample.createCriteria().andNcidEqualTo(id);
//        List<NewsTypeVoiw> newsTypeVoiws = newsTypeVoiwService.selectByExample(newsTypeVoiwExample);
//        for (NewsTypeVoiw newsTypeVoiw : newsTypeVoiws) {
//            System.out.println(newsTypeVoiw.getNtypename());
//        }
//        m.addObject("newsTypeVoiws",newsTypeVoiws);

        return  m;
    }
}
