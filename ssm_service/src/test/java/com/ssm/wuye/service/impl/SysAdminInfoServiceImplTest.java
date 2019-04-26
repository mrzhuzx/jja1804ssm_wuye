package com.ssm.wuye.service.impl;
/*
 *desc:
 *author:wjs
 *time:2019/4/25 0025
 *version:1.2.3
 */


import com.ssm.wuye.dao.SysAdminInfoMapper;
import com.ssm.wuye.domain.SysAdminInfo;
import com.ssm.wuye.domain.SysAdminInfoExample;
import com.ssm.wuye.service.SysAdminInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class SysAdminInfoServiceImplTest {

    @Resource
    SysAdminInfoMapper sysAdminInfoMapper;

    /**
     * 带条件查询
      */
    @Test
    public void SysAdminInfo(){
        SysAdminInfoExample sysAdminInfoExample=new SysAdminInfoExample();
        List<SysAdminInfo> sysAdminInfoList=sysAdminInfoMapper.selectByExample(sysAdminInfoExample);
        for(SysAdminInfo sa : sysAdminInfoList){
            System.out.println(sa.toString());
        }

    }

//    public void updateByPrimaryKeySelective(){
//
//        SysAdminInfo sysAdminInfo=new SysAdminInfo(2,"","","","","","","","");
//
//        int i = sysAdminInfoMapper.updateByExampleSelective(sysAdminInfo);
//        if (i==0){
//            System.out.println("修改失败");
//        }else {
//            System.out.println("修改成功："+i+"条数据");
//        }
//    }


}



















