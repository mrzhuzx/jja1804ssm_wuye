package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingCarinfoExample {
    /**
     * parking_carinfo
     */
    protected String orderByClause;

    /**
     * parking_carinfo
     */
    protected boolean distinct;

    /**
     * parking_carinfo
     */
    protected List<Criteria> oredCriteria;

    public ParkingCarinfoExample() {
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
     * parking_carinfo 2019-05-05
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

        public Criteria andParkingidIsNull() {
            addCriterion("parkingid is null");
            return (Criteria) this;
        }

        public Criteria andParkingidIsNotNull() {
            addCriterion("parkingid is not null");
            return (Criteria) this;
        }

        public Criteria andParkingidEqualTo(Integer value) {
            addCriterion("parkingid =", value, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingidNotEqualTo(Integer value) {
            addCriterion("parkingid <>", value, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingidGreaterThan(Integer value) {
            addCriterion("parkingid >", value, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parkingid >=", value, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingidLessThan(Integer value) {
            addCriterion("parkingid <", value, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingidLessThanOrEqualTo(Integer value) {
            addCriterion("parkingid <=", value, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingidIn(List<Integer> values) {
            addCriterion("parkingid in", values, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingidNotIn(List<Integer> values) {
            addCriterion("parkingid not in", values, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingidBetween(Integer value1, Integer value2) {
            addCriterion("parkingid between", value1, value2, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingidNotBetween(Integer value1, Integer value2) {
            addCriterion("parkingid not between", value1, value2, "parkingid");
            return (Criteria) this;
        }

        public Criteria andParkingcardsIsNull() {
            addCriterion("Parkingcards is null");
            return (Criteria) this;
        }

        public Criteria andParkingcardsIsNotNull() {
            addCriterion("Parkingcards is not null");
            return (Criteria) this;
        }

        public Criteria andParkingcardsEqualTo(String value) {
            addCriterion("Parkingcards =", value, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsNotEqualTo(String value) {
            addCriterion("Parkingcards <>", value, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsGreaterThan(String value) {
            addCriterion("Parkingcards >", value, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsGreaterThanOrEqualTo(String value) {
            addCriterion("Parkingcards >=", value, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsLessThan(String value) {
            addCriterion("Parkingcards <", value, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsLessThanOrEqualTo(String value) {
            addCriterion("Parkingcards <=", value, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsLike(String value) {
            addCriterion("Parkingcards like", value, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsNotLike(String value) {
            addCriterion("Parkingcards not like", value, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsIn(List<String> values) {
            addCriterion("Parkingcards in", values, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsNotIn(List<String> values) {
            addCriterion("Parkingcards not in", values, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsBetween(String value1, String value2) {
            addCriterion("Parkingcards between", value1, value2, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcardsNotBetween(String value1, String value2) {
            addCriterion("Parkingcards not between", value1, value2, "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcostIsNull() {
            addCriterion("Parkingcost is null");
            return (Criteria) this;
        }

        public Criteria andParkingcostIsNotNull() {
            addCriterion("Parkingcost is not null");
            return (Criteria) this;
        }

        public Criteria andParkingcostEqualTo(String value) {
            addCriterion("Parkingcost =", value, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostNotEqualTo(String value) {
            addCriterion("Parkingcost <>", value, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostGreaterThan(String value) {
            addCriterion("Parkingcost >", value, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostGreaterThanOrEqualTo(String value) {
            addCriterion("Parkingcost >=", value, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostLessThan(String value) {
            addCriterion("Parkingcost <", value, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostLessThanOrEqualTo(String value) {
            addCriterion("Parkingcost <=", value, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostLike(String value) {
            addCriterion("Parkingcost like", value, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostNotLike(String value) {
            addCriterion("Parkingcost not like", value, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostIn(List<String> values) {
            addCriterion("Parkingcost in", values, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostNotIn(List<String> values) {
            addCriterion("Parkingcost not in", values, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostBetween(String value1, String value2) {
            addCriterion("Parkingcost between", value1, value2, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingcostNotBetween(String value1, String value2) {
            addCriterion("Parkingcost not between", value1, value2, "parkingcost");
            return (Criteria) this;
        }

        public Criteria andParkingintimeIsNull() {
            addCriterion("Parkingintime is null");
            return (Criteria) this;
        }

        public Criteria andParkingintimeIsNotNull() {
            addCriterion("Parkingintime is not null");
            return (Criteria) this;
        }

        public Criteria andParkingintimeEqualTo(Date value) {
            addCriterion("Parkingintime =", value, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingintimeNotEqualTo(Date value) {
            addCriterion("Parkingintime <>", value, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingintimeGreaterThan(Date value) {
            addCriterion("Parkingintime >", value, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Parkingintime >=", value, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingintimeLessThan(Date value) {
            addCriterion("Parkingintime <", value, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingintimeLessThanOrEqualTo(Date value) {
            addCriterion("Parkingintime <=", value, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingintimeIn(List<Date> values) {
            addCriterion("Parkingintime in", values, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingintimeNotIn(List<Date> values) {
            addCriterion("Parkingintime not in", values, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingintimeBetween(Date value1, Date value2) {
            addCriterion("Parkingintime between", value1, value2, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingintimeNotBetween(Date value1, Date value2) {
            addCriterion("Parkingintime not between", value1, value2, "parkingintime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeIsNull() {
            addCriterion("Parkingouttime is null");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeIsNotNull() {
            addCriterion("Parkingouttime is not null");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeEqualTo(Date value) {
            addCriterion("Parkingouttime =", value, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeNotEqualTo(Date value) {
            addCriterion("Parkingouttime <>", value, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeGreaterThan(Date value) {
            addCriterion("Parkingouttime >", value, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Parkingouttime >=", value, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeLessThan(Date value) {
            addCriterion("Parkingouttime <", value, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeLessThanOrEqualTo(Date value) {
            addCriterion("Parkingouttime <=", value, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeIn(List<Date> values) {
            addCriterion("Parkingouttime in", values, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeNotIn(List<Date> values) {
            addCriterion("Parkingouttime not in", values, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeBetween(Date value1, Date value2) {
            addCriterion("Parkingouttime between", value1, value2, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andParkingouttimeNotBetween(Date value1, Date value2) {
            addCriterion("Parkingouttime not between", value1, value2, "parkingouttime");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNull() {
            addCriterion("paymentMethod is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("paymentMethod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(Integer value) {
            addCriterion("paymentMethod =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(Integer value) {
            addCriterion("paymentMethod <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(Integer value) {
            addCriterion("paymentMethod >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentMethod >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(Integer value) {
            addCriterion("paymentMethod <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(Integer value) {
            addCriterion("paymentMethod <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<Integer> values) {
            addCriterion("paymentMethod in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<Integer> values) {
            addCriterion("paymentMethod not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(Integer value1, Integer value2) {
            addCriterion("paymentMethod between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentMethod not between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNull() {
            addCriterion("PaymentStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNotNull() {
            addCriterion("PaymentStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusEqualTo(Integer value) {
            addCriterion("PaymentStatus =", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotEqualTo(Integer value) {
            addCriterion("PaymentStatus <>", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThan(Integer value) {
            addCriterion("PaymentStatus >", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PaymentStatus >=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThan(Integer value) {
            addCriterion("PaymentStatus <", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThanOrEqualTo(Integer value) {
            addCriterion("PaymentStatus <=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIn(List<Integer> values) {
            addCriterion("PaymentStatus in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotIn(List<Integer> values) {
            addCriterion("PaymentStatus not in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusBetween(Integer value1, Integer value2) {
            addCriterion("PaymentStatus between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PaymentStatus not between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andParkingcardsLikeInsensitive(String value) {
            addCriterion("upper(Parkingcards) like", value.toUpperCase(), "parkingcards");
            return (Criteria) this;
        }

        public Criteria andParkingcostLikeInsensitive(String value) {
            addCriterion("upper(Parkingcost) like", value.toUpperCase(), "parkingcost");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * parking_carinfo 2019-05-05
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