package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Sys_admin_info;
import com.ssm.wuye.domain.Sys_admin_infoExample.Criteria;
import com.ssm.wuye.domain.Sys_admin_infoExample.Criterion;
import com.ssm.wuye.domain.Sys_admin_infoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Sys_admin_infoSqlProvider {

    public String countByExample(Sys_admin_infoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("sys_admin_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(Sys_admin_infoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("sys_admin_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Sys_admin_info record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_admin_info");
        
        if (record.getUserid() != null) {
            sql.VALUES("userid", "#{userid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserpass() != null) {
            sql.VALUES("userpass", "#{userpass,jdbcType=VARCHAR}");
        }
        
        if (record.getUserphone() != null) {
            sql.VALUES("userphone", "#{userphone,jdbcType=VARCHAR}");
        }
        
        if (record.getUsermail() != null) {
            sql.VALUES("usermail", "#{usermail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserqqface() != null) {
            sql.VALUES("userqqface", "#{userqqface,jdbcType=VARCHAR}");
        }
        
        if (record.getUserflag() != null) {
            sql.VALUES("userflag", "#{userflag,jdbcType=VARCHAR}");
        }
        
        if (record.getUserstyle() != null) {
            sql.VALUES("userstyle", "#{userstyle,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleid() != null) {
            sql.VALUES("roleid", "#{roleid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(Sys_admin_infoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("userid");
        } else {
            sql.SELECT("userid");
        }
        sql.SELECT("username");
        sql.SELECT("userpass");
        sql.SELECT("userphone");
        sql.SELECT("usermail");
        sql.SELECT("userqqface");
        sql.SELECT("userflag");
        sql.SELECT("userstyle");
        sql.SELECT("roleid");
        sql.FROM("sys_admin_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Sys_admin_info record = (Sys_admin_info) parameter.get("record");
        Sys_admin_infoExample example = (Sys_admin_infoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("sys_admin_info");
        
        if (record.getUserid() != null) {
            sql.SET("userid = #{record.userid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserpass() != null) {
            sql.SET("userpass = #{record.userpass,jdbcType=VARCHAR}");
        }
        
        if (record.getUserphone() != null) {
            sql.SET("userphone = #{record.userphone,jdbcType=VARCHAR}");
        }
        
        if (record.getUsermail() != null) {
            sql.SET("usermail = #{record.usermail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserqqface() != null) {
            sql.SET("userqqface = #{record.userqqface,jdbcType=VARCHAR}");
        }
        
        if (record.getUserflag() != null) {
            sql.SET("userflag = #{record.userflag,jdbcType=VARCHAR}");
        }
        
        if (record.getUserstyle() != null) {
            sql.SET("userstyle = #{record.userstyle,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleid() != null) {
            sql.SET("roleid = #{record.roleid,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("sys_admin_info");
        
        sql.SET("userid = #{record.userid,jdbcType=INTEGER}");
        sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        sql.SET("userpass = #{record.userpass,jdbcType=VARCHAR}");
        sql.SET("userphone = #{record.userphone,jdbcType=VARCHAR}");
        sql.SET("usermail = #{record.usermail,jdbcType=VARCHAR}");
        sql.SET("userqqface = #{record.userqqface,jdbcType=VARCHAR}");
        sql.SET("userflag = #{record.userflag,jdbcType=VARCHAR}");
        sql.SET("userstyle = #{record.userstyle,jdbcType=VARCHAR}");
        sql.SET("roleid = #{record.roleid,jdbcType=INTEGER}");
        
        Sys_admin_infoExample example = (Sys_admin_infoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Sys_admin_info record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_admin_info");
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getUserpass() != null) {
            sql.SET("userpass = #{userpass,jdbcType=VARCHAR}");
        }
        
        if (record.getUserphone() != null) {
            sql.SET("userphone = #{userphone,jdbcType=VARCHAR}");
        }
        
        if (record.getUsermail() != null) {
            sql.SET("usermail = #{usermail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserqqface() != null) {
            sql.SET("userqqface = #{userqqface,jdbcType=VARCHAR}");
        }
        
        if (record.getUserflag() != null) {
            sql.SET("userflag = #{userflag,jdbcType=VARCHAR}");
        }
        
        if (record.getUserstyle() != null) {
            sql.SET("userstyle = #{userstyle,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleid() != null) {
            sql.SET("roleid = #{roleid,jdbcType=INTEGER}");
        }
        
        sql.WHERE("userid = #{userid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, Sys_admin_infoExample example, boolean includeExamplePhrase) {
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