package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.NewstypeMapper;
import com.ssm.wuye.domain.Newstype;
import com.ssm.wuye.domain.NewstypeExample;
import com.ssm.wuye.service.NewstypeService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author : tzhu
 * time :2019/4/18 0018
 * version: 1.2.3
 */
@Service
public class NewstypeServiceImpl  implements NewstypeService {


    @Resource
    NewstypeMapper newstypeMapper;


    /**
     * 条件下个数
     *
     * @param example
     * @return
     */
    public long countByExample(Newstype example) {
        NewstypeExample newstypeExample=new NewstypeExample();

        return newstypeMapper.countByExample(newstypeExample);
    }

    /**
     * 删除数据
     *
     * @param example
     * @return
     */
    public int deleteByExample(Newstype example) {

        NewstypeExample newstypeExample=new NewstypeExample();

        return newstypeMapper.deleteByExample(newstypeExample);
    }

    /**
     * 主键删除
     *
     * @param id
     * @return
     */

    public int deleteByPrimaryKey(Integer id) {
        NewstypeExample newstypeExample=new NewstypeExample();
        newstypeExample.createCriteria().andNtidEqualTo(id);//where  ntid=?
        return newstypeMapper.deleteByExample(newstypeExample);
    }

    /**
     * 添加
     *
     * @param record
     * @return
     */
    public int insert(Newstype record) {

        return newstypeMapper.insert(record);
    }

    /**
     * 查询带分页
     *
     * @param example
     * @param rowBounds
     * @return
     */
    public List<Newstype> selectByExampleWithRowbounds(Newstype example, RowBounds rowBounds) {

        NewstypeExample newstypeExample=new NewstypeExample();

        return newstypeMapper.selectByExampleWithRowbounds(newstypeExample,rowBounds);
    }

    /**
     * 多条件查询
     *
     * @param example
     * @return
     */
    public List<Newstype> selectByExample(Newstype example) {

        NewstypeExample newstypeExample=new NewstypeExample();

        return newstypeMapper.selectByExample(newstypeExample);
    }

    /**
     * 主键返回一条数据
     *
     * @param ntid
     * @return
     */
    public Newstype selectByPrimaryKey(Integer ntid) {


        return newstypeMapper.selectByPrimaryKey(ntid);
    }

    /**
     * 修改
     *
     * @param record
     * @param example
     * @return
     */
    public int updateByExampleSelective(Newstype record, Newstype example) {

        NewstypeExample newstypeExample=new NewstypeExample();
        //  record,newstypeExample  ??
        return newstypeMapper.updateByExampleSelective(record,newstypeExample);
    }

    /**
     * @param record
     * @param example
     * @return
     */
    public int updateByExample(Newstype record, Newstype example) {
        NewstypeExample newstypeExample=new NewstypeExample();
        //  record,newstypeExample  ??
        return newstypeMapper.updateByExampleSelective(record,newstypeExample);
    }

    /**
     * 修改
     *
     * @param record
     * @return
     */
    public int updateByPrimaryKeySelective(Newstype record) {
        return newstypeMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 主键修改
     *
     * @param record
     * @return
     */
    public int updateByPrimaryKey(Newstype record) {

        return newstypeMapper.updateByPrimaryKey(record);
    }
}
