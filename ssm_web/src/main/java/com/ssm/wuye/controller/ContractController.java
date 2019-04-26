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
import java.util.Date;
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
     * 带条件分页查询
     */
    @RequestMapping("consearch")
    public ModelAndView search() {
        ModelAndView m = new ModelAndView("pages/houduan/hetong.jsp");
        ContractExample contractExample = new ContractExample();
        Integer pageNum = 1;//页码
        Integer Size = 2;//条数
        Integer Num = Size * (pageNum - 1);//从哪条数据分页
        List<Contract> contractList = contractService.selectByExampleWithRowbounds(contractExample, new RowBounds(0, 2));
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
        return m;
    }


    /**
     * 增加一条数据
     *
     */
    @RequestMapping("consave")
    public ModelAndView contractsave(@ModelAttribute Contract con ){
        ModelAndView m = new ModelAndView("pages/houduan/hetong.jsp");
        int i=contractService.insertSelective(con);
       if(i==0){
            System.out.println("增加失败");
        }else {
            System.out.println("增加成功:"+i+"条数据");
        }
        List<Contract> serchall = serchall();
       m.addObject("serchall",serchall);//
        return  m;
    }

    /**
     * 查询全部
     * @return
     */




    private List<Contract> serchall() {
        ContractExample contractExample = new ContractExample();
        Integer pageNum = 1;//页码
        Integer Size = 2;//条数
        Integer Num = Size * (pageNum - 1);//从哪条数据分页
        List<Contract> contractList = contractService.selectByExampleWithRowbounds(contractExample, new RowBounds(0, 2));
        return contractList;
    }


}
