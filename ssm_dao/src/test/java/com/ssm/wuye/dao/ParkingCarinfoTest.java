package com.ssm.wuye.dao;

import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.domain.ParkingCarinfo;
import com.ssm.wuye.domain.ParkingCarinfoExample;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-04-25  09:23:28
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ParkingCarinfoTest {

    @Resource
    ParkingCarinfoMapper  parkingCarinfoMapper;

    @Test
    public void testsearch() {
        List<ParkingCarinfo> list = parkingCarinfoMapper.selectByExample(null);
        for (ParkingCarinfo parkingCarinfo : list) {
            System.out.println(parkingCarinfo.toString());
        }
    }
    /**
     * 拼接条件查询  and...
     */
    @Test
    public void testonesearch() {
        ParkingCarinfoExample   parkingCarinfoExample= new ParkingCarinfoExample();

        parkingCarinfoExample.createCriteria().andParkingcostBetween("30","80");

        List<ParkingCarinfo> list = parkingCarinfoMapper.selectByExample(parkingCarinfoExample);
        for (ParkingCarinfo parkingCarinfo : list) {
            System.out.println(parkingCarinfo.toString());
        }

    }

    /**
     * 查询带分页
     */
    @Test
    public void testpages() {
        ParkingCarinfoExample   parkingCarinfoExample= new ParkingCarinfoExample();
        Integer  pageNum=3;
        Integer  Size=2;
        Integer Num =Size*(pageNum-1);

        List<ParkingCarinfo> parkingCarinfos = parkingCarinfoMapper.selectByExampleWithRowbounds(parkingCarinfoExample,new RowBounds(Num, Size));

        for (ParkingCarinfo parkingCarinfo : parkingCarinfos) {
            System.out.println(parkingCarinfo.toString());
        }
    }

}
