package com.ssm.wuye.dao;

import com.ssm.wuye.domain.NewsExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * desc:
 * author:zhs
 * time:time
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class NewsTest {
    @Autowired
    NewsMapper newsMapper;
    @Test
    public void testsearch() {
        NewsExample newsExample = new NewsExample();
        long l = newsMapper.countByExample(newsExample);
        System.out.println("总条数:"+l);
    }

}
