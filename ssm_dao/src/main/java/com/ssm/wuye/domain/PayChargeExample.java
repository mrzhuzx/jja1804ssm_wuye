package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayChargeExample {
    /**
     * pay_charge
     */
    protected String orderByClause;

    /**
     * pay_charge
     */
    protected boolean distinct;

    /**
     * pay_charge
     */
    protected List<Criteria> oredCriteria;

    public PayChargeExample() {
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
     * pay_charge 2019-05-09
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

        public Criteria andPayidIsNull() {
            addCriterion("payId is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("payId is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(Integer value) {
            addCriterion("payId =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(Integer value) {
            addCriterion("payId <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(Integer value) {
            addCriterion("payId >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("payId >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(Integer value) {
            addCriterion("payId <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(Integer value) {
            addCriterion("payId <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<Integer> values) {
            addCriterion("payId in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<Integer> values) {
            addCriterion("payId not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(Integer value1, Integer value2) {
            addCriterion("payId between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(Integer value1, Integer value2) {
            addCriterion("payId not between", value1, value2, "payid");
            return (Criteria) this;
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

        public Criteria andLatepaymentIsNull() {
            addCriterion("Latepayment is null");
            return (Criteria) this;
        }

        public Criteria andLatepaymentIsNotNull() {
            addCriterion("Latepayment is not null");
            return (Criteria) this;
        }

        public Criteria andLatepaymentEqualTo(Double value) {
            addCriterion("Latepayment =", value, "latepayment");
            return (Criteria) this;
        }

        public Criteria andLatepaymentNotEqualTo(Double value) {
            addCriterion("Latepayment <>", value, "latepayment");
            return (Criteria) this;
        }

        public Criteria andLatepaymentGreaterThan(Double value) {
            addCriterion("Latepayment >", value, "latepayment");
            return (Criteria) this;
        }

        public Criteria andLatepaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("Latepayment >=", value, "latepayment");
            return (Criteria) this;
        }

        public Criteria andLatepaymentLessThan(Double value) {
            addCriterion("Latepayment <", value, "latepayment");
            return (Criteria) this;
        }

        public Criteria andLatepaymentLessThanOrEqualTo(Double value) {
            addCriterion("Latepayment <=", value, "latepayment");
            return (Criteria) this;
        }

        public Criteria andLatepaymentIn(List<Double> values) {
            addCriterion("Latepayment in", values, "latepayment");
            return (Criteria) this;
        }

        public Criteria andLatepaymentNotIn(List<Double> values) {
            addCriterion("Latepayment not in", values, "latepayment");
            return (Criteria) this;
        }

        public Criteria andLatepaymentBetween(Double value1, Double value2) {
            addCriterion("Latepayment between", value1, value2, "latepayment");
            return (Criteria) this;
        }

        public Criteria andLatepaymentNotBetween(Double value1, Double value2) {
            addCriterion("Latepayment not between", value1, value2, "latepayment");
            return (Criteria) this;
        }

        public Criteria andPayrealIsNull() {
            addCriterion("payReal is null");
            return (Criteria) this;
        }

        public Criteria andPayrealIsNotNull() {
            addCriterion("payReal is not null");
            return (Criteria) this;
        }

        public Criteria andPayrealEqualTo(Double value) {
            addCriterion("payReal =", value, "payreal");
            return (Criteria) this;
        }

        public Criteria andPayrealNotEqualTo(Double value) {
            addCriterion("payReal <>", value, "payreal");
            return (Criteria) this;
        }

        public Criteria andPayrealGreaterThan(Double value) {
            addCriterion("payReal >", value, "payreal");
            return (Criteria) this;
        }

        public Criteria andPayrealGreaterThanOrEqualTo(Double value) {
            addCriterion("payReal >=", value, "payreal");
            return (Criteria) this;
        }

        public Criteria andPayrealLessThan(Double value) {
            addCriterion("payReal <", value, "payreal");
            return (Criteria) this;
        }

        public Criteria andPayrealLessThanOrEqualTo(Double value) {
            addCriterion("payReal <=", value, "payreal");
            return (Criteria) this;
        }

        public Criteria andPayrealIn(List<Double> values) {
            addCriterion("payReal in", values, "payreal");
            return (Criteria) this;
        }

        public Criteria andPayrealNotIn(List<Double> values) {
            addCriterion("payReal not in", values, "payreal");
            return (Criteria) this;
        }

        public Criteria andPayrealBetween(Double value1, Double value2) {
            addCriterion("payReal between", value1, value2, "payreal");
            return (Criteria) this;
        }

        public Criteria andPayrealNotBetween(Double value1, Double value2) {
            addCriterion("payReal not between", value1, value2, "payreal");
            return (Criteria) this;
        }

        public Criteria andPaybalanceIsNull() {
            addCriterion("payBalance is null");
            return (Criteria) this;
        }

        public Criteria andPaybalanceIsNotNull() {
            addCriterion("payBalance is not null");
            return (Criteria) this;
        }

        public Criteria andPaybalanceEqualTo(Double value) {
            addCriterion("payBalance =", value, "paybalance");
            return (Criteria) this;
        }

        public Criteria andPaybalanceNotEqualTo(Double value) {
            addCriterion("payBalance <>", value, "paybalance");
            return (Criteria) this;
        }

        public Criteria andPaybalanceGreaterThan(Double value) {
            addCriterion("payBalance >", value, "paybalance");
            return (Criteria) this;
        }

        public Criteria andPaybalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("payBalance >=", value, "paybalance");
            return (Criteria) this;
        }

        public Criteria andPaybalanceLessThan(Double value) {
            addCriterion("payBalance <", value, "paybalance");
            return (Criteria) this;
        }

        public Criteria andPaybalanceLessThanOrEqualTo(Double value) {
            addCriterion("payBalance <=", value, "paybalance");
            return (Criteria) this;
        }

        public Criteria andPaybalanceIn(List<Double> values) {
            addCriterion("payBalance in", values, "paybalance");
            return (Criteria) this;
        }

        public Criteria andPaybalanceNotIn(List<Double> values) {
            addCriterion("payBalance not in", values, "paybalance");
            return (Criteria) this;
        }

        public Criteria andPaybalanceBetween(Double value1, Double value2) {
            addCriterion("payBalance between", value1, value2, "paybalance");
            return (Criteria) this;
        }

        public Criteria andPaybalanceNotBetween(Double value1, Double value2) {
            addCriterion("payBalance not between", value1, value2, "paybalance");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNull() {
            addCriterion("houseId is null");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNotNull() {
            addCriterion("houseId is not null");
            return (Criteria) this;
        }

        public Criteria andHouseidEqualTo(Integer value) {
            addCriterion("houseId =", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotEqualTo(Integer value) {
            addCriterion("houseId <>", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThan(Integer value) {
            addCriterion("houseId >", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("houseId >=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThan(Integer value) {
            addCriterion("houseId <", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThanOrEqualTo(Integer value) {
            addCriterion("houseId <=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidIn(List<Integer> values) {
            addCriterion("houseId in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotIn(List<Integer> values) {
            addCriterion("houseId not in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidBetween(Integer value1, Integer value2) {
            addCriterion("houseId between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("houseId not between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andChargetimeIsNull() {
            addCriterion("chargeTime is null");
            return (Criteria) this;
        }

        public Criteria andChargetimeIsNotNull() {
            addCriterion("chargeTime is not null");
            return (Criteria) this;
        }

        public Criteria andChargetimeEqualTo(Date value) {
            addCriterion("chargeTime =", value, "chargetime");
            return (Criteria) this;
        }

        public Criteria andChargetimeNotEqualTo(Date value) {
            addCriterion("chargeTime <>", value, "chargetime");
            return (Criteria) this;
        }

        public Criteria andChargetimeGreaterThan(Date value) {
            addCriterion("chargeTime >", value, "chargetime");
            return (Criteria) this;
        }

        public Criteria andChargetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chargeTime >=", value, "chargetime");
            return (Criteria) this;
        }

        public Criteria andChargetimeLessThan(Date value) {
            addCriterion("chargeTime <", value, "chargetime");
            return (Criteria) this;
        }

        public Criteria andChargetimeLessThanOrEqualTo(Date value) {
            addCriterion("chargeTime <=", value, "chargetime");
            return (Criteria) this;
        }

        public Criteria andChargetimeIn(List<Date> values) {
            addCriterion("chargeTime in", values, "chargetime");
            return (Criteria) this;
        }

        public Criteria andChargetimeNotIn(List<Date> values) {
            addCriterion("chargeTime not in", values, "chargetime");
            return (Criteria) this;
        }

        public Criteria andChargetimeBetween(Date value1, Date value2) {
            addCriterion("chargeTime between", value1, value2, "chargetime");
            return (Criteria) this;
        }

        public Criteria andChargetimeNotBetween(Date value1, Date value2) {
            addCriterion("chargeTime not between", value1, value2, "chargetime");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNull() {
            addCriterion("payName is null");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNotNull() {
            addCriterion("payName is not null");
            return (Criteria) this;
        }

        public Criteria andPaynameEqualTo(String value) {
            addCriterion("payName =", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotEqualTo(String value) {
            addCriterion("payName <>", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThan(String value) {
            addCriterion("payName >", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThanOrEqualTo(String value) {
            addCriterion("payName >=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThan(String value) {
            addCriterion("payName <", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThanOrEqualTo(String value) {
            addCriterion("payName <=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLike(String value) {
            addCriterion("payName like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotLike(String value) {
            addCriterion("payName not like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameIn(List<String> values) {
            addCriterion("payName in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotIn(List<String> values) {
            addCriterion("payName not in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameBetween(String value1, String value2) {
            addCriterion("payName between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotBetween(String value1, String value2) {
            addCriterion("payName not between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNull() {
            addCriterion("payState is null");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNotNull() {
            addCriterion("payState is not null");
            return (Criteria) this;
        }

        public Criteria andPaystateEqualTo(Integer value) {
            addCriterion("payState =", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotEqualTo(Integer value) {
            addCriterion("payState <>", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThan(Integer value) {
            addCriterion("payState >", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("payState >=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThan(Integer value) {
            addCriterion("payState <", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThanOrEqualTo(Integer value) {
            addCriterion("payState <=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateIn(List<Integer> values) {
            addCriterion("payState in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotIn(List<Integer> values) {
            addCriterion("payState not in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateBetween(Integer value1, Integer value2) {
            addCriterion("payState between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotBetween(Integer value1, Integer value2) {
            addCriterion("payState not between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaymonthIsNull() {
            addCriterion("payMonth is null");
            return (Criteria) this;
        }

        public Criteria andPaymonthIsNotNull() {
            addCriterion("payMonth is not null");
            return (Criteria) this;
        }

        public Criteria andPaymonthEqualTo(String value) {
            addCriterion("payMonth =", value, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthNotEqualTo(String value) {
            addCriterion("payMonth <>", value, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthGreaterThan(String value) {
            addCriterion("payMonth >", value, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthGreaterThanOrEqualTo(String value) {
            addCriterion("payMonth >=", value, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthLessThan(String value) {
            addCriterion("payMonth <", value, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthLessThanOrEqualTo(String value) {
            addCriterion("payMonth <=", value, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthLike(String value) {
            addCriterion("payMonth like", value, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthNotLike(String value) {
            addCriterion("payMonth not like", value, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthIn(List<String> values) {
            addCriterion("payMonth in", values, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthNotIn(List<String> values) {
            addCriterion("payMonth not in", values, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthBetween(String value1, String value2) {
            addCriterion("payMonth between", value1, value2, "paymonth");
            return (Criteria) this;
        }

        public Criteria andPaymonthNotBetween(String value1, String value2) {
            addCriterion("payMonth not between", value1, value2, "paymonth");
            return (Criteria) this;
        }

        public Criteria andOweridIsNull() {
            addCriterion("owerId is null");
            return (Criteria) this;
        }

        public Criteria andOweridIsNotNull() {
            addCriterion("owerId is not null");
            return (Criteria) this;
        }

        public Criteria andOweridEqualTo(Integer value) {
            addCriterion("owerId =", value, "owerid");
            return (Criteria) this;
        }

        public Criteria andOweridNotEqualTo(Integer value) {
            addCriterion("owerId <>", value, "owerid");
            return (Criteria) this;
        }

        public Criteria andOweridGreaterThan(Integer value) {
            addCriterion("owerId >", value, "owerid");
            return (Criteria) this;
        }

        public Criteria andOweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("owerId >=", value, "owerid");
            return (Criteria) this;
        }

        public Criteria andOweridLessThan(Integer value) {
            addCriterion("owerId <", value, "owerid");
            return (Criteria) this;
        }

        public Criteria andOweridLessThanOrEqualTo(Integer value) {
            addCriterion("owerId <=", value, "owerid");
            return (Criteria) this;
        }

        public Criteria andOweridIn(List<Integer> values) {
            addCriterion("owerId in", values, "owerid");
            return (Criteria) this;
        }

        public Criteria andOweridNotIn(List<Integer> values) {
            addCriterion("owerId not in", values, "owerid");
            return (Criteria) this;
        }

        public Criteria andOweridBetween(Integer value1, Integer value2) {
            addCriterion("owerId between", value1, value2, "owerid");
            return (Criteria) this;
        }

        public Criteria andOweridNotBetween(Integer value1, Integer value2) {
            addCriterion("owerId not between", value1, value2, "owerid");
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

        public Criteria andCsIsNull() {
            addCriterion("cs is null");
            return (Criteria) this;
        }

        public Criteria andCsIsNotNull() {
            addCriterion("cs is not null");
            return (Criteria) this;
        }

        public Criteria andCsEqualTo(Double value) {
            addCriterion("cs =", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsNotEqualTo(Double value) {
            addCriterion("cs <>", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsGreaterThan(Double value) {
            addCriterion("cs >", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsGreaterThanOrEqualTo(Double value) {
            addCriterion("cs >=", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsLessThan(Double value) {
            addCriterion("cs <", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsLessThanOrEqualTo(Double value) {
            addCriterion("cs <=", value, "cs");
            return (Criteria) this;
        }

        public Criteria andCsIn(List<Double> values) {
            addCriterion("cs in", values, "cs");
            return (Criteria) this;
        }

        public Criteria andCsNotIn(List<Double> values) {
            addCriterion("cs not in", values, "cs");
            return (Criteria) this;
        }

        public Criteria andCsBetween(Double value1, Double value2) {
            addCriterion("cs between", value1, value2, "cs");
            return (Criteria) this;
        }

        public Criteria andCsNotBetween(Double value1, Double value2) {
            addCriterion("cs not between", value1, value2, "cs");
            return (Criteria) this;
        }

        public Criteria andPaynameLikeInsensitive(String value) {
            addCriterion("upper(payName) like", value.toUpperCase(), "payname");
            return (Criteria) this;
        }

        public Criteria andPaymonthLikeInsensitive(String value) {
            addCriterion("upper(payMonth) like", value.toUpperCase(), "paymonth");
            return (Criteria) this;
        }

        public Criteria andChargenameLikeInsensitive(String value) {
            addCriterion("upper(chargeName) like", value.toUpperCase(), "chargename");
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
     * pay_charge 2019-05-09
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