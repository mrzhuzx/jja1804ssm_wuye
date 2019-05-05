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

    /**
     * 条件下个数
     * @param example
     * @return
     */
    public long countByExample(ComplainInfo example) {
        return 0;
    }

    /**
     * 删除
     * @param example
     * @return
     */
    public int deleteByExample(ComplainInfo example) {
        //NewsTypeExample newsTypeExample=new NewsTypeExample();
        //return newsTypeMapper.deleteByExample(newsTypeExample);
        ComplainInfoExample complainInfoExample = new ComplainInfoExample();

        return complainInfoMapper.deleteByExample(complainInfoExample);
    }

    /**
     * 删除一个主建删除
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(Integer id) {
//        NewsTypeExample newsTypeExample=new NewsTypeExample();
//        newsTypeExample.createCriteria().andNtidEqualTo(id);//where  ntid=?
//        return newsTypeMapper.deleteByExample(newsTypeExample);
        ComplainInfoExample complainInfoExample = new ComplainInfoExample();
        complainInfoExample.createCriteria().andCidEqualTo(id);
        return complainInfoMapper.deleteByExample(complainInfoExample);
    }

    /**
     * 添加
     * @param complainInfo
     * @return
     */
    public int insert(ComplainInfo complainInfo) {
        return  complainInfoMapper.insert(complainInfo);
    }

    /**
     * 查询带分页
     * @param example
     * @param rowBounds
     * @return
     */

    public List<ComplainInfo> selectByExampleWithRowbounds(ComplainInfo example, RowBounds rowBounds) {
        return null;
    }

    /**
     * 查找
     * @param example
     * @return
     */
    public List<ComplainInfo> selectByExample(ComplainInfo example) {
        //NewsTypeExample newsTypeExample=new NewsTypeExample();
        // return newsTypeMapper.selectByExample(newsTypeExample);
        ComplainInfoExample complainInfoExample = new ComplainInfoExample();
        return complainInfoMapper.selectByExample(complainInfoExample);
    }

    /**
     * 主键返回一条数据
     * @param ntid
     * @return
     */
    public ComplainInfo selectByPrimaryKey(Integer ntid) {
        return complainInfoMapper.selectByPrimaryKey(ntid);
    }

    public int updateByExampleSelective(ComplainInfo complainInfo, ComplainInfo example) {
        return 0;
    }

    public int updateByExample(ComplainInfo complainInfo, ComplainInfo example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(ComplainInfo complainInfo) {
       // return newsTypeMapper.updateByPrimaryKey(record);
        return complainInfoMapper.updateByPrimaryKeySelective(complainInfo);
    }

    /**
     * 主键修改
     * @param complainInfo
     * @return
     */

    public int updateByPrimaryKey(ComplainInfo complainInfo) {
        return 0;
    }
}
