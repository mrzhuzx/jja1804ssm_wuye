package com.ssm.wuye.dao;

import com.ssm.wuye.domain.TbMatter;
import com.ssm.wuye.domain.TbMatterExample.Criteria;
import com.ssm.wuye.domain.TbMatterExample.Criterion;
import com.ssm.wuye.domain.TbMatterExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TbMatterSqlProvider {

    public String countByExample(TbMatterExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_matter");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TbMatterExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_matter");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TbMatter record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_matter");
        
        if (record.getMatterid() != null) {
            sql.VALUES("matterId", "#{matterid,jdbcType=INTEGER}");
        }
        
        if (record.getMattername() != null) {
            sql.VALUES("matterName", "#{mattername,jdbcType=VARCHAR}");
        }
        
        if (record.getMatternum() != null) {
            sql.VALUES("matterNum", "#{matternum,jdbcType=INTEGER}");
        }
        
        if (record.getMatterprice() != null) {
            sql.VALUES("matterPrice", "#{matterprice,jdbcType=DOUBLE}");
        }
        
        if (record.getMattersortid() != null) {
            sql.VALUES("matterSortId", "#{mattersortid,jdbcType=INTEGER}");
        }
        
        if (record.getInstoragetime() != null) {
            sql.VALUES("inStorageTime", "#{instoragetime,jdbcType=DATE}");
        }
        
        if (record.getOutstoragetime() != null) {
            sql.VALUES("outStorageTime", "#{outstoragetime,jdbcType=DATE}");
        }
        
        if (record.getMatterstate() != null) {
            sql.VALUES("matterState", "#{matterstate,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TbMatterExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("matterId");
        } else {
            sql.SELECT("matterId");
        }
        sql.SELECT("matterName");
        sql.SELECT("matterNum");
        sql.SELECT("matterPrice");
        sql.SELECT("matterSortId");
        sql.SELECT("inStorageTime");
        sql.SELECT("outStorageTime");
        sql.SELECT("matterState");
        sql.FROM("tb_matter");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TbMatter record = (TbMatter) parameter.get("record");
        TbMatterExample example = (TbMatterExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_matter");
        
        if (record.getMatterid() != null) {
            sql.SET("matterId = #{record.matterid,jdbcType=INTEGER}");
        }
        
        if (record.getMattername() != null) {
            sql.SET("matterName = #{record.mattername,jdbcType=VARCHAR}");
        }
        
        if (record.getMatternum() != null) {
            sql.SET("matterNum = #{record.matternum,jdbcType=INTEGER}");
        }
        
        if (record.getMatterprice() != null) {
            sql.SET("matterPrice = #{record.matterprice,jdbcType=DOUBLE}");
        }
        
        if (record.getMattersortid() != null) {
            sql.SET("matterSortId = #{record.mattersortid,jdbcType=INTEGER}");
        }
        
        if (record.getInstoragetime() != null) {
            sql.SET("inStorageTime = #{record.instoragetime,jdbcType=DATE}");
        }
        
        if (record.getOutstoragetime() != null) {
            sql.SET("outStorageTime = #{record.outstoragetime,jdbcType=DATE}");
        }
        
        if (record.getMatterstate() != null) {
            sql.SET("matterState = #{record.matterstate,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_matter");
        
        sql.SET("matterId = #{record.matterid,jdbcType=INTEGER}");
        sql.SET("matterName = #{record.mattername,jdbcType=VARCHAR}");
        sql.SET("matterNum = #{record.matternum,jdbcType=INTEGER}");
        sql.SET("matterPrice = #{record.matterprice,jdbcType=DOUBLE}");
        sql.SET("matterSortId = #{record.mattersortid,jdbcType=INTEGER}");
        sql.SET("inStorageTime = #{record.instoragetime,jdbcType=DATE}");
        sql.SET("outStorageTime = #{record.outstoragetime,jdbcType=DATE}");
        sql.SET("matterState = #{record.matterstate,jdbcType=VARCHAR}");
        
        TbMatterExample example = (TbMatterExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TbMatter record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_matter");
        
        if (record.getMattername() != null) {
            sql.SET("matterName = #{mattername,jdbcType=VARCHAR}");
        }
        
        if (record.getMatternum() != null) {
            sql.SET("matterNum = #{matternum,jdbcType=INTEGER}");
        }
        
        if (record.getMatterprice() != null) {
            sql.SET("matterPrice = #{matterprice,jdbcType=DOUBLE}");
        }
        
        if (record.getMattersortid() != null) {
            sql.SET("matterSortId = #{mattersortid,jdbcType=INTEGER}");
        }
        
        if (record.getInstoragetime() != null) {
            sql.SET("inStorageTime = #{instoragetime,jdbcType=DATE}");
        }
        
        if (record.getOutstoragetime() != null) {
            sql.SET("outStorageTime = #{outstoragetime,jdbcType=DATE}");
        }
        
        if (record.getMatterstate() != null) {
            sql.SET("matterState = #{matterstate,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("matterId = #{matterid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TbMatterExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}