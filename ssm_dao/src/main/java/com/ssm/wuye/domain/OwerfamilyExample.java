package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class OwerfamilyExample {
    /**
     * owerfamily
     */
    protected String orderByClause;

    /**
     * owerfamily
     */
    protected boolean distinct;

    /**
     * owerfamily
     */
    protected List<Criteria> oredCriteria;

    public OwerfamilyExample() {
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
     * owerfamily 2019-04-17
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

        public Criteria andOfidIsNull() {
            addCriterion("ofId is null");
            return (Criteria) this;
        }

        public Criteria andOfidIsNotNull() {
            addCriterion("ofId is not null");
            return (Criteria) this;
        }

        public Criteria andOfidEqualTo(Integer value) {
            addCriterion("ofId =", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotEqualTo(Integer value) {
            addCriterion("ofId <>", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidGreaterThan(Integer value) {
            addCriterion("ofId >", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ofId >=", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidLessThan(Integer value) {
            addCriterion("ofId <", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidLessThanOrEqualTo(Integer value) {
            addCriterion("ofId <=", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidIn(List<Integer> values) {
            addCriterion("ofId in", values, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotIn(List<Integer> values) {
            addCriterion("ofId not in", values, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidBetween(Integer value1, Integer value2) {
            addCriterion("ofId between", value1, value2, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotBetween(Integer value1, Integer value2) {
            addCriterion("ofId not between", value1, value2, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfnameIsNull() {
            addCriterion("ofName is null");
            return (Criteria) this;
        }

        public Criteria andOfnameIsNotNull() {
            addCriterion("ofName is not null");
            return (Criteria) this;
        }

        public Criteria andOfnameEqualTo(String value) {
            addCriterion("ofName =", value, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameNotEqualTo(String value) {
            addCriterion("ofName <>", value, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameGreaterThan(String value) {
            addCriterion("ofName >", value, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameGreaterThanOrEqualTo(String value) {
            addCriterion("ofName >=", value, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameLessThan(String value) {
            addCriterion("ofName <", value, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameLessThanOrEqualTo(String value) {
            addCriterion("ofName <=", value, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameLike(String value) {
            addCriterion("ofName like", value, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameNotLike(String value) {
            addCriterion("ofName not like", value, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameIn(List<String> values) {
            addCriterion("ofName in", values, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameNotIn(List<String> values) {
            addCriterion("ofName not in", values, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameBetween(String value1, String value2) {
            addCriterion("ofName between", value1, value2, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfnameNotBetween(String value1, String value2) {
            addCriterion("ofName not between", value1, value2, "ofname");
            return (Criteria) this;
        }

        public Criteria andOfsexIsNull() {
            addCriterion("ofSex is null");
            return (Criteria) this;
        }

        public Criteria andOfsexIsNotNull() {
            addCriterion("ofSex is not null");
            return (Criteria) this;
        }

        public Criteria andOfsexEqualTo(String value) {
            addCriterion("ofSex =", value, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexNotEqualTo(String value) {
            addCriterion("ofSex <>", value, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexGreaterThan(String value) {
            addCriterion("ofSex >", value, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexGreaterThanOrEqualTo(String value) {
            addCriterion("ofSex >=", value, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexLessThan(String value) {
            addCriterion("ofSex <", value, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexLessThanOrEqualTo(String value) {
            addCriterion("ofSex <=", value, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexLike(String value) {
            addCriterion("ofSex like", value, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexNotLike(String value) {
            addCriterion("ofSex not like", value, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexIn(List<String> values) {
            addCriterion("ofSex in", values, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexNotIn(List<String> values) {
            addCriterion("ofSex not in", values, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexBetween(String value1, String value2) {
            addCriterion("ofSex between", value1, value2, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfsexNotBetween(String value1, String value2) {
            addCriterion("ofSex not between", value1, value2, "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceIsNull() {
            addCriterion("ofHomeplace is null");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceIsNotNull() {
            addCriterion("ofHomeplace is not null");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceEqualTo(String value) {
            addCriterion("ofHomeplace =", value, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceNotEqualTo(String value) {
            addCriterion("ofHomeplace <>", value, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceGreaterThan(String value) {
            addCriterion("ofHomeplace >", value, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("ofHomeplace >=", value, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceLessThan(String value) {
            addCriterion("ofHomeplace <", value, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceLessThanOrEqualTo(String value) {
            addCriterion("ofHomeplace <=", value, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceLike(String value) {
            addCriterion("ofHomeplace like", value, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceNotLike(String value) {
            addCriterion("ofHomeplace not like", value, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceIn(List<String> values) {
            addCriterion("ofHomeplace in", values, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceNotIn(List<String> values) {
            addCriterion("ofHomeplace not in", values, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceBetween(String value1, String value2) {
            addCriterion("ofHomeplace between", value1, value2, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceNotBetween(String value1, String value2) {
            addCriterion("ofHomeplace not between", value1, value2, "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOftelIsNull() {
            addCriterion("ofTel is null");
            return (Criteria) this;
        }

        public Criteria andOftelIsNotNull() {
            addCriterion("ofTel is not null");
            return (Criteria) this;
        }

        public Criteria andOftelEqualTo(String value) {
            addCriterion("ofTel =", value, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelNotEqualTo(String value) {
            addCriterion("ofTel <>", value, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelGreaterThan(String value) {
            addCriterion("ofTel >", value, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelGreaterThanOrEqualTo(String value) {
            addCriterion("ofTel >=", value, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelLessThan(String value) {
            addCriterion("ofTel <", value, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelLessThanOrEqualTo(String value) {
            addCriterion("ofTel <=", value, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelLike(String value) {
            addCriterion("ofTel like", value, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelNotLike(String value) {
            addCriterion("ofTel not like", value, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelIn(List<String> values) {
            addCriterion("ofTel in", values, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelNotIn(List<String> values) {
            addCriterion("ofTel not in", values, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelBetween(String value1, String value2) {
            addCriterion("ofTel between", value1, value2, "oftel");
            return (Criteria) this;
        }

        public Criteria andOftelNotBetween(String value1, String value2) {
            addCriterion("ofTel not between", value1, value2, "oftel");
            return (Criteria) this;
        }

        public Criteria andOfnexusIsNull() {
            addCriterion("ofNexus is null");
            return (Criteria) this;
        }

        public Criteria andOfnexusIsNotNull() {
            addCriterion("ofNexus is not null");
            return (Criteria) this;
        }

        public Criteria andOfnexusEqualTo(String value) {
            addCriterion("ofNexus =", value, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusNotEqualTo(String value) {
            addCriterion("ofNexus <>", value, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusGreaterThan(String value) {
            addCriterion("ofNexus >", value, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusGreaterThanOrEqualTo(String value) {
            addCriterion("ofNexus >=", value, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusLessThan(String value) {
            addCriterion("ofNexus <", value, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusLessThanOrEqualTo(String value) {
            addCriterion("ofNexus <=", value, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusLike(String value) {
            addCriterion("ofNexus like", value, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusNotLike(String value) {
            addCriterion("ofNexus not like", value, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusIn(List<String> values) {
            addCriterion("ofNexus in", values, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusNotIn(List<String> values) {
            addCriterion("ofNexus not in", values, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusBetween(String value1, String value2) {
            addCriterion("ofNexus between", value1, value2, "ofnexus");
            return (Criteria) this;
        }

        public Criteria andOfnexusNotBetween(String value1, String value2) {
            addCriterion("ofNexus not between", value1, value2, "ofnexus");
            return (Criteria) this;
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

        public Criteria andOfnameLikeInsensitive(String value) {
            addCriterion("upper(ofName) like", value.toUpperCase(), "ofname");
            return (Criteria) this;
        }

        public Criteria andOfsexLikeInsensitive(String value) {
            addCriterion("upper(ofSex) like", value.toUpperCase(), "ofsex");
            return (Criteria) this;
        }

        public Criteria andOfhomeplaceLikeInsensitive(String value) {
            addCriterion("upper(ofHomeplace) like", value.toUpperCase(), "ofhomeplace");
            return (Criteria) this;
        }

        public Criteria andOftelLikeInsensitive(String value) {
            addCriterion("upper(ofTel) like", value.toUpperCase(), "oftel");
            return (Criteria) this;
        }

        public Criteria andOfnexusLikeInsensitive(String value) {
            addCriterion("upper(ofNexus) like", value.toUpperCase(), "ofnexus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * owerfamily 2019-04-17
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