package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.ParkingPlaceinfo;
import com.ssm.wuye.domain.ParkingPlaceinfoExample;
import com.ssm.wuye.service.ParkingPlaceinfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author:zhs
 * time:2019-04-30  09:51:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class ParkingPlaceinfoServiceImplTest {

    @Resource
    ParkingPlaceinfoService  parkingPlaceinfoService;
    @Test
    public void countByExample() {
//        List<ParkingPlaceinfo> parkingPlaceinfos = parkingPlaceinfoService.selectByExample(null);
//        for (ParkingPlaceinfo parkingPlaceinfo : parkingPlaceinfos) {
//            System.out.println(parkingPlaceinfo.toString());
//        }
        ParkingPlaceinfoExample parkingPlaceinfoExample = new ParkingPlaceinfoExample();
        parkingPlaceinfoExample.createCriteria().andOlidEqualTo(4);
        List<ParkingPlaceinfo> parkingPlaceinfos = parkingPlaceinfoService.selectByExample(parkingPlaceinfoExample);
        for (ParkingPlaceinfo parkingPlaceinfo : parkingPlaceinfos) {
            System.out.println(parkingPlaceinfo.toString());
        }

    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByExampleWithRowbounds() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
        ParkingPlaceinfo parkingPlaceinfo = new ParkingPlaceinfo();
        parkingPlaceinfo.setOlid(1);
        parkingPlaceinfo.setHid(1);
        parkingPlaceinfo.setPid("A-1303");
        parkingPlaceinfo.setDescr("自用");
        parkingPlaceinfo.setHcards("gggg");
        parkingPlaceinfo.setHphone("15892765478");
        int i = parkingPlaceinfoService.updateByPrimaryKeySelective(parkingPlaceinfo);
        if (i==1){
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
    }
}