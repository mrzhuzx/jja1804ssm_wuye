package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class TbMatter_sortExample {
    /**
     * tb_matter_sort
     */
    protected String orderByClause;

    /**
     * tb_matter_sort
     */
    protected boolean distinct;

    /**
     * tb_matter_sort
     */
    protected List<Criteria> oredCriteria;

    public TbMatter_sortExample() {
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
     * tb_matter_sort 2019-04-23
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

        public Criteria andMattersortidIsNull() {
            addCriterion("matterSortId is null");
            return (Criteria) this;
        }

        public Criteria andMattersortidIsNotNull() {
            addCriterion("matterSortId is not null");
            return (Criteria) this;
        }

        public Criteria andMattersortidEqualTo(Integer value) {
            addCriterion("matterSortId =", value, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortidNotEqualTo(Integer value) {
            addCriterion("matterSortId <>", value, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortidGreaterThan(Integer value) {
            addCriterion("matterSortId >", value, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("matterSortId >=", value, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortidLessThan(Integer value) {
            addCriterion("matterSortId <", value, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortidLessThanOrEqualTo(Integer value) {
            addCriterion("matterSortId <=", value, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortidIn(List<Integer> values) {
            addCriterion("matterSortId in", values, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortidNotIn(List<Integer> values) {
            addCriterion("matterSortId not in", values, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortidBetween(Integer value1, Integer value2) {
            addCriterion("matterSortId between", value1, value2, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortidNotBetween(Integer value1, Integer value2) {
            addCriterion("matterSortId not between", value1, value2, "mattersortid");
            return (Criteria) this;
        }

        public Criteria andMattersortIsNull() {
            addCriterion("matterSort is null");
            return (Criteria) this;
        }

        public Criteria andMattersortIsNotNull() {
            addCriterion("matterSort is not null");
            return (Criteria) this;
        }

        public Criteria andMattersortEqualTo(String value) {
            addCriterion("matterSort =", value, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortNotEqualTo(String value) {
            addCriterion("matterSort <>", value, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortGreaterThan(String value) {
            addCriterion("matterSort >", value, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortGreaterThanOrEqualTo(String value) {
            addCriterion("matterSort >=", value, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortLessThan(String value) {
            addCriterion("matterSort <", value, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortLessThanOrEqualTo(String value) {
            addCriterion("matterSort <=", value, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortLike(String value) {
            addCriterion("matterSort like", value, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortNotLike(String value) {
            addCriterion("matterSort not like", value, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortIn(List<String> values) {
            addCriterion("matterSort in", values, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortNotIn(List<String> values) {
            addCriterion("matterSort not in", values, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortBetween(String value1, String value2) {
            addCriterion("matterSort between", value1, value2, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortNotBetween(String value1, String value2) {
            addCriterion("matterSort not between", value1, value2, "mattersort");
            return (Criteria) this;
        }

        public Criteria andMattersortLikeInsensitive(String value) {
            addCriterion("upper(matterSort) like", value.toUpperCase(), "mattersort");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_matter_sort 2019-04-23
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