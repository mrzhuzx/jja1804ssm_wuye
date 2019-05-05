package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ComplainInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author:czf
 * time:2019\4\25 0025
 * version:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ComplainInfoMapperTest {
    @Autowired
    ComplainInfoMapper complainInfoMapper;
    @Test
    public  void test(){
        List<ComplainInfo> complainInfos = complainInfoMapper.selectByExample(null);
        for (ComplainInfo complainInfo : complainInfos) {
          //  System.out.println(newsType.getNtid()+"  "+newsType.getNtypename());
            System.out.println(complainInfo.getTitle()+complainInfo.getCname()+complainInfo.getDescr()+complainInfo.getRname());
            
        }
        

    }
    

}