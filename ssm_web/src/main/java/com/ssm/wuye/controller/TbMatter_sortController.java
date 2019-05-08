package com.ssm.wuye.controller;

import com.ssm.wuye.domain.TbMatter_sort;
import com.ssm.wuye.domain.TbMatter_sortExample;
import com.ssm.wuye.service.TbMatter_sortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
@Controller
@RequestMapping("/type")
public class TbMatter_sortController {
    @Autowired
    TbMatter_sortService tbMatter_sortService;
    @RequestMapping("/search")
    public ModelAndView search() {
        ModelAndView m = new ModelAndView("pages/huoduan/typhon");
        TbMatter_sortExample tbMatter_sortExample=new TbMatter_sortExample();
        List<TbMatter_sort> tbMatter_sortList=tbMatter_sortService.selectByExample(tbMatter_sortExample);
        m.addObject("tbMatter_sortList",tbMatter_sortList);
    return m;
    }
    @RequestMapping("add")
    public ModelAndView tametteradd(@RequestParam String mattersort){
        TbMatter_sort tbMatter_sort=new TbMatter_sort(mattersort);
        System.out.println(tbMatter_sort.toString());
        ModelAndView m = new ModelAndView("forward:/type/search.do");
        int i =tbMatter_sortService.insertSelective(tbMatter_sort);

        if (i == 0) {
            System.out.println("增加失败");
        } else {
            System.out.println("增加成功:" + i + "条数据");
        }
        return m;
    }
    @RequestMapping("/catch")
    public ModelAndView single(@RequestParam Integer mattersortid){
        ModelAndView m = new ModelAndView("pages/huoduan/typhonupdate");
        TbMatter_sort tbMatter_sort=tbMatter_sortService.selectByPrimaryKey(mattersortid);
        m.addObject("tbMatter_sort",tbMatter_sort);
        System.out.println("获取到了一条数据-----------");
        return m;
    }
    @RequestMapping("/modify")
    public  ModelAndView modify(@RequestParam Integer mattersortid,@RequestParam String mattersort){
        TbMatter_sort tbMatter_sort=new TbMatter_sort(mattersortid,mattersort);
        System.out.println(mattersortid+mattersort);
        ModelAndView m = new ModelAndView("forward:/type/search.do");
        int i =tbMatter_sortService.updateByPrimaryKeySelective(tbMatter_sort);
        if(i==0){
            System.out.println("修改失败");
        }else {
            System.out.println("修改成功:"+i+"条数据");
        }

        return m;
    }
    @RequestMapping("/delete")
    public ModelAndView delete(@RequestParam Integer mattersortid){
        ModelAndView m = new ModelAndView("forward:/type/search.do");
        int i =tbMatter_sortService.deleteByPrimaryKey(mattersortid);
        if(i==0){
            System.out.println("删除失败");
        }else {
            System.out.println("删除成功:"+i+"条数据");
        }
        List<TbMatter_sort> tbMatter_sortList=tbMatter_sortService.selectByExample(null);
        m.addObject("tbMatter_sortList",tbMatter_sortList);
        return m;
    }
}
