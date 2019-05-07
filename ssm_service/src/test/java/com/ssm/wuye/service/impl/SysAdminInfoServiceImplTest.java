package com.ssm.wuye.service.impl;
/*
 *desc:
 *author:wjs
 *time:2019/4/25 0025
 *version:1.2.3
 */


import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.HouqinService;
import com.ssm.wuye.service.SysAdminInfoService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-service.xml"})
public class SysAdminInfoServiceImplTest {

    @Resource
    SysAdminInfoService sysAdminInfoService;

    @Resource
    HouqinService houqinService;


    /**
     * 查询总条数
     */
    @Test
    public void countByExample() {

        SysAdminInfoExample sysAdminInfoExample = new SysAdminInfoExample();
        ContractExample contractExample = new ContractExample();
        Long li = sysAdminInfoService.countByExample(sysAdminInfoExample);
        System.out.println(li);
    }

    /**
     * 带条件查询
     */
    @Test
    public void SysAdminInfo() {
        SysAdminInfoExample sysAdminInfoExample = new SysAdminInfoExample();
        List<SysAdminInfo> sysAdminInfoList = sysAdminInfoService.selectByExample(sysAdminInfoExample);
        for (SysAdminInfo sa : sysAdminInfoList) {
            System.out.println(sa.toString());
        }

    }

    /**
     * 主键修改
     */
    @Test
    public void updateByPrimaryKeySelective() {

        //用下面这个方法要在实体类加一个构造
        SysAdminInfo sai = new SysAdminInfo(35, "保安游队长", "123123", "12580", "144sdd@qq.com", "img/face/qq (14).jpg", "启用", "大妈勾引他，被无情拒绝，并发通告通知全小区，搞得大妈没脸见人，人送外号铁面无私单身狗", 8);

        int i = sysAdminInfoService.updateByPrimaryKeySelective(sai);
        if (i == 0) {
            System.out.println("修改失败");
        } else {
            System.out.println("修改成功：" + i + "条数据");
        }
    }

    /**
     * 添加
     */
    @Test
    public void insertSelective() {

        SysAdminInfo si = new SysAdminInfo();
        si.setUsername("保安游队长");
        si.setUserpass("123123");
        si.setUserphone("12580");
        si.setUsermail("1263904710@qq.com");
        si.setUserqqface("img/face/qq (14).jpg");
        si.setUserflag("启用");
        si.setUserstyle("黑脸包公，铁面无私");
        si.setRoleid(8);
        int i = sysAdminInfoService.insertSelective(si);
        if (i == 0) {
            System.out.println("增加失败");
        } else {
            System.out.println("增加成功：" + i + "条数据");
        }

    }


    /**
     * 删除
      */
    @Test
    public void deleteByPrimaryKey() {

        int i = sysAdminInfoService.deleteByPrimaryKey(36);

        if (i == 0) {
            System.out.println("删除失败");
        } else {
            System.out.println("删除成功：" + i + "条数据");
        }
    }

    /**
     * 带分页查询
     */
    @Test
    public void selectByExampleWithRowbounds() {

        SysAdminInfoExample sysAdminInfoExample = new SysAdminInfoExample();

        Integer pageNum = 2; // 第几页
        Integer Size = 3; // 每页的个数
        Integer Num = Size * (pageNum - 1); //从哪条数据分页
        List<SysAdminInfo> sysAdminInfoList = sysAdminInfoService.selectByExampleWithRowbounds(sysAdminInfoExample,new RowBounds(Num, Size));

        for (SysAdminInfo ai : sysAdminInfoList){
            System.out.println(ai.toString());
        }

    }


    @Test
    public void selectByPrimaryKey(){

        HouqinExample houqinExample=new HouqinExample();
        houqinExample.createCriteria().andUseridEqualTo(20);
        List<Houqin> houqins = houqinService.selectByExample(houqinExample);

        for (Houqin houqin : houqins) {
            System.out.println(houqin.toString());
        }
    }


}



















