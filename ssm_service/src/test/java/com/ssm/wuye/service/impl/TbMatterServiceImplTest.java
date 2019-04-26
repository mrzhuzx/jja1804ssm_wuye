package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.TbMatterMapper;
import com.ssm.wuye.domain.TbMatterExample;
import com.ssm.wuye.service.TbMatterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class TbMatterServiceImplTest {
@Resource
   TbMatterService tbMatterService;
    @Test
    public void countByExample() {
        TbMatterExample tbMatterExample=new TbMatterExample();
        long l= tbMatterService.countByExample(tbMatterExample);
        System.out.println(l);

    }

    @Test
    public void deleteByPrimaryKey() {
        int i =tbMatterService.deleteByPrimaryKey(1);
        if (i==0){
            System.out.println("删除失败");

        }else {
            System.out.println("删除成功:\"+i+\"条数据");
        }
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByExampleWithRowbounds() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }
}