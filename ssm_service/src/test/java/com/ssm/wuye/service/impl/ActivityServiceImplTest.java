package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.Activity;
import com.ssm.wuye.service.ActivityService;
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
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class ActivityServiceImplTest {
    @Resource
    ActivityService activityService;

    @Test
    public void deleteByPrimaryKey() {
        int i = activityService.deleteByPrimaryKey(8);
        if(i==0){
            System.out.println("删除失败");
        }else{
            System.out.println("删除成功");
        }
    }

    @Test
    public void insert() {
        Activity activity = new Activity();

        activity.setActivityname("书法大赛");
        activity.setActivitydesc("ddd");
        activity.setActivitycont("dd");
        activity.setActivitytime(null);
        activity.setActivityworker("dd");
        activity.setActivityward("shouji");

        int insert = activityService.insert(activity);
        if(insert==0){
            System.out.println("添加失败");
        }else{
            System.out.println("添加成功");
        }
    }

    @Test
    public void selectByExample() {
        List<Activity> activities = activityService.selectByExample(null);
        for (Activity activity : activities) {
            System.out.println(activity.getActivityname());

        }

    }

    @Test
    public void selectByPrimaryKey() {
        Activity activity = activityService.selectByPrimaryKey(4);
        System.out.println(activity.getActivityname());
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Activity activity = new Activity();
        activity.setId(5);
        activity.setActivityname("书法大赛");
        activity.setActivitydesc("dddd");
        activity.setActivitydesc("ddd");
        activity.setActivitytime(null);
        activity.setActivityworker("ddffff");
        activity.setActivityward("ddff");
        int i = activityService.updateByPrimaryKeySelective(activity);
        if(i==0){
            System.out.println("修改失败");
        }else{
            System.out.println("修改成功");
        }
    }
}