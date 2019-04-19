package com.ssm.wuye.mapper;

import com.ssm.wuye.dao.AdminfoMapper;
import com.ssm.wuye.domain.Adminfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author : tzhu
 * time :2019/4/16 0016
 * version: 1.2.3
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class AdminfoMapperTest {

   @Resource
    AdminfoMapper adminfoMapper;

    @Test
    public void test() {


        List<Adminfo> adminfoList = adminfoMapper.selectByExample(null);
        for (Adminfo adminfo : adminfoList) {
            System.out.println(adminfo.getUsername());
        }


    }


}