package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.NewsTypeVoiwMapper;
import com.ssm.wuye.domain.NewsTypeVoiw;
import com.ssm.wuye.domain.NewsTypeVoiwExample;
import com.ssm.wuye.service.NewsTypeVoiwService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-04-26  19:23:42
 */
@Service
public class NewsTypeVoiwImpl implements NewsTypeVoiwService {

    @Resource
    NewsTypeVoiwMapper newsTypeVoiwMapper;
    public long countByExample(NewsTypeVoiwExample example) {
        return newsTypeVoiwMapper.countByExample(example);
    }

    public List<NewsTypeVoiw> selectByExampleWithRowbounds(NewsTypeVoiwExample example, RowBounds rowBounds) {
        return newsTypeVoiwMapper.selectByExampleWithRowbounds(example,rowBounds);

    }

    public List<NewsTypeVoiw> selectByExample(NewsTypeVoiwExample example) {
        return newsTypeVoiwMapper.selectByExample(example);
    }


}
