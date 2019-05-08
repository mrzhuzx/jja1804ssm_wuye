package com.ssm.wuye.controller;
/*
 *desc:
 *author:wjs
 *time:2019/5/5 0005
 *version:1.2.3
 */

import com.ssm.wuye.dao.XiangmuMapper;
import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.NewsTypeService;
import com.ssm.wuye.service.ProgramService;
import com.ssm.wuye.service.ProgramTypeService;
import com.ssm.wuye.service.XiangmuSercice;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("pr")
public class ProgramController {

    @Resource
    XiangmuSercice xiangmuSercice;
    @Resource
    ProgramService programService;
    @Resource
    ProgramTypeService programTypeService;
    @Resource
    NewsTypeService newstypeService;

    /**
     * 项目视图查询
     *
     * @return
     */
    @RequestMapping("xiangmusearch")
    public ModelAndView xiangmusearch() {
        ModelAndView m = new ModelAndView("pages/huoduan/program");
        XiangmuExample xiangmuExample = new XiangmuExample();
        List<Xiangmu> xiangmuList = xiangmuSercice.selectByExample(xiangmuExample);
        m.addObject("xiangmuList", xiangmuList);
        return m;

    }

    /**
     * 类型查询
      * @return
     */
    @RequestMapping("xmtypesearch")
    public ModelAndView typesearch() {
        ModelAndView m = new ModelAndView("pages/gitqian/index");
        ProgramTypeExample programTypeExample=new ProgramTypeExample();
        List<ProgramType> programTypes = programTypeService.selectByExample(programTypeExample);
        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        m.addObject("newstypeList", newstypeList);
        m.addObject("programTypes", programTypes);
        return m;
    }


    /**
     * 类别下面的项目信息
     * @return
     */
    @RequestMapping("xmlxsearch")
    public ModelAndView xmlxsearch(@RequestParam Integer ptid,@RequestParam Integer pageNum) {
        ModelAndView m = new ModelAndView("pages/gitqian/products");
        ProgramTypeExample programTypeExample=new ProgramTypeExample();
        XiangmuExample xiangmuExample = new XiangmuExample();
        xiangmuExample.createCriteria().andPtidEqualTo(ptid);//根据类型ID条件查询
        long l =xiangmuSercice.countByExample(xiangmuExample);
        Integer con =(int)l;
        Integer Size=4;
        Integer pageAll= con%Size==0?con/Size:con/Size+1 ;
        if (pageNum<=1){
            pageNum = 1;
        }
        if (pageNum>pageAll){
            pageNum=pageAll;
        }
        Integer Num =Size*(pageNum-1);
        List<Xiangmu> xiangmus = xiangmuSercice.selectByExampleWithRowbounds(xiangmuExample, new RowBounds(Num, Size));
        m.addObject("xiangmus", xiangmus);
        List<ProgramType> programTypes = programTypeService.selectByExample(programTypeExample);
        ProgramType programType = programTypeService.selectByPrimaryKey(ptid);
        m.addObject("programType",programType);
        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        m.addObject("newstypeList", newstypeList);
        m.addObject("programTypes", programTypes);
        m.addObject("pageNum",pageNum);
        m.addObject("pageAll",pageAll);
        return m;
    }


    /**
     * 根据项目ID查询内容
     * @param pid
     * @return
     */
    @RequestMapping("proidsearch")
    public ModelAndView proidsearch(@RequestParam Integer pid,@RequestParam Integer ptid) {
        ModelAndView m = new ModelAndView("pages/gitqian/proxiangqingye");
        Program program = programService.selectByPrimaryKey(pid);
        ProgramType programType = programTypeService.selectByPrimaryKey(ptid);
        m.addObject("programType",programType);
        ProgramTypeExample programTypeExample=new ProgramTypeExample();
        List<ProgramType> programTypes = programTypeService.selectByExample(programTypeExample);
        List<NewsType> newstypeList = newstypeService.selectByExample(null);
        m.addObject("newstypeList", newstypeList);
        m.addObject("programTypes", programTypes);
        m.addObject("programs", program);
        return m;
    }
    /**
     * 添加
     * @param pg
     * @return
     */
    @RequestMapping("xiangmusave")
    public ModelAndView save(@ModelAttribute Program pg) {
        ModelAndView m = new ModelAndView("redirect:/pr/xiangmusearch.do");//添加完跳到查询页面
        int i = programService.insertSelective(pg);
        System.out.println(i);
        if (i == 0) {
            System.out.println("添加失败............");
        } else {
            System.out.println("添加成功：" + i + "条数据");
        }
        return m;
    }

    /**
     * 添加方法的迭代项目类型（获取一条数据）
     * @return
     */
    @RequestMapping("typesearch")
    public ModelAndView search(){

        ModelAndView m=new ModelAndView("pages/huoduan/programtianjia");//获取一条数据跳到添加的JSP页面
        List<ProgramType> programTypeList = programTypeService.selectByExample(null);

        m.addObject("programType",programTypeList); // " "内容用于JSP添加页面的items里面
        System.out.println("获取一条数据..............");
        return m;
    }

    /**
     * 获取一条数据（配合修改方法使用（迭代））
     * @param pid
     * @return
     */
    @RequestMapping("xmsearchone")
    public ModelAndView searchone(@RequestParam Integer pid){
        ModelAndView m=new ModelAndView("pages/huoduan/programxiugai");//获取一条数据跳到修改的JSP页面
        XiangmuExample xiangmuExample=new XiangmuExample();
        xiangmuExample.createCriteria().andPidEqualTo(pid);
        List<Xiangmu> xiangmuList = xiangmuSercice.selectByExample(xiangmuExample);
        List<ProgramType> programTypeList = programTypeService.selectByExample(null);
        Xiangmu xiangmu=new Xiangmu();
        for (Xiangmu xiangmu1:xiangmuList){
            xiangmu=xiangmu1;
        }
        m.addObject("prg",xiangmu); // " "用于修改的jsp页面${prg.pid}
        m.addObject("programType",programTypeList); // " "内容用于修改的JSP页面items里面
        System.out.println("获取到一条数据...........");
        return m;
    }

    /**
     * 根据ID修改
     * @param program
     * @return
     */
    @RequestMapping("xiangmuupdate")
    public ModelAndView update(@ModelAttribute Program program){

        ModelAndView m=new ModelAndView("redirect:/pr/xiangmusearch.do");//修改完跳到查询页面
        int i=programService.updateByPrimaryKeySelective(program);
        if (i==0){
            System.out.println("修改失败............");
        }else {
            System.out.println("修改成功："+i+"条数据");
        }
        ProgramExample programExample=new ProgramExample();
        List<Program> programList = programService.selectByExample(programExample);
        m.addObject("programList",programList); // "" 里面的内容是链接jsp页面的
        return m;
    }

    /**
     * 删除
     * @param pid
     * @return
     */
    @RequestMapping("xiangmudelete")
    public ModelAndView delete(@RequestParam Integer pid){

        ModelAndView m=new ModelAndView("redirect:/pr/xiangmusearch.do");//删除完跳到查询页面
        int i=programService.deleteByPrimaryKey(pid);
        System.out.println(pid);
        if (i==0){
            System.out.println("删除失败..............");
        }else {
            System.out.println("成功删除："+i+"条数据");
        }
        return m;
    }

}





























