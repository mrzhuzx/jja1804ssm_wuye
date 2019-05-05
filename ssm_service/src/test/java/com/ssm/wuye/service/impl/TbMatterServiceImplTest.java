package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.TbMatter;
import com.ssm.wuye.domain.TbMatterExample;
import com.ssm.wuye.service.TbMatterService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

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
        int i =tbMatterService.deleteByPrimaryKey(10004);
        if (i==0){
            System.out.println("删除失败");

        }else {
            System.out.println("删除成功:\"+i+\"条数据");
        }
    }

    @Test
    public void insertSelective() {
        TbMatter t=new TbMatter("11",10,10.00,1002,new Date(),new Date(),"可用");
int i=tbMatterService.insertSelective(t);
    if(i==0){
        System.out.println("增加失败");
    }else {
        System.out.println("增加成功:"+i+"条数据");
    }
    }

    @Test
    public void selectByExample() {
        TbMatterExample tbMatterExample=new TbMatterExample();
        tbMatterExample.createCriteria().andMatterstateEqualTo("可用");
        List<TbMatter> tbMattersList=tbMatterService.selectByExample(tbMatterExample);
        for(TbMatter tbMatter:tbMattersList){
            System.out.println(tbMatter.toString());

        }
    }

    @Test
    public void selectByExampleWithRowbounds() {
        TbMatterExample tbMatterExample=new TbMatterExample();
        Integer pageNum=1;
        Integer Size=8;
        Integer Num =Size*(pageNum-1);
        List<TbMatter> tbMattersList =tbMatterService.selectByExampleWithRowbounds(tbMatterExample,new RowBounds(Num, Size));
        for (TbMatter tbMatters:tbMattersList) {
            System.out.println(tbMatters.toString());
        }
    }

    @Test
    public void selectByPrimaryKey() {
        TbMatter tbMatter=tbMatterService.selectByPrimaryKey(10);
        System.out.println(tbMatter.toString());
    }

    @Test
    public void updateByPrimaryKeySelective() {

        TbMatter tbMatter=new TbMatter(57,"凳子1",10, 100.00,1002,new Date(),new Date(),"不可用");
        int i=tbMatterService.updateByPrimaryKeySelective(tbMatter);

        if(i==0){
            System.out.println("修改失败");
        }else {
            System.out.println("修改成功:"+i+"条数据");
        }

    }
}