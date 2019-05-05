package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.NewsTypeVoiw;
import com.ssm.wuye.domain.NewsTypeVoiwExample;
import com.ssm.wuye.service.NewsTypeVoiwService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;



/**
 * desc:
 * author:zhs
 * time:2019-04-26  19:27:30
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class NewsTypeVoiwImplTest {

    @Resource
    NewsTypeVoiwService newsTypeVoiwService;
    @Test
    public  void testsearch(){

        List<NewsTypeVoiw> newsTypeVoiws = newsTypeVoiwService.selectByExample(null);
        for (NewsTypeVoiw newsTypeVoiw : newsTypeVoiws) {
            System.out.println(newsTypeVoiw.toString());
        }


    }
    @Test
    public  void testsearchid(){
        NewsTypeVoiwExample newsTypeVoiwExample = new NewsTypeVoiwExample();
        newsTypeVoiwExample.createCriteria().andNtidEqualTo(2);
        List<NewsTypeVoiw> newsTypeVoiws = newsTypeVoiwService.selectByExample(newsTypeVoiwExample);
        for (NewsTypeVoiw newsTypeVoiw : newsTypeVoiws) {
            System.out.println(newsTypeVoiw.getNtypename());
        }
    }
}