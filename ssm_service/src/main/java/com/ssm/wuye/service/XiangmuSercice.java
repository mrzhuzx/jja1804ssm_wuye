package com.ssm.wuye.service; /*
 *desc:
 *author:wjs
 *time:2019/5/5 0005
 *version:1.2.3
 */

import com.ssm.wuye.domain.OwerHouseType;
import com.ssm.wuye.domain.OwerHouseTypeExample;
import com.ssm.wuye.domain.Xiangmu;
import com.ssm.wuye.domain.XiangmuExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface XiangmuSercice {

    /*
     *视图带条件查询
     */
    List<Xiangmu> selectByExample(XiangmuExample example);

    /**
     * 查询总数
     * @param example
     * @return
     */
    long countByExample(XiangmuExample example);

    /**
     * 带分页查询
     * @param example
     * @param rowBounds
     * @return
     */
    List<Xiangmu> selectByExampleWithRowbounds(XiangmuExample example, RowBounds rowBounds);
}
