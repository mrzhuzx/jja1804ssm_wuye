package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.ParkingCarinfo;
import com.ssm.wuye.domain.ParkingCarinfoExample;
import com.ssm.wuye.service.ParkingCarinfoService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * desc:路面停车信息表 service测试...
 * author:zhs
 * time:2019-04-25  11:32:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class ParkingCarinfoServiceImplTest {

    @Autowired
   ParkingCarinfoService parkingCarinfoService;

    /**
     * 查询条数
     */
    @Test
    public void testsearch() {
        ParkingCarinfoExample ParkingCarinfoExample = new ParkingCarinfoExample();
        long l = parkingCarinfoService.countByExample(ParkingCarinfoExample);
        System.out.println("总条数:"+l);
    }
    /**
     * 删除
     */
    @Test
    public void delete() {
        parkingCarinfoService.deleteByExample(2);
    }

    /**
     * 添加
     */
    @Test
    public void insert() {

        ParkingCarinfo  pc = new ParkingCarinfo();
        pc.setParkingcards("沪A-88888888");
        pc.setParkingcost("100");
        pc.setParkingintime( new Date());
        pc.setParkingouttime(new Date());
        pc.setPaymentmethod(3);
        pc.setPaymentstatus(1);
        int insert = parkingCarinfoService.insert(pc);
        if (insert==1){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
    @Test
    public void search() {
        List<ParkingCarinfo> parkingCarinfos = parkingCarinfoService.selectByExample(null);
        for (ParkingCarinfo parkingCarinfo : parkingCarinfos) {
            System.out.println(parkingCarinfo.toString());
        }
    }

    /**
     * 查询带分页
     */
    @Test
    public void searchpages() {
        ParkingCarinfoExample ParkingCarinfoExample = new ParkingCarinfoExample();
        ParkingCarinfoExample.createCriteria().andParkingcostEqualTo("30");
        Integer pageNum=2;
        Integer Size=4;
        //从第几条开始
        Integer Num =Size*(pageNum-1);
        RowBounds rowBounds = new RowBounds(Num, Size);
        List<ParkingCarinfo> parkingCarinfos = parkingCarinfoService.selectByExampleWithRowbounds(ParkingCarinfoExample, rowBounds);
        for (ParkingCarinfo parkingCarinfo : parkingCarinfos) {
            System.out.println(parkingCarinfo.toString());
        }
    }

    /**
     * 根据id查询一条
     */
    @Test
    public void searchone() {
        ParkingCarinfoExample   parkingCarinfoExample = new ParkingCarinfoExample();
        parkingCarinfoExample.createCriteria().andParkingcardsEqualTo("闽C-H66666");
        List<ParkingCarinfo> parkingCarinfos = parkingCarinfoService.selectByExample(parkingCarinfoExample);
        for (ParkingCarinfo parkingCarinfo : parkingCarinfos) {
            System.out.println(parkingCarinfo.getParkingid());
        }
    }

    /**
     * 更新
     */
    @Test
    public void searchupdate() {
        ParkingCarinfo  pc = new ParkingCarinfo();
        pc.setParkingid(24);
        pc.setParkingcards("闽A-88888888");
        pc.setParkingcost("100");
        pc.setParkingintime( new Date());
        pc.setParkingouttime(new Date());
        pc.setPaymentmethod(3);
        pc.setPaymentstatus(1);
        int i = parkingCarinfoService.updateByPrimaryKeySelective(pc);
        if (i==1){
            System.out.println("更新成功");
        }else {
            System.out.println("添加失败");
        }
    }
    @Test
    public void test() {
        ParkingCarinfo  pc = parkingCarinfoService.selectByPrimaryKey(1);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parkingintime = pc.getParkingintime();
        Date parkingouttime = pc.getParkingouttime();
        long diff = parkingouttime.getTime() -parkingintime.getTime();//这样得到的差值是微秒级别
        long days = diff / (1000 * 60 * 60 * 24);
        long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
        long min=((diff/(60*1000))-days*24*60-hours*60);
        System.out.println(""+days+"天"+hours+"小时"+min+"分钟");
        System.out.println(""+((days*24)+hours)+"小时");
        long time=((days*24)+hours);
        long Parkingcost=3*time;
        System.out.println(Parkingcost);




    }

}