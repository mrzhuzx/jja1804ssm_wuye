package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Cleaning;
import com.ssm.wuye.domain.CleaningExample.Criteria;
import com.ssm.wuye.domain.CleaningExample.Criterion;
import com.ssm.wuye.domain.CleaningExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CleaningSqlProvider {

    public String countByExample(CleaningExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("cleaning");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CleaningExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("cleaning");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Cleaning record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("cleaning");
        
        if (record.getCleid() != null) {
            sql.VALUES("cleid", "#{cleid,jdbcType=INTEGER}");
        }
        
        if (record.getClename() != null) {
            sql.VALUES("clename", "#{clename,jdbcType=VARCHAR}");
        }
        
        if (record.getClephone() != null) {
            sql.VALUES("clephone", "#{clephone,jdbcType=VARCHAR}");
        }
        
        if (record.getCleflag() != null) {
            sql.VALUES("cleflag", "#{cleflag,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleid() != null) {
            sql.VALUES("roleid", "#{roleid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CleaningExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("cleid");
        } else {
            sql.SELECT("cleid");
        }
        sql.SELECT("clename");
        sql.SELECT("clephone");
        sql.SELECT("cleflag");
        sql.SELECT("roleid");
        sql.FROM("cleaning");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Cleaning record = (Cleaning) parameter.get("record");
        CleaningExample example = (CleaningExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("cleaning");
        
        if (record.getCleid() != null) {
            sql.SET("cleid = #{record.cleid,jdbcType=INTEGER}");
        }
        
        if (record.getClename() != null) {
            sql.SET("clename = #{record.clename,jdbcType=VARCHAR}");
        }
        
        if (record.getClephone() != null) {
            sql.SET("clephone = #{record.clephone,jdbcType=VARCHAR}");
        }
        
        if (record.getCleflag() != null) {
            sql.SET("cleflag = #{record.cleflag,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleid() != null) {
            sql.SET("roleid = #{record.roleid,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("cleaning");
        
        sql.SET("cleid = #{record.cleid,jdbcType=INTEGER}");
        sql.SET("clename = #{record.clename,jdbcType=VARCHAR}");
        sql.SET("clephone = #{record.clephone,jdbcType=VARCHAR}");
        sql.SET("cleflag = #{record.cleflag,jdbcType=VARCHAR}");
        sql.SET("roleid = #{record.roleid,jdbcType=INTEGER}");
        
        CleaningExample example = (CleaningExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CleaningExample example, boolean includeExamplePhrase) {
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