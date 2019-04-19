package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class ProgramExample {
    /**
     * program
     */
    protected String orderByClause;

    /**
     * program
     */
    protected boolean distinct;

    /**
     * program
     */
    protected List<Criteria> oredCriteria;

    public ProgramExample() {
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
     * program 2019-04-17
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPpictureIsNull() {
            addCriterion("ppicture is null");
            return (Criteria) this;
        }

        public Criteria andPpictureIsNotNull() {
            addCriterion("ppicture is not null");
            return (Criteria) this;
        }

        public Criteria andPpictureEqualTo(String value) {
            addCriterion("ppicture =", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureNotEqualTo(String value) {
            addCriterion("ppicture <>", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureGreaterThan(String value) {
            addCriterion("ppicture >", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureGreaterThanOrEqualTo(String value) {
            addCriterion("ppicture >=", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureLessThan(String value) {
            addCriterion("ppicture <", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureLessThanOrEqualTo(String value) {
            addCriterion("ppicture <=", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureLike(String value) {
            addCriterion("ppicture like", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureNotLike(String value) {
            addCriterion("ppicture not like", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureIn(List<String> values) {
            addCriterion("ppicture in", values, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureNotIn(List<String> values) {
            addCriterion("ppicture not in", values, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureBetween(String value1, String value2) {
            addCriterion("ppicture between", value1, value2, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureNotBetween(String value1, String value2) {
            addCriterion("ppicture not between", value1, value2, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPintroduceIsNull() {
            addCriterion("pintroduce is null");
            return (Criteria) this;
        }

        public Criteria andPintroduceIsNotNull() {
            addCriterion("pintroduce is not null");
            return (Criteria) this;
        }

        public Criteria andPintroduceEqualTo(String value) {
            addCriterion("pintroduce =", value, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceNotEqualTo(String value) {
            addCriterion("pintroduce <>", value, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceGreaterThan(String value) {
            addCriterion("pintroduce >", value, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("pintroduce >=", value, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceLessThan(String value) {
            addCriterion("pintroduce <", value, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceLessThanOrEqualTo(String value) {
            addCriterion("pintroduce <=", value, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceLike(String value) {
            addCriterion("pintroduce like", value, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceNotLike(String value) {
            addCriterion("pintroduce not like", value, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceIn(List<String> values) {
            addCriterion("pintroduce in", values, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceNotIn(List<String> values) {
            addCriterion("pintroduce not in", values, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceBetween(String value1, String value2) {
            addCriterion("pintroduce between", value1, value2, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPintroduceNotBetween(String value1, String value2) {
            addCriterion("pintroduce not between", value1, value2, "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPadressIsNull() {
            addCriterion("padress is null");
            return (Criteria) this;
        }

        public Criteria andPadressIsNotNull() {
            addCriterion("padress is not null");
            return (Criteria) this;
        }

        public Criteria andPadressEqualTo(String value) {
            addCriterion("padress =", value, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressNotEqualTo(String value) {
            addCriterion("padress <>", value, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressGreaterThan(String value) {
            addCriterion("padress >", value, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressGreaterThanOrEqualTo(String value) {
            addCriterion("padress >=", value, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressLessThan(String value) {
            addCriterion("padress <", value, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressLessThanOrEqualTo(String value) {
            addCriterion("padress <=", value, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressLike(String value) {
            addCriterion("padress like", value, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressNotLike(String value) {
            addCriterion("padress not like", value, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressIn(List<String> values) {
            addCriterion("padress in", values, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressNotIn(List<String> values) {
            addCriterion("padress not in", values, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressBetween(String value1, String value2) {
            addCriterion("padress between", value1, value2, "padress");
            return (Criteria) this;
        }

        public Criteria andPadressNotBetween(String value1, String value2) {
            addCriterion("padress not between", value1, value2, "padress");
            return (Criteria) this;
        }

        public Criteria andPtidIsNull() {
            addCriterion("ptid is null");
            return (Criteria) this;
        }

        public Criteria andPtidIsNotNull() {
            addCriterion("ptid is not null");
            return (Criteria) this;
        }

        public Criteria andPtidEqualTo(Integer value) {
            addCriterion("ptid =", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidNotEqualTo(Integer value) {
            addCriterion("ptid <>", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidGreaterThan(Integer value) {
            addCriterion("ptid >", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptid >=", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidLessThan(Integer value) {
            addCriterion("ptid <", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidLessThanOrEqualTo(Integer value) {
            addCriterion("ptid <=", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidIn(List<Integer> values) {
            addCriterion("ptid in", values, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidNotIn(List<Integer> values) {
            addCriterion("ptid not in", values, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidBetween(Integer value1, Integer value2) {
            addCriterion("ptid between", value1, value2, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ptid not between", value1, value2, "ptid");
            return (Criteria) this;
        }

        public Criteria andPnameLikeInsensitive(String value) {
            addCriterion("upper(pname) like", value.toUpperCase(), "pname");
            return (Criteria) this;
        }

        public Criteria andPpictureLikeInsensitive(String value) {
            addCriterion("upper(ppicture) like", value.toUpperCase(), "ppicture");
            return (Criteria) this;
        }

        public Criteria andPintroduceLikeInsensitive(String value) {
            addCriterion("upper(pintroduce) like", value.toUpperCase(), "pintroduce");
            return (Criteria) this;
        }

        public Criteria andPadressLikeInsensitive(String value) {
            addCriterion("upper(padress) like", value.toUpperCase(), "padress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * program 2019-04-17
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