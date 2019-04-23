package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class ContractTypeExample {
    /**
     * contract_type
     */
    protected String orderByClause;

    /**
     * contract_type
     */
    protected boolean distinct;

    /**
     * contract_type
     */
    protected List<Criteria> oredCriteria;

    public ContractTypeExample() {
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
     * contract_type 2019-04-23
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

        public Criteria andContypeidIsNull() {
            addCriterion("contypeId is null");
            return (Criteria) this;
        }

        public Criteria andContypeidIsNotNull() {
            addCriterion("contypeId is not null");
            return (Criteria) this;
        }

        public Criteria andContypeidEqualTo(Integer value) {
            addCriterion("contypeId =", value, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContypeidNotEqualTo(Integer value) {
            addCriterion("contypeId <>", value, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContypeidGreaterThan(Integer value) {
            addCriterion("contypeId >", value, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("contypeId >=", value, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContypeidLessThan(Integer value) {
            addCriterion("contypeId <", value, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContypeidLessThanOrEqualTo(Integer value) {
            addCriterion("contypeId <=", value, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContypeidIn(List<Integer> values) {
            addCriterion("contypeId in", values, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContypeidNotIn(List<Integer> values) {
            addCriterion("contypeId not in", values, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContypeidBetween(Integer value1, Integer value2) {
            addCriterion("contypeId between", value1, value2, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("contypeId not between", value1, value2, "contypeid");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNull() {
            addCriterion("contractType is null");
            return (Criteria) this;
        }

        public Criteria andContracttypeIsNotNull() {
            addCriterion("contractType is not null");
            return (Criteria) this;
        }

        public Criteria andContracttypeEqualTo(String value) {
            addCriterion("contractType =", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotEqualTo(String value) {
            addCriterion("contractType <>", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThan(String value) {
            addCriterion("contractType >", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeGreaterThanOrEqualTo(String value) {
            addCriterion("contractType >=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThan(String value) {
            addCriterion("contractType <", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLessThanOrEqualTo(String value) {
            addCriterion("contractType <=", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLike(String value) {
            addCriterion("contractType like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotLike(String value) {
            addCriterion("contractType not like", value, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeIn(List<String> values) {
            addCriterion("contractType in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotIn(List<String> values) {
            addCriterion("contractType not in", values, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeBetween(String value1, String value2) {
            addCriterion("contractType between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeNotBetween(String value1, String value2) {
            addCriterion("contractType not between", value1, value2, "contracttype");
            return (Criteria) this;
        }

        public Criteria andContracttypeLikeInsensitive(String value) {
            addCriterion("upper(contractType) like", value.toUpperCase(), "contracttype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * contract_type 2019-04-23
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