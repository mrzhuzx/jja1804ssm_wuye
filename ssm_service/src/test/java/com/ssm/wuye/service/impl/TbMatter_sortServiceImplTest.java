package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.TbMatter_sort;
import com.ssm.wuye.domain.TbMatter_sortExample;
import com.ssm.wuye.service.TbMatter_sortService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class TbMatter_sortServiceImplTest {
    @Resource
TbMatter_sortService tbMatter_sortService;
    @Test
    public void deleteByPrimaryKey() {
        int i=tbMatter_sortService.deleteByPrimaryKey(1006);
        if (i==0){
            System.out.println("删除失败");

        }else {
            System.out.println("删除成功:\"+i+\"条数据");
        }
    }

    @Test
    public void insertSelective() {
        TbMatter_sort t=new TbMatter_sort("游戏");
        int i=tbMatter_sortService.insertSelective(t);
        if(i==0){
            System.out.println("增加失败");
        }else {
            System.out.println("增加成功:"+i+"条数据");
        }

    }

    @Test
    public void selectByExample() {
        TbMatter_sortExample tbMatter_sortExample=new TbMatter_sortExample();
        tbMatter_sortExample.createCriteria().andMattersortEqualTo("健身器材");
        List<TbMatter_sort>tbMatter_sortList=tbMatter_sortService.selectByExample(tbMatter_sortExample);
        for(TbMatter_sort tbMatter_sort:tbMatter_sortList){
            System.out.println(tbMatter_sort.toString());
        }

    }

    @Test
    public void selectByExampleWithRowbounds() {
        TbMatter_sortExample tbMatter_sortExample = new TbMatter_sortExample();
        Integer pageNum = 1;
        Integer Size = 8;
        Integer Num = Size * (pageNum - 1);
        List<TbMatter_sort> tbMatter_sortList = tbMatter_sortService.selectByExampleWithRowbounds(tbMatter_sortExample,new RowBounds(Num,Size ));
        for (TbMatter_sort tbMatter_sort:tbMatter_sortList){
            System.out.println(tbMatter_sort.toString());
        }
    }

    @Test
    public void selectByPrimaryKey() {
        TbMatter_sort tbMatter_sort=tbMatter_sortService.selectByPrimaryKey(1007);
        System.out.println(tbMatter_sort.toString());

    }

    @Test
    public void updateByPrimaryKeySelective() {
        TbMatter_sort tbMatter_sort=new TbMatter_sort(1007,"书籍");
        int i=tbMatter_sortService.updateByPrimaryKeySelective(tbMatter_sort);
        if(i==0){
            System.out.println("修改失败");
        }else {
            System.out.println("修改成功:"+i+"条数据");
        }

    }
}