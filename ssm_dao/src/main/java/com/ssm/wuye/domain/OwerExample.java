package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class OwerExample {
    /**
     * ower
     */
    protected String orderByClause;

    /**
     * ower
     */
    protected boolean distinct;

    /**
     * ower
     */
    protected List<Criteria> oredCriteria;

    public OwerExample() {
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
     * ower 2019-04-17
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

        public Criteria andOlidIsNull() {
            addCriterion("olId is null");
            return (Criteria) this;
        }

        public Criteria andOlidIsNotNull() {
            addCriterion("olId is not null");
            return (Criteria) this;
        }

        public Criteria andOlidEqualTo(Integer value) {
            addCriterion("olId =", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotEqualTo(Integer value) {
            addCriterion("olId <>", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThan(Integer value) {
            addCriterion("olId >", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("olId >=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThan(Integer value) {
            addCriterion("olId <", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidLessThanOrEqualTo(Integer value) {
            addCriterion("olId <=", value, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidIn(List<Integer> values) {
            addCriterion("olId in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotIn(List<Integer> values) {
            addCriterion("olId not in", values, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidBetween(Integer value1, Integer value2) {
            addCriterion("olId between", value1, value2, "olid");
            return (Criteria) this;
        }

        public Criteria andOlidNotBetween(Integer value1, Integer value2) {
            addCriterion("olId not between", value1, value2, "olid");
            return (Criteria) this;
        }

        public Criteria andOlnameIsNull() {
            addCriterion("olName is null");
            return (Criteria) this;
        }

        public Criteria andOlnameIsNotNull() {
            addCriterion("olName is not null");
            return (Criteria) this;
        }

        public Criteria andOlnameEqualTo(String value) {
            addCriterion("olName =", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameNotEqualTo(String value) {
            addCriterion("olName <>", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameGreaterThan(String value) {
            addCriterion("olName >", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameGreaterThanOrEqualTo(String value) {
            addCriterion("olName >=", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameLessThan(String value) {
            addCriterion("olName <", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameLessThanOrEqualTo(String value) {
            addCriterion("olName <=", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameLike(String value) {
            addCriterion("olName like", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameNotLike(String value) {
            addCriterion("olName not like", value, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameIn(List<String> values) {
            addCriterion("olName in", values, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameNotIn(List<String> values) {
            addCriterion("olName not in", values, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameBetween(String value1, String value2) {
            addCriterion("olName between", value1, value2, "olname");
            return (Criteria) this;
        }

        public Criteria andOlnameNotBetween(String value1, String value2) {
            addCriterion("olName not between", value1, value2, "olname");
            return (Criteria) this;
        }

        public Criteria andOlaccountIsNull() {
            addCriterion("olAccount is null");
            return (Criteria) this;
        }

        public Criteria andOlaccountIsNotNull() {
            addCriterion("olAccount is not null");
            return (Criteria) this;
        }

        public Criteria andOlaccountEqualTo(String value) {
            addCriterion("olAccount =", value, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountNotEqualTo(String value) {
            addCriterion("olAccount <>", value, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountGreaterThan(String value) {
            addCriterion("olAccount >", value, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountGreaterThanOrEqualTo(String value) {
            addCriterion("olAccount >=", value, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountLessThan(String value) {
            addCriterion("olAccount <", value, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountLessThanOrEqualTo(String value) {
            addCriterion("olAccount <=", value, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountLike(String value) {
            addCriterion("olAccount like", value, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountNotLike(String value) {
            addCriterion("olAccount not like", value, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountIn(List<String> values) {
            addCriterion("olAccount in", values, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountNotIn(List<String> values) {
            addCriterion("olAccount not in", values, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountBetween(String value1, String value2) {
            addCriterion("olAccount between", value1, value2, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlaccountNotBetween(String value1, String value2) {
            addCriterion("olAccount not between", value1, value2, "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlpasswdIsNull() {
            addCriterion("olPasswd is null");
            return (Criteria) this;
        }

        public Criteria andOlpasswdIsNotNull() {
            addCriterion("olPasswd is not null");
            return (Criteria) this;
        }

        public Criteria andOlpasswdEqualTo(String value) {
            addCriterion("olPasswd =", value, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdNotEqualTo(String value) {
            addCriterion("olPasswd <>", value, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdGreaterThan(String value) {
            addCriterion("olPasswd >", value, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdGreaterThanOrEqualTo(String value) {
            addCriterion("olPasswd >=", value, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdLessThan(String value) {
            addCriterion("olPasswd <", value, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdLessThanOrEqualTo(String value) {
            addCriterion("olPasswd <=", value, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdLike(String value) {
            addCriterion("olPasswd like", value, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdNotLike(String value) {
            addCriterion("olPasswd not like", value, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdIn(List<String> values) {
            addCriterion("olPasswd in", values, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdNotIn(List<String> values) {
            addCriterion("olPasswd not in", values, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdBetween(String value1, String value2) {
            addCriterion("olPasswd between", value1, value2, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andOlpasswdNotBetween(String value1, String value2) {
            addCriterion("olPasswd not between", value1, value2, "olpasswd");
            return (Criteria) this;
        }

        public Criteria andPoweridIsNull() {
            addCriterion("powerId is null");
            return (Criteria) this;
        }

        public Criteria andPoweridIsNotNull() {
            addCriterion("powerId is not null");
            return (Criteria) this;
        }

        public Criteria andPoweridEqualTo(String value) {
            addCriterion("powerId =", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotEqualTo(String value) {
            addCriterion("powerId <>", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridGreaterThan(String value) {
            addCriterion("powerId >", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridGreaterThanOrEqualTo(String value) {
            addCriterion("powerId >=", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLessThan(String value) {
            addCriterion("powerId <", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLessThanOrEqualTo(String value) {
            addCriterion("powerId <=", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLike(String value) {
            addCriterion("powerId like", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotLike(String value) {
            addCriterion("powerId not like", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridIn(List<String> values) {
            addCriterion("powerId in", values, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotIn(List<String> values) {
            addCriterion("powerId not in", values, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridBetween(String value1, String value2) {
            addCriterion("powerId between", value1, value2, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotBetween(String value1, String value2) {
            addCriterion("powerId not between", value1, value2, "powerid");
            return (Criteria) this;
        }

        public Criteria andOlphoneIsNull() {
            addCriterion("olPhone is null");
            return (Criteria) this;
        }

        public Criteria andOlphoneIsNotNull() {
            addCriterion("olPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOlphoneEqualTo(String value) {
            addCriterion("olPhone =", value, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneNotEqualTo(String value) {
            addCriterion("olPhone <>", value, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneGreaterThan(String value) {
            addCriterion("olPhone >", value, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneGreaterThanOrEqualTo(String value) {
            addCriterion("olPhone >=", value, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneLessThan(String value) {
            addCriterion("olPhone <", value, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneLessThanOrEqualTo(String value) {
            addCriterion("olPhone <=", value, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneLike(String value) {
            addCriterion("olPhone like", value, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneNotLike(String value) {
            addCriterion("olPhone not like", value, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneIn(List<String> values) {
            addCriterion("olPhone in", values, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneNotIn(List<String> values) {
            addCriterion("olPhone not in", values, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneBetween(String value1, String value2) {
            addCriterion("olPhone between", value1, value2, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlphoneNotBetween(String value1, String value2) {
            addCriterion("olPhone not between", value1, value2, "olphone");
            return (Criteria) this;
        }

        public Criteria andOlheadimgIsNull() {
            addCriterion("olHeadimg is null");
            return (Criteria) this;
        }

        public Criteria andOlheadimgIsNotNull() {
            addCriterion("olHeadimg is not null");
            return (Criteria) this;
        }

        public Criteria andOlheadimgEqualTo(String value) {
            addCriterion("olHeadimg =", value, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgNotEqualTo(String value) {
            addCriterion("olHeadimg <>", value, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgGreaterThan(String value) {
            addCriterion("olHeadimg >", value, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgGreaterThanOrEqualTo(String value) {
            addCriterion("olHeadimg >=", value, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgLessThan(String value) {
            addCriterion("olHeadimg <", value, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgLessThanOrEqualTo(String value) {
            addCriterion("olHeadimg <=", value, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgLike(String value) {
            addCriterion("olHeadimg like", value, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgNotLike(String value) {
            addCriterion("olHeadimg not like", value, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgIn(List<String> values) {
            addCriterion("olHeadimg in", values, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgNotIn(List<String> values) {
            addCriterion("olHeadimg not in", values, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgBetween(String value1, String value2) {
            addCriterion("olHeadimg between", value1, value2, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlheadimgNotBetween(String value1, String value2) {
            addCriterion("olHeadimg not between", value1, value2, "olheadimg");
            return (Criteria) this;
        }

        public Criteria andOlmemberIsNull() {
            addCriterion("olMember is null");
            return (Criteria) this;
        }

        public Criteria andOlmemberIsNotNull() {
            addCriterion("olMember is not null");
            return (Criteria) this;
        }

        public Criteria andOlmemberEqualTo(Integer value) {
            addCriterion("olMember =", value, "olmember");
            return (Criteria) this;
        }

        public Criteria andOlmemberNotEqualTo(Integer value) {
            addCriterion("olMember <>", value, "olmember");
            return (Criteria) this;
        }

        public Criteria andOlmemberGreaterThan(Integer value) {
            addCriterion("olMember >", value, "olmember");
            return (Criteria) this;
        }

        public Criteria andOlmemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("olMember >=", value, "olmember");
            return (Criteria) this;
        }

        public Criteria andOlmemberLessThan(Integer value) {
            addCriterion("olMember <", value, "olmember");
            return (Criteria) this;
        }

        public Criteria andOlmemberLessThanOrEqualTo(Integer value) {
            addCriterion("olMember <=", value, "olmember");
            return (Criteria) this;
        }

        public Criteria andOlmemberIn(List<Integer> values) {
            addCriterion("olMember in", values, "olmember");
            return (Criteria) this;
        }

        public Criteria andOlmemberNotIn(List<Integer> values) {
            addCriterion("olMember not in", values, "olmember");
            return (Criteria) this;
        }

        public Criteria andOlmemberBetween(Integer value1, Integer value2) {
            addCriterion("olMember between", value1, value2, "olmember");
            return (Criteria) this;
        }

        public Criteria andOlmemberNotBetween(Integer value1, Integer value2) {
            addCriterion("olMember not between", value1, value2, "olmember");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleId =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleId <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleId >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleId >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleId <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleId <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleId in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleId not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleId between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleId not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andOlnameLikeInsensitive(String value) {
            addCriterion("upper(olName) like", value.toUpperCase(), "olname");
            return (Criteria) this;
        }

        public Criteria andOlaccountLikeInsensitive(String value) {
            addCriterion("upper(olAccount) like", value.toUpperCase(), "olaccount");
            return (Criteria) this;
        }

        public Criteria andOlpasswdLikeInsensitive(String value) {
            addCriterion("upper(olPasswd) like", value.toUpperCase(), "olpasswd");
            return (Criteria) this;
        }

        public Criteria andPoweridLikeInsensitive(String value) {
            addCriterion("upper(powerId) like", value.toUpperCase(), "powerid");
            return (Criteria) this;
        }

        public Criteria andOlphoneLikeInsensitive(String value) {
            addCriterion("upper(olPhone) like", value.toUpperCase(), "olphone");
            return (Criteria) this;
        }

        public Criteria andOlheadimgLikeInsensitive(String value) {
            addCriterion("upper(olHeadimg) like", value.toUpperCase(), "olheadimg");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ower 2019-04-17
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