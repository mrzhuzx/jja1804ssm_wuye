package com.ssm.wuye.service; /*
 *desc:
 *author:wjs
 *time:2019/4/30 0030
 *version:1.2.3
 */


import com.ssm.wuye.domain.ContractTypeExample;
import com.ssm.wuye.domain.Houqin;
import com.ssm.wuye.domain.HouqinExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface HouqinService {

    /*
     *带条件查询
     */
    List<Houqin> selectByExample(HouqinExample example);

    /*
     *查询总条数
     */
    long countByExample( HouqinExample example);

    /**
     * 主键修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Houqin record);

    /**
     * 根据ID删除
     * @param userid
     * @return
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * 增加
     * @param record
     * @return
     */
    int insertSelective(Houqin record);

    /**
     * 带分页查询
     * @param example
     * @param rowBounds
     * @return
     */
    List<Houqin> selectByExampleWithRowbounds(HouqinExample example, RowBounds rowBounds);

    /**
     * 查询一条数据
     * @param userid
     * @return
     */
    Houqin selectByPrimaryKey(Integer userid);


}
