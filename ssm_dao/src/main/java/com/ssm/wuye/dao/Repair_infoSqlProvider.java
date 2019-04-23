package com.ssm.wuye.dao;

import com.ssm.wuye.domain.Repair_info;
import com.ssm.wuye.domain.Repair_infoExample.Criteria;
import com.ssm.wuye.domain.Repair_infoExample.Criterion;
import com.ssm.wuye.domain.Repair_infoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Repair_infoSqlProvider {

    public String countByExample(Repair_infoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("repair_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(Repair_infoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("repair_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Repair_info record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("repair_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getRepairname() != null) {
            sql.VALUES("repairname", "#{repairname,jdbcType=VARCHAR}");
        }
        
        if (record.getRepairphone() != null) {
            sql.VALUES("repairphone", "#{repairphone,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.VALUES("category", "#{category,jdbcType=VARCHAR}");
        }
        
        if (record.getRepdesc() != null) {
            sql.VALUES("repdesc", "#{repdesc,jdbcType=VARCHAR}");
        }
        
        if (record.getReportdate() != null) {
            sql.VALUES("reportdate", "#{reportdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMeans() != null) {
            sql.VALUES("means", "#{means,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getRepairdate() != null) {
            sql.VALUES("repairdate", "#{repairdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPrincipal() != null) {
            sql.VALUES("principal", "#{principal,jdbcType=VARCHAR}");
        }
        
        if (record.getMaterial() != null) {
            sql.VALUES("material", "#{material,jdbcType=DOUBLE}");
        }
        
        if (record.getUpkeep() != null) {
            sql.VALUES("upkeep", "#{upkeep,jdbcType=DOUBLE}");
        }
        
        if (record.getCompletedate() != null) {
            sql.VALUES("completedate", "#{completedate,jdbcType=DATE}");
        }
        
        if (record.getIspay() != null) {
            sql.VALUES("ispay", "#{ispay,jdbcType=INTEGER}");
        }
        
        if (record.getPaydate() != null) {
            sql.VALUES("paydate", "#{paydate,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(Repair_infoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("repairname");
        sql.SELECT("repairphone");
        sql.SELECT("category");
        sql.SELECT("repdesc");
        sql.SELECT("reportdate");
        sql.SELECT("means");
        sql.SELECT("status");
        sql.SELECT("repairdate");
        sql.SELECT("principal");
        sql.SELECT("material");
        sql.SELECT("upkeep");
        sql.SELECT("completedate");
        sql.SELECT("ispay");
        sql.SELECT("paydate");
        sql.FROM("repair_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Repair_info record = (Repair_info) parameter.get("record");
        Repair_infoExample example = (Repair_infoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("repair_info");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getRepairname() != null) {
            sql.SET("repairname = #{record.repairname,jdbcType=VARCHAR}");
        }
        
        if (record.getRepairphone() != null) {
            sql.SET("repairphone = #{record.repairphone,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.SET("category = #{record.category,jdbcType=VARCHAR}");
        }
        
        if (record.getRepdesc() != null) {
            sql.SET("repdesc = #{record.repdesc,jdbcType=VARCHAR}");
        }
        
        if (record.getReportdate() != null) {
            sql.SET("reportdate = #{record.reportdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMeans() != null) {
            sql.SET("means = #{record.means,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getRepairdate() != null) {
            sql.SET("repairdate = #{record.repairdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPrincipal() != null) {
            sql.SET("principal = #{record.principal,jdbcType=VARCHAR}");
        }
        
        if (record.getMaterial() != null) {
            sql.SET("material = #{record.material,jdbcType=DOUBLE}");
        }
        
        if (record.getUpkeep() != null) {
            sql.SET("upkeep = #{record.upkeep,jdbcType=DOUBLE}");
        }
        
        if (record.getCompletedate() != null) {
            sql.SET("completedate = #{record.completedate,jdbcType=DATE}");
        }
        
        if (record.getIspay() != null) {
            sql.SET("ispay = #{record.ispay,jdbcType=INTEGER}");
        }
        
        if (record.getPaydate() != null) {
            sql.SET("paydate = #{record.paydate,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("repair_info");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("repairname = #{record.repairname,jdbcType=VARCHAR}");
        sql.SET("repairphone = #{record.repairphone,jdbcType=VARCHAR}");
        sql.SET("category = #{record.category,jdbcType=VARCHAR}");
        sql.SET("repdesc = #{record.repdesc,jdbcType=VARCHAR}");
        sql.SET("reportdate = #{record.reportdate,jdbcType=TIMESTAMP}");
        sql.SET("means = #{record.means,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("repairdate = #{record.repairdate,jdbcType=TIMESTAMP}");
        sql.SET("principal = #{record.principal,jdbcType=VARCHAR}");
        sql.SET("material = #{record.material,jdbcType=DOUBLE}");
        sql.SET("upkeep = #{record.upkeep,jdbcType=DOUBLE}");
        sql.SET("completedate = #{record.completedate,jdbcType=DATE}");
        sql.SET("ispay = #{record.ispay,jdbcType=INTEGER}");
        sql.SET("paydate = #{record.paydate,jdbcType=TIMESTAMP}");
        
        Repair_infoExample example = (Repair_infoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Repair_info record) {
        SQL sql = new SQL();
        sql.UPDATE("repair_info");
        
        if (record.getRepairname() != null) {
            sql.SET("repairname = #{repairname,jdbcType=VARCHAR}");
        }
        
        if (record.getRepairphone() != null) {
            sql.SET("repairphone = #{repairphone,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.SET("category = #{category,jdbcType=VARCHAR}");
        }
        
        if (record.getRepdesc() != null) {
            sql.SET("repdesc = #{repdesc,jdbcType=VARCHAR}");
        }
        
        if (record.getReportdate() != null) {
            sql.SET("reportdate = #{reportdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMeans() != null) {
            sql.SET("means = #{means,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getRepairdate() != null) {
            sql.SET("repairdate = #{repairdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPrincipal() != null) {
            sql.SET("principal = #{principal,jdbcType=VARCHAR}");
        }
        
        if (record.getMaterial() != null) {
            sql.SET("material = #{material,jdbcType=DOUBLE}");
        }
        
        if (record.getUpkeep() != null) {
            sql.SET("upkeep = #{upkeep,jdbcType=DOUBLE}");
        }
        
        if (record.getCompletedate() != null) {
            sql.SET("completedate = #{completedate,jdbcType=DATE}");
        }
        
        if (record.getIspay() != null) {
            sql.SET("ispay = #{ispay,jdbcType=INTEGER}");
        }
        
        if (record.getPaydate() != null) {
            sql.SET("paydate = #{paydate,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, Repair_infoExample example, boolean includeExamplePhrase) {
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