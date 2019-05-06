package com.ssm.wuye.controller;

import com.ssm.wuye.domain.Activity;
import com.ssm.wuye.service.ActivityService;
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
 * time:2019\5\6 0006
 * version:
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {
    @Resource
    ActivityService activityService;

    @RequestMapping("/findall")
    public ModelAndView findall() {
        ModelAndView mv = new ModelAndView();
        List<Activity> activities = activityService.selectByExample(null);
        mv.addObject("activities", activities);
        mv.setViewName("pages/huoduan/activity");
        return mv;

    }

    @RequestMapping("delete")
    public ModelAndView delete(@RequestParam Integer id) {
        ModelAndView mv = new ModelAndView();
        activityService.deleteByPrimaryKey(id);
        mv.setViewName("forward:findall.do");
        return mv;
    }

    @RequestMapping("/save")
    public ModelAndView save(@ModelAttribute Activity activity) {
        ModelAndView mv = new ModelAndView();
        activityService.insert(activity);
        mv.setViewName("forward:findall.do");
        List<Activity> activities = activityService.selectByExample(null);
        mv.addObject("activities", activities);
        return mv;
    }

    @RequestMapping("/findone")
    public ModelAndView findone(@RequestParam Integer id) {
        System.out.println("进来了findone");
        ModelAndView mv = new ModelAndView();
        Activity activity = activityService.selectByPrimaryKey(id);
        mv.addObject("activity", activity);
        mv.setViewName("pages/huoduan/activityupdate");
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView update(@ModelAttribute Activity activity) {
        System.out.println("进来update了");
        ModelAndView mv = new ModelAndView();
        int i = activityService.updateByPrimaryKeySelective(activity);
        System.out.println("修改成功"+i+"条");
        mv.setViewName("forward:findall.do");
        return mv;
    }
}
