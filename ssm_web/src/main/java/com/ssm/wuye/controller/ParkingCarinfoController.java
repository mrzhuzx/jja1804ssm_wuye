package com.ssm.wuye.controller;

import com.ssm.wuye.dao.ParkingCarinfoMapper;
import com.ssm.wuye.domain.ParkingCarinfo;
import com.ssm.wuye.domain.ParkingCarinfoExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-05-05  19:21:24
 */
@Controller
@RequestMapping("")
public class ParkingCarinfoController {
    @Resource
    ParkingCarinfoMapper parkingCarinfoMapper;

    @RequestMapping("searchcar")
    public ModelAndView searchcar(@RequestParam  String  Parkingcards){
        ModelAndView m = new ModelAndView("pages/gitqian/parking_carinfo");

        ParkingCarinfoExample   parkingCarinfoExample = new ParkingCarinfoExample();
        System.out.println(Parkingcards);
        parkingCarinfoExample.createCriteria().andParkingcardsEqualTo(Parkingcards);
        List<ParkingCarinfo> parkingCarinfos = parkingCarinfoMapper.selectByExample(parkingCarinfoExample);

        ParkingCarinfo parkingCarinfo = new ParkingCarinfo();
        for (ParkingCarinfo carinfo : parkingCarinfos) {
            parkingCarinfo=carinfo;
        }
        m.addObject("parkingCarinfos",parkingCarinfo);

        return  m;
    }
    @RequestMapping("jine")
    public ModelAndView jine(@RequestParam  Integer parkingid,@RequestParam  Date  parkingintime,@RequestParam  Date  parkingouttime,@RequestParam  String  paymentmethod){

        ModelAndView m = new ModelAndView("pages/gitqian/parking_carinfo");
        long diff = parkingouttime.getTime() -parkingintime.getTime();//这样得到的差值是微秒级别
        long days = diff / (1000 * 60 * 60 * 24);
        long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
        System.out.println(""+days+"天"+hours+"小时");
        String mm=(((days*24)+hours)+"小时");
        long min=((diff/(60*1000))-days*24*60-hours*60);
        System.out.println(min+"分钟");



        m.addObject("mm",mm);
        m.addObject("min",min);

        Integer Paymentmethod = Integer.valueOf(paymentmethod);

        ParkingCarinfo  pc = new ParkingCarinfo();

        if (min>30){
            String money=((days*24)+hours)*3+3+"";
            pc.setParkingcost(money);
            m.addObject("money",money);
        }else {
            String money=((days*24)+hours)*3+"";
            pc.setParkingcost(money);
            m.addObject("money",money);
        }

        pc.setParkingid(parkingid);

        pc.setPaymentmethod(Paymentmethod);
        pc.setPaymentstatus(1);
        int i = parkingCarinfoMapper.updateByPrimaryKeySelective(pc);
        if (i==1){
            System.out.println("更新成功");
        }else {
            System.out.println("添加失败");
        }


        return m;
    }

    @RequestMapping("list")
    public ModelAndView list(){
        ModelAndView m = new ModelAndView("pages/huoduan/parking_carinfo");

        List<ParkingCarinfo> parkingCarinfos = parkingCarinfoMapper.selectByExample(null);

        m.addObject("parkingCarinfos",parkingCarinfos);

        return m;
    }
}
