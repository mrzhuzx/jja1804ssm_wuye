package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\5\5 0005
 * version:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ActivityMapperTest {
    @Resource
    ActivityMapper activityMapper;
    @Test
    public void test(){
        List<com.ssm.wuye.domain.Activity> activities = activityMapper.selectByExample(null);
        for (Activity activity : activities) {
            System.out.println(activity.getActivityname());

        }


        }

    }

