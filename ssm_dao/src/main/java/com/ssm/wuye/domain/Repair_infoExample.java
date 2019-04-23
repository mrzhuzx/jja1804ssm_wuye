package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Repair_infoExample {
    /**
     * repair_info
     */
    protected String orderByClause;

    /**
     * repair_info
     */
    protected boolean distinct;

    /**
     * repair_info
     */
    protected List<Criteria> oredCriteria;

    public Repair_infoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * repair_info 2019-04-23
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRepairnameIsNull() {
            addCriterion("repairname is null");
            return (Criteria) this;
        }

        public Criteria andRepairnameIsNotNull() {
            addCriterion("repairname is not null");
            return (Criteria) this;
        }

        public Criteria andRepairnameEqualTo(String value) {
            addCriterion("repairname =", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameNotEqualTo(String value) {
            addCriterion("repairname <>", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameGreaterThan(String value) {
            addCriterion("repairname >", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameGreaterThanOrEqualTo(String value) {
            addCriterion("repairname >=", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameLessThan(String value) {
            addCriterion("repairname <", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameLessThanOrEqualTo(String value) {
            addCriterion("repairname <=", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameLike(String value) {
            addCriterion("repairname like", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameNotLike(String value) {
            addCriterion("repairname not like", value, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameIn(List<String> values) {
            addCriterion("repairname in", values, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameNotIn(List<String> values) {
            addCriterion("repairname not in", values, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameBetween(String value1, String value2) {
            addCriterion("repairname between", value1, value2, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairnameNotBetween(String value1, String value2) {
            addCriterion("repairname not between", value1, value2, "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairphoneIsNull() {
            addCriterion("repairphone is null");
            return (Criteria) this;
        }

        public Criteria andRepairphoneIsNotNull() {
            addCriterion("repairphone is not null");
            return (Criteria) this;
        }

        public Criteria andRepairphoneEqualTo(String value) {
            addCriterion("repairphone =", value, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneNotEqualTo(String value) {
            addCriterion("repairphone <>", value, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneGreaterThan(String value) {
            addCriterion("repairphone >", value, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneGreaterThanOrEqualTo(String value) {
            addCriterion("repairphone >=", value, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneLessThan(String value) {
            addCriterion("repairphone <", value, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneLessThanOrEqualTo(String value) {
            addCriterion("repairphone <=", value, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneLike(String value) {
            addCriterion("repairphone like", value, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneNotLike(String value) {
            addCriterion("repairphone not like", value, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneIn(List<String> values) {
            addCriterion("repairphone in", values, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneNotIn(List<String> values) {
            addCriterion("repairphone not in", values, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneBetween(String value1, String value2) {
            addCriterion("repairphone between", value1, value2, "repairphone");
            return (Criteria) this;
        }

        public Criteria andRepairphoneNotBetween(String value1, String value2) {
            addCriterion("repairphone not between", value1, value2, "repairphone");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andRepdescIsNull() {
            addCriterion("repdesc is null");
            return (Criteria) this;
        }

        public Criteria andRepdescIsNotNull() {
            addCriterion("repdesc is not null");
            return (Criteria) this;
        }

        public Criteria andRepdescEqualTo(String value) {
            addCriterion("repdesc =", value, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescNotEqualTo(String value) {
            addCriterion("repdesc <>", value, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescGreaterThan(String value) {
            addCriterion("repdesc >", value, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescGreaterThanOrEqualTo(String value) {
            addCriterion("repdesc >=", value, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescLessThan(String value) {
            addCriterion("repdesc <", value, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescLessThanOrEqualTo(String value) {
            addCriterion("repdesc <=", value, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescLike(String value) {
            addCriterion("repdesc like", value, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescNotLike(String value) {
            addCriterion("repdesc not like", value, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescIn(List<String> values) {
            addCriterion("repdesc in", values, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescNotIn(List<String> values) {
            addCriterion("repdesc not in", values, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescBetween(String value1, String value2) {
            addCriterion("repdesc between", value1, value2, "repdesc");
            return (Criteria) this;
        }

        public Criteria andRepdescNotBetween(String value1, String value2) {
            addCriterion("repdesc not between", value1, value2, "repdesc");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNull() {
            addCriterion("reportdate is null");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNotNull() {
            addCriterion("reportdate is not null");
            return (Criteria) this;
        }

        public Criteria andReportdateEqualTo(Date value) {
            addCriterion("reportdate =", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotEqualTo(Date value) {
            addCriterion("reportdate <>", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThan(Date value) {
            addCriterion("reportdate >", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThanOrEqualTo(Date value) {
            addCriterion("reportdate >=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThan(Date value) {
            addCriterion("reportdate <", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThanOrEqualTo(Date value) {
            addCriterion("reportdate <=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateIn(List<Date> values) {
            addCriterion("reportdate in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotIn(List<Date> values) {
            addCriterion("reportdate not in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateBetween(Date value1, Date value2) {
            addCriterion("reportdate between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotBetween(Date value1, Date value2) {
            addCriterion("reportdate not between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andMeansIsNull() {
            addCriterion("means is null");
            return (Criteria) this;
        }

        public Criteria andMeansIsNotNull() {
            addCriterion("means is not null");
            return (Criteria) this;
        }

        public Criteria andMeansEqualTo(Integer value) {
            addCriterion("means =", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansNotEqualTo(Integer value) {
            addCriterion("means <>", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansGreaterThan(Integer value) {
            addCriterion("means >", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansGreaterThanOrEqualTo(Integer value) {
            addCriterion("means >=", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansLessThan(Integer value) {
            addCriterion("means <", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansLessThanOrEqualTo(Integer value) {
            addCriterion("means <=", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansIn(List<Integer> values) {
            addCriterion("means in", values, "means");
            return (Criteria) this;
        }

        public Criteria andMeansNotIn(List<Integer> values) {
            addCriterion("means not in", values, "means");
            return (Criteria) this;
        }

        public Criteria andMeansBetween(Integer value1, Integer value2) {
            addCriterion("means between", value1, value2, "means");
            return (Criteria) this;
        }

        public Criteria andMeansNotBetween(Integer value1, Integer value2) {
            addCriterion("means not between", value1, value2, "means");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRepairdateIsNull() {
            addCriterion("repairdate is null");
            return (Criteria) this;
        }

        public Criteria andRepairdateIsNotNull() {
            addCriterion("repairdate is not null");
            return (Criteria) this;
        }

        public Criteria andRepairdateEqualTo(Date value) {
            addCriterion("repairdate =", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateNotEqualTo(Date value) {
            addCriterion("repairdate <>", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateGreaterThan(Date value) {
            addCriterion("repairdate >", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateGreaterThanOrEqualTo(Date value) {
            addCriterion("repairdate >=", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateLessThan(Date value) {
            addCriterion("repairdate <", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateLessThanOrEqualTo(Date value) {
            addCriterion("repairdate <=", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateIn(List<Date> values) {
            addCriterion("repairdate in", values, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateNotIn(List<Date> values) {
            addCriterion("repairdate not in", values, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateBetween(Date value1, Date value2) {
            addCriterion("repairdate between", value1, value2, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateNotBetween(Date value1, Date value2) {
            addCriterion("repairdate not between", value1, value2, "repairdate");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(Double value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(Double value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(Double value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(Double value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(Double value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(Double value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<Double> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<Double> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(Double value1, Double value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(Double value1, Double value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andUpkeepIsNull() {
            addCriterion("upkeep is null");
            return (Criteria) this;
        }

        public Criteria andUpkeepIsNotNull() {
            addCriterion("upkeep is not null");
            return (Criteria) this;
        }

        public Criteria andUpkeepEqualTo(Double value) {
            addCriterion("upkeep =", value, "upkeep");
            return (Criteria) this;
        }

        public Criteria andUpkeepNotEqualTo(Double value) {
            addCriterion("upkeep <>", value, "upkeep");
            return (Criteria) this;
        }

        public Criteria andUpkeepGreaterThan(Double value) {
            addCriterion("upkeep >", value, "upkeep");
            return (Criteria) this;
        }

        public Criteria andUpkeepGreaterThanOrEqualTo(Double value) {
            addCriterion("upkeep >=", value, "upkeep");
            return (Criteria) this;
        }

        public Criteria andUpkeepLessThan(Double value) {
            addCriterion("upkeep <", value, "upkeep");
            return (Criteria) this;
        }

        public Criteria andUpkeepLessThanOrEqualTo(Double value) {
            addCriterion("upkeep <=", value, "upkeep");
            return (Criteria) this;
        }

        public Criteria andUpkeepIn(List<Double> values) {
            addCriterion("upkeep in", values, "upkeep");
            return (Criteria) this;
        }

        public Criteria andUpkeepNotIn(List<Double> values) {
            addCriterion("upkeep not in", values, "upkeep");
            return (Criteria) this;
        }

        public Criteria andUpkeepBetween(Double value1, Double value2) {
            addCriterion("upkeep between", value1, value2, "upkeep");
            return (Criteria) this;
        }

        public Criteria andUpkeepNotBetween(Double value1, Double value2) {
            addCriterion("upkeep not between", value1, value2, "upkeep");
            return (Criteria) this;
        }

        public Criteria andCompletedateIsNull() {
            addCriterion("completedate is null");
            return (Criteria) this;
        }

        public Criteria andCompletedateIsNotNull() {
            addCriterion("completedate is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedateEqualTo(Date value) {
            addCriterionForJDBCDate("completedate =", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("completedate <>", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateGreaterThan(Date value) {
            addCriterionForJDBCDate("completedate >", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("completedate >=", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateLessThan(Date value) {
            addCriterionForJDBCDate("completedate <", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("completedate <=", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateIn(List<Date> values) {
            addCriterionForJDBCDate("completedate in", values, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("completedate not in", values, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("completedate between", value1, value2, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("completedate not between", value1, value2, "completedate");
            return (Criteria) this;
        }

        public Criteria andIspayIsNull() {
            addCriterion("ispay is null");
            return (Criteria) this;
        }

        public Criteria andIspayIsNotNull() {
            addCriterion("ispay is not null");
            return (Criteria) this;
        }

        public Criteria andIspayEqualTo(Integer value) {
            addCriterion("ispay =", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotEqualTo(Integer value) {
            addCriterion("ispay <>", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThan(Integer value) {
            addCriterion("ispay >", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThanOrEqualTo(Integer value) {
            addCriterion("ispay >=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThan(Integer value) {
            addCriterion("ispay <", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThanOrEqualTo(Integer value) {
            addCriterion("ispay <=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayIn(List<Integer> values) {
            addCriterion("ispay in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotIn(List<Integer> values) {
            addCriterion("ispay not in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayBetween(Integer value1, Integer value2) {
            addCriterion("ispay between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotBetween(Integer value1, Integer value2) {
            addCriterion("ispay not between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("paydate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("paydate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("paydate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("paydate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("paydate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("paydate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("paydate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("paydate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("paydate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("paydate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("paydate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("paydate not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andRepairnameLikeInsensitive(String value) {
            addCriterion("upper(repairname) like", value.toUpperCase(), "repairname");
            return (Criteria) this;
        }

        public Criteria andRepairphoneLikeInsensitive(String value) {
            addCriterion("upper(repairphone) like", value.toUpperCase(), "repairphone");
            return (Criteria) this;
        }

        public Criteria andCategoryLikeInsensitive(String value) {
            addCriterion("upper(category) like", value.toUpperCase(), "category");
            return (Criteria) this;
        }

        public Criteria andRepdescLikeInsensitive(String value) {
            addCriterion("upper(repdesc) like", value.toUpperCase(), "repdesc");
            return (Criteria) this;
        }

        public Criteria andPrincipalLikeInsensitive(String value) {
            addCriterion("upper(principal) like", value.toUpperCase(), "principal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * repair_info 2019-04-23
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}