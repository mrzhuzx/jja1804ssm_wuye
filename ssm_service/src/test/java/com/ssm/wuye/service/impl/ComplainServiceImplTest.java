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
            System.out.println(complainInfo.getCid() + complainInfo.getTitle());
        }
    }

    @Test
    public void deleteByPrimaryKey() {
        int i = complainService.deleteByPrimaryKey(3);
        if (i == 0) {
            System.out.println("删除失败");
        } else {
            System.out.println("删除成功"+i+"条数据");
        }

    }

    @Test
    public void updateByPrimaryKeySelective() {
        ComplainInfo complainInfo = new ComplainInfo();
        complainInfo.setCid(5);
        complainInfo.setTitle("游泳池");
        complainInfo.setDescr("用泳池");
        complainInfo.setCname("马虎腾");
        complainInfo.setCphone("12");
        complainInfo.setRname("张五记");


        int i = complainService.updateByPrimaryKeySelective(complainInfo);
        if(i==0){
            System.out.println("修改失败");
        }else{
            System.out.println("修改成功");
        }
    }

    @Test
    public void selectByPrimaryKey() {
        ComplainInfo complainInfo = complainService.selectByPrimaryKey(3);
        System.out.println(complainInfo.getDescr());
    }

    @Test
    public void insert() {
        ComplainInfo complainInfo = new ComplainInfo();
        complainInfo.setCid(11);
        complainInfo.setTitle("马云");
        complainInfo.setDescr("mayun");
        complainInfo.setCname("mayun");
        complainInfo.setCphone("125");
        complainInfo.setRname("mayun");
        complainInfo.setStatus(1);
        complainInfo.setMeans(2);
        complainInfo.setCdate(null);
        complainInfo.setDealdescr("wu");
        int insert = complainService.insert(complainInfo);
        if(insert==0){
            System.out.println("添加失败");
        }else{
            System.out.println("添加成功");
        }

    }
}
