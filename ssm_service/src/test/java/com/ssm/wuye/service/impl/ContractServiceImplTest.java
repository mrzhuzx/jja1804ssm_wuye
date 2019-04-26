package com.ssm.wuye.service.impl;

import com.ssm.wuye.domain.Contract;
import com.ssm.wuye.domain.ContractExample;
import com.ssm.wuye.service.ContractService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * desc:
 * author:lzp
 * {time}2019-4-25 10:40:02
 * 主要对数据层进行测试
 * version:1.2.3
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"})
public class ContractServiceImplTest {
    @Resource
    ContractService contractService;

    /*
     *查询条数
     */
    @Test
    public  void countByExample() {
        ContractExample contractExample=new ContractExample();
        Long li=contractService.countByExample(contractExample);
        System.out.println(li);

    }


    /*
     * 增加一条数据
     */
    @Test
    public void insertSelective() {
        Contract con=new Contract();
        con.setContractname("户主协议合同");
        con.setContractnum("No.1258011004");
        con.setContracttype("4");
        con.setContractdes("与游奋前队长的最高级协议合同，这是人类的一大步，也是队长的一小步");
        con.setSignatorytelephone("15000001111");
        con.setSigningpeople("游奋前队长");
        con.setContractstart(new Date(2019-02-10));
        con.setContractend(new Date(2069-02-10));

        int i=contractService.insertSelective(con);
        if(i==0){
            System.out.println("增加失败");
        }else {
            System.out.println("增加成功:"+i+"条数据");
        }
    }

    /**
     *带条件查询
     */
    @Test
    public void selectByExample() {
        ContractExample contractExample=new ContractExample();
        contractExample.createCriteria().andSigningpeopleEqualTo("刘诗诗");//线性，and列名EqualTo（条件）
        //contractExample.createCriteria().andContracttypeEqualTo("3");
        System.out.println("***********************");
        List<Contract> contracts = contractService.selectByExample(contractExample);
        for ( Contract contract:contracts) {
            System.out.println(contract.toString());
        }
    }

    /**
     * 分页查询带有条件
     */
    @Test
    public void selectByExampleWithRowbounds() {
        ContractExample contractExample=new ContractExample();
        /**
         * 方法二：RowBounds rowBounds = new RowBounds(offset:0,limit:5);// offset起始行 // limit是当前页显示多少条数据
         * List<MyHouse> myHouseList=myHouseService.selectByExampleWithRowbounds(myHouseExample,rowBounds)；
         */
        Integer pageNum=1;
        Integer Size=2;
        Integer Num =Size*(pageNum-1);
        List<Contract> contractList=contractService.selectByExampleWithRowbounds(contractExample,new RowBounds(0,2));
        for (Contract contract  :contractList) {
            System.out.println(contract.toString());
        }
    }


    /*
     *查询一条数据
     */
    @Test
    public void selectByPrimaryKey() {
        Contract contract=contractService.selectByPrimaryKey(1);
        System.out.println(contract.toString());
    }


    /**
     * 修改
     */
    @Test
    public void updateByPrimaryKeySelective() {
        Contract con=new Contract();
        con.setContractid(5);
        con.setContractname("户主协议合同01");
        con.setContractnum("No.1258011004");
        con.setContracttype("4");
        con.setContractdes("与游奋前队长的最高级协议合同，这是人类的一大步，也是队长的一小步");
        con.setSignatorytelephone("15000001111");
        con.setSigningpeople("游奋前队长");
        con.setContractstart(new Date(2019-02-10));
        con.setContractend(new Date(2069-02-10));
        int i=contractService.updateByPrimaryKeySelective(con);

        if(i==0){
            System.out.println("修改失败");
        }else {
            System.out.println("修改成功:"+i+"条数据");
        }
    }
}