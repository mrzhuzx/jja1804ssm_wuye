package com.ssm.wuye.dao;

import com.ssm.wuye.domain.NewsType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author : tzhu
 * time :2019/4/24 0024
 * version: 1.2.3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class NewsTypeMapperTest {

    @Autowired
    NewsTypeMapper newsTypeMapper;

    @Test
    public void test() {

        List<NewsType> newsTypes = newsTypeMapper.selectByExample(null);

        for (NewsType newsType : newsTypes) {

            System.out.println(newsType.getNtid()+"  "+newsType.getNtypename());

        }




    }


}