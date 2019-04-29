package com.ssm.wuye.controller;





import com.ssm.wuye.domain.*;
import com.ssm.wuye.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("ower")
public class SysOwerController {

    @Autowired
    SysOwerService sysOwerService;
    @Autowired
    SysOwerFamilyService sysOwerFamilyService;
    @Autowired
    MyHouseService myHouseService;
    @Autowired
    NewsTypeService newsTypeService;
    @Autowired
    OwerHouseTypeService owerHouseTypeService;



    @RequestMapping("login")//业主登录
    public ModelAndView login(HttpSession session, @RequestParam String account,@RequestParam String passwd){
        ModelAndView m=new ModelAndView("forward:/nt/search.do");//
        SysOwer sysOwer = sysOwerService.selectByNamePassword(account, passwd);
       session.setAttribute("ower", sysOwer);
        return m;
    }
    @RequestMapping("logout")//业主退出
    public  ModelAndView logout(HttpSession session){
        ModelAndView m=new ModelAndView("/pages/gitqian/login");
        session.removeAttribute("ower");
        return m;
    }
    @RequestMapping("query")//业主查询个人信息
    public ModelAndView query(@RequestParam Integer olid){
        ModelAndView m=new ModelAndView("/pages/gitqian/oweroi");
        SysOwer sysOwer = sysOwerService.selectByPrimaryKey(olid);
        List<NewsType> newstypeList = newsTypeService.selectByExample(null);
        m.addObject("newstypeList", newstypeList);
        m.addObject("ower", sysOwer);
        return m;
    }
    @RequestMapping("queryio")//业主修改个人信息页面
    public ModelAndView ownerInformation(@RequestParam Integer olid){
        ModelAndView m=new ModelAndView("/pages/gitqian/xgoweroi");
        SysOwer sysOwer = sysOwerService.selectByPrimaryKey(olid);
        List<NewsType> newstypeList = newsTypeService.selectByExample(null);
        m.addObject("newstypeList", newstypeList);
        m.addObject("ower", sysOwer);
        return m;
    }
    @RequestMapping("xgoi")//业主修改个人信息
    public ModelAndView xgownerInformation(@RequestParam Integer olid,@RequestParam String olname,@RequestParam String powerid,@RequestParam String olphone){
        ModelAndView m=new ModelAndView("forward:/ower/query.do");
        SysOwer sysOwer=new SysOwer(olid,olname,powerid, olphone);
        sysOwerService.updateByPrimaryKeySelective(sysOwer);
        return m;
    }
//    @RequestMapping("xgpasswd")//业主修改密码
//    public ModelAndView xgpasswd(@RequestParam Integer olid,@RequestParam String passwd){
//        ModelAndView m=new ModelAndView("forward:/ower/logout");
//        SysOwer sysOwer=new SysOwer(olid, passwd);
//       sysOwerService.updateByPrimaryKeySelective(sysOwer);
//        return m;
//    }
//    @RequestMapping("of")//查看家庭成员
//    public ModelAndView ckjtcy(@RequestParam Integer olid,@RequestParam Integer pageNum){
//        ModelAndView m=new ModelAndView("/pages/gitqian/owerfm");
//        SysOwerFamilyExample sysOwerFamilyExample = new SysOwerFamilyExample();
//        sysOwerFamilyExample.createCriteria().andOlidEqualTo(olid);
//        Integer Size=4;
//        long l = sysOwerFamilyService.countByExample(sysOwerFamilyExample);
//        System.out.println(l+"##################################################");
//        Integer con =(int)l;
//        Integer pageAll= con%Size==0?con/Size:con/Size+1 ;
//        if (pageNum<=1){
//            pageNum = 1;
//        }
//        if (pageNum>pageAll){
//            pageNum=pageAll;
//        }
//        Integer Num =Size*(pageNum-1);
//        System.out.println("pageNum :"+pageNum);
//        System.out.println("pageALL:"+pageAll);
//        List<SysOwerFamily> sysOwerFamilyList =  sysOwerFamilyService.selectByExampleWithRowbounds(sysOwerFamilyExample,new RowBounds(Num, Size));
//        List<NewsType> newstypeList = newsTypeService.selectByExample(null);
//        SysOwer sysOwer = sysOwerService.selectByPrimaryKey(olid);
//        m.addObject("newstypeList", newstypeList);
//        m.addObject("ower", sysOwer);
//        m.addObject("pageNum",pageNum);
//        m.addObject("pageAll",pageAll);
//        m.addObject("owerFamil", sysOwerFamilyList);
//        return m;
//    }
    @RequestMapping("of")//查看家庭成员
   public ModelAndView ckjtcy(@RequestParam Integer olid){
        ModelAndView m=new ModelAndView("/pages/gitqian/owerfm");
        SysOwerFamilyExample sysOwerFamilyExample = new SysOwerFamilyExample();
        sysOwerFamilyExample.createCriteria().andOlidEqualTo(olid);
        List<SysOwerFamily> sysOwerFamilyList =  sysOwerFamilyService.selectByExample(sysOwerFamilyExample);
        List<NewsType> newstypeList = newsTypeService.selectByExample(null);
        SysOwer sysOwer = sysOwerService.selectByPrimaryKey(olid);
        m.addObject("newstypeList", newstypeList);
        m.addObject("ower", sysOwer);
        m.addObject("owerFamil", sysOwerFamilyList);
        return m;
    }
    @RequestMapping("tzzjof")//跳转增加家庭成员
    public ModelAndView zjiajtcy(@RequestParam Integer olid){
        ModelAndView m=new ModelAndView("/pages/gitqian/zjof");
        SysOwer sysOwer = sysOwerService.selectByPrimaryKey(olid);
        m.addObject("ower", sysOwer);
        return m;
    }
    @RequestMapping("zjof")//增加家庭成员
    public ModelAndView zjjtcy(@RequestParam Integer olid,@RequestParam String ofname,@RequestParam String ofsex,@RequestParam String ofhomeplace
    ,@RequestParam String oftel ,@RequestParam String ofnexus){
        ModelAndView m=new ModelAndView("forward:/ower/of.do");
        SysOwerFamily sysOwerFamily=new SysOwerFamily(ofname,ofsex,ofhomeplace,oftel,ofnexus,olid);
        int i = sysOwerFamilyService.insertSelective(sysOwerFamily);
        System.out.println(i);
        return m;
    }
    @RequestMapping("cxof")//跳转修改家庭成员
    public ModelAndView cxjtcy(@RequestParam Integer ofid,@RequestParam Integer olid){
        ModelAndView m=new ModelAndView("/pages/gitqian/xgof");
        SysOwerFamily sysOwerFamily = sysOwerFamilyService.selectByPrimaryKey(ofid);
        SysOwer sysOwer = sysOwerService.selectByPrimaryKey(olid);
        m.addObject("ower", sysOwer);
        m.addObject("ofowerFamil", sysOwerFamily);
        return m;
    }
    @RequestMapping("xgof")//修改家庭成员
    public ModelAndView xgjtcy(@RequestParam Integer ofid,@RequestParam String ofname,@RequestParam String ofsex,@RequestParam String ofhomeplace
    ,@RequestParam String oftel,@RequestParam String ofnexus,@RequestParam Integer olid){
        ModelAndView m=new ModelAndView("forward:/ower/of.do");
        SysOwerFamily sysOwerFamily=new SysOwerFamily(ofid, ofname,ofsex , ofhomeplace, oftel,ofnexus ,olid );
        int i = sysOwerFamilyService.updateByPrimaryKeySelective(sysOwerFamily);
        System.out.println("00000000000000000000000000000#"+i);
        return m;
    }
    @RequestMapping("scof")//删除家庭成员
    public ModelAndView scjtcy(@RequestParam Integer ofid,@RequestParam Integer olid){
        ModelAndView m=new ModelAndView("forward:/ower/of.do");
        int i = sysOwerFamilyService.deleteByPrimaryKey(ofid);
        System.out.println(i+"#0000000000000000000000000000000000");
        return m;
    }
    @RequestMapping("ckhouse")//查看房屋信息
    public ModelAndView fwxx(@RequestParam Integer olid){
        ModelAndView m=new ModelAndView("/pages/gitqian/owerhouse");
       OwerHouseTypeExample oht=new OwerHouseTypeExample();
       oht.createCriteria().andOlidEqualTo(olid);
        List<OwerHouseType> ohtList = owerHouseTypeService.selectByExample(oht);
        List<NewsType> newstypeList = newsTypeService.selectByExample(null);
        SysOwer sysOwer = sysOwerService.selectByPrimaryKey(olid);
        m.addObject("newstypeList", newstypeList);
        m.addObject("oth", ohtList);
        m.addObject("ower", sysOwer);
        return m;
    }
    @RequestMapping("czfw")//房屋租借
    public ModelAndView czfwolan(@RequestParam Integer hid,@RequestParam Integer olid ,@RequestParam Integer olan){
        ModelAndView m=new ModelAndView("forward:/ower/ckhouse.do");
        MyHouse myHouse=new MyHouse(hid, olan);
        myHouseService.updateByPrimaryKeySelective(myHouse);
        return m;
    }
    @RequestMapping("csfw")//房屋出售
    public ModelAndView csfw(@RequestParam Integer hid,@RequestParam Integer olid ,@RequestParam Integer hstate){
        ModelAndView m=new ModelAndView("forward:/ower/ckhouse.do");
        if (hstate==1 || equals(1)) {
            String tate="代售";
        MyHouse myHouse=new MyHouse(hid,tate);
        myHouseService.updateByPrimaryKeySelective(myHouse);
        }else if(hstate==2 || equals(2)){
            String tate="入住";
            MyHouse myHouse=new MyHouse(hid,tate);
            myHouseService.updateByPrimaryKeySelective(myHouse);
        }else {
            System.out.println(hstate+"已经超过范围");
        }
        return m;
    }


}
