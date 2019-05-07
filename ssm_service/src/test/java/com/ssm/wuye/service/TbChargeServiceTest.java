package com.ssm.wuye.service;

import com.ssm.wuye.domain.ChElectricMeter;
import com.ssm.wuye.domain.TbCharge;
import com.ssm.wuye.domain.TbChargeExample;
import com.ssm.wuye.vo.ElectricAndOwer;
import com.ssm.wuye.vo.GasAndOwer;
import com.ssm.wuye.vo.WaterAndOwer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * time：2019/4/25--15:59
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class TbChargeServiceTest {

    @Resource
    TbChargeService tbChargeService;
    @Resource
    //ChElectricSercice chElectricSercice;
  //  @Resource
    ChWaterService chWaterService;
    @Resource
    ChGasService chGasServicel;

//    @Test
//    public void test1(){
//        TbChargeExample tbChargeExample=new TbChargeExample();
//        List<TbCharge> tbCharges = tbChargeService.selectByExample(tbChargeExample);
//        for (TbCharge tbCharge : tbCharges) {
//            System.out.println(tbCharge.toString());
//        }
//
//    }
//    @Test
//    public void test2(){
//
//        List<ChElectricMeter> meterList = chElectricSercice.selectByExample(null);
//        for (ChElectricMeter tbCharge : meterList) {
//            System.out.println(tbCharge.toString());
//        }
//
//    }
//    @Test
//    public void test3(){
//
//        List<WaterAndOwer> waterAndOwerList = chWaterService.selectAll();
//        for (WaterAndOwer tbCharge : waterAndOwerList) {
//            System.out.println(tbCharge.toString());
//        }
//
//    }
    @Test
    public void test4(){

        List<GasAndOwer> gasAndOwers = chGasServicel.selectAll();
        for (GasAndOwer tbCharge : gasAndOwers) {
            System.out.println(tbCharge.toString());
        }

    }
    @Test
    public void test5(){

      //  List<ElectricAndOwer> electricAndOwers = chElectricSercice.selectAll();
      //  for (ElectricAndOwer tbCharge : electricAndOwers) {
        //    System.out.println(tbCharge.toString());
        }

 //   }

}