package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.News;
import com.ssm.wuye.domain.NewsExample;

import com.ssm.wuye.service.NewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author:zhs
 * time:2019-04-25  17:11:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class NewsServiceImplTest {
    @Autowired
    NewsService  newsService;

    @Test
    public void search() {
        NewsExample newsExample = new NewsExample();
        newsExample.createCriteria().andNctypeidEqualTo(2);
        List<News> news = newsService.selectByExample(newsExample);
        for (News news1 : news) {
            System.out.println(news1.getNctypeid());
        }

    }
    @Test
    public void testsearch() {
        NewsExample newsExample = new NewsExample();
//        newsExample.createCriteria().andNctypeidEqualTo(1);
        int i = newsService.countByExample(newsExample);
        System.out.println("总条数:"+i);
    }
}