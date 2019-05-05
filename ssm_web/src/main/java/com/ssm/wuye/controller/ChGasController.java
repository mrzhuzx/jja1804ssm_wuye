package com.ssm.wuye.controller;



import com.ssm.wuye.domain.ChGasMeter;

import com.ssm.wuye.domain.ChGasMeterExample;
import com.ssm.wuye.domain.MyHouse;
import com.ssm.wuye.service.ChGasService;
import com.ssm.wuye.service.MyHouseService;
import com.ssm.wuye.vo.GasAndOwer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * time：2019/4/27--16:21
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Controller
@RequestMapping("gas")
public class ChGasController {
    @Resource
    ChGasService chGasService;
    @Resource
    MyHouseService myHouseService;

    /**
     * 查询全部燃气
     * @return
     */
    @RequestMapping("searchAll")
    public ModelAndView searchAll(){
        ModelAndView view=new ModelAndView("pages/huoduan/shoufei/gasAll");
        List<GasAndOwer> gasAndOwers = chGasService.selectAll();
        System.out.println("_______________________________________________"+gasAndOwers.toString());
        view.addObject("gasAndOwers",gasAndOwers);
        return view;
    }

    @RequestMapping("searchOne")
    public ModelAndView searchOne(@RequestParam Integer id){
        ModelAndView view=new ModelAndView("pages/huoduan/shoufei/gasUpdate");
        ChGasMeter chGasMeter = chGasService.selectByPrimaryKey(id);
        List<MyHouse> myHouseList = myHouseService.selectByExample(null);
        view.addObject("myHouseList",myHouseList);
        view.addObject("chGasMeter",chGasMeter);
        return view;
    }

    @RequestMapping("insertOne")
    public ModelAndView insertOne(@ModelAttribute ChGasMeter chGasMeter){
        ModelAndView view=new ModelAndView("redirect:/gas/searchAll.do");
        chGasMeter.setGasnumber("gas"+chGasMeter.getHouseid());
        int i = chGasService.insertSelective(chGasMeter);
        if (i>=0){
            System.out.println("添加成功！！");
        }else {
            System.out.println("添加失败！！！");

        }
        return view;
    }
    @RequestMapping("updateOne")
    public ModelAndView updateOne(@ModelAttribute ChGasMeter chGasMeter){
        ModelAndView view=new ModelAndView("redirect:/gas/searchAll.do");
        ChGasMeterExample chGasMeterExample=new ChGasMeterExample();
        chGasMeterExample.createCriteria().andIdEqualTo(chGasMeter.getId());
        chGasMeter.setGasnumber("gas"+chGasMeter.getHouseid());
        int i = chGasService.updateByExampleSelective(chGasMeter, chGasMeterExample);
        if (i>=0){
            System.out.println("修改成功！！");
        }else {
            System.out.println("修改失败！！！");

        }
        return  view;
    }
    @RequestMapping("deleteOne")
    public ModelAndView deleteOne(@RequestParam Integer id){
        ModelAndView view=new ModelAndView("redirect:/gas/searchAll.do");
        int i = chGasService.deleteByPrimaryKey(id);
        if (i>=0){
            System.out.println("删除成功！！！");

        }else {
            System.out.println("删除失败！！");

        }
        return view;
    }
}
