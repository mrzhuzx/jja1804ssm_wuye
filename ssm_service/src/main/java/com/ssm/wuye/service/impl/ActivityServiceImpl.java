package com.ssm.wuye.service.impl;

import com.ssm.wuye.dao.ActivityMapper;
import com.ssm.wuye.domain.Activity;
import com.ssm.wuye.domain.ActivityExample;
import com.ssm.wuye.service.ActivityService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\5\5 0005
 * version:
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Resource
    ActivityMapper activityMapper;
    @Override
    public long countByExample(Activity example) {
        return 0;
    }

    @Override
    public int deleteByExample(Activity example) {
        return 0;
    }

    /**
     * 删除
     * @param id
     * @return
     */

    @Override
    public int deleteByPrimaryKey(Integer id) {
        ActivityExample activityExample = new ActivityExample();
        activityExample.createCriteria().andIdEqualTo(id);
        return activityMapper.deleteByExample(activityExample);
    }

    /**
     * 添加
     * @param activity
     * @return
     */
    @Override
    public int insert(Activity activity) {
        return activityMapper.insert(activity);
    }

    @Override
    public List<Activity> selectByExampleWithRowbounds(Activity example, RowBounds rowBounds) {
        return null;
    }

    /**
     * 查找
     * @param example
     * @return
     */
    @Override
    public List<Activity> selectByExample(Activity example) {
        ActivityExample activityExample = new ActivityExample();
        return activityMapper.selectByExample(activityExample);
    }

    @Override
    public Activity selectByPrimaryKey(Integer id) {
        return activityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Activity activity, Activity example) {
        return 0;
    }

    @Override
    public int updateByExample(Activity activity, Activity example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Activity activity) {
        return activityMapper.updateByPrimaryKeySelective(activity);
    }

    @Override
    public int updateByPrimaryKey(Activity activity) {
        return 0;
    }
}
