package com.ssm.wuye.controller;



import com.ssm.wuye.domain.SysOwer;
import com.ssm.wuye.service.MyHouseService;
import com.ssm.wuye.service.SysOwerFamilyService;
import com.ssm.wuye.service.SysOwerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("ower")
public class SysOwerController {

    @Autowired
    SysOwerService sysOwerService;
    @Autowired
    SysOwerFamilyService sysOwerFamilyService;
    @Autowired
    MyHouseService myHouseService;



    @RequestMapping("login")//业主登录
    public ModelAndView login(@RequestParam String account,@RequestParam String passwd){
        ModelAndView m=new ModelAndView("/pages/gitqian/index");
        SysOwer sysOwer = sysOwerService.selectByNamePassword(account, passwd);
        m.addObject("ower", sysOwer);
        return m;
    }
    @RequestMapping("logout")//业主退出
    public  ModelAndView logout(){
        ModelAndView m=new ModelAndView("/pages/gitqian/login");
        return m;
    }
    @RequestMapping("query")//业主查询个人信息
    public ModelAndView query(@RequestParam Integer olid){
        ModelAndView m=new ModelAndView("/pages/gitqian/houseloan");
        SysOwer sysOwer = sysOwerService.selectByPrimaryKey(olid);
        m.addObject("sower", sysOwer);
        return m;
    }
    @RequestMapping("oi")//业主修改个人信息
    public ModelAndView ownerInformation(@RequestParam Integer olid,@RequestParam String olname,@RequestParam String powerid,@RequestParam String olphone
   ){
        ModelAndView m=new ModelAndView("");
        SysOwer sysOwer=new SysOwer(olid,olname,powerid, olphone);
        sysOwerService.updateByPrimaryKeySelective(sysOwer);
        return m;
    }
    @RequestMapping("xgpasswd")//业主修改密码
    public ModelAndView xgpasswd(@RequestParam Integer olid,@RequestParam String passwd){
        ModelAndView m=new ModelAndView("");
        SysOwer sysOwer=new SysOwer(olid, passwd);
       sysOwerService.updateByPrimaryKeySelective(sysOwer);
        return m;
    }
//    @RequestMapping("")//查看家庭成员
//    public ModelAndView ckjtcy(@RequestParam Integer olid){
//        ModelAndView m=new ModelAndView("");
//
//        return m;
//    }
//    @RequestMapping("")//增加家庭成员
//    public ModelAndView zjiajtcy(@RequestParam Integer olid){
//        ModelAndView m=new ModelAndView("");
//
//        return m;
//    }
//    @RequestMapping("")//修改家庭成员
//    public ModelAndView xgjtcy(@RequestParam Integer ofid){
//        ModelAndView m=new ModelAndView("");
//
//        return m;
//    }
//    @RequestMapping("")//删除家庭成员
//    public ModelAndView scjtcy(@RequestParam Integer ofid){
//        ModelAndView m=new ModelAndView("");
//
//        return m;
//    }
//    @RequestMapping("")//查看房屋信息
//    public ModelAndView fwxx(@RequestParam Integer ofid){
//        ModelAndView m=new ModelAndView("");
//
//        return m;
//    }
//    @RequestMapping("")//修改房屋信息
//    public ModelAndView xgfwxx(@RequestParam Integer ofid){
//        ModelAndView m=new ModelAndView("");
//
//        return m;
//    }
//    @RequestMapping("")//查看车位信息
//    public ModelAndView cwxx(@RequestParam Integer ofid){
//        ModelAndView m=new ModelAndView("");
//
//        return m;
//    }
//    @RequestMapping("")//xg车位信息
//    public ModelAndView xgcwxx(@RequestParam Integer ofid){
//        ModelAndView m=new ModelAndView("");
//
//        return m;
//    }

}
