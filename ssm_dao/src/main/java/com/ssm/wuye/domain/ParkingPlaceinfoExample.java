package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class ParkingPlaceinfoExample {
    /**
     * parking_placeinfo
     */
    protected String orderByClause;

    /**
     * parking_placeinfo
     */
    protected boolean distinct;

    /**
     * parking_placeinfo
     */
    protected List<Criteria> oredCriteria;

    public ParkingPlaceinfoExample() {
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
     * parking_placeinfo 2019-05-05
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

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andOlidIsNull() {
            addCriterion("olid is null");
            return (Criteria) this;
        }

        public Criteria andOlidIsNotNull() {
            addCriterion("olid is not null");
            return (Criteria) this;
        }

        public Criteria andOlidEqualTo(Integer value) {
            addCriterion("olid =", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotEqualTo(Integer value) {
            addCriterion("olid <>", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThan(Integer value) {
            addCriterion("olid >", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("olid >=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThan(Integer value) {
            addCriterion("olid <", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThanOrEqualTo(Integer value) {
            addCriterion("olid <=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidIn(List<Integer> values) {
            addCriterion("olid in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotIn(List<Integer> values) {
            addCriterion("olid not in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidBetween(Integer value1, Integer value2) {
            addCriterion("olid between", value1, value2, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotBetween(Integer value1, Integer value2) {
            addCriterion("olid not between", value1, value2, "olid");
            return (Criteria) this;
        }

        public Criteria andHnameIsNull() {
            addCriterion("hname is null");
            return (Criteria) this;
        }

        public Criteria andHnameIsNotNull() {
            addCriterion("hname is not null");
            return (Criteria) this;
        }

        public Criteria andHnameEqualTo(String value) {
            addCriterion("hname =", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotEqualTo(String value) {
            addCriterion("hname <>", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThan(String value) {
            addCriterion("hname >", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThanOrEqualTo(String value) {
            addCriterion("hname >=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThan(String value) {
            addCriterion("hname <", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThanOrEqualTo(String value) {
            addCriterion("hname <=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLike(String value) {
            addCriterion("hname like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotLike(String value) {
            addCriterion("hname not like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameIn(List<String> values) {
            addCriterion("hname in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotIn(List<String> values) {
            addCriterion("hname not in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameBetween(String value1, String value2) {
            addCriterion("hname between", value1, value2, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotBetween(String value1, String value2) {
            addCriterion("hname not between", value1, value2, "hname");
            return (Criteria) this;
        }

        public Criteria andHphoneIsNull() {
            addCriterion("hphone is null");
            return (Criteria) this;
        }

        public Criteria andHphoneIsNotNull() {
            addCriterion("hphone is not null");
            return (Criteria) this;
        }

        public Criteria andHphoneEqualTo(String value) {
            addCriterion("hphone =", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotEqualTo(String value) {
            addCriterion("hphone <>", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneGreaterThan(String value) {
            addCriterion("hphone >", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneGreaterThanOrEqualTo(String value) {
            addCriterion("hphone >=", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneLessThan(String value) {
            addCriterion("hphone <", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneLessThanOrEqualTo(String value) {
            addCriterion("hphone <=", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneLike(String value) {
            addCriterion("hphone like", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotLike(String value) {
            addCriterion("hphone not like", value, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneIn(List<String> values) {
            addCriterion("hphone in", values, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotIn(List<String> values) {
            addCriterion("hphone not in", values, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneBetween(String value1, String value2) {
            addCriterion("hphone between", value1, value2, "hphone");
            return (Criteria) this;
        }

        public Criteria andHphoneNotBetween(String value1, String value2) {
            addCriterion("hphone not between", value1, value2, "hphone");
            return (Criteria) this;
        }

        public Criteria andHcardsIsNull() {
            addCriterion("hcards is null");
            return (Criteria) this;
        }

        public Criteria andHcardsIsNotNull() {
            addCriterion("hcards is not null");
            return (Criteria) this;
        }

        public Criteria andHcardsEqualTo(String value) {
            addCriterion("hcards =", value, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsNotEqualTo(String value) {
            addCriterion("hcards <>", value, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsGreaterThan(String value) {
            addCriterion("hcards >", value, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsGreaterThanOrEqualTo(String value) {
            addCriterion("hcards >=", value, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsLessThan(String value) {
            addCriterion("hcards <", value, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsLessThanOrEqualTo(String value) {
            addCriterion("hcards <=", value, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsLike(String value) {
            addCriterion("hcards like", value, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsNotLike(String value) {
            addCriterion("hcards not like", value, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsIn(List<String> values) {
            addCriterion("hcards in", values, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsNotIn(List<String> values) {
            addCriterion("hcards not in", values, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsBetween(String value1, String value2) {
            addCriterion("hcards between", value1, value2, "hcards");
            return (Criteria) this;
        }

        public Criteria andHcardsNotBetween(String value1, String value2) {
            addCriterion("hcards not between", value1, value2, "hcards");
            return (Criteria) this;
        }

        public Criteria andDescrIsNull() {
            addCriterion("descr is null");
            return (Criteria) this;
        }

        public Criteria andDescrIsNotNull() {
            addCriterion("descr is not null");
            return (Criteria) this;
        }

        public Criteria andDescrEqualTo(String value) {
            addCriterion("descr =", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotEqualTo(String value) {
            addCriterion("descr <>", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThan(String value) {
            addCriterion("descr >", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThanOrEqualTo(String value) {
            addCriterion("descr >=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThan(String value) {
            addCriterion("descr <", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThanOrEqualTo(String value) {
            addCriterion("descr <=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLike(String value) {
            addCriterion("descr like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotLike(String value) {
            addCriterion("descr not like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrIn(List<String> values) {
            addCriterion("descr in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotIn(List<String> values) {
            addCriterion("descr not in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrBetween(String value1, String value2) {
            addCriterion("descr between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotBetween(String value1, String value2) {
            addCriterion("descr not between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andPidLikeInsensitive(String value) {
            addCriterion("upper(pid) like", value.toUpperCase(), "pid");
            return (Criteria) this;
        }

        public Criteria andHnameLikeInsensitive(String value) {
            addCriterion("upper(hname) like", value.toUpperCase(), "hname");
            return (Criteria) this;
        }

        public Criteria andHphoneLikeInsensitive(String value) {
            addCriterion("upper(hphone) like", value.toUpperCase(), "hphone");
            return (Criteria) this;
        }

        public Criteria andHcardsLikeInsensitive(String value) {
            addCriterion("upper(hcards) like", value.toUpperCase(), "hcards");
            return (Criteria) this;
        }

        public Criteria andDescrLikeInsensitive(String value) {
            addCriterion("upper(descr) like", value.toUpperCase(), "descr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * parking_placeinfo 2019-05-05
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