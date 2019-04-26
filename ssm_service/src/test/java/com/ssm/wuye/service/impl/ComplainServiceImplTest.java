package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.ComplainInfo;
import com.ssm.wuye.service.ComplainService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author:czf
 * time:2019\4\26 0026
 * version:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-service.xml"})
public class ComplainServiceImplTest {
    @Resource
    ComplainService complainService;
    @Before
    public void setUp() throws Exception {
        System.out.println("Before 在全部的测试方法之前执行的方法：一般初始化测试环境");
    }
    @Test
    public void test() {
        List<ComplainInfo> list = complainService.selectByExample(null);
        for (ComplainInfo complainInfo : list) {
            System.out.println(complainInfo.getCid()+complainInfo.getTitle());

        }


    }

}