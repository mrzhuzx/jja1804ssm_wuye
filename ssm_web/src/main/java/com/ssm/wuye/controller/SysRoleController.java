package com.ssm.wuye.controller;

import com.ssm.wuye.domain.SysRole;
import com.ssm.wuye.service.SysRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping("role")
public class SysRoleController {
    @Resource
    SysRoleService sysRoleService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("rolesearch")
    public ModelAndView rolesearch(){
        ModelAndView m=new ModelAndView("pages/huoduan/sysrole");
        List<SysRole> roles = sysRoleService.selectByExample(null);
        for (SysRole sysRole :roles) {
            System.out.println(sysRole.toString());
        }
        m.addObject("roles",roles);
        return m;
    }

    /**
     * 增加一条数据
     * @return
     */
    @RequestMapping("rolesave")
    public ModelAndView rolesave(@ModelAttribute SysRole role){
        ModelAndView m=new ModelAndView("redirect:/role/rolesearch.do");
        int i=sysRoleService.insertSelective(role);
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
    @RequestMapping("roleone")
    public  ModelAndView roleone(@RequestParam Integer roleid){
        ModelAndView m=new ModelAndView("pages/huoduan/sysroleupdate");
        SysRole role = sysRoleService.selectByPrimaryKey(roleid);
        m.addObject("role",role);
        System.out.println("获取到了一条数据-----------");
        return  m;

    }

    /**
     * 修改一条数据（根据主键ID）
     */
    @RequestMapping("roleupdate")
    public  ModelAndView roleupdate(@ModelAttribute SysRole role){
        ModelAndView m= new ModelAndView("redirect:/role/rolesearch.do");
        int i= sysRoleService.updateByPrimaryKeySelective(role);
        if(i==0){
            System.out.println("修改失败");
        }else {
            System.out.println("修改成功:"+i+"条数据");
        }
        List<SysRole> roles = sysRoleService.selectByExample(null);
        m.addObject("roles",roles);
        return m;
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("roledelete")
    public ModelAndView roledelete(@RequestParam Integer roleid){
        ModelAndView m=new ModelAndView("forward:/role/rolesearch.do");
        int i=sysRoleService.deleteByPrimaryKey(roleid);
        if(i==0){
            System.out.println("删除失败");
        }else {
            System.out.println("删除成功:"+i+"条数据");
        }
        return m;


    }


}
