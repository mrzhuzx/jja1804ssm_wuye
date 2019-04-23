package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChWaterMeterExample {
    /**
     * ch_water_meter
     */
    protected String orderByClause;

    /**
     * ch_water_meter
     */
    protected boolean distinct;

    /**
     * ch_water_meter
     */
    protected List<Criteria> oredCriteria;

    public ChWaterMeterExample() {
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
     * ch_water_meter 2019-04-23
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

        public Criteria andWateridIsNull() {
            addCriterion("waterid is null");
            return (Criteria) this;
        }

        public Criteria andWateridIsNotNull() {
            addCriterion("waterid is not null");
            return (Criteria) this;
        }

        public Criteria andWateridEqualTo(Integer value) {
            addCriterion("waterid =", value, "waterid");
            return (Criteria) this;
        }

        public Criteria andWateridNotEqualTo(Integer value) {
            addCriterion("waterid <>", value, "waterid");
            return (Criteria) this;
        }

        public Criteria andWateridGreaterThan(Integer value) {
            addCriterion("waterid >", value, "waterid");
            return (Criteria) this;
        }

        public Criteria andWateridGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterid >=", value, "waterid");
            return (Criteria) this;
        }

        public Criteria andWateridLessThan(Integer value) {
            addCriterion("waterid <", value, "waterid");
            return (Criteria) this;
        }

        public Criteria andWateridLessThanOrEqualTo(Integer value) {
            addCriterion("waterid <=", value, "waterid");
            return (Criteria) this;
        }

        public Criteria andWateridIn(List<Integer> values) {
            addCriterion("waterid in", values, "waterid");
            return (Criteria) this;
        }

        public Criteria andWateridNotIn(List<Integer> values) {
            addCriterion("waterid not in", values, "waterid");
            return (Criteria) this;
        }

        public Criteria andWateridBetween(Integer value1, Integer value2) {
            addCriterion("waterid between", value1, value2, "waterid");
            return (Criteria) this;
        }

        public Criteria andWateridNotBetween(Integer value1, Integer value2) {
            addCriterion("waterid not between", value1, value2, "waterid");
            return (Criteria) this;
        }

        public Criteria andWnumberIsNull() {
            addCriterion("wnumber is null");
            return (Criteria) this;
        }

        public Criteria andWnumberIsNotNull() {
            addCriterion("wnumber is not null");
            return (Criteria) this;
        }

        public Criteria andWnumberEqualTo(String value) {
            addCriterion("wnumber =", value, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberNotEqualTo(String value) {
            addCriterion("wnumber <>", value, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberGreaterThan(String value) {
            addCriterion("wnumber >", value, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberGreaterThanOrEqualTo(String value) {
            addCriterion("wnumber >=", value, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberLessThan(String value) {
            addCriterion("wnumber <", value, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberLessThanOrEqualTo(String value) {
            addCriterion("wnumber <=", value, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberLike(String value) {
            addCriterion("wnumber like", value, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberNotLike(String value) {
            addCriterion("wnumber not like", value, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberIn(List<String> values) {
            addCriterion("wnumber in", values, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberNotIn(List<String> values) {
            addCriterion("wnumber not in", values, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberBetween(String value1, String value2) {
            addCriterion("wnumber between", value1, value2, "wnumber");
            return (Criteria) this;
        }

        public Criteria andWnumberNotBetween(String value1, String value2) {
            addCriterion("wnumber not between", value1, value2, "wnumber");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNull() {
            addCriterion("houseid is null");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNotNull() {
            addCriterion("houseid is not null");
            return (Criteria) this;
        }

        public Criteria andHouseidEqualTo(Integer value) {
            addCriterion("houseid =", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotEqualTo(Integer value) {
            addCriterion("houseid <>", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThan(Integer value) {
            addCriterion("houseid >", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("houseid >=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThan(Integer value) {
            addCriterion("houseid <", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThanOrEqualTo(Integer value) {
            addCriterion("houseid <=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidIn(List<Integer> values) {
            addCriterion("houseid in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotIn(List<Integer> values) {
            addCriterion("houseid not in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidBetween(Integer value1, Integer value2) {
            addCriterion("houseid between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("houseid not between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andWatervolumeIsNull() {
            addCriterion("waterVolume is null");
            return (Criteria) this;
        }

        public Criteria andWatervolumeIsNotNull() {
            addCriterion("waterVolume is not null");
            return (Criteria) this;
        }

        public Criteria andWatervolumeEqualTo(Double value) {
            addCriterion("waterVolume =", value, "watervolume");
            return (Criteria) this;
        }

        public Criteria andWatervolumeNotEqualTo(Double value) {
            addCriterion("waterVolume <>", value, "watervolume");
            return (Criteria) this;
        }

        public Criteria andWatervolumeGreaterThan(Double value) {
            addCriterion("waterVolume >", value, "watervolume");
            return (Criteria) this;
        }

        public Criteria andWatervolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("waterVolume >=", value, "watervolume");
            return (Criteria) this;
        }

        public Criteria andWatervolumeLessThan(Double value) {
            addCriterion("waterVolume <", value, "watervolume");
            return (Criteria) this;
        }

        public Criteria andWatervolumeLessThanOrEqualTo(Double value) {
            addCriterion("waterVolume <=", value, "watervolume");
            return (Criteria) this;
        }

        public Criteria andWatervolumeIn(List<Double> values) {
            addCriterion("waterVolume in", values, "watervolume");
            return (Criteria) this;
        }

        public Criteria andWatervolumeNotIn(List<Double> values) {
            addCriterion("waterVolume not in", values, "watervolume");
            return (Criteria) this;
        }

        public Criteria andWatervolumeBetween(Double value1, Double value2) {
            addCriterion("waterVolume between", value1, value2, "watervolume");
            return (Criteria) this;
        }

        public Criteria andWatervolumeNotBetween(Double value1, Double value2) {
            addCriterion("waterVolume not between", value1, value2, "watervolume");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Date value) {
            addCriterionForJDBCDate("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Date value) {
            addCriterionForJDBCDate("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Date value) {
            addCriterionForJDBCDate("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Date> values) {
            addCriterionForJDBCDate("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andWnumberLikeInsensitive(String value) {
            addCriterion("upper(wnumber) like", value.toUpperCase(), "wnumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ch_water_meter 2019-04-23
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