package com.ssm.wuye.service.impl; /*
 *desc:
 *author:wjs
 *time:2019/4/30 0030
 *version:1.2.3
 */

import com.ssm.wuye.dao.HouqinMapper;
import com.ssm.wuye.domain.ContractTypeExample;
import com.ssm.wuye.domain.Houqin;
import com.ssm.wuye.domain.HouqinExample;
import com.ssm.wuye.service.HouqinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouqinServiceImpl implements HouqinService {

    @Resource
    HouqinMapper houqinMapper;

    /**
     * 带条件查询
      * @param example
     * @return
     */
    @Override
    public List<Houqin> selectByExample(HouqinExample example) {
        return houqinMapper.selectByExample(example);
    }

    /**
     * 查询总条数
     * @param example
     * @return
     */
    @Override
    public long countByExample(ContractTypeExample example) {
        return 0;
    }
}
