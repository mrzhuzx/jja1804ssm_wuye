package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ContractExample {
    /**
     * contract
     */
    protected String orderByClause;

    /**
     * contract
     */
    protected boolean distinct;

    /**
     * contract
     */
    protected List<Criteria> oredCriteria;

    public ContractExample() {
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
     * contract 2019-04-25
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andContractidIsNull() {
            addCriterion("contractId is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("contractId is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(Integer value) {
            addCriterion("contractId =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(Integer value) {
            addCriterion("contractId <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(Integer value) {
            addCriterion("contractId >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(Integer value) {
            addCriterion("contractId >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(Integer value) {
            addCriterion("contractId <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(Integer value) {
            addCriterion("contractId <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<Integer> values) {
            addCriterion("contractId in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<Integer> values) {
            addCriterion("contractId not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(Integer value1, Integer value2) {
            addCriterion("contractId between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(Integer value1, Integer value2) {
            addCriterion("contractId not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractnameIsNull() {
            addCriterion("contractName is null");
            return (Criteria) this;
        }

        public Criteria andContractnameIsNotNull() {
            addCriterion("contractName is not null");
            return (Criteria) this;
        }

        public Criteria andContractnameEqualTo(String value) {
            addCriterion("contractName =", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotEqualTo(String value) {
            addCriterion("contractName <>", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameGreaterThan(String value) {
            addCriterion("contractName >", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameGreaterThanOrEqualTo(String value) {
            addCriterion("contractName >=", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLessThan(String value) {
            addCriterion("contractName <", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLessThanOrEqualTo(String value) {
            addCriterion("contractName <=", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLike(String value) {
            addCriterion("contractName like", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotLike(String value) {
            addCriterion("contractName not like", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameIn(List<String> values) {
            addCriterion("contractName in", values, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotIn(List<String> values) {
            addCriterion("contractName not in", values, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameBetween(String value1, String value2) {
            addCriterion("contractName between", value1, value2, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotBetween(String value1, String value2) {
            addCriterion("contractName not between", value1, value2, "contractname");
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

        public Criteria andContractstartIsNull() {
            addCriterion("contractStart is null");
            return (Criteria) this;
        }

        public Criteria andContractstartIsNotNull() {
            addCriterion("contractStart is not null");
            return (Criteria) this;
        }

        public Criteria andContractstartEqualTo(Date value) {
            addCriterionForJDBCDate("contractStart =", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartNotEqualTo(Date value) {
            addCriterionForJDBCDate("contractStart <>", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartGreaterThan(Date value) {
            addCriterionForJDBCDate("contractStart >", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contractStart >=", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartLessThan(Date value) {
            addCriterionForJDBCDate("contractStart <", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contractStart <=", value, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartIn(List<Date> values) {
            addCriterionForJDBCDate("contractStart in", values, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartNotIn(List<Date> values) {
            addCriterionForJDBCDate("contractStart not in", values, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contractStart between", value1, value2, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractstartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contractStart not between", value1, value2, "contractstart");
            return (Criteria) this;
        }

        public Criteria andContractendIsNull() {
            addCriterion("contractEnd is null");
            return (Criteria) this;
        }

        public Criteria andContractendIsNotNull() {
            addCriterion("contractEnd is not null");
            return (Criteria) this;
        }

        public Criteria andContractendEqualTo(Date value) {
            addCriterionForJDBCDate("contractEnd =", value, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractendNotEqualTo(Date value) {
            addCriterionForJDBCDate("contractEnd <>", value, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractendGreaterThan(Date value) {
            addCriterionForJDBCDate("contractEnd >", value, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contractEnd >=", value, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractendLessThan(Date value) {
            addCriterionForJDBCDate("contractEnd <", value, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contractEnd <=", value, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractendIn(List<Date> values) {
            addCriterionForJDBCDate("contractEnd in", values, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractendNotIn(List<Date> values) {
            addCriterionForJDBCDate("contractEnd not in", values, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contractEnd between", value1, value2, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contractEnd not between", value1, value2, "contractend");
            return (Criteria) this;
        }

        public Criteria andContractdesIsNull() {
            addCriterion("contractDes is null");
            return (Criteria) this;
        }

        public Criteria andContractdesIsNotNull() {
            addCriterion("contractDes is not null");
            return (Criteria) this;
        }

        public Criteria andContractdesEqualTo(String value) {
            addCriterion("contractDes =", value, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesNotEqualTo(String value) {
            addCriterion("contractDes <>", value, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesGreaterThan(String value) {
            addCriterion("contractDes >", value, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesGreaterThanOrEqualTo(String value) {
            addCriterion("contractDes >=", value, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesLessThan(String value) {
            addCriterion("contractDes <", value, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesLessThanOrEqualTo(String value) {
            addCriterion("contractDes <=", value, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesLike(String value) {
            addCriterion("contractDes like", value, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesNotLike(String value) {
            addCriterion("contractDes not like", value, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesIn(List<String> values) {
            addCriterion("contractDes in", values, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesNotIn(List<String> values) {
            addCriterion("contractDes not in", values, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesBetween(String value1, String value2) {
            addCriterion("contractDes between", value1, value2, "contractdes");
            return (Criteria) this;
        }

        public Criteria andContractdesNotBetween(String value1, String value2) {
            addCriterion("contractDes not between", value1, value2, "contractdes");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleIsNull() {
            addCriterion("signingPeople is null");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleIsNotNull() {
            addCriterion("signingPeople is not null");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleEqualTo(String value) {
            addCriterion("signingPeople =", value, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleNotEqualTo(String value) {
            addCriterion("signingPeople <>", value, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleGreaterThan(String value) {
            addCriterion("signingPeople >", value, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("signingPeople >=", value, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleLessThan(String value) {
            addCriterion("signingPeople <", value, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleLessThanOrEqualTo(String value) {
            addCriterion("signingPeople <=", value, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleLike(String value) {
            addCriterion("signingPeople like", value, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleNotLike(String value) {
            addCriterion("signingPeople not like", value, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleIn(List<String> values) {
            addCriterion("signingPeople in", values, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleNotIn(List<String> values) {
            addCriterion("signingPeople not in", values, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleBetween(String value1, String value2) {
            addCriterion("signingPeople between", value1, value2, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleNotBetween(String value1, String value2) {
            addCriterion("signingPeople not between", value1, value2, "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneIsNull() {
            addCriterion("signatoryTelephone is null");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneIsNotNull() {
            addCriterion("signatoryTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneEqualTo(String value) {
            addCriterion("signatoryTelephone =", value, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneNotEqualTo(String value) {
            addCriterion("signatoryTelephone <>", value, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneGreaterThan(String value) {
            addCriterion("signatoryTelephone >", value, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("signatoryTelephone >=", value, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneLessThan(String value) {
            addCriterion("signatoryTelephone <", value, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneLessThanOrEqualTo(String value) {
            addCriterion("signatoryTelephone <=", value, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneLike(String value) {
            addCriterion("signatoryTelephone like", value, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneNotLike(String value) {
            addCriterion("signatoryTelephone not like", value, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneIn(List<String> values) {
            addCriterion("signatoryTelephone in", values, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneNotIn(List<String> values) {
            addCriterion("signatoryTelephone not in", values, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneBetween(String value1, String value2) {
            addCriterion("signatoryTelephone between", value1, value2, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneNotBetween(String value1, String value2) {
            addCriterion("signatoryTelephone not between", value1, value2, "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andContractnumIsNull() {
            addCriterion("contractNum is null");
            return (Criteria) this;
        }

        public Criteria andContractnumIsNotNull() {
            addCriterion("contractNum is not null");
            return (Criteria) this;
        }

        public Criteria andContractnumEqualTo(String value) {
            addCriterion("contractNum =", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumNotEqualTo(String value) {
            addCriterion("contractNum <>", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumGreaterThan(String value) {
            addCriterion("contractNum >", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumGreaterThanOrEqualTo(String value) {
            addCriterion("contractNum >=", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumLessThan(String value) {
            addCriterion("contractNum <", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumLessThanOrEqualTo(String value) {
            addCriterion("contractNum <=", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumLike(String value) {
            addCriterion("contractNum like", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumNotLike(String value) {
            addCriterion("contractNum not like", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumIn(List<String> values) {
            addCriterion("contractNum in", values, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumNotIn(List<String> values) {
            addCriterion("contractNum not in", values, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumBetween(String value1, String value2) {
            addCriterion("contractNum between", value1, value2, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumNotBetween(String value1, String value2) {
            addCriterion("contractNum not between", value1, value2, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnameLikeInsensitive(String value) {
            addCriterion("upper(contractName) like", value.toUpperCase(), "contractname");
            return (Criteria) this;
        }

        public Criteria andContracttypeLikeInsensitive(String value) {
            addCriterion("upper(contractType) like", value.toUpperCase(), "contracttype");
            return (Criteria) this;
        }

        public Criteria andContractdesLikeInsensitive(String value) {
            addCriterion("upper(contractDes) like", value.toUpperCase(), "contractdes");
            return (Criteria) this;
        }

        public Criteria andSigningpeopleLikeInsensitive(String value) {
            addCriterion("upper(signingPeople) like", value.toUpperCase(), "signingpeople");
            return (Criteria) this;
        }

        public Criteria andSignatorytelephoneLikeInsensitive(String value) {
            addCriterion("upper(signatoryTelephone) like", value.toUpperCase(), "signatorytelephone");
            return (Criteria) this;
        }

        public Criteria andContractnumLikeInsensitive(String value) {
            addCriterion("upper(contractNum) like", value.toUpperCase(), "contractnum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * contract 2019-04-25
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