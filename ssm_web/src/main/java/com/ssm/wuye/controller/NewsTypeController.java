package com.ssm.wuye.controller;


import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.NewsService;
import com.ssm.wuye.service.NewsTypeService;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ModelAndView searchnews(@RequestParam String ntid,@RequestParam Integer pageNum) {
        ModelAndView m = new ModelAndView();
        System.out.println(ntid);
        Integer id = Integer.valueOf(ntid);
        //根据typeid查询news类下的所有内容,带分页

        NewsExample newsExample = new NewsExample();
        newsExample.createCriteria().andNctypeidEqualTo(id);
        Integer countAll = newsService.countByExample(newsExample);
        Integer pageSize = 3;
        Integer pageAll = countAll % pageSize == 0 ? countAll / pageSize : countAll / pageSize + 1;
        if (pageNum<=0) {
            pageNum=1;
        }
        if (pageNum>pageAll) {
            pageNum=pageAll;
        }
        Integer Num =pageSize*(pageNum-1);
        RowBounds rowBounds = new RowBounds(Num, pageSize);
        List<News> news1 = newsService.selectByExampleWithRowbounds(newsExample,rowBounds);
        newsExample.createCriteria().andNctypeidEqualTo(id);
        m.addObject("news1", news1);
        m.addObject("pageAll", pageAll);
        m.addObject("pageNum", pageNum);



        //根据typeid查询typename（来源：）
        NewsTypeExample newsTypeExample = new NewsTypeExample();
        newsTypeExample.createCriteria().andNtidEqualTo(id);
        List<NewsType> newsTypes = newstypeService.selectByExample(newsTypeExample);
        m.addObject("newst", newsTypes);
        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        m.addObject("newstypeList", newstypeList);



        NewsType newsType1 = new NewsType();
        for (NewsType newsType : newstypeList) {
            newsType1=newsType;
        }
        String Ntid=ntid;
        m.addObject("Ntid", Ntid);





        m.setViewName("pages/gitqian/news");
        return m;
    }

    //h后台
    @RequestMapping("htnewstype")
    public ModelAndView htnewstype() {

        ModelAndView m = new ModelAndView("pages/huoduan/htnewstype");
        List<NewsType> htnestype = newstypeService.selectByExample(null);
        m.addObject("htnestype", htnestype);
        return  m ;
    }
    @RequestMapping("htnewstypeid")
    public ModelAndView htnewstypeid(@RequestParam String ntid) {
        System.out.println(ntid);
        Integer id = Integer.valueOf(ntid);
        ModelAndView m = new ModelAndView("pages/huoduan/ht_ntypeupdate");
        NewsType newsType = newstypeService.selectByPrimaryKey(id);
        m.addObject("newsType", newsType);
        return m;
    }

    @RequestMapping("htnewstypeupda")
    public ModelAndView htnewstypeupda(@RequestParam String ntid ,@RequestParam  String  ntypename){
        ModelAndView m = new ModelAndView("pages/huoduan/htnewstype");
        Integer id = Integer.valueOf(ntid);
        NewsType  tewsType = new NewsType();
        tewsType.setNtid(id);
        tewsType.setNtypename(ntypename);
        System.out.println(ntypename+"====================================");
        newstypeService.updateByPrimaryKeySelective(tewsType);

        List<NewsType> htnestype = newstypeService.selectByExample(null);
        m.addObject("htnestype", htnestype);

        return m;
    }


    @RequestMapping("htntidadd")
    public ModelAndView htntidadd(@RequestParam String ntid) {
        System.out.println(ntid);
        Integer id = Integer.valueOf(ntid);
        ModelAndView m = new ModelAndView("pages/huoduan/ht_ntypeadd");
        NewsType newsType = newstypeService.selectByPrimaryKey(id);
        m.addObject("newsType", newsType);
        return m;
    }

    @RequestMapping("htnewstypeadd")
    public ModelAndView htnewstypeadd(@RequestParam  String  ntypename){
        ModelAndView m = new ModelAndView("pages/huoduan/htnewstype");

        NewsType  tewsType = new NewsType();
        tewsType.setNtypename(ntypename);
        System.out.println(ntypename+"====================================");
        int insert = newstypeService.insert(tewsType);
        if (insert==1){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
        List<NewsType> htnestype = newstypeService.selectByExample(null);
        m.addObject("htnestype", htnestype);

        return m;

    }

}