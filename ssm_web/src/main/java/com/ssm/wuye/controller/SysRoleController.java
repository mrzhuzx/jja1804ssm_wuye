package com.ssm.wuye.controller;

import com.ssm.wuye.domain.SysRole;
import com.ssm.wuye.service.SysRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("rolesearch")
    public ModelAndView rolesearch(){
        ModelAndView m=new ModelAndView();
        List<SysRole> roles = sysRoleService.selectByExample(null);
        for (SysRole sysRole :roles) {
            System.out.println(sysRole.toString());
        }
        m.addObject("roles",roles);
        return m;
    }


}
