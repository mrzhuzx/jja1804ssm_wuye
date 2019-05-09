package com.ssm.wuye.controller;
import com.ssm.wuye.domain.ComplainInfo;
import com.ssm.wuye.domain.NewsType;
import com.ssm.wuye.domain.OwerHouseType;
import com.ssm.wuye.domain.OwerHouseTypeExample;
import com.ssm.wuye.service.ComplainService;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
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
 * time:2019\4\25 0025
 * version:
 */
@Controller
@RequestMapping("/complain")
public class ComplainController {
    @Resource
    ComplainService complainService;

    /**
     * 后台查找所有
     *
     * @return
     */

    @RequestMapping("/findall")
    public ModelAndView search() {
        ModelAndView mv = new ModelAndView();
        List<ComplainInfo> complainInfolist = complainService.selectByExample(null);
        System.out.println("客户投诉表：" + complainInfolist.size());
        mv.addObject("complainInfolist", complainInfolist);
        System.out.println(complainInfolist.size());
        mv.setViewName("pages/huoduan/complain");
        return mv;
    }

    /**
     * 前台查找所有
     *
     * @return
     */
    @RequestMapping("/findallq")
    public ModelAndView searchq() {
        System.out.println("进来serchq了");
        ModelAndView mv = new ModelAndView();
        List<ComplainInfo> complainInfolist = complainService.selectByExample(null);
        System.out.println("客户投诉表：" + complainInfolist.toString());
        mv.addObject("complainInfolist", complainInfolist);
        System.out.println(complainInfolist.size());
        mv.setViewName("pages/gitqian/complain");
        return mv;
    }

    /**
     * 后台删除
     *
     * @param cid
     * @return
     */
    @RequestMapping("/delete")
    public ModelAndView delete(@RequestParam Integer cid) {
        System.out.println("进来了");
        ModelAndView mv = new ModelAndView();
        int i = complainService.deleteByPrimaryKey(cid);
        System.out.println("删除数据" + i + "条");
//        List<ComplainInfo> list = complainService.selectByExample(null);
//        mv.addObject("list",list);
        mv.setViewName("forward:/complain/findall.do");
        return mv;
    }

    /**
     * 后台修改
     *
     * @param
     * @return
     */
    @RequestMapping("/findone")
    public ModelAndView findone(@RequestParam Integer cid) {
        System.out.println("进来findone 了");
        ModelAndView mv = new ModelAndView();
        ComplainInfo com = complainService.selectByPrimaryKey(cid);
        List<ComplainInfo> list = complainService.selectByExample(null);
        mv.addObject("com", com);
        mv.setViewName("pages/huoduan/complainupdate");
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView update(@ModelAttribute ComplainInfo complainInfo) {
        System.out.println("进来update了");
        ModelAndView mv = new ModelAndView();
        int i = complainService.updateByPrimaryKeySelective(complainInfo);
        List<ComplainInfo> list = complainService.selectByExample(null);
        mv.addObject("list", list);
        mv.setViewName("forward:/complain/findall.do");
        return mv;

    }

    /**
     * 后台添加
     *
     * @param complainInfo
     * @return
     */

    @RequestMapping("/save")
    public ModelAndView save(@ModelAttribute ComplainInfo complainInfo) {
        System.out.println("进来save了");
        ModelAndView mv = new ModelAndView();
        int i = complainService.insert(complainInfo);
        System.out.println("添加成功" + i + "条");
        List<ComplainInfo> list = complainService.selectByExample(null);
        mv.addObject(list);
        mv.setViewName("forward:/complain/findall.do");
        return mv;
    }

    /**
     * 前台添加
     *
     * @param complainInfo
     * @return
     */
    @RequestMapping("/savec")
    public ModelAndView savec(@ModelAttribute ComplainInfo complainInfo) {
        System.out.println("进来savec了");
        ModelAndView mv = new ModelAndView();
        int i = complainService.insert(complainInfo);
        System.out.println("添加成功" + i + "条");
        List<ComplainInfo> list = complainService.selectByExample(null);
        mv.addObject("list", list);
        mv.setViewName("forward:/complain/fenye.do?pageNum=1");
        return mv;

    }

    /**
     * 前台分页
     * @param pageNum
     * @return
     */
    @RequestMapping("/fenye")
    public ModelAndView fenye(@RequestParam Integer pageNum) {
        System.out.println("进来fenye了"+pageNum);

        ModelAndView m = new ModelAndView("pages/gitqian/complain");
        long l = complainService.countByExample(null);
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
        List<ComplainInfo> list = complainService.selectByExampleWithRowbounds(null, new RowBounds(Num, Size));


        m.addObject("pageAll", pageAll);
        m.addObject("pageNum", pageNum);
        m.addObject("list", list);
        return m;
    }
}
