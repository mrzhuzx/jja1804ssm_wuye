package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class CleaningExample {
    /**
     * cleaning
     */
    protected String orderByClause;

    /**
     * cleaning
     */
    protected boolean distinct;

    /**
     * cleaning
     */
    protected List<Criteria> oredCriteria;

    public CleaningExample() {
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
     * cleaning 2019-04-30
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

        public Criteria andCleidIsNull() {
            addCriterion("cleid is null");
            return (Criteria) this;
        }

        public Criteria andCleidIsNotNull() {
            addCriterion("cleid is not null");
            return (Criteria) this;
        }

        public Criteria andCleidEqualTo(Integer value) {
            addCriterion("cleid =", value, "cleid");
            return (Criteria) this;
        }

        public Criteria andCleidNotEqualTo(Integer value) {
            addCriterion("cleid <>", value, "cleid");
            return (Criteria) this;
        }

        public Criteria andCleidGreaterThan(Integer value) {
            addCriterion("cleid >", value, "cleid");
            return (Criteria) this;
        }

        public Criteria andCleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cleid >=", value, "cleid");
            return (Criteria) this;
        }

        public Criteria andCleidLessThan(Integer value) {
            addCriterion("cleid <", value, "cleid");
            return (Criteria) this;
        }

        public Criteria andCleidLessThanOrEqualTo(Integer value) {
            addCriterion("cleid <=", value, "cleid");
            return (Criteria) this;
        }

        public Criteria andCleidIn(List<Integer> values) {
            addCriterion("cleid in", values, "cleid");
            return (Criteria) this;
        }

        public Criteria andCleidNotIn(List<Integer> values) {
            addCriterion("cleid not in", values, "cleid");
            return (Criteria) this;
        }

        public Criteria andCleidBetween(Integer value1, Integer value2) {
            addCriterion("cleid between", value1, value2, "cleid");
            return (Criteria) this;
        }

        public Criteria andCleidNotBetween(Integer value1, Integer value2) {
            addCriterion("cleid not between", value1, value2, "cleid");
            return (Criteria) this;
        }

        public Criteria andClenameIsNull() {
            addCriterion("clename is null");
            return (Criteria) this;
        }

        public Criteria andClenameIsNotNull() {
            addCriterion("clename is not null");
            return (Criteria) this;
        }

        public Criteria andClenameEqualTo(String value) {
            addCriterion("clename =", value, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameNotEqualTo(String value) {
            addCriterion("clename <>", value, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameGreaterThan(String value) {
            addCriterion("clename >", value, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameGreaterThanOrEqualTo(String value) {
            addCriterion("clename >=", value, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameLessThan(String value) {
            addCriterion("clename <", value, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameLessThanOrEqualTo(String value) {
            addCriterion("clename <=", value, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameLike(String value) {
            addCriterion("clename like", value, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameNotLike(String value) {
            addCriterion("clename not like", value, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameIn(List<String> values) {
            addCriterion("clename in", values, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameNotIn(List<String> values) {
            addCriterion("clename not in", values, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameBetween(String value1, String value2) {
            addCriterion("clename between", value1, value2, "clename");
            return (Criteria) this;
        }

        public Criteria andClenameNotBetween(String value1, String value2) {
            addCriterion("clename not between", value1, value2, "clename");
            return (Criteria) this;
        }

        public Criteria andClephoneIsNull() {
            addCriterion("clephone is null");
            return (Criteria) this;
        }

        public Criteria andClephoneIsNotNull() {
            addCriterion("clephone is not null");
            return (Criteria) this;
        }

        public Criteria andClephoneEqualTo(String value) {
            addCriterion("clephone =", value, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneNotEqualTo(String value) {
            addCriterion("clephone <>", value, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneGreaterThan(String value) {
            addCriterion("clephone >", value, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneGreaterThanOrEqualTo(String value) {
            addCriterion("clephone >=", value, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneLessThan(String value) {
            addCriterion("clephone <", value, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneLessThanOrEqualTo(String value) {
            addCriterion("clephone <=", value, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneLike(String value) {
            addCriterion("clephone like", value, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneNotLike(String value) {
            addCriterion("clephone not like", value, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneIn(List<String> values) {
            addCriterion("clephone in", values, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneNotIn(List<String> values) {
            addCriterion("clephone not in", values, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneBetween(String value1, String value2) {
            addCriterion("clephone between", value1, value2, "clephone");
            return (Criteria) this;
        }

        public Criteria andClephoneNotBetween(String value1, String value2) {
            addCriterion("clephone not between", value1, value2, "clephone");
            return (Criteria) this;
        }

        public Criteria andCleflagIsNull() {
            addCriterion("cleflag is null");
            return (Criteria) this;
        }

        public Criteria andCleflagIsNotNull() {
            addCriterion("cleflag is not null");
            return (Criteria) this;
        }

        public Criteria andCleflagEqualTo(String value) {
            addCriterion("cleflag =", value, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagNotEqualTo(String value) {
            addCriterion("cleflag <>", value, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagGreaterThan(String value) {
            addCriterion("cleflag >", value, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagGreaterThanOrEqualTo(String value) {
            addCriterion("cleflag >=", value, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagLessThan(String value) {
            addCriterion("cleflag <", value, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagLessThanOrEqualTo(String value) {
            addCriterion("cleflag <=", value, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagLike(String value) {
            addCriterion("cleflag like", value, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagNotLike(String value) {
            addCriterion("cleflag not like", value, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagIn(List<String> values) {
            addCriterion("cleflag in", values, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagNotIn(List<String> values) {
            addCriterion("cleflag not in", values, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagBetween(String value1, String value2) {
            addCriterion("cleflag between", value1, value2, "cleflag");
            return (Criteria) this;
        }

        public Criteria andCleflagNotBetween(String value1, String value2) {
            addCriterion("cleflag not between", value1, value2, "cleflag");
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

        public Criteria andClenameLikeInsensitive(String value) {
            addCriterion("upper(clename) like", value.toUpperCase(), "clename");
            return (Criteria) this;
        }

        public Criteria andClephoneLikeInsensitive(String value) {
            addCriterion("upper(clephone) like", value.toUpperCase(), "clephone");
            return (Criteria) this;
        }

        public Criteria andCleflagLikeInsensitive(String value) {
            addCriterion("upper(cleflag) like", value.toUpperCase(), "cleflag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * cleaning 2019-04-30
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