package com.ssm.wuye.dao;

import com.ssm.wuye.domain.HouseWaterVo;
import com.ssm.wuye.domain.HouseWaterVoExample.Criteria;
import com.ssm.wuye.domain.HouseWaterVoExample.Criterion;
import com.ssm.wuye.domain.HouseWaterVoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class HouseWaterVoSqlProvider {

    public String countByExample(HouseWaterVoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("house_water_vo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(HouseWaterVoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("house_water_vo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(HouseWaterVo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("house_water_vo");
        
        if (record.getHid() != null) {
            sql.VALUES("hid", "#{hid,jdbcType=INTEGER}");
        }
        
        if (record.getOlid() != null) {
            sql.VALUES("olid", "#{olid,jdbcType=INTEGER}");
        }
        
        if (record.getHbulidingname() != null) {
            sql.VALUES("hBulidingName", "#{hbulidingname,jdbcType=VARCHAR}");
        }
        
        if (record.getWaterid() != null) {
            sql.VALUES("waterid", "#{waterid,jdbcType=INTEGER}");
        }
        
        if (record.getWnumber() != null) {
            sql.VALUES("wnumber", "#{wnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getWatervolume() != null) {
            sql.VALUES("waterVolume", "#{watervolume,jdbcType=DOUBLE}");
        }
        
        if (record.getMonth() != null) {
            sql.VALUES("month", "#{month,jdbcType=DATE}");
        }
        
        if (record.getOlname() != null) {
            sql.VALUES("olName", "#{olname,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(HouseWaterVoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("hid");
        } else {
            sql.SELECT("hid");
        }
        sql.SELECT("olid");
        sql.SELECT("hBulidingName");
        sql.SELECT("waterid");
        sql.SELECT("wnumber");
        sql.SELECT("waterVolume");
        sql.SELECT("month");
        sql.SELECT("olName");
        sql.FROM("house_water_vo");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        HouseWaterVo record = (HouseWaterVo) parameter.get("record");
        HouseWaterVoExample example = (HouseWaterVoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("house_water_vo");
        
        if (record.getHid() != null) {
            sql.SET("hid = #{record.hid,jdbcType=INTEGER}");
        }
        
        if (record.getOlid() != null) {
            sql.SET("olid = #{record.olid,jdbcType=INTEGER}");
        }
        
        if (record.getHbulidingname() != null) {
            sql.SET("hBulidingName = #{record.hbulidingname,jdbcType=VARCHAR}");
        }
        
        if (record.getWaterid() != null) {
            sql.SET("waterid = #{record.waterid,jdbcType=INTEGER}");
        }
        
        if (record.getWnumber() != null) {
            sql.SET("wnumber = #{record.wnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getWatervolume() != null) {
            sql.SET("waterVolume = #{record.watervolume,jdbcType=DOUBLE}");
        }
        
        if (record.getMonth() != null) {
            sql.SET("month = #{record.month,jdbcType=DATE}");
        }
        
        if (record.getOlname() != null) {
            sql.SET("olName = #{record.olname,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("house_water_vo");
        
        sql.SET("hid = #{record.hid,jdbcType=INTEGER}");
        sql.SET("olid = #{record.olid,jdbcType=INTEGER}");
        sql.SET("hBulidingName = #{record.hbulidingname,jdbcType=VARCHAR}");
        sql.SET("waterid = #{record.waterid,jdbcType=INTEGER}");
        sql.SET("wnumber = #{record.wnumber,jdbcType=VARCHAR}");
        sql.SET("waterVolume = #{record.watervolume,jdbcType=DOUBLE}");
        sql.SET("month = #{record.month,jdbcType=DATE}");
        sql.SET("olName = #{record.olname,jdbcType=VARCHAR}");
        
        HouseWaterVoExample example = (HouseWaterVoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, HouseWaterVoExample example, boolean includeExamplePhrase) {
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