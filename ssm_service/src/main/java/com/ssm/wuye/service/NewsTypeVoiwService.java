package com.ssm.wuye.service;



import com.ssm.wuye.domain.NewsTypeVoiw;
import com.ssm.wuye.domain.NewsTypeVoiwExample;
import org.apache.ibatis.session.RowBounds;


import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-04-26  19:15:37
 */

public interface NewsTypeVoiwService {

    long countByExample(NewsTypeVoiwExample example);

    List<NewsTypeVoiw> selectByExampleWithRowbounds(NewsTypeVoiwExample example, RowBounds rowBounds);

    List<NewsTypeVoiw> selectByExample(NewsTypeVoiwExample example);


}
