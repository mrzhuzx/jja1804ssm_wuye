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
import org.apache.ibatis.session.RowBounds;
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


    /**
     * 查询总条数
      * @param example
     * @return
     */
    public long countByExample(XiangmuExample example) {
        return xiangmuMapper.countByExample(example);
    }


    /**
     * 带分页查询
     * @param example
     * @param rowBounds
     * @return
     */
    public List<Xiangmu> selectByExampleWithRowbounds(XiangmuExample example, RowBounds rowBounds) {
        return xiangmuMapper.selectByExampleWithRowbounds(example,rowBounds);
    }
}
