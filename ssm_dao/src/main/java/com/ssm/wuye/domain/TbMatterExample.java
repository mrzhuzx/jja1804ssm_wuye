package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbMatterExample {
    /**
     * tb_matter
     */
    protected String orderByClause;

    /**
     * tb_matter
     */
    protected boolean distinct;

    /**
     * tb_matter
     */
    protected List<Criteria> oredCriteria;

    public TbMatterExample() {
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
     * tb_matter 2019-04-23
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

        public Criteria andMatteridIsNull() {
            addCriterion("matterId is null");
            return (Criteria) this;
        }

        public Criteria andMatteridIsNotNull() {
            addCriterion("matterId is not null");
            return (Criteria) this;
        }

        public Criteria andMatteridEqualTo(Integer value) {
            addCriterion("matterId =", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridNotEqualTo(Integer value) {
            addCriterion("matterId <>", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridGreaterThan(Integer value) {
            addCriterion("matterId >", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("matterId >=", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridLessThan(Integer value) {
            addCriterion("matterId <", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridLessThanOrEqualTo(Integer value) {
            addCriterion("matterId <=", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridIn(List<Integer> values) {
            addCriterion("matterId in", values, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridNotIn(List<Integer> values) {
            addCriterion("matterId not in", values, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridBetween(Integer value1, Integer value2) {
            addCriterion("matterId between", value1, value2, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridNotBetween(Integer value1, Integer value2) {
            addCriterion("matterId not between", value1, value2, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatternameIsNull() {
            addCriterion("matterName is null");
            return (Criteria) this;
        }

        public Criteria andMatternameIsNotNull() {
            addCriterion("matterName is not null");
            return (Criteria) this;
        }

        public Criteria andMatternameEqualTo(String value) {
            addCriterion("matterName =", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotEqualTo(String value) {
            addCriterion("matterName <>", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameGreaterThan(String value) {
            addCriterion("matterName >", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameGreaterThanOrEqualTo(String value) {
            addCriterion("matterName >=", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameLessThan(String value) {
            addCriterion("matterName <", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameLessThanOrEqualTo(String value) {
            addCriterion("matterName <=", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameLike(String value) {
            addCriterion("matterName like", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotLike(String value) {
            addCriterion("matterName not like", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameIn(List<String> values) {
            addCriterion("matterName in", values, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotIn(List<String> values) {
            addCriterion("matterName not in", values, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameBetween(String value1, String value2) {
            addCriterion("matterName between", value1, value2, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotBetween(String value1, String value2) {
            addCriterion("matterName not between", value1, value2, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternumIsNull() {
            addCriterion("matterNum is null");
            return (Criteria) this;
        }

        public Criteria andMatternumIsNotNull() {
            addCriterion("matterNum is not null");
            return (Criteria) this;
        }

        public Criteria andMatternumEqualTo(Integer value) {
            addCriterion("matterNum =", value, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatternumNotEqualTo(Integer value) {
            addCriterion("matterNum <>", value, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatternumGreaterThan(Integer value) {
            addCriterion("matterNum >", value, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatternumGreaterThanOrEqualTo(Integer value) {
            addCriterion("matterNum >=", value, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatternumLessThan(Integer value) {
            addCriterion("matterNum <", value, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatternumLessThanOrEqualTo(Integer value) {
            addCriterion("matterNum <=", value, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatternumIn(List<Integer> values) {
            addCriterion("matterNum in", values, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatternumNotIn(List<Integer> values) {
            addCriterion("matterNum not in", values, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatternumBetween(Integer value1, Integer value2) {
            addCriterion("matterNum between", value1, value2, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatternumNotBetween(Integer value1, Integer value2) {
            addCriterion("matterNum not between", value1, value2, "matternum");
            return (Criteria) this;
        }

        public Criteria andMatterpriceIsNull() {
            addCriterion("matterPrice is null");
            return (Criteria) this;
        }

        public Criteria andMatterpriceIsNotNull() {
            addCriterion("matterPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMatterpriceEqualTo(Double value) {
            addCriterion("matterPrice =", value, "matterprice");
            return (Criteria) this;
        }

        public Criteria andMatterpriceNotEqualTo(Double value) {
            addCriterion("matterPrice <>", value, "matterprice");
            return (Criteria) this;
        }

        public Criteria andMatterpriceGreaterThan(Double value) {
            addCriterion("matterPrice >", value, "matterprice");
            return (Criteria) this;
        }

        public Criteria andMatterpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("matterPrice >=", value, "matterprice");
            return (Criteria) this;
        }

        public Criteria andMatterpriceLessThan(Double value) {
            addCriterion("matterPrice <", value, "matterprice");
            return (Criteria) this;
        }

        public Criteria andMatterpriceLessThanOrEqualTo(Double value) {
            addCriterion("matterPrice <=", value, "matterprice");
            return (Criteria) this;
        }

        public Criteria andMatterpriceIn(List<Double> values) {
            addCriterion("matterPrice in", values, "matterprice");
            return (Criteria) this;
        }

        public Criteria andMatterpriceNotIn(List<Double> values) {
            addCriterion("matterPrice not in", values, "matterprice");
            return (Criteria) this;
        }

        public Criteria andMatterpriceBetween(Double value1, Double value2) {
            addCriterion("matterPrice between", value1, value2, "matterprice");
            return (Criteria) this;
        }

        public Criteria andMatterpriceNotBetween(Double value1, Double value2) {
            addCriterion("matterPrice not between", value1, value2, "matterprice");
            return (Criteria) this;
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

        public Criteria andInstoragetimeIsNull() {
            addCriterion("inStorageTime is null");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeIsNotNull() {
            addCriterion("inStorageTime is not null");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeEqualTo(Date value) {
            addCriterionForJDBCDate("inStorageTime =", value, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("inStorageTime <>", value, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("inStorageTime >", value, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inStorageTime >=", value, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeLessThan(Date value) {
            addCriterionForJDBCDate("inStorageTime <", value, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inStorageTime <=", value, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeIn(List<Date> values) {
            addCriterionForJDBCDate("inStorageTime in", values, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("inStorageTime not in", values, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inStorageTime between", value1, value2, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andInstoragetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inStorageTime not between", value1, value2, "instoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeIsNull() {
            addCriterion("outStorageTime is null");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeIsNotNull() {
            addCriterion("outStorageTime is not null");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeEqualTo(Date value) {
            addCriterionForJDBCDate("outStorageTime =", value, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("outStorageTime <>", value, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("outStorageTime >", value, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outStorageTime >=", value, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeLessThan(Date value) {
            addCriterionForJDBCDate("outStorageTime <", value, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outStorageTime <=", value, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeIn(List<Date> values) {
            addCriterionForJDBCDate("outStorageTime in", values, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("outStorageTime not in", values, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outStorageTime between", value1, value2, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andOutstoragetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outStorageTime not between", value1, value2, "outstoragetime");
            return (Criteria) this;
        }

        public Criteria andMatterstateIsNull() {
            addCriterion("matterState is null");
            return (Criteria) this;
        }

        public Criteria andMatterstateIsNotNull() {
            addCriterion("matterState is not null");
            return (Criteria) this;
        }

        public Criteria andMatterstateEqualTo(String value) {
            addCriterion("matterState =", value, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateNotEqualTo(String value) {
            addCriterion("matterState <>", value, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateGreaterThan(String value) {
            addCriterion("matterState >", value, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateGreaterThanOrEqualTo(String value) {
            addCriterion("matterState >=", value, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateLessThan(String value) {
            addCriterion("matterState <", value, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateLessThanOrEqualTo(String value) {
            addCriterion("matterState <=", value, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateLike(String value) {
            addCriterion("matterState like", value, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateNotLike(String value) {
            addCriterion("matterState not like", value, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateIn(List<String> values) {
            addCriterion("matterState in", values, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateNotIn(List<String> values) {
            addCriterion("matterState not in", values, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateBetween(String value1, String value2) {
            addCriterion("matterState between", value1, value2, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatterstateNotBetween(String value1, String value2) {
            addCriterion("matterState not between", value1, value2, "matterstate");
            return (Criteria) this;
        }

        public Criteria andMatternameLikeInsensitive(String value) {
            addCriterion("upper(matterName) like", value.toUpperCase(), "mattername");
            return (Criteria) this;
        }

        public Criteria andMatterstateLikeInsensitive(String value) {
            addCriterion("upper(matterState) like", value.toUpperCase(), "matterstate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_matter 2019-04-23
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