package com.ssm.wuye.controller;
import com.ssm.wuye.domain.ComplainInfo;
import com.ssm.wuye.domain.RepairInfo;
import com.ssm.wuye.service.RepairService;
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
 * author:czf
 * time:2019\4\29 0029
 * version:
 */
@Controller
@RequestMapping("/repair")
public class RepairController {
    @Resource
    RepairService repairService;

    @RequestMapping("/findall")
    public ModelAndView findall() {
        System.out.println("进来findall了");
        ModelAndView mv = new ModelAndView();
        List<RepairInfo> repairInfos = repairService.selectByExample(null);
        mv.addObject("repairInfos",repairInfos);
        System.out.println(repairInfos.toString());
        mv.setViewName("pages/huoduan/repair");
        return mv;

    }
    @RequestMapping("/delete")
    public ModelAndView delete(@RequestParam  Integer id){
        System.out.println("进来delete了");
        ModelAndView mv = new ModelAndView();
        int i = repairService.deleteByPrimaryKey(id);
        System.out.println("删除"+i+"条");
        mv.setViewName("forward:/repair/findall.do");

        return mv;
    }
    @RequestMapping("findone")
    public  ModelAndView findone(@RequestParam Integer id){
        System.out.println("进来findone了");
        ModelAndView mv = new ModelAndView();
        RepairInfo rep = repairService.selectByPrimaryKey(id);
        System.out.println(rep.getRepairname());
        mv.addObject("rep",rep);
        mv.setViewName("pages/huoduan/repairupdate");
        return mv;
    }
    @RequestMapping("finddetail")
    public  ModelAndView findetail(@RequestParam Integer id){

        ModelAndView mv = new ModelAndView();
        RepairInfo rep = repairService.selectByPrimaryKey(id);
        System.out.println(rep.getRepairname());
        mv.addObject("rep",rep);
        mv.setViewName("pages/huoduan/repairdetail");
        return mv;
    }
    @RequestMapping("/update")
    public ModelAndView update(@ModelAttribute RepairInfo repairInfo){
        System.out.println("进来update了");
        ModelAndView mv = new ModelAndView();
        int i = repairService.updateByPrimaryKeySelective(repairInfo);
        System.out.println("11111");
        mv.setViewName("forward:/repair/findall.do");
        return mv;
    }
    @RequestMapping("/insert")
    public ModelAndView insert(@ModelAttribute RepairInfo repairInfo){
        ModelAndView mv = new ModelAndView();
        int insert = repairService.insert(repairInfo);
        System.out.println("添加成功"+insert+"tiao");
        mv.setViewName("forward:/repair/findall.do");
        return mv;
    }

    /**
     * 前台添加
     * @param repairInfo
     * @return
     */
    @RequestMapping("/insertq")
    public ModelAndView insertq(@ModelAttribute RepairInfo repairInfo){
        ModelAndView mv = new ModelAndView();
        int insert = repairService.insert(repairInfo);
        System.out.println("添加成功"+insert+"tiao");
        mv.setViewName("forward:/repair/fenye.do?pageNum=1");
        return mv;
    }
    @RequestMapping("/fenye")
    public ModelAndView fenye(@RequestParam Integer pageNum) {
        System.out.println("进来fenye了"+pageNum);

        ModelAndView m = new ModelAndView("pages/gitqian/repair");
        long l = repairService.countByExample(null);
        Integer con = (int) l;
        Integer Size = 4;
        Integer pageAll = con % Size == 0 ? con / Size : con / Size + 1;
        if (pageNum <= 1) {
            pageNum = 1;
        }
        if (pageNum > pageAll) {
            pageNum = pageAll;
        }
        Integer Num = Size * (pageNum - 1);
        List<RepairInfo> list = repairService.selectByExampleWithRowbounds(null, new RowBounds(Num, Size));


        m.addObject("pageAll", pageAll);
        m.addObject("pageNum", pageNum);
        m.addObject("list", list );
        return m;
    }
}
