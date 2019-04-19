package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.Newstype;
import com.ssm.wuye.service.NewstypeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

/**
 * desc: spring和mybaits的整合和配置文件
 * author : tzhu
 * time :2019/4/18 0018
 * version: 1.2.3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class NewstypeServiceImplTest {

    @Resource
    NewstypeService newstypeService;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before 在全部的测试方法之前执行的方法： 一般初化测试环境~~~~  ");
    }

    @Test
    public void test() {

        List<Newstype> newstypeList = newstypeService.selectByExample(null);

        for (Newstype newstype : newstypeList) {

            System.out.println(newstype.getNtid()+" "+newstype.getNtypename());
        }



    }


}