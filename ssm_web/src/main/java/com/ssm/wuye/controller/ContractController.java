package com.ssm.wuye.controller;

import com.ssm.wuye.domain.Contract;
import com.ssm.wuye.domain.ContractExample;
import com.ssm.wuye.domain.ContractType;
import com.ssm.wuye.service.ContractService;
import com.ssm.wuye.service.ContractTypeService;
import org.apache.ibatis.session.RowBounds;
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
@RequestMapping("con")
public class ContractController {

    @Resource
    ContractService contractService;

    @Resource
    ContractTypeService contractTypeService;

    /**
     * 查询全部
     */
    @RequestMapping("consearch")
    public ModelAndView search() {
        ModelAndView m = new ModelAndView("pages/huoduan/hetong/hetong");
        List<Contract> contractList = contractService.selectByExample(null);
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
        m.addObject("contractList",contractList);
        return m;
    }


    /**
     * 增加一条数据
     *
     */
    @RequestMapping("consave")
    public ModelAndView contractsave(@ModelAttribute Contract con ){
        ModelAndView m = new ModelAndView("redirect:/con/consearch.do");
        int i=contractService.insertSelective(con);
        if(i==0){
            System.out.println("增加失败");
        }else {
            System.out.println("增加成功:"+i+"条数据");
        }

        return  m;
    }


    /**
     * 获取一条数据
     * @return
     */
    @RequestMapping("searchone")
    public ModelAndView searchone(@RequestParam Integer contractid ){
        ModelAndView m=new ModelAndView("pages/huoduan/hetong/hetongupdate");
        Contract contract = contractService.selectByPrimaryKey(contractid);
        List<ContractType> types = contractTypeService.selectByExample(null);
        m.addObject("types",types);
        m.addObject("contract",contract);
        System.out.println("获取到了一条数据-----------");
        return  m;
    }

    /**
     * 获取合同类别
     *
     * @return
     */
    @RequestMapping("searchType")
    public ModelAndView searchType( ){
        ModelAndView m=new ModelAndView("pages/huoduan/hetong/hetongadd");
        List<ContractType> types = contractTypeService.selectByExample(null);
        m.addObject("types",types);
        System.out.println("获取到了一条数据-----------");
        return  m;
    }
    /**
     *根据主键ID修改
     * @return
     */
    @RequestMapping("conupdate")
    public ModelAndView conupdate(@ModelAttribute Contract con){
        ModelAndView m=new ModelAndView("redirect:/con/consearch.do");
        int i=contractService.updateByPrimaryKeySelective(con);
        if(i==0){
            System.out.println("修改失败");
        }else {
            System.out.println("修改成功:"+i+"条数据");
        }
        List<Contract> contractList = contractService.selectByExample(null);
        m.addObject("contractList",contractList);
        return  m;
    }

    /**
     *根据主键ID删除
     * @return
     */
    @RequestMapping("condelete")
    public  ModelAndView condelete(@RequestParam Integer contractid){
        ModelAndView m=new ModelAndView("redirect:/con/consearch.do");
        int i=contractService.deleteByPrimaryKey(contractid);
        if(i==0){
            System.out.println("删除失败");
        }else {
            System.out.println("删除成功:"+i+"条数据");
        }
        return m;
    }


    private List<Contract> serchall() {
        ContractExample contractExample = new ContractExample();
        Integer pageNum = 1;//页码
        Integer Size = 2;//条数
        Integer Num = Size * (pageNum - 1);//从哪条数据分页
        List<Contract> contractList = contractService.selectByExampleWithRowbounds(contractExample, new RowBounds(0, 2));
        return contractList;
    }


}
