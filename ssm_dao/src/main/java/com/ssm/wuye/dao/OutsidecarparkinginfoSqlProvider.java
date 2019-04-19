package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Outsidecarparkinginfo;
import com.ssm.wuye.domain.OutsidecarparkinginfoExample.Criteria;
import com.ssm.wuye.domain.OutsidecarparkinginfoExample.Criterion;
import com.ssm.wuye.domain.OutsidecarparkinginfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OutsidecarparkinginfoSqlProvider {

    public String countByExample(OutsidecarparkinginfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("outsidecarparkinginfo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OutsidecarparkinginfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("outsidecarparkinginfo");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Outsidecarparkinginfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("outsidecarparkinginfo");
        
        if (record.getParkingid() != null) {
            sql.VALUES("parkingid", "#{parkingid,jdbcType=INTEGER}");
        }
        
        if (record.getParkingcards() != null) {
            sql.VALUES("Parkingcards", "#{parkingcards,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingcost() != null) {
            sql.VALUES("Parkingcost", "#{parkingcost,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingintime() != null) {
            sql.VALUES("Parkingintime", "#{parkingintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getParkingouttime() != null) {
            sql.VALUES("Parkingouttime", "#{parkingouttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPaymentmethod() != null) {
            sql.VALUES("paymentMethod", "#{paymentmethod,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentstatus() != null) {
            sql.VALUES("PaymentStatus", "#{paymentstatus,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OutsidecarparkinginfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("parkingid");
        } else {
            sql.SELECT("parkingid");
        }
        sql.SELECT("Parkingcards");
        sql.SELECT("Parkingcost");
        sql.SELECT("Parkingintime");
        sql.SELECT("Parkingouttime");
        sql.SELECT("paymentMethod");
        sql.SELECT("PaymentStatus");
        sql.FROM("outsidecarparkinginfo");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Outsidecarparkinginfo record = (Outsidecarparkinginfo) parameter.get("record");
        OutsidecarparkinginfoExample example = (OutsidecarparkinginfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("outsidecarparkinginfo");
        
        if (record.getParkingid() != null) {
            sql.SET("parkingid = #{record.parkingid,jdbcType=INTEGER}");
        }
        
        if (record.getParkingcards() != null) {
            sql.SET("Parkingcards = #{record.parkingcards,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingcost() != null) {
            sql.SET("Parkingcost = #{record.parkingcost,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingintime() != null) {
            sql.SET("Parkingintime = #{record.parkingintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getParkingouttime() != null) {
            sql.SET("Parkingouttime = #{record.parkingouttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPaymentmethod() != null) {
            sql.SET("paymentMethod = #{record.paymentmethod,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentstatus() != null) {
            sql.SET("PaymentStatus = #{record.paymentstatus,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("outsidecarparkinginfo");
        
        sql.SET("parkingid = #{record.parkingid,jdbcType=INTEGER}");
        sql.SET("Parkingcards = #{record.parkingcards,jdbcType=VARCHAR}");
        sql.SET("Parkingcost = #{record.parkingcost,jdbcType=VARCHAR}");
        sql.SET("Parkingintime = #{record.parkingintime,jdbcType=TIMESTAMP}");
        sql.SET("Parkingouttime = #{record.parkingouttime,jdbcType=TIMESTAMP}");
        sql.SET("paymentMethod = #{record.paymentmethod,jdbcType=INTEGER}");
        sql.SET("PaymentStatus = #{record.paymentstatus,jdbcType=INTEGER}");
        
        OutsidecarparkinginfoExample example = (OutsidecarparkinginfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Outsidecarparkinginfo record) {
        SQL sql = new SQL();
        sql.UPDATE("outsidecarparkinginfo");
        
        if (record.getParkingcards() != null) {
            sql.SET("Parkingcards = #{parkingcards,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingcost() != null) {
            sql.SET("Parkingcost = #{parkingcost,jdbcType=VARCHAR}");
        }
        
        if (record.getParkingintime() != null) {
            sql.SET("Parkingintime = #{parkingintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getParkingouttime() != null) {
            sql.SET("Parkingouttime = #{parkingouttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPaymentmethod() != null) {
            sql.SET("paymentMethod = #{paymentmethod,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentstatus() != null) {
            sql.SET("PaymentStatus = #{paymentstatus,jdbcType=INTEGER}");
        }
        
        sql.WHERE("parkingid = #{parkingid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OutsidecarparkinginfoExample example, boolean includeExamplePhrase) {
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