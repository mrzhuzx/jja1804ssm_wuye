package com.ssm.wuye.dao;

import com.ssm.wuye.domain.RepairInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.ws.rs.core.Context;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author:czf
 * time:2019\5\5 0005
 * version:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring-mybatis.xml"} )
public class RepairInfoMapperTest {
    @Autowired
    RepairInfoMapper repairInfoMapper;
    @Test
    public  void test(){
        List<RepairInfo> repairInfos = repairInfoMapper.selectByExample(null);
        for (RepairInfo repairInfo : repairInfos) {
            System.out.println(repairInfo.getRepairname());

        }

    }

}