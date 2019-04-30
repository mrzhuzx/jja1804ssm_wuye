package com.ssm.wuye.service.impl; /*
 *desc:
 *author:wjs
 *time:2019/4/30 0030
 *version:1.2.3
 */

import com.ssm.wuye.dao.HouqinMapper;
import com.ssm.wuye.domain.Houqin;
import com.ssm.wuye.domain.HouqinExample;
import com.ssm.wuye.service.HouqinService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class HouqinServiceImplTest {

    @Resource
    HouqinService houqinService;

    /**
     * 带条件查询（只能带一个条件查）
     */
    @Test
    public void selectByExamplet(){
        HouqinExample houqinExample=new HouqinExample();
       // houqinExample.createCriteria().andRolenameEqualTo("保安队长");
//        houqinExample.createCriteria().andRolenameEqualTo("保洁");
//        houqinExample.createCriteria().andRolenameEqualTo("绿化");
//        houqinExample.createCriteria().andRolenameEqualTo("保安");
        System.out.println("......................");
        List<Houqin> houqins = houqinService.selectByExample(houqinExample);
        for (Houqin houqin:houqins){
            System.out.println(houqin.toString());
        }
    }

}
