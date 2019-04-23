package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Sys_role;
import com.ssm.wuye.domain.Sys_roleExample.Criteria;
import com.ssm.wuye.domain.Sys_roleExample.Criterion;
import com.ssm.wuye.domain.Sys_roleExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Sys_roleSqlProvider {

    public String countByExample(Sys_roleExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("sys_role");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(Sys_roleExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("sys_role");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Sys_role record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_role");
        
        if (record.getRoleid() != null) {
            sql.VALUES("roleId", "#{roleid,jdbcType=INTEGER}");
        }
        
        if (record.getRolename() != null) {
            sql.VALUES("roleName", "#{rolename,jdbcType=VARCHAR}");
        }
        
        if (record.getRolestatus() != null) {
            sql.VALUES("roleStatus", "#{rolestatus,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(Sys_roleExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("roleId");
        } else {
            sql.SELECT("roleId");
        }
        sql.SELECT("roleName");
        sql.SELECT("roleStatus");
        sql.FROM("sys_role");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Sys_role record = (Sys_role) parameter.get("record");
        Sys_roleExample example = (Sys_roleExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("sys_role");
        
        if (record.getRoleid() != null) {
            sql.SET("roleId = #{record.roleid,jdbcType=INTEGER}");
        }
        
        if (record.getRolename() != null) {
            sql.SET("roleName = #{record.rolename,jdbcType=VARCHAR}");
        }
        
        if (record.getRolestatus() != null) {
            sql.SET("roleStatus = #{record.rolestatus,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("sys_role");
        
        sql.SET("roleId = #{record.roleid,jdbcType=INTEGER}");
        sql.SET("roleName = #{record.rolename,jdbcType=VARCHAR}");
        sql.SET("roleStatus = #{record.rolestatus,jdbcType=VARCHAR}");
        
        Sys_roleExample example = (Sys_roleExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Sys_role record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_role");
        
        if (record.getRolename() != null) {
            sql.SET("roleName = #{rolename,jdbcType=VARCHAR}");
        }
        
        if (record.getRolestatus() != null) {
            sql.SET("roleStatus = #{rolestatus,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("roleId = #{roleid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, Sys_roleExample example, boolean includeExamplePhrase) {
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