package com.ssm.wuye.service;


import com.ssm.wuye.vo.ElectricAndOwer;
import com.ssm.wuye.vo.GasAndOwer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
    ChElectricService chElectricSercice;
    @Resource
    ChWaterService chWaterService;
    @Resource
    ChGasService chGasServicel;
    @Resource
    TbPayService tbPayService;


//    @Test
//    public void tbPayServicetest5(){
//
//        List<PayCharge> payCharges = tbPayService.selectByExample(11111, "水费");
//        for (PayCharge payCharge : payCharges) {
//            System.out.println(payCharge.getPayid());
//        }
//    }
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

        List<ElectricAndOwer> electricAndOwers = chElectricSercice.selectAll();
        for (ElectricAndOwer tbCharge : electricAndOwers) {
            System.out.println(tbCharge.toString());
        }

    }
//    @Test
////    public void testlll(){
////        TbChargeExample tbChargeExample=new TbChargeExample();
////        TbChargeExample tbChargeExample1=new TbChargeExample();
////        tbChargeExample.createCriteria().andChargenameEqualTo("水费");
////        tbChargeExample1.createCriteria().andChargenameEqualTo("电费");
////        List<TbCharge> tbCharges = tbChargeService.selectByExample(tbChargeExample);
////        List<TbCharge> tbCharges1 = tbChargeService.selectByExample(tbChargeExample1);
////        System.out.println("水"+tbCharges.size()+"电"+tbCharges1.size());
////
////        if (tbCharges.size()>=tbCharges1.size()){
////            TbChargeExample tbChargeExample2=new TbChargeExample();
////            tbChargeExample2.createCriteria().andChargenameEqualTo("燃气费");
////            List<TbCharge> tbCharges2 = tbChargeService.selectByExample(tbChargeExample2);
////            System.out.println("燃气"+tbCharges2.size());
////            if (tbCharges.size()>=tbCharges2.size()){
//////                model.addAttribute("tbCharges",tbCharges);
////                System.out.println("1");
////            }else {
////                TbChargeExample tbChargeExample3=new TbChargeExample();
////                tbChargeExample3.createCriteria().andChargenameEqualTo("物业费");
////                List<TbCharge> tbCharges3 = tbChargeService.selectByExample(tbChargeExample3);
////                System.out.println("物业"+tbCharges.size());
////                if (tbCharges2.size()>=tbCharges3.size()){
//////                model.addAttribute("tbCharges",tbCharges1);
////                    System.out.println("2");
////                }else {
//////                model.addAttribute("tbCharges",tbChargeExample2);
////                    System.out.println("3");
////                }
//////
////            }
////        }else {
////            TbChargeExample tbChargeExample2=new TbChargeExample();
////            tbChargeExample2.createCriteria().andChargenameEqualTo("物业费");
////            List<TbCharge> tbCharges2 = tbChargeService.selectByExample(tbChargeExample2);
////            System.out.println("物业"+tbCharges.size());
////            if (tbCharges1.size()>=tbCharges2.size()){
//////                model.addAttribute("tbCharges",tbCharges1);
////                System.out.println("4");
////            }else {
////                TbChargeExample tbChargeExample3=new TbChargeExample();
////                tbChargeExample3.createCriteria().andChargenameEqualTo("燃气费");
////                List<TbCharge> tbCharges3 = tbChargeService.selectByExample(tbChargeExample3);
////                System.out.println("燃气"+tbCharges.size());
////                if (tbCharges2.size()>=tbCharges3.size()){
//////                model.addAttribute("tbCharges",tbCharges1);
////                    System.out.println("5");
////                }else {
//////                model.addAttribute("tbCharges",tbChargeExample2);
////                    System.out.println("6");
////                }
////            }
////        }
////    }
    @Test
    public void testdate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

        String createdate = sdf.format(date);
        System.out.println(createdate);
    }

}