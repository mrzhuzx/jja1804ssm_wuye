package com.ssm.wuye.dao;

import com.ssm.wuye.domain.ParkingPlaceinfo;
import com.ssm.wuye.domain.ParkingPlaceinfoExample.Criteria;
import com.ssm.wuye.domain.ParkingPlaceinfoExample.Criterion;
import com.ssm.wuye.domain.ParkingPlaceinfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ParkingPlaceinfoSqlProvider {

    public String countByExample(ParkingPlaceinfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("parking_placeinfo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ParkingPlaceinfoExample example) {
        SQL sql = new SQL();

        sql.DELETE_FROM("parking_placeinfo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ParkingPlaceinfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("parking_placeinfo");
        
        if (record.getHid() != null) {
            sql.VALUES("hid", "#{hid,jdbcType=INTEGER}");
        }
        
        if (record.getPid() != null) {
            sql.VALUES("pid", "#{pid,jdbcType=VARCHAR}");
        }
        
        if (record.getOlid() != null) {
            sql.VALUES("olid", "#{olid,jdbcType=INTEGER}");
        }
        
        if (record.getHname() != null) {
            sql.VALUES("hname", "#{hname,jdbcType=VARCHAR}");
        }
        
        if (record.getHphone() != null) {
            sql.VALUES("hphone", "#{hphone,jdbcType=VARCHAR}");
        }
        
        if (record.getHcards() != null) {
            sql.VALUES("hcards", "#{hcards,jdbcType=VARCHAR}");
        }
        
        if (record.getDescr() != null) {
            sql.VALUES("descr", "#{descr,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ParkingPlaceinfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("hid");
        } else {
            sql.SELECT("hid");
        }
        sql.SELECT("pid");
        sql.SELECT("olid");
        sql.SELECT("hname");
        sql.SELECT("hphone");
        sql.SELECT("hcards");
        sql.SELECT("descr");
        sql.FROM("parking_placeinfo");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ParkingPlaceinfo record = (ParkingPlaceinfo) parameter.get("record");
        ParkingPlaceinfoExample example = (ParkingPlaceinfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("parking_placeinfo");
        
        if (record.getHid() != null) {
            sql.SET("hid = #{record.hid,jdbcType=INTEGER}");
        }
        
        if (record.getPid() != null) {
            sql.SET("pid = #{record.pid,jdbcType=VARCHAR}");
        }
        
        if (record.getOlid() != null) {
            sql.SET("olid = #{record.olid,jdbcType=INTEGER}");
        }
        
        if (record.getHname() != null) {
            sql.SET("hname = #{record.hname,jdbcType=VARCHAR}");
        }
        
        if (record.getHphone() != null) {
            sql.SET("hphone = #{record.hphone,jdbcType=VARCHAR}");
        }
        
        if (record.getHcards() != null) {
            sql.SET("hcards = #{record.hcards,jdbcType=VARCHAR}");
        }
        
        if (record.getDescr() != null) {
            sql.SET("descr = #{record.descr,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("parking_placeinfo");
        
        sql.SET("hid = #{record.hid,jdbcType=INTEGER}");
        sql.SET("pid = #{record.pid,jdbcType=VARCHAR}");
        sql.SET("olid = #{record.olid,jdbcType=INTEGER}");
        sql.SET("hname = #{record.hname,jdbcType=VARCHAR}");
        sql.SET("hphone = #{record.hphone,jdbcType=VARCHAR}");
        sql.SET("hcards = #{record.hcards,jdbcType=VARCHAR}");
        sql.SET("descr = #{record.descr,jdbcType=VARCHAR}");
        
        ParkingPlaceinfoExample example = (ParkingPlaceinfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ParkingPlaceinfo record) {
        SQL sql = new SQL();
        sql.UPDATE("parking_placeinfo");
        
        if (record.getPid() != null) {
            sql.SET("pid = #{pid,jdbcType=VARCHAR}");
        }
        
        if (record.getOlid() != null) {
            sql.SET("olid = #{olid,jdbcType=INTEGER}");
        }
        
        if (record.getHname() != null) {
            sql.SET("hname = #{hname,jdbcType=VARCHAR}");
        }
        
        if (record.getHphone() != null) {
            sql.SET("hphone = #{hphone,jdbcType=VARCHAR}");
        }
        
        if (record.getHcards() != null) {
            sql.SET("hcards = #{hcards,jdbcType=VARCHAR}");
        }
        
        if (record.getDescr() != null) {
            sql.SET("descr = #{descr,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("hid = #{hid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ParkingPlaceinfoExample example, boolean includeExamplePhrase) {
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