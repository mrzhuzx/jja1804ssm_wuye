package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.RepairInfo;
import com.ssm.wuye.service.RepairService;
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
 * time:2019\5\5 0005
 * version:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-service.xml"})
public class RepairServiceImplTest {
    @Resource
    RepairService repairService;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before 在全部的测试方法之前执行的方法：一般初始化测试环境");

    }

    @Test
    public void deleteByPrimaryKey() {
        int i = repairService.deleteByPrimaryKey(20181216);
        if (i == 0) {
            System.out.println("删除失败");
        } else {
            System.out.println("删除成功");
        }

    }

    @Test
    public void insert() {
        RepairInfo repairInfo = new RepairInfo();
        repairInfo.setRepairname("陈发树");
        int insert = repairService.insert(repairInfo);
        if (insert == 0) {
            System.out.println("添加失败");
        } else {
            System.out.println("添加成功");
        }
    }

    @Test
    public void selectByExample() {
        List<RepairInfo> repairInfos = repairService.selectByExample(null);
        for (RepairInfo repairInfo : repairInfos) {
            System.out.println(repairInfo.getRepairname());

        }

    }

    @Test
    public void selectByPrimaryKey() {
        RepairInfo repairInfo = repairService.selectByPrimaryKey(20181213);
        System.out.println(repairInfo.getRepairname());
    }


    @Test
    public void updateByPrimaryKeySelective() {
        RepairInfo repairInfo = new RepairInfo();
        repairInfo.setId(20181213);
        repairInfo.setRepairname("王健林");
        int i = repairService.updateByPrimaryKeySelective(repairInfo);
        if(i==0){
            System.out.println("修改失败");
        }else{
            System.out.println("修改成功");
        }

    }
}