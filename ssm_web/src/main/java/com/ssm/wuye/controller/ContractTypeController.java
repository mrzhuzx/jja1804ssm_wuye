package com.ssm.wuye.controller;

import com.ssm.wuye.domain.ContractType;
import com.ssm.wuye.service.ContractTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:卢智鹏
 * {time}
 * version:1.2.3
 */
@Controller
@RequestMapping("cont")
public class ContractTypeController {

    @Resource
    ContractTypeService contractTypeService;

    /**
     * 查询全部
     */
    @RequestMapping("ctsearch")
    public ModelAndView ctsearch(){
        ModelAndView m=new ModelAndView("pages/huoduan/httype");
        List<ContractType> types = contractTypeService.selectByExample(null);
        for (ContractType contractType:types) {
            System.out.println(contractType.toString());
        }
      m.addObject("types",types);
      return m;
    }

    /**
     * 增加一种类型
     */
    @RequestMapping("ctsave")
    public  ModelAndView  ctsave(@ModelAttribute ContractType contypetid){
        ModelAndView  m=new ModelAndView("redirect:/cont/ctsearch.do");
        int i=contractTypeService.insertSelective(contypetid);
        if(i==0){
            System.out.println("增加失败");
        }else {
            System.out.println("增加成功:"+i+"条数据");
        }
        return  m;
    }

    /**
     * 获取一条数据
     */
  @RequestMapping("ctone")
    public  ModelAndView ctone(@RequestParam Integer contypeid){
      ModelAndView m=new ModelAndView("pages/huoduan/htupdate");
      ContractType type=contractTypeService.selectByPrimaryKey(contypeid);
      m.addObject("type",type);
      System.out.println("获取到了一条数据-----------");
     return m;
  }

    /**
     *修改
     */
  @RequestMapping("ctupdate")
    public ModelAndView ctupdate(@ModelAttribute ContractType cont){
      ModelAndView m=new ModelAndView("redirect:/cont/ctsearch.do");
      int i=contractTypeService.updateByPrimaryKeySelective(cont);
      if(i==0){
          System.out.println("修改失败");
      }else {
          System.out.println("修改成功:"+i+"条数据");
      }
      List<ContractType> types = contractTypeService.selectByExample(null);
      m.addObject("types",types);
      return m;
  }

    /**
     * 删除
     */
    @RequestMapping("ctdelect")
    public ModelAndView ctdelect(@RequestParam Integer contypeid){
        ModelAndView m=new ModelAndView("redirect:/cont/ctsearch.do");
        int i=contractTypeService.deleteByPrimaryKey(contypeid);
        if(i==0){
            System.out.println("删除失败");
        }else {
            System.out.println("删除成功:"+i+"条数据");
        }
        return m;
    }

}
