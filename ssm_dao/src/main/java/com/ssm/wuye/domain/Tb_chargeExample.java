package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class Tb_chargeExample {
    /**
     * tb_charge
     */
    protected String orderByClause;

    /**
     * tb_charge
     */
    protected boolean distinct;

    /**
     * tb_charge
     */
    protected List<Criteria> oredCriteria;

    public Tb_chargeExample() {
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
     * tb_charge 2019-04-23
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

        public Criteria andChargeidIsNull() {
            addCriterion("chargeId is null");
            return (Criteria) this;
        }

        public Criteria andChargeidIsNotNull() {
            addCriterion("chargeId is not null");
            return (Criteria) this;
        }

        public Criteria andChargeidEqualTo(Integer value) {
            addCriterion("chargeId =", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidNotEqualTo(Integer value) {
            addCriterion("chargeId <>", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidGreaterThan(Integer value) {
            addCriterion("chargeId >", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeId >=", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidLessThan(Integer value) {
            addCriterion("chargeId <", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidLessThanOrEqualTo(Integer value) {
            addCriterion("chargeId <=", value, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidIn(List<Integer> values) {
            addCriterion("chargeId in", values, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidNotIn(List<Integer> values) {
            addCriterion("chargeId not in", values, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidBetween(Integer value1, Integer value2) {
            addCriterion("chargeId between", value1, value2, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargeidNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeId not between", value1, value2, "chargeid");
            return (Criteria) this;
        }

        public Criteria andChargenameIsNull() {
            addCriterion("chargeName is null");
            return (Criteria) this;
        }

        public Criteria andChargenameIsNotNull() {
            addCriterion("chargeName is not null");
            return (Criteria) this;
        }

        public Criteria andChargenameEqualTo(String value) {
            addCriterion("chargeName =", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotEqualTo(String value) {
            addCriterion("chargeName <>", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameGreaterThan(String value) {
            addCriterion("chargeName >", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameGreaterThanOrEqualTo(String value) {
            addCriterion("chargeName >=", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLessThan(String value) {
            addCriterion("chargeName <", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLessThanOrEqualTo(String value) {
            addCriterion("chargeName <=", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameLike(String value) {
            addCriterion("chargeName like", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotLike(String value) {
            addCriterion("chargeName not like", value, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameIn(List<String> values) {
            addCriterion("chargeName in", values, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotIn(List<String> values) {
            addCriterion("chargeName not in", values, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameBetween(String value1, String value2) {
            addCriterion("chargeName between", value1, value2, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargenameNotBetween(String value1, String value2) {
            addCriterion("chargeName not between", value1, value2, "chargename");
            return (Criteria) this;
        }

        public Criteria andChargestandardIsNull() {
            addCriterion("chargeStandard is null");
            return (Criteria) this;
        }

        public Criteria andChargestandardIsNotNull() {
            addCriterion("chargeStandard is not null");
            return (Criteria) this;
        }

        public Criteria andChargestandardEqualTo(Double value) {
            addCriterion("chargeStandard =", value, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargestandardNotEqualTo(Double value) {
            addCriterion("chargeStandard <>", value, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargestandardGreaterThan(Double value) {
            addCriterion("chargeStandard >", value, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargestandardGreaterThanOrEqualTo(Double value) {
            addCriterion("chargeStandard >=", value, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargestandardLessThan(Double value) {
            addCriterion("chargeStandard <", value, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargestandardLessThanOrEqualTo(Double value) {
            addCriterion("chargeStandard <=", value, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargestandardIn(List<Double> values) {
            addCriterion("chargeStandard in", values, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargestandardNotIn(List<Double> values) {
            addCriterion("chargeStandard not in", values, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargestandardBetween(Double value1, Double value2) {
            addCriterion("chargeStandard between", value1, value2, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargestandardNotBetween(Double value1, Double value2) {
            addCriterion("chargeStandard not between", value1, value2, "chargestandard");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionIsNull() {
            addCriterion("chargeDescription is null");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionIsNotNull() {
            addCriterion("chargeDescription is not null");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionEqualTo(String value) {
            addCriterion("chargeDescription =", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotEqualTo(String value) {
            addCriterion("chargeDescription <>", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionGreaterThan(String value) {
            addCriterion("chargeDescription >", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("chargeDescription >=", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLessThan(String value) {
            addCriterion("chargeDescription <", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLessThanOrEqualTo(String value) {
            addCriterion("chargeDescription <=", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLike(String value) {
            addCriterion("chargeDescription like", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotLike(String value) {
            addCriterion("chargeDescription not like", value, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionIn(List<String> values) {
            addCriterion("chargeDescription in", values, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotIn(List<String> values) {
            addCriterion("chargeDescription not in", values, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionBetween(String value1, String value2) {
            addCriterion("chargeDescription between", value1, value2, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionNotBetween(String value1, String value2) {
            addCriterion("chargeDescription not between", value1, value2, "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargeyearIsNull() {
            addCriterion("chargeYear is null");
            return (Criteria) this;
        }

        public Criteria andChargeyearIsNotNull() {
            addCriterion("chargeYear is not null");
            return (Criteria) this;
        }

        public Criteria andChargeyearEqualTo(String value) {
            addCriterion("chargeYear =", value, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearNotEqualTo(String value) {
            addCriterion("chargeYear <>", value, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearGreaterThan(String value) {
            addCriterion("chargeYear >", value, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearGreaterThanOrEqualTo(String value) {
            addCriterion("chargeYear >=", value, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearLessThan(String value) {
            addCriterion("chargeYear <", value, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearLessThanOrEqualTo(String value) {
            addCriterion("chargeYear <=", value, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearLike(String value) {
            addCriterion("chargeYear like", value, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearNotLike(String value) {
            addCriterion("chargeYear not like", value, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearIn(List<String> values) {
            addCriterion("chargeYear in", values, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearNotIn(List<String> values) {
            addCriterion("chargeYear not in", values, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearBetween(String value1, String value2) {
            addCriterion("chargeYear between", value1, value2, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargeyearNotBetween(String value1, String value2) {
            addCriterion("chargeYear not between", value1, value2, "chargeyear");
            return (Criteria) this;
        }

        public Criteria andChargenameLikeInsensitive(String value) {
            addCriterion("upper(chargeName) like", value.toUpperCase(), "chargename");
            return (Criteria) this;
        }

        public Criteria andChargedescriptionLikeInsensitive(String value) {
            addCriterion("upper(chargeDescription) like", value.toUpperCase(), "chargedescription");
            return (Criteria) this;
        }

        public Criteria andChargeyearLikeInsensitive(String value) {
            addCriterion("upper(chargeYear) like", value.toUpperCase(), "chargeyear");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_charge 2019-04-23
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