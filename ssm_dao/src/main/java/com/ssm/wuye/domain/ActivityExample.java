package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActivityExample {
    /**
     * activity
     */
    protected String orderByClause;

    /**
     * activity
     */
    protected boolean distinct;

    /**
     * activity
     */
    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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
     * activity 2019-04-30
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

        public Criteria andActivitynameIsNull() {
            addCriterion("activityname is null");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNotNull() {
            addCriterion("activityname is not null");
            return (Criteria) this;
        }

        public Criteria andActivitynameEqualTo(String value) {
            addCriterion("activityname =", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotEqualTo(String value) {
            addCriterion("activityname <>", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThan(String value) {
            addCriterion("activityname >", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThanOrEqualTo(String value) {
            addCriterion("activityname >=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThan(String value) {
            addCriterion("activityname <", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThanOrEqualTo(String value) {
            addCriterion("activityname <=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLike(String value) {
            addCriterion("activityname like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotLike(String value) {
            addCriterion("activityname not like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameIn(List<String> values) {
            addCriterion("activityname in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotIn(List<String> values) {
            addCriterion("activityname not in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameBetween(String value1, String value2) {
            addCriterion("activityname between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotBetween(String value1, String value2) {
            addCriterion("activityname not between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitydescIsNull() {
            addCriterion("activitydesc is null");
            return (Criteria) this;
        }

        public Criteria andActivitydescIsNotNull() {
            addCriterion("activitydesc is not null");
            return (Criteria) this;
        }

        public Criteria andActivitydescEqualTo(String value) {
            addCriterion("activitydesc =", value, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescNotEqualTo(String value) {
            addCriterion("activitydesc <>", value, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescGreaterThan(String value) {
            addCriterion("activitydesc >", value, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescGreaterThanOrEqualTo(String value) {
            addCriterion("activitydesc >=", value, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescLessThan(String value) {
            addCriterion("activitydesc <", value, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescLessThanOrEqualTo(String value) {
            addCriterion("activitydesc <=", value, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescLike(String value) {
            addCriterion("activitydesc like", value, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescNotLike(String value) {
            addCriterion("activitydesc not like", value, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescIn(List<String> values) {
            addCriterion("activitydesc in", values, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescNotIn(List<String> values) {
            addCriterion("activitydesc not in", values, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescBetween(String value1, String value2) {
            addCriterion("activitydesc between", value1, value2, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitydescNotBetween(String value1, String value2) {
            addCriterion("activitydesc not between", value1, value2, "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitycontIsNull() {
            addCriterion("activitycont is null");
            return (Criteria) this;
        }

        public Criteria andActivitycontIsNotNull() {
            addCriterion("activitycont is not null");
            return (Criteria) this;
        }

        public Criteria andActivitycontEqualTo(String value) {
            addCriterion("activitycont =", value, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontNotEqualTo(String value) {
            addCriterion("activitycont <>", value, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontGreaterThan(String value) {
            addCriterion("activitycont >", value, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontGreaterThanOrEqualTo(String value) {
            addCriterion("activitycont >=", value, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontLessThan(String value) {
            addCriterion("activitycont <", value, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontLessThanOrEqualTo(String value) {
            addCriterion("activitycont <=", value, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontLike(String value) {
            addCriterion("activitycont like", value, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontNotLike(String value) {
            addCriterion("activitycont not like", value, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontIn(List<String> values) {
            addCriterion("activitycont in", values, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontNotIn(List<String> values) {
            addCriterion("activitycont not in", values, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontBetween(String value1, String value2) {
            addCriterion("activitycont between", value1, value2, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitycontNotBetween(String value1, String value2) {
            addCriterion("activitycont not between", value1, value2, "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivitytimeIsNull() {
            addCriterion("activitytime is null");
            return (Criteria) this;
        }

        public Criteria andActivitytimeIsNotNull() {
            addCriterion("activitytime is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytimeEqualTo(Date value) {
            addCriterionForJDBCDate("activitytime =", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("activitytime <>", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("activitytime >", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activitytime >=", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeLessThan(Date value) {
            addCriterionForJDBCDate("activitytime <", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("activitytime <=", value, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeIn(List<Date> values) {
            addCriterionForJDBCDate("activitytime in", values, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("activitytime not in", values, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activitytime between", value1, value2, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivitytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("activitytime not between", value1, value2, "activitytime");
            return (Criteria) this;
        }

        public Criteria andActivityworkerIsNull() {
            addCriterion("activityworker is null");
            return (Criteria) this;
        }

        public Criteria andActivityworkerIsNotNull() {
            addCriterion("activityworker is not null");
            return (Criteria) this;
        }

        public Criteria andActivityworkerEqualTo(String value) {
            addCriterion("activityworker =", value, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerNotEqualTo(String value) {
            addCriterion("activityworker <>", value, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerGreaterThan(String value) {
            addCriterion("activityworker >", value, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerGreaterThanOrEqualTo(String value) {
            addCriterion("activityworker >=", value, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerLessThan(String value) {
            addCriterion("activityworker <", value, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerLessThanOrEqualTo(String value) {
            addCriterion("activityworker <=", value, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerLike(String value) {
            addCriterion("activityworker like", value, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerNotLike(String value) {
            addCriterion("activityworker not like", value, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerIn(List<String> values) {
            addCriterion("activityworker in", values, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerNotIn(List<String> values) {
            addCriterion("activityworker not in", values, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerBetween(String value1, String value2) {
            addCriterion("activityworker between", value1, value2, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivityworkerNotBetween(String value1, String value2) {
            addCriterion("activityworker not between", value1, value2, "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivitywardIsNull() {
            addCriterion("activityward is null");
            return (Criteria) this;
        }

        public Criteria andActivitywardIsNotNull() {
            addCriterion("activityward is not null");
            return (Criteria) this;
        }

        public Criteria andActivitywardEqualTo(String value) {
            addCriterion("activityward =", value, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardNotEqualTo(String value) {
            addCriterion("activityward <>", value, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardGreaterThan(String value) {
            addCriterion("activityward >", value, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardGreaterThanOrEqualTo(String value) {
            addCriterion("activityward >=", value, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardLessThan(String value) {
            addCriterion("activityward <", value, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardLessThanOrEqualTo(String value) {
            addCriterion("activityward <=", value, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardLike(String value) {
            addCriterion("activityward like", value, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardNotLike(String value) {
            addCriterion("activityward not like", value, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardIn(List<String> values) {
            addCriterion("activityward in", values, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardNotIn(List<String> values) {
            addCriterion("activityward not in", values, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardBetween(String value1, String value2) {
            addCriterion("activityward between", value1, value2, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitywardNotBetween(String value1, String value2) {
            addCriterion("activityward not between", value1, value2, "activityward");
            return (Criteria) this;
        }

        public Criteria andActivitynameLikeInsensitive(String value) {
            addCriterion("upper(activityname) like", value.toUpperCase(), "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitydescLikeInsensitive(String value) {
            addCriterion("upper(activitydesc) like", value.toUpperCase(), "activitydesc");
            return (Criteria) this;
        }

        public Criteria andActivitycontLikeInsensitive(String value) {
            addCriterion("upper(activitycont) like", value.toUpperCase(), "activitycont");
            return (Criteria) this;
        }

        public Criteria andActivityworkerLikeInsensitive(String value) {
            addCriterion("upper(activityworker) like", value.toUpperCase(), "activityworker");
            return (Criteria) this;
        }

        public Criteria andActivitywardLikeInsensitive(String value) {
            addCriterion("upper(activityward) like", value.toUpperCase(), "activityward");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * activity 2019-04-30
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