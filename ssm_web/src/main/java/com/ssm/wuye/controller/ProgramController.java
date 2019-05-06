package com.ssm.wuye.controller; /*
 *desc:
 *author:wjs
 *time:2019/5/5 0005
 *version:1.2.3
 */

import com.ssm.wuye.domain.Houqin;
import com.ssm.wuye.domain.HouqinExample;
import com.ssm.wuye.domain.Xiangmu;
import com.ssm.wuye.domain.XiangmuExample;
import com.ssm.wuye.service.XiangmuSercice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("pr")
public class ProgramController {

    @Resource
    XiangmuSercice xiangmuSercice;

    /**
     * 项目视图查询
     * @return
     */
    @RequestMapping("xiangmusearch")
    public ModelAndView xiangmusearch(){
        ModelAndView m=new ModelAndView("pages/huoduan/program");
        XiangmuExample xiangmuExample=new XiangmuExample();
        List<Xiangmu> xiangmuList = xiangmuSercice.selectByExample(xiangmuExample);
        m.addObject("xiangmuList",xiangmuList);
        return m;

    }

}
