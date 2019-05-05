package com.ssm.wuye.dao;

import com.ssm.wuye.domain.OwerHouseType;
import com.ssm.wuye.domain.OwerHouseTypeExample.Criteria;
import com.ssm.wuye.domain.OwerHouseTypeExample.Criterion;
import com.ssm.wuye.domain.OwerHouseTypeExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OwerHouseTypeSqlProvider {

    public String countByExample(OwerHouseTypeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ower_house_type");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OwerHouseTypeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ower_house_type");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OwerHouseType record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ower_house_type");
        
        if (record.getOlname() != null) {
            sql.VALUES("olName", "#{olname,jdbcType=VARCHAR}");
        }
        
        if (record.getHnumber() != null) {
            sql.VALUES("hNumber", "#{hnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getHstate() != null) {
            sql.VALUES("hState", "#{hstate,jdbcType=VARCHAR}");
        }
        
        if (record.getHbulidingname() != null) {
            sql.VALUES("hBulidingName", "#{hbulidingname,jdbcType=VARCHAR}");
        }
        
        if (record.getHunitnumber() != null) {
            sql.VALUES("hUnitNumber", "#{hunitnumber,jdbcType=INTEGER}");
        }
        
        if (record.getHfloor() != null) {
            sql.VALUES("hFloor", "#{hfloor,jdbcType=INTEGER}");
        }
        
        if (record.getHdirection() != null) {
            sql.VALUES("hDirection", "#{hdirection,jdbcType=VARCHAR}");
        }
        
        if (record.getHarea() != null) {
            sql.VALUES("hArea", "#{harea,jdbcType=VARCHAR}");
        }
        
        if (record.getHremarks() != null) {
            sql.VALUES("hRemarks", "#{hremarks,jdbcType=VARCHAR}");
        }
        
        if (record.getLoan() != null) {
            sql.VALUES("Loan", "#{loan,jdbcType=INTEGER}");
        }
        
        if (record.getHtypename() != null) {
            sql.VALUES("hTypeName", "#{htypename,jdbcType=VARCHAR}");
        }
        
        if (record.getHtpropertyright() != null) {
            sql.VALUES("htPropertyRight", "#{htpropertyright,jdbcType=VARCHAR}");
        }
        
        if (record.getOlphone() != null) {
            sql.VALUES("olPhone", "#{olphone,jdbcType=VARCHAR}");
        }
        
        if (record.getOlid() != null) {
            sql.VALUES("olId", "#{olid,jdbcType=INTEGER}");
        }
        
        if (record.getHid() != null) {
            sql.VALUES("hid", "#{hid,jdbcType=INTEGER}");
        }
        
        if (record.getHtypeid() != null) {
            sql.VALUES("hTypeId", "#{htypeid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OwerHouseTypeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("olName");
        } else {
            sql.SELECT("olName");
        }
        sql.SELECT("hNumber");
        sql.SELECT("hState");
        sql.SELECT("hBulidingName");
        sql.SELECT("hUnitNumber");
        sql.SELECT("hFloor");
        sql.SELECT("hDirection");
        sql.SELECT("hArea");
        sql.SELECT("hRemarks");
        sql.SELECT("Loan");
        sql.SELECT("hTypeName");
        sql.SELECT("htPropertyRight");
        sql.SELECT("olPhone");
        sql.SELECT("olId");
        sql.SELECT("hid");
        sql.SELECT("hTypeId");
        sql.FROM("ower_house_type");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OwerHouseType record = (OwerHouseType) parameter.get("record");
        OwerHouseTypeExample example = (OwerHouseTypeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ower_house_type");
        
        if (record.getOlname() != null) {
            sql.SET("olName = #{record.olname,jdbcType=VARCHAR}");
        }
        
        if (record.getHnumber() != null) {
            sql.SET("hNumber = #{record.hnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getHstate() != null) {
            sql.SET("hState = #{record.hstate,jdbcType=VARCHAR}");
        }
        
        if (record.getHbulidingname() != null) {
            sql.SET("hBulidingName = #{record.hbulidingname,jdbcType=VARCHAR}");
        }
        
        if (record.getHunitnumber() != null) {
            sql.SET("hUnitNumber = #{record.hunitnumber,jdbcType=INTEGER}");
        }
        
        if (record.getHfloor() != null) {
            sql.SET("hFloor = #{record.hfloor,jdbcType=INTEGER}");
        }
        
        if (record.getHdirection() != null) {
            sql.SET("hDirection = #{record.hdirection,jdbcType=VARCHAR}");
        }
        
        if (record.getHarea() != null) {
            sql.SET("hArea = #{record.harea,jdbcType=VARCHAR}");
        }
        
        if (record.getHremarks() != null) {
            sql.SET("hRemarks = #{record.hremarks,jdbcType=VARCHAR}");
        }
        
        if (record.getLoan() != null) {
            sql.SET("Loan = #{record.loan,jdbcType=INTEGER}");
        }
        
        if (record.getHtypename() != null) {
            sql.SET("hTypeName = #{record.htypename,jdbcType=VARCHAR}");
        }
        
        if (record.getHtpropertyright() != null) {
            sql.SET("htPropertyRight = #{record.htpropertyright,jdbcType=VARCHAR}");
        }
        
        if (record.getOlphone() != null) {
            sql.SET("olPhone = #{record.olphone,jdbcType=VARCHAR}");
        }
        
        if (record.getOlid() != null) {
            sql.SET("olId = #{record.olid,jdbcType=INTEGER}");
        }
        
        if (record.getHid() != null) {
            sql.SET("hid = #{record.hid,jdbcType=INTEGER}");
        }
        
        if (record.getHtypeid() != null) {
            sql.SET("hTypeId = #{record.htypeid,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ower_house_type");
        
        sql.SET("olName = #{record.olname,jdbcType=VARCHAR}");
        sql.SET("hNumber = #{record.hnumber,jdbcType=VARCHAR}");
        sql.SET("hState = #{record.hstate,jdbcType=VARCHAR}");
        sql.SET("hBulidingName = #{record.hbulidingname,jdbcType=VARCHAR}");
        sql.SET("hUnitNumber = #{record.hunitnumber,jdbcType=INTEGER}");
        sql.SET("hFloor = #{record.hfloor,jdbcType=INTEGER}");
        sql.SET("hDirection = #{record.hdirection,jdbcType=VARCHAR}");
        sql.SET("hArea = #{record.harea,jdbcType=VARCHAR}");
        sql.SET("hRemarks = #{record.hremarks,jdbcType=VARCHAR}");
        sql.SET("Loan = #{record.loan,jdbcType=INTEGER}");
        sql.SET("hTypeName = #{record.htypename,jdbcType=VARCHAR}");
        sql.SET("htPropertyRight = #{record.htpropertyright,jdbcType=VARCHAR}");
        sql.SET("olPhone = #{record.olphone,jdbcType=VARCHAR}");
        sql.SET("olId = #{record.olid,jdbcType=INTEGER}");
        sql.SET("hid = #{record.hid,jdbcType=INTEGER}");
        sql.SET("hTypeId = #{record.htypeid,jdbcType=INTEGER}");
        
        OwerHouseTypeExample example = (OwerHouseTypeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OwerHouseTypeExample example, boolean includeExamplePhrase) {
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