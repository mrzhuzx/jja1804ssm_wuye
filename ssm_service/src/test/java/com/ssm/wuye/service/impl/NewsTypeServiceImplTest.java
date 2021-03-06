package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.News;
import com.ssm.wuye.domain.NewsExample;
import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.domain.NewsTypeExample;
import com.ssm.wuye.service.NewsTypeService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.net.SocketTimeoutException;
import java.util.List;

/**
 * desc: spring和mybaits的整合和配置文件
 * author : tzhu
 * time :2019/4/18 0018
 * version: 1.2.3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class NewsTypeServiceImplTest {

    @Resource
    NewsTypeService newsTypeService;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before 在全部的测试方法之前执行的方法： 一般初化测试环境~~~~  ");
    }

    @Test
    public void test() {

        List<NewsType> newsTypeList = newsTypeService.selectByExample(null);
        for (NewsType newsType : newsTypeList) {
            System.out.println(newsType.getNtid()+" "+newsType.getNtypename());
        }

    }
    @Test
    public  void test1(){
        NewsTypeExample newsTypeExample = new NewsTypeExample();
        newsTypeExample.createCriteria().andNtidEqualTo(2);
        List<NewsType> newsTypes = newsTypeService.selectByExample(newsTypeExample);
        for (NewsType newsType : newsTypes) {
            System.out.println(newsType.getNtypename());
        }
    }
    @Test
    public  void update(){
        NewsType newsType = new NewsType();
        newsType.setNtypename("g99gggg");
        newsType.setNtid(16);
        int i = newsTypeService.updateByPrimaryKeySelective(newsType);
        if (i==1){
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
    }


}