package com.meal.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminNewsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserkindIsNull() {
            addCriterion("userKind is null");
            return (Criteria) this;
        }

        public Criteria andUserkindIsNotNull() {
            addCriterion("userKind is not null");
            return (Criteria) this;
        }

        public Criteria andUserkindEqualTo(Integer value) {
            addCriterion("userKind =", value, "userkind");
            return (Criteria) this;
        }

        public Criteria andUserkindNotEqualTo(Integer value) {
            addCriterion("userKind <>", value, "userkind");
            return (Criteria) this;
        }

        public Criteria andUserkindGreaterThan(Integer value) {
            addCriterion("userKind >", value, "userkind");
            return (Criteria) this;
        }

        public Criteria andUserkindGreaterThanOrEqualTo(Integer value) {
            addCriterion("userKind >=", value, "userkind");
            return (Criteria) this;
        }

        public Criteria andUserkindLessThan(Integer value) {
            addCriterion("userKind <", value, "userkind");
            return (Criteria) this;
        }

        public Criteria andUserkindLessThanOrEqualTo(Integer value) {
            addCriterion("userKind <=", value, "userkind");
            return (Criteria) this;
        }

        public Criteria andUserkindIn(List<Integer> values) {
            addCriterion("userKind in", values, "userkind");
            return (Criteria) this;
        }

        public Criteria andUserkindNotIn(List<Integer> values) {
            addCriterion("userKind not in", values, "userkind");
            return (Criteria) this;
        }

        public Criteria andUserkindBetween(Integer value1, Integer value2) {
            addCriterion("userKind between", value1, value2, "userkind");
            return (Criteria) this;
        }

        public Criteria andUserkindNotBetween(Integer value1, Integer value2) {
            addCriterion("userKind not between", value1, value2, "userkind");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
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

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionobjectIsNull() {
            addCriterion("actionobject is null");
            return (Criteria) this;
        }

        public Criteria andActionobjectIsNotNull() {
            addCriterion("actionobject is not null");
            return (Criteria) this;
        }

        public Criteria andActionobjectEqualTo(String value) {
            addCriterion("actionobject =", value, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectNotEqualTo(String value) {
            addCriterion("actionobject <>", value, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectGreaterThan(String value) {
            addCriterion("actionobject >", value, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectGreaterThanOrEqualTo(String value) {
            addCriterion("actionobject >=", value, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectLessThan(String value) {
            addCriterion("actionobject <", value, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectLessThanOrEqualTo(String value) {
            addCriterion("actionobject <=", value, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectLike(String value) {
            addCriterion("actionobject like", value, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectNotLike(String value) {
            addCriterion("actionobject not like", value, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectIn(List<String> values) {
            addCriterion("actionobject in", values, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectNotIn(List<String> values) {
            addCriterion("actionobject not in", values, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectBetween(String value1, String value2) {
            addCriterion("actionobject between", value1, value2, "actionobject");
            return (Criteria) this;
        }

        public Criteria andActionobjectNotBetween(String value1, String value2) {
            addCriterion("actionobject not between", value1, value2, "actionobject");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNull() {
            addCriterion("newstime is null");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNotNull() {
            addCriterion("newstime is not null");
            return (Criteria) this;
        }

        public Criteria andNewstimeEqualTo(Date value) {
            addCriterion("newstime =", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotEqualTo(Date value) {
            addCriterion("newstime <>", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThan(Date value) {
            addCriterion("newstime >", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("newstime >=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThan(Date value) {
            addCriterion("newstime <", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThanOrEqualTo(Date value) {
            addCriterion("newstime <=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeIn(List<Date> values) {
            addCriterion("newstime in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotIn(List<Date> values) {
            addCriterion("newstime not in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeBetween(Date value1, Date value2) {
            addCriterion("newstime between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotBetween(Date value1, Date value2) {
            addCriterion("newstime not between", value1, value2, "newstime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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