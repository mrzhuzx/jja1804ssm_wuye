package com.ssm.wuye.dao;

import com.ssm.wuye.domain.NewsType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * desc:
 * author : tzhu
 * time :2019/4/24 0024
 * version: 1.2.3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class NewsTypeMapperTest {

    @Autowired
    NewsTypeMapper newsTypeMapper;
    @Test
    public void testsearch() {

        List<NewsType> newsTypes = newsTypeMapper.selectByExample(null);
        for (NewsType newsType : newsTypes) {
            System.out.println(newsType.getNtid()+"  "+newsType.getNtypename());
        }
    }
    @Test
    public void testdelet() {

        int i = newsTypeMapper.deleteByPrimaryKey(8);
        if (i==1){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
    @Test
    public void testsave(){

        NewsType  tewsType = new NewsType();
        tewsType.setNtypename("公司活动");
        int insert = newsTypeMapper.insert(tewsType);
        if (insert==1){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }


    }

    @Test
    public void testupdate(){

        NewsType  tewsType = new NewsType();
        tewsType.setNtypename("活动策划");
        tewsType.setNtid(9);
        int i = newsTypeMapper.updateByPrimaryKeySelective(tewsType);
        if (i==1){
            System.out.println("更新成功");
        }else {
            System.out.println("添加失败");
        }

}
}