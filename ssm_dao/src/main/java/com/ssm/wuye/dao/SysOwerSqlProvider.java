package com.ssm.wuye.dao;

import com.ssm.wuye.domain.SysOwer;
import com.ssm.wuye.domain.SysOwerExample.Criteria;
import com.ssm.wuye.domain.SysOwerExample.Criterion;
import com.ssm.wuye.domain.SysOwerExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SysOwerSqlProvider {

    public String countByExample(SysOwerExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("sys_ower");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SysOwerExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("sys_ower");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SysOwer record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_ower");
        
        if (record.getOlid() != null) {
            sql.VALUES("olId", "#{olid,jdbcType=INTEGER}");
        }
        
        if (record.getOlname() != null) {
            sql.VALUES("olName", "#{olname,jdbcType=VARCHAR}");
        }
        
        if (record.getOlaccount() != null) {
            sql.VALUES("olAccount", "#{olaccount,jdbcType=VARCHAR}");
        }
        
        if (record.getOlpasswd() != null) {
            sql.VALUES("olPasswd", "#{olpasswd,jdbcType=VARCHAR}");
        }
        
        if (record.getPowerid() != null) {
            sql.VALUES("powerId", "#{powerid,jdbcType=VARCHAR}");
        }
        
        if (record.getOlphone() != null) {
            sql.VALUES("olPhone", "#{olphone,jdbcType=VARCHAR}");
        }
        
        if (record.getOlheadimg() != null) {
            sql.VALUES("olHeadimg", "#{olheadimg,jdbcType=VARCHAR}");
        }
        
        if (record.getOlmember() != null) {
            sql.VALUES("olMember", "#{olmember,jdbcType=INTEGER}");
        }
        
        if (record.getRoleid() != null) {
            sql.VALUES("roleId", "#{roleid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SysOwerExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("olId");
        } else {
            sql.SELECT("olId");
        }
        sql.SELECT("olName");
        sql.SELECT("olAccount");
        sql.SELECT("olPasswd");
        sql.SELECT("powerId");
        sql.SELECT("olPhone");
        sql.SELECT("olHeadimg");
        sql.SELECT("olMember");
        sql.SELECT("roleId");
        sql.FROM("sys_ower");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SysOwer record = (SysOwer) parameter.get("record");
        SysOwerExample example = (SysOwerExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("sys_ower");
        
        if (record.getOlid() != null) {
            sql.SET("olId = #{record.olid,jdbcType=INTEGER}");
        }
        
        if (record.getOlname() != null) {
            sql.SET("olName = #{record.olname,jdbcType=VARCHAR}");
        }
        
        if (record.getOlaccount() != null) {
            sql.SET("olAccount = #{record.olaccount,jdbcType=VARCHAR}");
        }
        
        if (record.getOlpasswd() != null) {
            sql.SET("olPasswd = #{record.olpasswd,jdbcType=VARCHAR}");
        }
        
        if (record.getPowerid() != null) {
            sql.SET("powerId = #{record.powerid,jdbcType=VARCHAR}");
        }
        
        if (record.getOlphone() != null) {
            sql.SET("olPhone = #{record.olphone,jdbcType=VARCHAR}");
        }
        
        if (record.getOlheadimg() != null) {
            sql.SET("olHeadimg = #{record.olheadimg,jdbcType=VARCHAR}");
        }
        
        if (record.getOlmember() != null) {
            sql.SET("olMember = #{record.olmember,jdbcType=INTEGER}");
        }
        
        if (record.getRoleid() != null) {
            sql.SET("roleId = #{record.roleid,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("sys_ower");
        
        sql.SET("olId = #{record.olid,jdbcType=INTEGER}");
        sql.SET("olName = #{record.olname,jdbcType=VARCHAR}");
        sql.SET("olAccount = #{record.olaccount,jdbcType=VARCHAR}");
        sql.SET("olPasswd = #{record.olpasswd,jdbcType=VARCHAR}");
        sql.SET("powerId = #{record.powerid,jdbcType=VARCHAR}");
        sql.SET("olPhone = #{record.olphone,jdbcType=VARCHAR}");
        sql.SET("olHeadimg = #{record.olheadimg,jdbcType=VARCHAR}");
        sql.SET("olMember = #{record.olmember,jdbcType=INTEGER}");
        sql.SET("roleId = #{record.roleid,jdbcType=INTEGER}");
        
        SysOwerExample example = (SysOwerExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SysOwer record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_ower");
        
        if (record.getOlname() != null) {
            sql.SET("olName = #{olname,jdbcType=VARCHAR}");
        }
        
        if (record.getOlaccount() != null) {
            sql.SET("olAccount = #{olaccount,jdbcType=VARCHAR}");
        }
        
        if (record.getOlpasswd() != null) {
            sql.SET("olPasswd = #{olpasswd,jdbcType=VARCHAR}");
        }
        
        if (record.getPowerid() != null) {
            sql.SET("powerId = #{powerid,jdbcType=VARCHAR}");
        }
        
        if (record.getOlphone() != null) {
            sql.SET("olPhone = #{olphone,jdbcType=VARCHAR}");
        }
        
        if (record.getOlheadimg() != null) {
            sql.SET("olHeadimg = #{olheadimg,jdbcType=VARCHAR}");
        }
        
        if (record.getOlmember() != null) {
            sql.SET("olMember = #{olmember,jdbcType=INTEGER}");
        }
        
        if (record.getRoleid() != null) {
            sql.SET("roleId = #{roleid,jdbcType=INTEGER}");
        }
        
        sql.WHERE("olId = #{olid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SysOwerExample example, boolean includeExamplePhrase) {
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