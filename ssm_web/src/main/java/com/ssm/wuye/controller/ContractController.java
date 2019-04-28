package com.ssm.wuye.controller;

import com.ssm.wuye.domain.Contract;
import com.ssm.wuye.domain.ContractExample;
import com.ssm.wuye.service.ContractService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */


@Controller
@RequestMapping("con")
public class ContractController {

    @Resource
    ContractService contractService;

    /**
     * 查询全部
     */
    @RequestMapping("consearch")
    public ModelAndView search() {
        ModelAndView m = new ModelAndView("pages/huoduan/hetong");
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
        ModelAndView m = new ModelAndView("forward:/con/consearch.do");
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
    public ModelAndView searchone(Integer contracid ){
        ModelAndView m=new ModelAndView("pages/houduan/hetongupdate");
        Contract contract = contractService.selectByPrimaryKey(contracid);
        System.out.println("获取到了一条数据-----------");
        List<Contract> contractList = contractService.selectByExample(null);
        m.addObject("contractList",contractList);
        return  m;
    }

    /**
     *根据主键ID修改
     * @return
     */
    @RequestMapping("conupdate")
    public ModelAndView conupdate(@ModelAttribute Contract con){
        ModelAndView m=new ModelAndView("forward:/con/consearch.do");
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
     public  ModelAndView condelete(@ModelAttribute Integer contractid){
        ModelAndView m=new ModelAndView("forward:/con/consearch.do");
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
