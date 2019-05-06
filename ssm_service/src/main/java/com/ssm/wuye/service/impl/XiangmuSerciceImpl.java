package com.ssm.wuye.service.impl;
/*
 *desc:
 *author:wjs
 *time:2019/5/5 0005
 *version:1.2.3
 */

import com.ssm.wuye.dao.XiangmuMapper;
import com.ssm.wuye.domain.Xiangmu;
import com.ssm.wuye.domain.XiangmuExample;
import com.ssm.wuye.service.XiangmuSercice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;



@Service
public class XiangmuSerciceImpl implements XiangmuSercice {

    @Resource
    XiangmuMapper xiangmuMapper;


    /**
     * 项目视图查询
     * @param example
     * @return
     */
    public List<Xiangmu> selectByExample(XiangmuExample example) {
        return xiangmuMapper.selectByExample(example);
    }
}
