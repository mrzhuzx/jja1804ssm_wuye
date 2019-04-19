package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class HousetypeExample {
    /**
     * housetype
     */
    protected String orderByClause;

    /**
     * housetype
     */
    protected boolean distinct;

    /**
     * housetype
     */
    protected List<Criteria> oredCriteria;

    public HousetypeExample() {
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
     * housetype 2019-04-17
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

        public Criteria andHtypeidIsNull() {
            addCriterion("hTypeId is null");
            return (Criteria) this;
        }

        public Criteria andHtypeidIsNotNull() {
            addCriterion("hTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andHtypeidEqualTo(Integer value) {
            addCriterion("hTypeId =", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidNotEqualTo(Integer value) {
            addCriterion("hTypeId <>", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidGreaterThan(Integer value) {
            addCriterion("hTypeId >", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hTypeId >=", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidLessThan(Integer value) {
            addCriterion("hTypeId <", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("hTypeId <=", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidIn(List<Integer> values) {
            addCriterion("hTypeId in", values, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidNotIn(List<Integer> values) {
            addCriterion("hTypeId not in", values, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidBetween(Integer value1, Integer value2) {
            addCriterion("hTypeId between", value1, value2, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("hTypeId not between", value1, value2, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypenameIsNull() {
            addCriterion("hTypeName is null");
            return (Criteria) this;
        }

        public Criteria andHtypenameIsNotNull() {
            addCriterion("hTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andHtypenameEqualTo(String value) {
            addCriterion("hTypeName =", value, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameNotEqualTo(String value) {
            addCriterion("hTypeName <>", value, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameGreaterThan(String value) {
            addCriterion("hTypeName >", value, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("hTypeName >=", value, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameLessThan(String value) {
            addCriterion("hTypeName <", value, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameLessThanOrEqualTo(String value) {
            addCriterion("hTypeName <=", value, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameLike(String value) {
            addCriterion("hTypeName like", value, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameNotLike(String value) {
            addCriterion("hTypeName not like", value, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameIn(List<String> values) {
            addCriterion("hTypeName in", values, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameNotIn(List<String> values) {
            addCriterion("hTypeName not in", values, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameBetween(String value1, String value2) {
            addCriterion("hTypeName between", value1, value2, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtypenameNotBetween(String value1, String value2) {
            addCriterion("hTypeName not between", value1, value2, "htypename");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightIsNull() {
            addCriterion("htPropertyRight is null");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightIsNotNull() {
            addCriterion("htPropertyRight is not null");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightEqualTo(String value) {
            addCriterion("htPropertyRight =", value, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightNotEqualTo(String value) {
            addCriterion("htPropertyRight <>", value, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightGreaterThan(String value) {
            addCriterion("htPropertyRight >", value, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightGreaterThanOrEqualTo(String value) {
            addCriterion("htPropertyRight >=", value, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightLessThan(String value) {
            addCriterion("htPropertyRight <", value, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightLessThanOrEqualTo(String value) {
            addCriterion("htPropertyRight <=", value, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightLike(String value) {
            addCriterion("htPropertyRight like", value, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightNotLike(String value) {
            addCriterion("htPropertyRight not like", value, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightIn(List<String> values) {
            addCriterion("htPropertyRight in", values, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightNotIn(List<String> values) {
            addCriterion("htPropertyRight not in", values, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightBetween(String value1, String value2) {
            addCriterion("htPropertyRight between", value1, value2, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightNotBetween(String value1, String value2) {
            addCriterion("htPropertyRight not between", value1, value2, "htpropertyright");
            return (Criteria) this;
        }

        public Criteria andHtypenameLikeInsensitive(String value) {
            addCriterion("upper(hTypeName) like", value.toUpperCase(), "htypename");
            return (Criteria) this;
        }

        public Criteria andHtpropertyrightLikeInsensitive(String value) {
            addCriterion("upper(htPropertyRight) like", value.toUpperCase(), "htpropertyright");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * housetype 2019-04-17
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