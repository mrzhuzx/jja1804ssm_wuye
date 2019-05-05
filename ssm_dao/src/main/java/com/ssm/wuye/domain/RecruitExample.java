package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class RecruitExample {
    /**
     * recruit
     */
    protected String orderByClause;

    /**
     * recruit
     */
    protected boolean distinct;

    /**
     * recruit
     */
    protected List<Criteria> oredCriteria;

    public RecruitExample() {
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
     * recruit 2019-05-05
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

        public Criteria andRecruitidIsNull() {
            addCriterion("recruitId is null");
            return (Criteria) this;
        }

        public Criteria andRecruitidIsNotNull() {
            addCriterion("recruitId is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitidEqualTo(Integer value) {
            addCriterion("recruitId =", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidNotEqualTo(Integer value) {
            addCriterion("recruitId <>", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidGreaterThan(Integer value) {
            addCriterion("recruitId >", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitId >=", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidLessThan(Integer value) {
            addCriterion("recruitId <", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidLessThanOrEqualTo(Integer value) {
            addCriterion("recruitId <=", value, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidIn(List<Integer> values) {
            addCriterion("recruitId in", values, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidNotIn(List<Integer> values) {
            addCriterion("recruitId not in", values, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidBetween(Integer value1, Integer value2) {
            addCriterion("recruitId between", value1, value2, "recruitid");
            return (Criteria) this;
        }

        public Criteria andRecruitidNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitId not between", value1, value2, "recruitid");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andPostnameIsNull() {
            addCriterion("postName is null");
            return (Criteria) this;
        }

        public Criteria andPostnameIsNotNull() {
            addCriterion("postName is not null");
            return (Criteria) this;
        }

        public Criteria andPostnameEqualTo(String value) {
            addCriterion("postName =", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotEqualTo(String value) {
            addCriterion("postName <>", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameGreaterThan(String value) {
            addCriterion("postName >", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameGreaterThanOrEqualTo(String value) {
            addCriterion("postName >=", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLessThan(String value) {
            addCriterion("postName <", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLessThanOrEqualTo(String value) {
            addCriterion("postName <=", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLike(String value) {
            addCriterion("postName like", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotLike(String value) {
            addCriterion("postName not like", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameIn(List<String> values) {
            addCriterion("postName in", values, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotIn(List<String> values) {
            addCriterion("postName not in", values, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameBetween(String value1, String value2) {
            addCriterion("postName between", value1, value2, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotBetween(String value1, String value2) {
            addCriterion("postName not between", value1, value2, "postname");
            return (Criteria) this;
        }

        public Criteria andRecruitdesIsNull() {
            addCriterion("recruitDes is null");
            return (Criteria) this;
        }

        public Criteria andRecruitdesIsNotNull() {
            addCriterion("recruitDes is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitdesEqualTo(String value) {
            addCriterion("recruitDes =", value, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesNotEqualTo(String value) {
            addCriterion("recruitDes <>", value, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesGreaterThan(String value) {
            addCriterion("recruitDes >", value, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesGreaterThanOrEqualTo(String value) {
            addCriterion("recruitDes >=", value, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesLessThan(String value) {
            addCriterion("recruitDes <", value, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesLessThanOrEqualTo(String value) {
            addCriterion("recruitDes <=", value, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesLike(String value) {
            addCriterion("recruitDes like", value, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesNotLike(String value) {
            addCriterion("recruitDes not like", value, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesIn(List<String> values) {
            addCriterion("recruitDes in", values, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesNotIn(List<String> values) {
            addCriterion("recruitDes not in", values, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesBetween(String value1, String value2) {
            addCriterion("recruitDes between", value1, value2, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andRecruitdesNotBetween(String value1, String value2) {
            addCriterion("recruitDes not between", value1, value2, "recruitdes");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("Duty is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("Duty is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("Duty =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("Duty <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("Duty >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("Duty >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("Duty <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("Duty <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("Duty like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("Duty not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("Duty in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("Duty not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("Duty between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("Duty not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andRecruitnumIsNull() {
            addCriterion("recruitNum is null");
            return (Criteria) this;
        }

        public Criteria andRecruitnumIsNotNull() {
            addCriterion("recruitNum is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitnumEqualTo(Integer value) {
            addCriterion("recruitNum =", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumNotEqualTo(Integer value) {
            addCriterion("recruitNum <>", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumGreaterThan(Integer value) {
            addCriterion("recruitNum >", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitNum >=", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumLessThan(Integer value) {
            addCriterion("recruitNum <", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumLessThanOrEqualTo(Integer value) {
            addCriterion("recruitNum <=", value, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumIn(List<Integer> values) {
            addCriterion("recruitNum in", values, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumNotIn(List<Integer> values) {
            addCriterion("recruitNum not in", values, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumBetween(Integer value1, Integer value2) {
            addCriterion("recruitNum between", value1, value2, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andRecruitnumNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitNum not between", value1, value2, "recruitnum");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNull() {
            addCriterion("contactNumber is null");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNotNull() {
            addCriterion("contactNumber is not null");
            return (Criteria) this;
        }

        public Criteria andContactnumberEqualTo(String value) {
            addCriterion("contactNumber =", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotEqualTo(String value) {
            addCriterion("contactNumber <>", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThan(String value) {
            addCriterion("contactNumber >", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("contactNumber >=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThan(String value) {
            addCriterion("contactNumber <", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThanOrEqualTo(String value) {
            addCriterion("contactNumber <=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLike(String value) {
            addCriterion("contactNumber like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotLike(String value) {
            addCriterion("contactNumber not like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberIn(List<String> values) {
            addCriterion("contactNumber in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotIn(List<String> values) {
            addCriterion("contactNumber not in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberBetween(String value1, String value2) {
            addCriterion("contactNumber between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotBetween(String value1, String value2) {
            addCriterion("contactNumber not between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCompanynameLikeInsensitive(String value) {
            addCriterion("upper(companyName) like", value.toUpperCase(), "companyname");
            return (Criteria) this;
        }

        public Criteria andPostnameLikeInsensitive(String value) {
            addCriterion("upper(postName) like", value.toUpperCase(), "postname");
            return (Criteria) this;
        }

        public Criteria andRecruitdesLikeInsensitive(String value) {
            addCriterion("upper(recruitDes) like", value.toUpperCase(), "recruitdes");
            return (Criteria) this;
        }

        public Criteria andDutyLikeInsensitive(String value) {
            addCriterion("upper(Duty) like", value.toUpperCase(), "duty");
            return (Criteria) this;
        }

        public Criteria andContactnumberLikeInsensitive(String value) {
            addCriterion("upper(contactNumber) like", value.toUpperCase(), "contactnumber");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(Address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * recruit 2019-05-05
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