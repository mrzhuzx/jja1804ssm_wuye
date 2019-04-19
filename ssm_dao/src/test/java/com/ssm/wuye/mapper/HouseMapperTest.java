package com.ssm.wuye.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author : tzhu
 * time :2019/4/17 0017
 * version: 1.2.3
 */

public class HouseMapperTest extends BaseJUnit {

   /* //@Autowired
    @Resource
    HouseMapper houseMapper;


    @Test
    public void testAdd(){

        House  house=new House();

        house.setHnumber("XMXXXHH闽XXX22885211444");
        house.setHstate("入住");
        house.setHbulidingname("清华楼B座12056");
        house.setHunitnumber(20);
        house.setHfloor(33);
        house.setHtypeid(1);
        house.setHdirection("坐北朝南");
        house.setHarea(" 5000平 ");
        house.setHremarks("坐北朝南可观海");
        house.setOlid(6);

        int insert = houseMapper.insert(house);
        System.out.println("[执行添加 ：]"+insert);

    }

    @Test
    public void testSearch2(){

        System.out.println(" 测试父类~~~ ");

        HouseExample  houseExample=new HouseExample();
        // where  a=? and b=? and c=?
        houseExample.createCriteria().andHfloorBetween(20,30).andHtypeidEqualTo(1);

        List<House> houseList = houseMapper.selectByExample(houseExample);

        for (House house : houseList) {
            System.out.println(" [ house] :"+house.toString());

        }


    }

    @Test
    public void testSearch(){
        System.out.println(" 测试父类~~~ ");


        List<House> houseList = houseMapper.selectByExample(null);

        for (House house : houseList) {
            System.out.println(" [ house] :"+house.toString());

        }

    }*/



}