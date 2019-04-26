package com.ssm.wuye.service.impl;
import com.ssm.wuye.dao.ComplainInfoMapper;
import com.ssm.wuye.domain.ComplainInfo;
import com.ssm.wuye.domain.ComplainInfoExample;
import com.ssm.wuye.domain.NewsTypeExample;
import com.ssm.wuye.service.ComplainService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\4\25 0025
 * version:
 */
@Service
public class ComplainServiceImpl implements ComplainService {
   @Resource
    ComplainInfoMapper complainInfoMapper;


    public long countByExample(ComplainInfo example) {
        return 0;
    }

    public int deleteByExample(ComplainInfo example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(ComplainInfo complainInfo) {
        return 0;
    }

    public List<ComplainInfo> selectByExampleWithRowbounds(ComplainInfo example, RowBounds rowBounds) {
        return null;
    }

    public List<ComplainInfo> selectByExample(ComplainInfo example) {
        //NewsTypeExample newsTypeExample=new NewsTypeExample();
        // return newsTypeMapper.selectByExample(newsTypeExample);
        ComplainInfoExample complainInfoExample = new ComplainInfoExample();
        return complainInfoMapper.selectByExample(complainInfoExample);
    }

    public ComplainInfo selectByPrimaryKey(Integer ntid) {
        return null;
    }

    public int updateByExampleSelective(ComplainInfo complainInfo, ComplainInfo example) {
        return 0;
    }

    public int updateByExample(ComplainInfo complainInfo, ComplainInfo example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(ComplainInfo complainInfo) {
        return 0;
    }

    public int updateByPrimaryKey(ComplainInfo complainInfo) {
        return 0;
    }
}
