package com.ssm.wuye.service.impl;

/*
 *2019-04-24 13:07:16 吴佳毅
 * 楼房修改操作
 * MyHouse，MyHouseService MyHouseServiceImpl相关代码都有增加和修改
 * MyHouseService在dao层com.ssm.wuye.dao.MyHouseMapper查找关键语句
 */


import com.ssm.wuye.domain.MyHouse;
import com.ssm.wuye.domain.MyHouseExample;
import com.ssm.wuye.service.MyHouseService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.List;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class MyHouseServiceImplTest {

    @Resource
    MyHouseService myHouseService;

    /*
    *查询条数
     */
    @Test
    public void countByExample() {
        MyHouseExample myHouseExample=new MyHouseExample();
        long l = myHouseService.countByExample(myHouseExample);
        System.out.println(l);
    }


    @Test
    public void deleteByPrimaryKey() {
        int i = myHouseService.deleteByPrimaryKey(11170);
        if(i==0){
            System.out.println("删除失败");
        }else {
            System.out.println("删除成功:"+i+"条数据");
        }
    }

    @Test
    public void insertSelective() {
        MyHouse r=new MyHouse("打","你","白话", 1,1,1,"腾讯","三菱","功夫",1,0);
        int i = myHouseService.insertSelective(r);
        if(i==0){
            System.out.println("增加失败");
        }else {
            System.out.println("增加成功:"+i+"条数据");
        }
    }

    //带条件查询
    @Test
    public void selectByExample() {
        MyHouseExample myHouseExample = new MyHouseExample();
        myHouseExample.createCriteria().andHstateEqualTo("待售");//线性，and列名EqualTo（条件）
        List<MyHouse> myHouseList = myHouseService.selectByExample(myHouseExample);
        for (MyHouse myHouse : myHouseList) {
            System.out.println(myHouse.toString());
        }
    }
    //带条件分页查询
    @Test
    public void selectByExampleWithRowbounds() {
        MyHouseExample myHouseExample=new MyHouseExample();
        /*
         *方法一：List<MyHouse> myHouseList=myHouseService.selectByExampleWithRowbounds(myHouseExample，New RowBound(0，5))；
         * 方法二：RowBounds rowBounds = new RowBounds(offset:0,limit:5);// offset起始行 // limit是当前页显示多少条数据
         * List<MyHouse> myHouseList=myHouseService.selectByExampleWithRowbounds(myHouseExample,rowBounds)；
         */
        Integer pageNum=2;
        Integer Size=8;
        Integer Num =Size*(pageNum-1);
        List<MyHouse> myHouseList =myHouseService.selectByExampleWithRowbounds(myHouseExample,new RowBounds(Num, Size));
        for (MyHouse myHouse:myHouseList) {
            System.out.println(myHouse.toString());
        }
    }
    /*
    *查询一条数据
     */
    @Test
    public void selectByPrimaryKey() {
        MyHouse myHouse = myHouseService.selectByPrimaryKey(11169);
        System.out.println(myHouse.toString());
    }

    @Test
    public void updateByPrimaryKeySelective() {
        MyHouse myHouse=new MyHouse(11171,"菜市场","篮球鞋","烤鸭蛋",1, 2, 2, "广电", "ct", "画",1 , 0);
        int i = myHouseService.updateByPrimaryKeySelective(myHouse);
        if(i==0){
            System.out.println("修改失败");
        }else {
            System.out.println("修改成功:"+i+"条数据");
        }
    }
}