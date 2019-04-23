package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Contract;
import com.ssm.wuye.domain.ContractExample.Criteria;
import com.ssm.wuye.domain.ContractExample.Criterion;
import com.ssm.wuye.domain.ContractExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ContractSqlProvider {

    public String countByExample(ContractExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("contract");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ContractExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("contract");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Contract record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("contract");
        
        if (record.getContractid() != null) {
            sql.VALUES("contractId", "#{contractid,jdbcType=INTEGER}");
        }
        
        if (record.getContractname() != null) {
            sql.VALUES("contractName", "#{contractname,jdbcType=VARCHAR}");
        }
        
        if (record.getContracttype() != null) {
            sql.VALUES("contractType", "#{contracttype,jdbcType=VARCHAR}");
        }
        
        if (record.getContractstart() != null) {
            sql.VALUES("contractStart", "#{contractstart,jdbcType=DATE}");
        }
        
        if (record.getContractend() != null) {
            sql.VALUES("contractEnd", "#{contractend,jdbcType=DATE}");
        }
        
        if (record.getContractdes() != null) {
            sql.VALUES("contractDes", "#{contractdes,jdbcType=VARCHAR}");
        }
        
        if (record.getSigningpeople() != null) {
            sql.VALUES("signingPeople", "#{signingpeople,jdbcType=VARCHAR}");
        }
        
        if (record.getSignatorytelephone() != null) {
            sql.VALUES("signatoryTelephone", "#{signatorytelephone,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ContractExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("contractId");
        } else {
            sql.SELECT("contractId");
        }
        sql.SELECT("contractName");
        sql.SELECT("contractType");
        sql.SELECT("contractStart");
        sql.SELECT("contractEnd");
        sql.SELECT("contractDes");
        sql.SELECT("signingPeople");
        sql.SELECT("signatoryTelephone");
        sql.FROM("contract");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Contract record = (Contract) parameter.get("record");
        ContractExample example = (ContractExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("contract");
        
        if (record.getContractid() != null) {
            sql.SET("contractId = #{record.contractid,jdbcType=INTEGER}");
        }
        
        if (record.getContractname() != null) {
            sql.SET("contractName = #{record.contractname,jdbcType=VARCHAR}");
        }
        
        if (record.getContracttype() != null) {
            sql.SET("contractType = #{record.contracttype,jdbcType=VARCHAR}");
        }
        
        if (record.getContractstart() != null) {
            sql.SET("contractStart = #{record.contractstart,jdbcType=DATE}");
        }
        
        if (record.getContractend() != null) {
            sql.SET("contractEnd = #{record.contractend,jdbcType=DATE}");
        }
        
        if (record.getContractdes() != null) {
            sql.SET("contractDes = #{record.contractdes,jdbcType=VARCHAR}");
        }
        
        if (record.getSigningpeople() != null) {
            sql.SET("signingPeople = #{record.signingpeople,jdbcType=VARCHAR}");
        }
        
        if (record.getSignatorytelephone() != null) {
            sql.SET("signatoryTelephone = #{record.signatorytelephone,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("contract");
        
        sql.SET("contractId = #{record.contractid,jdbcType=INTEGER}");
        sql.SET("contractName = #{record.contractname,jdbcType=VARCHAR}");
        sql.SET("contractType = #{record.contracttype,jdbcType=VARCHAR}");
        sql.SET("contractStart = #{record.contractstart,jdbcType=DATE}");
        sql.SET("contractEnd = #{record.contractend,jdbcType=DATE}");
        sql.SET("contractDes = #{record.contractdes,jdbcType=VARCHAR}");
        sql.SET("signingPeople = #{record.signingpeople,jdbcType=VARCHAR}");
        sql.SET("signatoryTelephone = #{record.signatorytelephone,jdbcType=VARCHAR}");
        
        ContractExample example = (ContractExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Contract record) {
        SQL sql = new SQL();
        sql.UPDATE("contract");
        
        if (record.getContractname() != null) {
            sql.SET("contractName = #{contractname,jdbcType=VARCHAR}");
        }
        
        if (record.getContracttype() != null) {
            sql.SET("contractType = #{contracttype,jdbcType=VARCHAR}");
        }
        
        if (record.getContractstart() != null) {
            sql.SET("contractStart = #{contractstart,jdbcType=DATE}");
        }
        
        if (record.getContractend() != null) {
            sql.SET("contractEnd = #{contractend,jdbcType=DATE}");
        }
        
        if (record.getContractdes() != null) {
            sql.SET("contractDes = #{contractdes,jdbcType=VARCHAR}");
        }
        
        if (record.getSigningpeople() != null) {
            sql.SET("signingPeople = #{signingpeople,jdbcType=VARCHAR}");
        }
        
        if (record.getSignatorytelephone() != null) {
            sql.SET("signatoryTelephone = #{signatorytelephone,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("contractId = #{contractid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ContractExample example, boolean includeExamplePhrase) {
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