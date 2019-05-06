package com.ssm.wuye.controller;

/*
 *desc: 人事模块
 *author:wjs
 *time:2019/4/26 0026
 *version:1.2.3
 */

import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.HouqinService;
import com.ssm.wuye.service.SysAdminInfoService;
import com.ssm.wuye.service.SysRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("ai")
public class SysAdminInfoController {

    @Resource
    SysAdminInfoService sysAdminInfoService;
    @Resource
    HouqinService houqinService;
    @Resource
    SysRoleService sysRoleService;


    /**
     * 查询全部数据
     * @return
     */
    @RequestMapping("infosearch")
    public ModelAndView search(){
      ModelAndView m =new ModelAndView("pages/huoduan/sysadniminfo");
      SysAdminInfoExample sysAdminInfoExample=new SysAdminInfoExample();
      List<SysAdminInfo> sysAdminInfoList=sysAdminInfoService.selectByExample(sysAdminInfoExample);
      m.addObject("sysAdminInfoList",sysAdminInfoList);
      return m;

  }


    /**
     * 人事视图查询
     * @return
     */
    @RequestMapping("houqinsearch")
  public  ModelAndView houqinsearch(){
      ModelAndView m=new ModelAndView("pages/huoduan/sysadniminfo");
      HouqinExample houqinExample=new HouqinExample();
      /*houqinExample.createCriteria().andRolenameEqualTo("保安队长");*/
        List<Houqin> houqins = houqinService.selectByExample(houqinExample);
        m.addObject("houqins",houqins);
      return m;

  }


  /**
     * 带条件分页查询
     * @return
     */
//    @RequestMapping("infosearch")
//    public ModelAndView search() {
//
//        ModelAndView m = new ModelAndView("pages/huoduan/sysadniminfo.jsp");
//        SysAdminInfoExample sysAdminInfoExample = new SysAdminInfoExample();
//        Integer pageNum = 1; //页码
//        Integer Size = 10; //每页条数
//        Integer Num = Size * (pageNum - 1);
//        List<SysAdminInfo> sysAdminInfoList = sysAdminInfoService.selectByExampleWithRowbounds(sysAdminInfoExample, new RowBounds(Num, Size));
//        for (SysAdminInfo sai : sysAdminInfoList) {
//            System.out.println(sai.toString());
//        }
//        return m;
//    }
    /**
     * 获取职位信息（配合修改方法使用）
     * @param
     * @return
     */
    @RequestMapping("searchRole")
    public ModelAndView searchRole() {
        ModelAndView m =new ModelAndView("pages/huoduan/adniminfotianjia");
        List<SysRole> sysRoles = sysRoleService.selectByExample(null);
        m.addObject("sysRoles",sysRoles);
        for (SysRole sysRole : sysRoles) {
            sysRole.getRolename();
        }
        System.out.println("获取到一条数据...........");
        return m;

    }

    /**
     * 添加
     * @return
     */
    @RequestMapping("infosave")
    public ModelAndView save(@ModelAttribute SysAdminInfo sai) {

        ModelAndView m = new ModelAndView("redirect:/ai/houqinsearch.do");
        int i = sysAdminInfoService.insertSelective(sai);
        if (i == 0) {
            System.out.println("添加失败...........");
        } else {
            System.out.println("添加成功：" + i + "条数据");
        }
        return m;
    }

    /**
     * 获取一条数据（配合修改方法使用）
     * @param userid
     * @return
     */
    @RequestMapping("infosearchone")
   public ModelAndView searchone(@RequestParam Integer userid) {
        ModelAndView m =new ModelAndView("pages/huoduan/adniminfoxiugai");
        HouqinExample houqinExample=new HouqinExample();
        houqinExample.createCriteria().andUseridEqualTo(userid);
        List<Houqin> houqins = houqinService.selectByExample(houqinExample);
        List<SysRole> sysRoles = sysRoleService.selectByExample(null);
        Houqin houqin=new Houqin();
        for (Houqin houqin1 : houqins) {
            houqin= houqin1;
        }
        m.addObject("saif",houqin);
        m.addObject("sysRoles",sysRoles);
       System.out.println("获取到一条数据...........");
       return m;

   }
    /**
     * 修改
     * @param sysAdminInfo
     * @return
     */
    @RequestMapping("infoupdate")
    public ModelAndView update(@ModelAttribute SysAdminInfo sysAdminInfo){

        ModelAndView m =new ModelAndView("redirect:/ai/houqinsearch.do");
        int i=sysAdminInfoService.updateByPrimaryKeySelective(sysAdminInfo);
        if (i==0){
            System.out.println("修改失败...........");
        }else {
            System.out.println("修改成功："+i+"条数据");
        }
        SysAdminInfoExample sysAdminInfoExample=new SysAdminInfoExample();
        List<SysAdminInfo> sysAdminInfoList=sysAdminInfoService.selectByExample(sysAdminInfoExample);
        m.addObject("sysAdminInfoList",sysAdminInfoList);
        return m;
    }

    /**
     * 删除
      * @param userid
     * @return
     */
    @RequestMapping("infodelete")
    public ModelAndView delete(@RequestParam Integer userid){
        ModelAndView m =new ModelAndView("redirect:/ai/houqinsearch.do");
        int i=sysAdminInfoService.deleteByPrimaryKey(userid);
        System.out.println(userid);
        if (i==0){
            System.out.println("删除成功..........");
        }else {
            System.out.println("成功删除"+i+"条数据");
        }
        return m;
    }



}



























