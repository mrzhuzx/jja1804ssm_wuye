package com.ssm.wuye.dao;

import com.ssm.wuye.domain.TbCharge;
import com.ssm.wuye.domain.TbChargeExample.Criteria;
import com.ssm.wuye.domain.TbChargeExample.Criterion;
import com.ssm.wuye.domain.TbChargeExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TbChargeSqlProvider {

    public String countByExample(TbChargeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_charge");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TbChargeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_charge");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TbCharge record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_charge");
        
        if (record.getChargeid() != null) {
            sql.VALUES("chargeId", "#{chargeid,jdbcType=INTEGER}");
        }
        
        if (record.getChargename() != null) {
            sql.VALUES("chargeName", "#{chargename,jdbcType=VARCHAR}");
        }
        
        if (record.getChargestandard() != null) {
            sql.VALUES("chargeStandard", "#{chargestandard,jdbcType=DOUBLE}");
        }
        
        if (record.getChargedescription() != null) {
            sql.VALUES("chargeDescription", "#{chargedescription,jdbcType=VARCHAR}");
        }
        
        if (record.getChargeyear() != null) {
            sql.VALUES("chargeYear", "#{chargeyear,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TbChargeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("chargeId");
        } else {
            sql.SELECT("chargeId");
        }
        sql.SELECT("chargeName");
        sql.SELECT("chargeStandard");
        sql.SELECT("chargeDescription");
        sql.SELECT("chargeYear");
        sql.FROM("tb_charge");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TbCharge record = (TbCharge) parameter.get("record");
        TbChargeExample example = (TbChargeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_charge");
        
        if (record.getChargeid() != null) {
            sql.SET("chargeId = #{record.chargeid,jdbcType=INTEGER}");
        }
        
        if (record.getChargename() != null) {
            sql.SET("chargeName = #{record.chargename,jdbcType=VARCHAR}");
        }
        
        if (record.getChargestandard() != null) {
            sql.SET("chargeStandard = #{record.chargestandard,jdbcType=DOUBLE}");
        }
        
        if (record.getChargedescription() != null) {
            sql.SET("chargeDescription = #{record.chargedescription,jdbcType=VARCHAR}");
        }
        
        if (record.getChargeyear() != null) {
            sql.SET("chargeYear = #{record.chargeyear,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_charge");
        
        sql.SET("chargeId = #{record.chargeid,jdbcType=INTEGER}");
        sql.SET("chargeName = #{record.chargename,jdbcType=VARCHAR}");
        sql.SET("chargeStandard = #{record.chargestandard,jdbcType=DOUBLE}");
        sql.SET("chargeDescription = #{record.chargedescription,jdbcType=VARCHAR}");
        sql.SET("chargeYear = #{record.chargeyear,jdbcType=VARCHAR}");
        
        TbChargeExample example = (TbChargeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TbCharge record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_charge");
        
        if (record.getChargename() != null) {
            sql.SET("chargeName = #{chargename,jdbcType=VARCHAR}");
        }
        
        if (record.getChargestandard() != null) {
            sql.SET("chargeStandard = #{chargestandard,jdbcType=DOUBLE}");
        }
        
        if (record.getChargedescription() != null) {
            sql.SET("chargeDescription = #{chargedescription,jdbcType=VARCHAR}");
        }
        
        if (record.getChargeyear() != null) {
            sql.SET("chargeYear = #{chargeyear,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("chargeId = #{chargeid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TbChargeExample example, boolean includeExamplePhrase) {
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