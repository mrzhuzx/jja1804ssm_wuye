package com.ssm.wuye.domain;

import java.util.ArrayList;
import java.util.List;

public class Sys_admin_infoExample {
    /**
     * sys_admin_info
     */
    protected String orderByClause;

    /**
     * sys_admin_info
     */
    protected boolean distinct;

    /**
     * sys_admin_info
     */
    protected List<Criteria> oredCriteria;

    public Sys_admin_infoExample() {
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
     * sys_admin_info 2019-04-23
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpassIsNull() {
            addCriterion("userpass is null");
            return (Criteria) this;
        }

        public Criteria andUserpassIsNotNull() {
            addCriterion("userpass is not null");
            return (Criteria) this;
        }

        public Criteria andUserpassEqualTo(String value) {
            addCriterion("userpass =", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotEqualTo(String value) {
            addCriterion("userpass <>", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassGreaterThan(String value) {
            addCriterion("userpass >", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassGreaterThanOrEqualTo(String value) {
            addCriterion("userpass >=", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLessThan(String value) {
            addCriterion("userpass <", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLessThanOrEqualTo(String value) {
            addCriterion("userpass <=", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLike(String value) {
            addCriterion("userpass like", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotLike(String value) {
            addCriterion("userpass not like", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassIn(List<String> values) {
            addCriterion("userpass in", values, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotIn(List<String> values) {
            addCriterion("userpass not in", values, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassBetween(String value1, String value2) {
            addCriterion("userpass between", value1, value2, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotBetween(String value1, String value2) {
            addCriterion("userpass not between", value1, value2, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userphone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userphone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userphone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userphone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userphone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userphone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userphone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userphone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userphone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userphone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userphone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userphone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userphone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userphone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUsermailIsNull() {
            addCriterion("usermail is null");
            return (Criteria) this;
        }

        public Criteria andUsermailIsNotNull() {
            addCriterion("usermail is not null");
            return (Criteria) this;
        }

        public Criteria andUsermailEqualTo(String value) {
            addCriterion("usermail =", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotEqualTo(String value) {
            addCriterion("usermail <>", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailGreaterThan(String value) {
            addCriterion("usermail >", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailGreaterThanOrEqualTo(String value) {
            addCriterion("usermail >=", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailLessThan(String value) {
            addCriterion("usermail <", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailLessThanOrEqualTo(String value) {
            addCriterion("usermail <=", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailLike(String value) {
            addCriterion("usermail like", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotLike(String value) {
            addCriterion("usermail not like", value, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailIn(List<String> values) {
            addCriterion("usermail in", values, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotIn(List<String> values) {
            addCriterion("usermail not in", values, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailBetween(String value1, String value2) {
            addCriterion("usermail between", value1, value2, "usermail");
            return (Criteria) this;
        }

        public Criteria andUsermailNotBetween(String value1, String value2) {
            addCriterion("usermail not between", value1, value2, "usermail");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceIsNull() {
            addCriterion("userqqface is null");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceIsNotNull() {
            addCriterion("userqqface is not null");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceEqualTo(String value) {
            addCriterion("userqqface =", value, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceNotEqualTo(String value) {
            addCriterion("userqqface <>", value, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceGreaterThan(String value) {
            addCriterion("userqqface >", value, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceGreaterThanOrEqualTo(String value) {
            addCriterion("userqqface >=", value, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceLessThan(String value) {
            addCriterion("userqqface <", value, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceLessThanOrEqualTo(String value) {
            addCriterion("userqqface <=", value, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceLike(String value) {
            addCriterion("userqqface like", value, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceNotLike(String value) {
            addCriterion("userqqface not like", value, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceIn(List<String> values) {
            addCriterion("userqqface in", values, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceNotIn(List<String> values) {
            addCriterion("userqqface not in", values, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceBetween(String value1, String value2) {
            addCriterion("userqqface between", value1, value2, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceNotBetween(String value1, String value2) {
            addCriterion("userqqface not between", value1, value2, "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserflagIsNull() {
            addCriterion("userflag is null");
            return (Criteria) this;
        }

        public Criteria andUserflagIsNotNull() {
            addCriterion("userflag is not null");
            return (Criteria) this;
        }

        public Criteria andUserflagEqualTo(String value) {
            addCriterion("userflag =", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotEqualTo(String value) {
            addCriterion("userflag <>", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagGreaterThan(String value) {
            addCriterion("userflag >", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagGreaterThanOrEqualTo(String value) {
            addCriterion("userflag >=", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagLessThan(String value) {
            addCriterion("userflag <", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagLessThanOrEqualTo(String value) {
            addCriterion("userflag <=", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagLike(String value) {
            addCriterion("userflag like", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotLike(String value) {
            addCriterion("userflag not like", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagIn(List<String> values) {
            addCriterion("userflag in", values, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotIn(List<String> values) {
            addCriterion("userflag not in", values, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagBetween(String value1, String value2) {
            addCriterion("userflag between", value1, value2, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotBetween(String value1, String value2) {
            addCriterion("userflag not between", value1, value2, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserstyleIsNull() {
            addCriterion("userstyle is null");
            return (Criteria) this;
        }

        public Criteria andUserstyleIsNotNull() {
            addCriterion("userstyle is not null");
            return (Criteria) this;
        }

        public Criteria andUserstyleEqualTo(String value) {
            addCriterion("userstyle =", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotEqualTo(String value) {
            addCriterion("userstyle <>", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleGreaterThan(String value) {
            addCriterion("userstyle >", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleGreaterThanOrEqualTo(String value) {
            addCriterion("userstyle >=", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleLessThan(String value) {
            addCriterion("userstyle <", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleLessThanOrEqualTo(String value) {
            addCriterion("userstyle <=", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleLike(String value) {
            addCriterion("userstyle like", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotLike(String value) {
            addCriterion("userstyle not like", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleIn(List<String> values) {
            addCriterion("userstyle in", values, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotIn(List<String> values) {
            addCriterion("userstyle not in", values, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleBetween(String value1, String value2) {
            addCriterion("userstyle between", value1, value2, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotBetween(String value1, String value2) {
            addCriterion("userstyle not between", value1, value2, "userstyle");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andUserpassLikeInsensitive(String value) {
            addCriterion("upper(userpass) like", value.toUpperCase(), "userpass");
            return (Criteria) this;
        }

        public Criteria andUserphoneLikeInsensitive(String value) {
            addCriterion("upper(userphone) like", value.toUpperCase(), "userphone");
            return (Criteria) this;
        }

        public Criteria andUsermailLikeInsensitive(String value) {
            addCriterion("upper(usermail) like", value.toUpperCase(), "usermail");
            return (Criteria) this;
        }

        public Criteria andUserqqfaceLikeInsensitive(String value) {
            addCriterion("upper(userqqface) like", value.toUpperCase(), "userqqface");
            return (Criteria) this;
        }

        public Criteria andUserflagLikeInsensitive(String value) {
            addCriterion("upper(userflag) like", value.toUpperCase(), "userflag");
            return (Criteria) this;
        }

        public Criteria andUserstyleLikeInsensitive(String value) {
            addCriterion("upper(userstyle) like", value.toUpperCase(), "userstyle");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sys_admin_info 2019-04-23
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