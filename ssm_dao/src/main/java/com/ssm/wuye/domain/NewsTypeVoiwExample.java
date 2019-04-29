package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NewsTypeVoiwExample {
    /**
     * newstype_voiw
     */
    protected String orderByClause;

    /**
     * newstype_voiw
     */
    protected boolean distinct;

    /**
     * newstype_voiw
     */
    protected List<Criteria> oredCriteria;

    public NewsTypeVoiwExample() {
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
     * newstype_voiw 2019-04-27
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

        public Criteria andNtypenameIsNull() {
            addCriterion("ntypename is null");
            return (Criteria) this;
        }

        public Criteria andNtypenameIsNotNull() {
            addCriterion("ntypename is not null");
            return (Criteria) this;
        }

        public Criteria andNtypenameEqualTo(String value) {
            addCriterion("ntypename =", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameNotEqualTo(String value) {
            addCriterion("ntypename <>", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameGreaterThan(String value) {
            addCriterion("ntypename >", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("ntypename >=", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameLessThan(String value) {
            addCriterion("ntypename <", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameLessThanOrEqualTo(String value) {
            addCriterion("ntypename <=", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameLike(String value) {
            addCriterion("ntypename like", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameNotLike(String value) {
            addCriterion("ntypename not like", value, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameIn(List<String> values) {
            addCriterion("ntypename in", values, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameNotIn(List<String> values) {
            addCriterion("ntypename not in", values, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameBetween(String value1, String value2) {
            addCriterion("ntypename between", value1, value2, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNtypenameNotBetween(String value1, String value2) {
            addCriterion("ntypename not between", value1, value2, "ntypename");
            return (Criteria) this;
        }

        public Criteria andNcidIsNull() {
            addCriterion("ncid is null");
            return (Criteria) this;
        }

        public Criteria andNcidIsNotNull() {
            addCriterion("ncid is not null");
            return (Criteria) this;
        }

        public Criteria andNcidEqualTo(Integer value) {
            addCriterion("ncid =", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotEqualTo(Integer value) {
            addCriterion("ncid <>", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidGreaterThan(Integer value) {
            addCriterion("ncid >", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ncid >=", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidLessThan(Integer value) {
            addCriterion("ncid <", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidLessThanOrEqualTo(Integer value) {
            addCriterion("ncid <=", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidIn(List<Integer> values) {
            addCriterion("ncid in", values, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotIn(List<Integer> values) {
            addCriterion("ncid not in", values, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidBetween(Integer value1, Integer value2) {
            addCriterion("ncid between", value1, value2, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ncid not between", value1, value2, "ncid");
            return (Criteria) this;
        }

        public Criteria andNctitleIsNull() {
            addCriterion("nctitle is null");
            return (Criteria) this;
        }

        public Criteria andNctitleIsNotNull() {
            addCriterion("nctitle is not null");
            return (Criteria) this;
        }

        public Criteria andNctitleEqualTo(String value) {
            addCriterion("nctitle =", value, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleNotEqualTo(String value) {
            addCriterion("nctitle <>", value, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleGreaterThan(String value) {
            addCriterion("nctitle >", value, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleGreaterThanOrEqualTo(String value) {
            addCriterion("nctitle >=", value, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleLessThan(String value) {
            addCriterion("nctitle <", value, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleLessThanOrEqualTo(String value) {
            addCriterion("nctitle <=", value, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleLike(String value) {
            addCriterion("nctitle like", value, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleNotLike(String value) {
            addCriterion("nctitle not like", value, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleIn(List<String> values) {
            addCriterion("nctitle in", values, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleNotIn(List<String> values) {
            addCriterion("nctitle not in", values, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleBetween(String value1, String value2) {
            addCriterion("nctitle between", value1, value2, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNctitleNotBetween(String value1, String value2) {
            addCriterion("nctitle not between", value1, value2, "nctitle");
            return (Criteria) this;
        }

        public Criteria andNccontentIsNull() {
            addCriterion("nccontent is null");
            return (Criteria) this;
        }

        public Criteria andNccontentIsNotNull() {
            addCriterion("nccontent is not null");
            return (Criteria) this;
        }

        public Criteria andNccontentEqualTo(String value) {
            addCriterion("nccontent =", value, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentNotEqualTo(String value) {
            addCriterion("nccontent <>", value, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentGreaterThan(String value) {
            addCriterion("nccontent >", value, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentGreaterThanOrEqualTo(String value) {
            addCriterion("nccontent >=", value, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentLessThan(String value) {
            addCriterion("nccontent <", value, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentLessThanOrEqualTo(String value) {
            addCriterion("nccontent <=", value, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentLike(String value) {
            addCriterion("nccontent like", value, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentNotLike(String value) {
            addCriterion("nccontent not like", value, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentIn(List<String> values) {
            addCriterion("nccontent in", values, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentNotIn(List<String> values) {
            addCriterion("nccontent not in", values, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentBetween(String value1, String value2) {
            addCriterion("nccontent between", value1, value2, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNccontentNotBetween(String value1, String value2) {
            addCriterion("nccontent not between", value1, value2, "nccontent");
            return (Criteria) this;
        }

        public Criteria andNctimeIsNull() {
            addCriterion("nctime is null");
            return (Criteria) this;
        }

        public Criteria andNctimeIsNotNull() {
            addCriterion("nctime is not null");
            return (Criteria) this;
        }

        public Criteria andNctimeEqualTo(Date value) {
            addCriterionForJDBCDate("nctime =", value, "nctime");
            return (Criteria) this;
        }

        public Criteria andNctimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("nctime <>", value, "nctime");
            return (Criteria) this;
        }

        public Criteria andNctimeGreaterThan(Date value) {
            addCriterionForJDBCDate("nctime >", value, "nctime");
            return (Criteria) this;
        }

        public Criteria andNctimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nctime >=", value, "nctime");
            return (Criteria) this;
        }

        public Criteria andNctimeLessThan(Date value) {
            addCriterionForJDBCDate("nctime <", value, "nctime");
            return (Criteria) this;
        }

        public Criteria andNctimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nctime <=", value, "nctime");
            return (Criteria) this;
        }

        public Criteria andNctimeIn(List<Date> values) {
            addCriterionForJDBCDate("nctime in", values, "nctime");
            return (Criteria) this;
        }

        public Criteria andNctimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("nctime not in", values, "nctime");
            return (Criteria) this;
        }

        public Criteria andNctimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nctime between", value1, value2, "nctime");
            return (Criteria) this;
        }

        public Criteria andNctimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nctime not between", value1, value2, "nctime");
            return (Criteria) this;
        }

        public Criteria andNtidIsNull() {
            addCriterion("ntid is null");
            return (Criteria) this;
        }

        public Criteria andNtidIsNotNull() {
            addCriterion("ntid is not null");
            return (Criteria) this;
        }

        public Criteria andNtidEqualTo(Integer value) {
            addCriterion("ntid =", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidNotEqualTo(Integer value) {
            addCriterion("ntid <>", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidGreaterThan(Integer value) {
            addCriterion("ntid >", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ntid >=", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidLessThan(Integer value) {
            addCriterion("ntid <", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidLessThanOrEqualTo(Integer value) {
            addCriterion("ntid <=", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidIn(List<Integer> values) {
            addCriterion("ntid in", values, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidNotIn(List<Integer> values) {
            addCriterion("ntid not in", values, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidBetween(Integer value1, Integer value2) {
            addCriterion("ntid between", value1, value2, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ntid not between", value1, value2, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtypenameLikeInsensitive(String value) {
            addCriterion("upper(ntypename) like", value.toUpperCase(), "ntypename");
            return (Criteria) this;
        }

        public Criteria andNctitleLikeInsensitive(String value) {
            addCriterion("upper(nctitle) like", value.toUpperCase(), "nctitle");
            return (Criteria) this;
        }

        public Criteria andNccontentLikeInsensitive(String value) {
            addCriterion("upper(nccontent) like", value.toUpperCase(), "nccontent");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * newstype_voiw 2019-04-27
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