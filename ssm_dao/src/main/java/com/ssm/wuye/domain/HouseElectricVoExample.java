package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseElectricVoExample {
    /**
     * house_electric_vo
     */
    protected String orderByClause;

    /**
     * house_electric_vo
     */
    protected boolean distinct;

    /**
     * house_electric_vo
     */
    protected List<Criteria> oredCriteria;

    public HouseElectricVoExample() {
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
     * house_electric_vo 2019-05-09
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

        public Criteria andOlidIsNull() {
            addCriterion("olId is null");
            return (Criteria) this;
        }

        public Criteria andOlidIsNotNull() {
            addCriterion("olId is not null");
            return (Criteria) this;
        }

        public Criteria andOlidEqualTo(Integer value) {
            addCriterion("olId =", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotEqualTo(Integer value) {
            addCriterion("olId <>", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThan(Integer value) {
            addCriterion("olId >", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("olId >=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThan(Integer value) {
            addCriterion("olId <", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThanOrEqualTo(Integer value) {
            addCriterion("olId <=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidIn(List<Integer> values) {
            addCriterion("olId in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotIn(List<Integer> values) {
            addCriterion("olId not in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidBetween(Integer value1, Integer value2) {
            addCriterion("olId between", value1, value2, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotBetween(Integer value1, Integer value2) {
            addCriterion("olId not between", value1, value2, "olid");
            return (Criteria) this;
        }

        public Criteria andOlnameIsNull() {
            addCriterion("olName is null");
            return (Criteria) this;
        }

        public Criteria andOlnameIsNotNull() {
            addCriterion("olName is not null");
            return (Criteria) this;
        }

        public Criteria andOlnameEqualTo(String value) {
            addCriterion("olName =", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameNotEqualTo(String value) {
            addCriterion("olName <>", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameGreaterThan(String value) {
            addCriterion("olName >", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameGreaterThanOrEqualTo(String value) {
            addCriterion("olName >=", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameLessThan(String value) {
            addCriterion("olName <", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameLessThanOrEqualTo(String value) {
            addCriterion("olName <=", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameLike(String value) {
            addCriterion("olName like", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameNotLike(String value) {
            addCriterion("olName not like", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameIn(List<String> values) {
            addCriterion("olName in", values, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameNotIn(List<String> values) {
            addCriterion("olName not in", values, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameBetween(String value1, String value2) {
            addCriterion("olName between", value1, value2, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameNotBetween(String value1, String value2) {
            addCriterion("olName not between", value1, value2, "olname");
            return (Criteria) this;
        }

        public Criteria andElectricidIsNull() {
            addCriterion("electricid is null");
            return (Criteria) this;
        }

        public Criteria andElectricidIsNotNull() {
            addCriterion("electricid is not null");
            return (Criteria) this;
        }

        public Criteria andElectricidEqualTo(Integer value) {
            addCriterion("electricid =", value, "electricid");
            return (Criteria) this;
        }

        public Criteria andElectricidNotEqualTo(Integer value) {
            addCriterion("electricid <>", value, "electricid");
            return (Criteria) this;
        }

        public Criteria andElectricidGreaterThan(Integer value) {
            addCriterion("electricid >", value, "electricid");
            return (Criteria) this;
        }

        public Criteria andElectricidGreaterThanOrEqualTo(Integer value) {
            addCriterion("electricid >=", value, "electricid");
            return (Criteria) this;
        }

        public Criteria andElectricidLessThan(Integer value) {
            addCriterion("electricid <", value, "electricid");
            return (Criteria) this;
        }

        public Criteria andElectricidLessThanOrEqualTo(Integer value) {
            addCriterion("electricid <=", value, "electricid");
            return (Criteria) this;
        }

        public Criteria andElectricidIn(List<Integer> values) {
            addCriterion("electricid in", values, "electricid");
            return (Criteria) this;
        }

        public Criteria andElectricidNotIn(List<Integer> values) {
            addCriterion("electricid not in", values, "electricid");
            return (Criteria) this;
        }

        public Criteria andElectricidBetween(Integer value1, Integer value2) {
            addCriterion("electricid between", value1, value2, "electricid");
            return (Criteria) this;
        }

        public Criteria andElectricidNotBetween(Integer value1, Integer value2) {
            addCriterion("electricid not between", value1, value2, "electricid");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNull() {
            addCriterion("enumber is null");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNotNull() {
            addCriterion("enumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnumberEqualTo(String value) {
            addCriterion("enumber =", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotEqualTo(String value) {
            addCriterion("enumber <>", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThan(String value) {
            addCriterion("enumber >", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThanOrEqualTo(String value) {
            addCriterion("enumber >=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThan(String value) {
            addCriterion("enumber <", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThanOrEqualTo(String value) {
            addCriterion("enumber <=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLike(String value) {
            addCriterion("enumber like", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotLike(String value) {
            addCriterion("enumber not like", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberIn(List<String> values) {
            addCriterion("enumber in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotIn(List<String> values) {
            addCriterion("enumber not in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberBetween(String value1, String value2) {
            addCriterion("enumber between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotBetween(String value1, String value2) {
            addCriterion("enumber not between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andElectricIsNull() {
            addCriterion("electric is null");
            return (Criteria) this;
        }

        public Criteria andElectricIsNotNull() {
            addCriterion("electric is not null");
            return (Criteria) this;
        }

        public Criteria andElectricEqualTo(Double value) {
            addCriterion("electric =", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotEqualTo(Double value) {
            addCriterion("electric <>", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricGreaterThan(Double value) {
            addCriterion("electric >", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricGreaterThanOrEqualTo(Double value) {
            addCriterion("electric >=", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricLessThan(Double value) {
            addCriterion("electric <", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricLessThanOrEqualTo(Double value) {
            addCriterion("electric <=", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricIn(List<Double> values) {
            addCriterion("electric in", values, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotIn(List<Double> values) {
            addCriterion("electric not in", values, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricBetween(Double value1, Double value2) {
            addCriterion("electric between", value1, value2, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotBetween(Double value1, Double value2) {
            addCriterion("electric not between", value1, value2, "electric");
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

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameIsNull() {
            addCriterion("hBulidingName is null");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameIsNotNull() {
            addCriterion("hBulidingName is not null");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameEqualTo(String value) {
            addCriterion("hBulidingName =", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameNotEqualTo(String value) {
            addCriterion("hBulidingName <>", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameGreaterThan(String value) {
            addCriterion("hBulidingName >", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameGreaterThanOrEqualTo(String value) {
            addCriterion("hBulidingName >=", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameLessThan(String value) {
            addCriterion("hBulidingName <", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameLessThanOrEqualTo(String value) {
            addCriterion("hBulidingName <=", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameLike(String value) {
            addCriterion("hBulidingName like", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameNotLike(String value) {
            addCriterion("hBulidingName not like", value, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameIn(List<String> values) {
            addCriterion("hBulidingName in", values, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameNotIn(List<String> values) {
            addCriterion("hBulidingName not in", values, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameBetween(String value1, String value2) {
            addCriterion("hBulidingName between", value1, value2, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameNotBetween(String value1, String value2) {
            addCriterion("hBulidingName not between", value1, value2, "hbulidingname");
            return (Criteria) this;
        }

        public Criteria andOlnameLikeInsensitive(String value) {
            addCriterion("upper(olName) like", value.toUpperCase(), "olname");
            return (Criteria) this;
        }

        public Criteria andEnumberLikeInsensitive(String value) {
            addCriterion("upper(enumber) like", value.toUpperCase(), "enumber");
            return (Criteria) this;
        }

        public Criteria andHbulidingnameLikeInsensitive(String value) {
            addCriterion("upper(hBulidingName) like", value.toUpperCase(), "hbulidingname");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * house_electric_vo 2019-05-09
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