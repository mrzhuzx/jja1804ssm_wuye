package com.ssm.wuye.dao;

import com.ssm.wuye.domain.News;
import com.ssm.wuye.domain.NewsExample.Criteria;
import com.ssm.wuye.domain.NewsExample.Criterion;
import com.ssm.wuye.domain.NewsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class NewsSqlProvider {

    public String countByExample(NewsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("news");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(NewsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("news");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(News record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("news");
        
        if (record.getNcid() != null) {
            sql.VALUES("ncid", "#{ncid,jdbcType=INTEGER}");
        }
        
        if (record.getNctitle() != null) {
            sql.VALUES("nctitle", "#{nctitle,jdbcType=VARCHAR}");
        }
        
        if (record.getNccontent() != null) {
            sql.VALUES("nccontent", "#{nccontent,jdbcType=VARCHAR}");
        }
        
        if (record.getNctime() != null) {
            sql.VALUES("nctime", "#{nctime,jdbcType=DATE}");
        }
        
        if (record.getNctypeid() != null) {
            sql.VALUES("nctypeid", "#{nctypeid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(NewsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ncid");
        } else {
            sql.SELECT("ncid");
        }
        sql.SELECT("nctitle");
        sql.SELECT("nccontent");
        sql.SELECT("nctime");
        sql.SELECT("nctypeid");
        sql.FROM("news");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        News record = (News) parameter.get("record");
        NewsExample example = (NewsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("news");
        
        if (record.getNcid() != null) {
            sql.SET("ncid = #{record.ncid,jdbcType=INTEGER}");
        }
        
        if (record.getNctitle() != null) {
            sql.SET("nctitle = #{record.nctitle,jdbcType=VARCHAR}");
        }
        
        if (record.getNccontent() != null) {
            sql.SET("nccontent = #{record.nccontent,jdbcType=VARCHAR}");
        }
        
        if (record.getNctime() != null) {
            sql.SET("nctime = #{record.nctime,jdbcType=DATE}");
        }
        
        if (record.getNctypeid() != null) {
            sql.SET("nctypeid = #{record.nctypeid,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("news");
        
        sql.SET("ncid = #{record.ncid,jdbcType=INTEGER}");
        sql.SET("nctitle = #{record.nctitle,jdbcType=VARCHAR}");
        sql.SET("nccontent = #{record.nccontent,jdbcType=VARCHAR}");
        sql.SET("nctime = #{record.nctime,jdbcType=DATE}");
        sql.SET("nctypeid = #{record.nctypeid,jdbcType=INTEGER}");
        
        NewsExample example = (NewsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(News record) {
        SQL sql = new SQL();
        sql.UPDATE("news");
        
        if (record.getNctitle() != null) {
            sql.SET("nctitle = #{nctitle,jdbcType=VARCHAR}");
        }
        
        if (record.getNccontent() != null) {
            sql.SET("nccontent = #{nccontent,jdbcType=VARCHAR}");
        }
        
        if (record.getNctime() != null) {
            sql.SET("nctime = #{nctime,jdbcType=DATE}");
        }
        
        if (record.getNctypeid() != null) {
            sql.SET("nctypeid = #{nctypeid,jdbcType=INTEGER}");
        }
        
        sql.WHERE("ncid = #{ncid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, NewsExample example, boolean includeExamplePhrase) {
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