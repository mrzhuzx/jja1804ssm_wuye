package com.ssm.wuye.controller;

import com.ssm.wuye.domain.ParkingPlaceinfo;
import com.ssm.wuye.domain.ParkingPlaceinfoExample;
import com.ssm.wuye.service.ParkingPlaceinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-04-30  10:01:43
 */
@Controller
@RequestMapping("parking")
public class ParkingPlaceinfoController {
    @Resource
    ParkingPlaceinfoService parkingPlaceinfoService;
    @RequestMapping("pk_list")
    public ModelAndView pk_list(@RequestParam Integer olid){
        ModelAndView m = new ModelAndView("pages/gitqian/parkingc");

        ParkingPlaceinfoExample parkingPlaceinfoExample = new ParkingPlaceinfoExample();
        parkingPlaceinfoExample.createCriteria().andOlidEqualTo(olid);
        List<ParkingPlaceinfo> parkingPlaceinfos = parkingPlaceinfoService.selectByExample(parkingPlaceinfoExample);
        m.addObject("pk_list",parkingPlaceinfos);
        return m;
    }
    @RequestMapping("pk_cha")
    public ModelAndView pk_cha(@RequestParam Integer olid, @RequestParam String descr){
        ModelAndView m = new ModelAndView("forward:/parking/pk_list.do");
        ParkingPlaceinfo parkingPlaceinfo = new ParkingPlaceinfo();
        parkingPlaceinfo.setDescr(descr);
        ParkingPlaceinfoExample parkingPlaceinfoExample=new ParkingPlaceinfoExample();
        parkingPlaceinfoExample.createCriteria().andOlidEqualTo(olid);
        int i = parkingPlaceinfoService.updateByExampleSelective(parkingPlaceinfo,parkingPlaceinfoExample);
        if (i==1){
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
        return m;
    }

}
