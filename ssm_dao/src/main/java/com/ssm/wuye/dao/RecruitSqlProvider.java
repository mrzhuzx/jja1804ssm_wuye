package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Recruit;
import com.ssm.wuye.domain.RecruitExample.Criteria;
import com.ssm.wuye.domain.RecruitExample.Criterion;
import com.ssm.wuye.domain.RecruitExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RecruitSqlProvider {

    public String countByExample(RecruitExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("recruit");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RecruitExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("recruit");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Recruit record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("recruit");
        
        if (record.getRecruitid() != null) {
            sql.VALUES("recruitId", "#{recruitid,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyname() != null) {
            sql.VALUES("companyName", "#{companyname,jdbcType=VARCHAR}");
        }
        
        if (record.getPostname() != null) {
            sql.VALUES("postName", "#{postname,jdbcType=VARCHAR}");
        }
        
        if (record.getRecruitdes() != null) {
            sql.VALUES("recruitDes", "#{recruitdes,jdbcType=VARCHAR}");
        }
        
        if (record.getDuty() != null) {
            sql.VALUES("Duty", "#{duty,jdbcType=VARCHAR}");
        }
        
        if (record.getSalary() != null) {
            sql.VALUES("Salary", "#{salary,jdbcType=VARCHAR}");
        }
        
        if (record.getRecruitnum() != null) {
            sql.VALUES("recruitNum", "#{recruitnum,jdbcType=INTEGER}");
        }
        
        if (record.getRecruitnumber() != null) {
            sql.VALUES("recruitNumber", "#{recruitnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getRecruitend() != null) {
            sql.VALUES("recruitEnd", "#{recruitend,jdbcType=DATE}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("Address", "#{address,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RecruitExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("recruitId");
        } else {
            sql.SELECT("recruitId");
        }
        sql.SELECT("companyName");
        sql.SELECT("postName");
        sql.SELECT("recruitDes");
        sql.SELECT("Duty");
        sql.SELECT("Salary");
        sql.SELECT("recruitNum");
        sql.SELECT("recruitNumber");
        sql.SELECT("recruitEnd");
        sql.SELECT("Address");
        sql.FROM("recruit");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Recruit record = (Recruit) parameter.get("record");
        RecruitExample example = (RecruitExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("recruit");
        
        if (record.getRecruitid() != null) {
            sql.SET("recruitId = #{record.recruitid,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyname() != null) {
            sql.SET("companyName = #{record.companyname,jdbcType=VARCHAR}");
        }
        
        if (record.getPostname() != null) {
            sql.SET("postName = #{record.postname,jdbcType=VARCHAR}");
        }
        
        if (record.getRecruitdes() != null) {
            sql.SET("recruitDes = #{record.recruitdes,jdbcType=VARCHAR}");
        }
        
        if (record.getDuty() != null) {
            sql.SET("Duty = #{record.duty,jdbcType=VARCHAR}");
        }
        
        if (record.getSalary() != null) {
            sql.SET("Salary = #{record.salary,jdbcType=VARCHAR}");
        }
        
        if (record.getRecruitnum() != null) {
            sql.SET("recruitNum = #{record.recruitnum,jdbcType=INTEGER}");
        }
        
        if (record.getRecruitnumber() != null) {
            sql.SET("recruitNumber = #{record.recruitnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getRecruitend() != null) {
            sql.SET("recruitEnd = #{record.recruitend,jdbcType=DATE}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("Address = #{record.address,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("recruit");
        
        sql.SET("recruitId = #{record.recruitid,jdbcType=INTEGER}");
        sql.SET("companyName = #{record.companyname,jdbcType=VARCHAR}");
        sql.SET("postName = #{record.postname,jdbcType=VARCHAR}");
        sql.SET("recruitDes = #{record.recruitdes,jdbcType=VARCHAR}");
        sql.SET("Duty = #{record.duty,jdbcType=VARCHAR}");
        sql.SET("Salary = #{record.salary,jdbcType=VARCHAR}");
        sql.SET("recruitNum = #{record.recruitnum,jdbcType=INTEGER}");
        sql.SET("recruitNumber = #{record.recruitnumber,jdbcType=VARCHAR}");
        sql.SET("recruitEnd = #{record.recruitend,jdbcType=DATE}");
        sql.SET("Address = #{record.address,jdbcType=VARCHAR}");
        
        RecruitExample example = (RecruitExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Recruit record) {
        System.out.println(record.toString()+"////////////////////////////////");
        SQL sql = new SQL();
        sql.UPDATE("recruit");
        
        if (record.getCompanyname() != null) {
            sql.SET("companyName = #{companyname,jdbcType=VARCHAR}");
        }
        
        if (record.getPostname() != null) {
            sql.SET("postName = #{postname,jdbcType=VARCHAR}");
        }
        
        if (record.getRecruitdes() != null) {
            sql.SET("recruitDes = #{recruitdes,jdbcType=VARCHAR}");
        }
        
        if (record.getDuty() != null) {
            sql.SET("Duty = #{duty,jdbcType=VARCHAR}");
        }
        
        if (record.getSalary() != null) {
            sql.SET("Salary = #{salary,jdbcType=VARCHAR}");
        }
        
        if (record.getRecruitnum() != null) {
            sql.SET("recruitNum = #{recruitnum,jdbcType=INTEGER}");
        }
        
        if (record.getRecruitnumber() != null) {
            sql.SET("recruitNumber = #{recruitnumber,jdbcType=VARCHAR}");
        }
        
        if (record.getRecruitend() != null) {
            sql.SET("recruitEnd = #{recruitend,jdbcType=DATE}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("Address = #{address,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("recruitId = #{recruitid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RecruitExample example, boolean includeExamplePhrase) {
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