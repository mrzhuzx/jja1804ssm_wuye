package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.TbMatter_sortMapper;
import com.ssm.wuye.domain.TbMatter_sort;
import com.ssm.wuye.domain.TbMatter_sortExample;
import com.ssm.wuye.service.TbMatter_sortService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
@Service
public class TbMatter_sortServiceImpl implements TbMatter_sortService {
    @Resource
    TbMatter_sortMapper tbMatter_sortMapper;
    /*
   *根据id删除
   */
  public int deleteByPrimaryKey(Integer mattersortid) {
      return tbMatter_sortMapper.deleteByPrimaryKey(mattersortid)  ;  }
  /*
   *增加
   */
    public int insertSelective(TbMatter_sort record) {
        return tbMatter_sortMapper.insertSelective(record);
    }
    /*
     *带条件查询
     */
    public List<TbMatter_sort> selectByExample(TbMatter_sortExample example) {
        return tbMatter_sortMapper.selectByExample(example);
    }
    /*
     *带分页查询
     */
    public List<TbMatter_sort> selectByExampleWithRowbounds(TbMatter_sortExample example, RowBounds rowBounds) {
        return tbMatter_sortMapper.selectByExampleWithRowbounds(example,rowBounds);
    }
    /*
     *查询一条数据
     */
    public TbMatter_sort selectByPrimaryKey(Integer mattersortid) {
        return tbMatter_sortMapper.selectByPrimaryKey(mattersortid);
    }
    /*
     *主键修改
     */
    public int updateByPrimaryKeySelective(TbMatter_sort record) {
        return tbMatter_sortMapper.updateByPrimaryKeySelective(record);
    }
}
