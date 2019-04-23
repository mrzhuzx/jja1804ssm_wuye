package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Complain_infoExample {
    /**
     * complain_info
     */
    protected String orderByClause;

    /**
     * complain_info
     */
    protected boolean distinct;

    /**
     * complain_info
     */
    protected List<Criteria> oredCriteria;

    public Complain_infoExample() {
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
     * complain_info 2019-04-23
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNull() {
            addCriterion("cphone is null");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNotNull() {
            addCriterion("cphone is not null");
            return (Criteria) this;
        }

        public Criteria andCphoneEqualTo(String value) {
            addCriterion("cphone =", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotEqualTo(String value) {
            addCriterion("cphone <>", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThan(String value) {
            addCriterion("cphone >", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cphone >=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThan(String value) {
            addCriterion("cphone <", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThanOrEqualTo(String value) {
            addCriterion("cphone <=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLike(String value) {
            addCriterion("cphone like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotLike(String value) {
            addCriterion("cphone not like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneIn(List<String> values) {
            addCriterion("cphone in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotIn(List<String> values) {
            addCriterion("cphone not in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneBetween(String value1, String value2) {
            addCriterion("cphone between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotBetween(String value1, String value2) {
            addCriterion("cphone not between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andRnameIsNull() {
            addCriterion("rname is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("rname is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("rname =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("rname <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("rname >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("rname >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("rname <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("rname <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("rname like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("rname not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("rname in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("rname not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("rname between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("rname not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMeansIsNull() {
            addCriterion("means is null");
            return (Criteria) this;
        }

        public Criteria andMeansIsNotNull() {
            addCriterion("means is not null");
            return (Criteria) this;
        }

        public Criteria andMeansEqualTo(Integer value) {
            addCriterion("means =", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansNotEqualTo(Integer value) {
            addCriterion("means <>", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansGreaterThan(Integer value) {
            addCriterion("means >", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansGreaterThanOrEqualTo(Integer value) {
            addCriterion("means >=", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansLessThan(Integer value) {
            addCriterion("means <", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansLessThanOrEqualTo(Integer value) {
            addCriterion("means <=", value, "means");
            return (Criteria) this;
        }

        public Criteria andMeansIn(List<Integer> values) {
            addCriterion("means in", values, "means");
            return (Criteria) this;
        }

        public Criteria andMeansNotIn(List<Integer> values) {
            addCriterion("means not in", values, "means");
            return (Criteria) this;
        }

        public Criteria andMeansBetween(Integer value1, Integer value2) {
            addCriterion("means between", value1, value2, "means");
            return (Criteria) this;
        }

        public Criteria andMeansNotBetween(Integer value1, Integer value2) {
            addCriterion("means not between", value1, value2, "means");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("cdate is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("cdate is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("cdate =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("cdate <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("cdate >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdate >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("cdate <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("cdate <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("cdate in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("cdate not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("cdate between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("cdate not between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andDealdescrIsNull() {
            addCriterion("dealdescr is null");
            return (Criteria) this;
        }

        public Criteria andDealdescrIsNotNull() {
            addCriterion("dealdescr is not null");
            return (Criteria) this;
        }

        public Criteria andDealdescrEqualTo(String value) {
            addCriterion("dealdescr =", value, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrNotEqualTo(String value) {
            addCriterion("dealdescr <>", value, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrGreaterThan(String value) {
            addCriterion("dealdescr >", value, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrGreaterThanOrEqualTo(String value) {
            addCriterion("dealdescr >=", value, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrLessThan(String value) {
            addCriterion("dealdescr <", value, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrLessThanOrEqualTo(String value) {
            addCriterion("dealdescr <=", value, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrLike(String value) {
            addCriterion("dealdescr like", value, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrNotLike(String value) {
            addCriterion("dealdescr not like", value, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrIn(List<String> values) {
            addCriterion("dealdescr in", values, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrNotIn(List<String> values) {
            addCriterion("dealdescr not in", values, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrBetween(String value1, String value2) {
            addCriterion("dealdescr between", value1, value2, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andDealdescrNotBetween(String value1, String value2) {
            addCriterion("dealdescr not between", value1, value2, "dealdescr");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andDescrLikeInsensitive(String value) {
            addCriterion("upper(descr) like", value.toUpperCase(), "descr");
            return (Criteria) this;
        }

        public Criteria andCnameLikeInsensitive(String value) {
            addCriterion("upper(cname) like", value.toUpperCase(), "cname");
            return (Criteria) this;
        }

        public Criteria andCphoneLikeInsensitive(String value) {
            addCriterion("upper(cphone) like", value.toUpperCase(), "cphone");
            return (Criteria) this;
        }

        public Criteria andRnameLikeInsensitive(String value) {
            addCriterion("upper(rname) like", value.toUpperCase(), "rname");
            return (Criteria) this;
        }

        public Criteria andDealdescrLikeInsensitive(String value) {
            addCriterion("upper(dealdescr) like", value.toUpperCase(), "dealdescr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * complain_info 2019-04-23
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