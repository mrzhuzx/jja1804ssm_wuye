package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class GardenerExample {
    /**
     * gardener
     */
    protected String orderByClause;

    /**
     * gardener
     */
    protected boolean distinct;

    /**
     * gardener
     */
    protected List<Criteria> oredCriteria;

    public GardenerExample() {
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
     * gardener 2019-04-30
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

        public Criteria andGaridIsNull() {
            addCriterion("garid is null");
            return (Criteria) this;
        }

        public Criteria andGaridIsNotNull() {
            addCriterion("garid is not null");
            return (Criteria) this;
        }

        public Criteria andGaridEqualTo(Integer value) {
            addCriterion("garid =", value, "garid");
            return (Criteria) this;
        }

        public Criteria andGaridNotEqualTo(Integer value) {
            addCriterion("garid <>", value, "garid");
            return (Criteria) this;
        }

        public Criteria andGaridGreaterThan(Integer value) {
            addCriterion("garid >", value, "garid");
            return (Criteria) this;
        }

        public Criteria andGaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("garid >=", value, "garid");
            return (Criteria) this;
        }

        public Criteria andGaridLessThan(Integer value) {
            addCriterion("garid <", value, "garid");
            return (Criteria) this;
        }

        public Criteria andGaridLessThanOrEqualTo(Integer value) {
            addCriterion("garid <=", value, "garid");
            return (Criteria) this;
        }

        public Criteria andGaridIn(List<Integer> values) {
            addCriterion("garid in", values, "garid");
            return (Criteria) this;
        }

        public Criteria andGaridNotIn(List<Integer> values) {
            addCriterion("garid not in", values, "garid");
            return (Criteria) this;
        }

        public Criteria andGaridBetween(Integer value1, Integer value2) {
            addCriterion("garid between", value1, value2, "garid");
            return (Criteria) this;
        }

        public Criteria andGaridNotBetween(Integer value1, Integer value2) {
            addCriterion("garid not between", value1, value2, "garid");
            return (Criteria) this;
        }

        public Criteria andGarnameIsNull() {
            addCriterion("garname is null");
            return (Criteria) this;
        }

        public Criteria andGarnameIsNotNull() {
            addCriterion("garname is not null");
            return (Criteria) this;
        }

        public Criteria andGarnameEqualTo(String value) {
            addCriterion("garname =", value, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameNotEqualTo(String value) {
            addCriterion("garname <>", value, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameGreaterThan(String value) {
            addCriterion("garname >", value, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameGreaterThanOrEqualTo(String value) {
            addCriterion("garname >=", value, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameLessThan(String value) {
            addCriterion("garname <", value, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameLessThanOrEqualTo(String value) {
            addCriterion("garname <=", value, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameLike(String value) {
            addCriterion("garname like", value, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameNotLike(String value) {
            addCriterion("garname not like", value, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameIn(List<String> values) {
            addCriterion("garname in", values, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameNotIn(List<String> values) {
            addCriterion("garname not in", values, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameBetween(String value1, String value2) {
            addCriterion("garname between", value1, value2, "garname");
            return (Criteria) this;
        }

        public Criteria andGarnameNotBetween(String value1, String value2) {
            addCriterion("garname not between", value1, value2, "garname");
            return (Criteria) this;
        }

        public Criteria andGarphoneIsNull() {
            addCriterion("garphone is null");
            return (Criteria) this;
        }

        public Criteria andGarphoneIsNotNull() {
            addCriterion("garphone is not null");
            return (Criteria) this;
        }

        public Criteria andGarphoneEqualTo(String value) {
            addCriterion("garphone =", value, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneNotEqualTo(String value) {
            addCriterion("garphone <>", value, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneGreaterThan(String value) {
            addCriterion("garphone >", value, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneGreaterThanOrEqualTo(String value) {
            addCriterion("garphone >=", value, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneLessThan(String value) {
            addCriterion("garphone <", value, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneLessThanOrEqualTo(String value) {
            addCriterion("garphone <=", value, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneLike(String value) {
            addCriterion("garphone like", value, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneNotLike(String value) {
            addCriterion("garphone not like", value, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneIn(List<String> values) {
            addCriterion("garphone in", values, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneNotIn(List<String> values) {
            addCriterion("garphone not in", values, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneBetween(String value1, String value2) {
            addCriterion("garphone between", value1, value2, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarphoneNotBetween(String value1, String value2) {
            addCriterion("garphone not between", value1, value2, "garphone");
            return (Criteria) this;
        }

        public Criteria andGarflagIsNull() {
            addCriterion("garflag is null");
            return (Criteria) this;
        }

        public Criteria andGarflagIsNotNull() {
            addCriterion("garflag is not null");
            return (Criteria) this;
        }

        public Criteria andGarflagEqualTo(String value) {
            addCriterion("garflag =", value, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagNotEqualTo(String value) {
            addCriterion("garflag <>", value, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagGreaterThan(String value) {
            addCriterion("garflag >", value, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagGreaterThanOrEqualTo(String value) {
            addCriterion("garflag >=", value, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagLessThan(String value) {
            addCriterion("garflag <", value, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagLessThanOrEqualTo(String value) {
            addCriterion("garflag <=", value, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagLike(String value) {
            addCriterion("garflag like", value, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagNotLike(String value) {
            addCriterion("garflag not like", value, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagIn(List<String> values) {
            addCriterion("garflag in", values, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagNotIn(List<String> values) {
            addCriterion("garflag not in", values, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagBetween(String value1, String value2) {
            addCriterion("garflag between", value1, value2, "garflag");
            return (Criteria) this;
        }

        public Criteria andGarflagNotBetween(String value1, String value2) {
            addCriterion("garflag not between", value1, value2, "garflag");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andGarnameLikeInsensitive(String value) {
            addCriterion("upper(garname) like", value.toUpperCase(), "garname");
            return (Criteria) this;
        }

        public Criteria andGarphoneLikeInsensitive(String value) {
            addCriterion("upper(garphone) like", value.toUpperCase(), "garphone");
            return (Criteria) this;
        }

        public Criteria andGarflagLikeInsensitive(String value) {
            addCriterion("upper(garflag) like", value.toUpperCase(), "garflag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * gardener 2019-04-30
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