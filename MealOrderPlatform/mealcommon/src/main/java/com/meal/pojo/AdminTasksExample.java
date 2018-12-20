package com.meal.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminTasksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminTasksExample() {
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

        public Criteria andTaskkindIsNull() {
            addCriterion("taskKind is null");
            return (Criteria) this;
        }

        public Criteria andTaskkindIsNotNull() {
            addCriterion("taskKind is not null");
            return (Criteria) this;
        }

        public Criteria andTaskkindEqualTo(Integer value) {
            addCriterion("taskKind =", value, "taskkind");
            return (Criteria) this;
        }

        public Criteria andTaskkindNotEqualTo(Integer value) {
            addCriterion("taskKind <>", value, "taskkind");
            return (Criteria) this;
        }

        public Criteria andTaskkindGreaterThan(Integer value) {
            addCriterion("taskKind >", value, "taskkind");
            return (Criteria) this;
        }

        public Criteria andTaskkindGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskKind >=", value, "taskkind");
            return (Criteria) this;
        }

        public Criteria andTaskkindLessThan(Integer value) {
            addCriterion("taskKind <", value, "taskkind");
            return (Criteria) this;
        }

        public Criteria andTaskkindLessThanOrEqualTo(Integer value) {
            addCriterion("taskKind <=", value, "taskkind");
            return (Criteria) this;
        }

        public Criteria andTaskkindIn(List<Integer> values) {
            addCriterion("taskKind in", values, "taskkind");
            return (Criteria) this;
        }

        public Criteria andTaskkindNotIn(List<Integer> values) {
            addCriterion("taskKind not in", values, "taskkind");
            return (Criteria) this;
        }

        public Criteria andTaskkindBetween(Integer value1, Integer value2) {
            addCriterion("taskKind between", value1, value2, "taskkind");
            return (Criteria) this;
        }

        public Criteria andTaskkindNotBetween(Integer value1, Integer value2) {
            addCriterion("taskKind not between", value1, value2, "taskkind");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNull() {
            addCriterion("objectId is null");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNotNull() {
            addCriterion("objectId is not null");
            return (Criteria) this;
        }

        public Criteria andObjectidEqualTo(String value) {
            addCriterion("objectId =", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotEqualTo(String value) {
            addCriterion("objectId <>", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThan(String value) {
            addCriterion("objectId >", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThanOrEqualTo(String value) {
            addCriterion("objectId >=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThan(String value) {
            addCriterion("objectId <", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThanOrEqualTo(String value) {
            addCriterion("objectId <=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLike(String value) {
            addCriterion("objectId like", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotLike(String value) {
            addCriterion("objectId not like", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidIn(List<String> values) {
            addCriterion("objectId in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotIn(List<String> values) {
            addCriterion("objectId not in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidBetween(String value1, String value2) {
            addCriterion("objectId between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotBetween(String value1, String value2) {
            addCriterion("objectId not between", value1, value2, "objectid");
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

        public Criteria andTasktimeIsNull() {
            addCriterion("tasktime is null");
            return (Criteria) this;
        }

        public Criteria andTasktimeIsNotNull() {
            addCriterion("tasktime is not null");
            return (Criteria) this;
        }

        public Criteria andTasktimeEqualTo(Date value) {
            addCriterion("tasktime =", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotEqualTo(Date value) {
            addCriterion("tasktime <>", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeGreaterThan(Date value) {
            addCriterion("tasktime >", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tasktime >=", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeLessThan(Date value) {
            addCriterion("tasktime <", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeLessThanOrEqualTo(Date value) {
            addCriterion("tasktime <=", value, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeIn(List<Date> values) {
            addCriterion("tasktime in", values, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotIn(List<Date> values) {
            addCriterion("tasktime not in", values, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeBetween(Date value1, Date value2) {
            addCriterion("tasktime between", value1, value2, "tasktime");
            return (Criteria) this;
        }

        public Criteria andTasktimeNotBetween(Date value1, Date value2) {
            addCriterion("tasktime not between", value1, value2, "tasktime");
            return (Criteria) this;
        }

        public Criteria andDonetimeIsNull() {
            addCriterion("donetime is null");
            return (Criteria) this;
        }

        public Criteria andDonetimeIsNotNull() {
            addCriterion("donetime is not null");
            return (Criteria) this;
        }

        public Criteria andDonetimeEqualTo(Date value) {
            addCriterion("donetime =", value, "donetime");
            return (Criteria) this;
        }

        public Criteria andDonetimeNotEqualTo(Date value) {
            addCriterion("donetime <>", value, "donetime");
            return (Criteria) this;
        }

        public Criteria andDonetimeGreaterThan(Date value) {
            addCriterion("donetime >", value, "donetime");
            return (Criteria) this;
        }

        public Criteria andDonetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("donetime >=", value, "donetime");
            return (Criteria) this;
        }

        public Criteria andDonetimeLessThan(Date value) {
            addCriterion("donetime <", value, "donetime");
            return (Criteria) this;
        }

        public Criteria andDonetimeLessThanOrEqualTo(Date value) {
            addCriterion("donetime <=", value, "donetime");
            return (Criteria) this;
        }

        public Criteria andDonetimeIn(List<Date> values) {
            addCriterion("donetime in", values, "donetime");
            return (Criteria) this;
        }

        public Criteria andDonetimeNotIn(List<Date> values) {
            addCriterion("donetime not in", values, "donetime");
            return (Criteria) this;
        }

        public Criteria andDonetimeBetween(Date value1, Date value2) {
            addCriterion("donetime between", value1, value2, "donetime");
            return (Criteria) this;
        }

        public Criteria andDonetimeNotBetween(Date value1, Date value2) {
            addCriterion("donetime not between", value1, value2, "donetime");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(String value) {
            addCriterion("adminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(String value) {
            addCriterion("adminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(String value) {
            addCriterion("adminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("adminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(String value) {
            addCriterion("adminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(String value) {
            addCriterion("adminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLike(String value) {
            addCriterion("adminId like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotLike(String value) {
            addCriterion("adminId not like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<String> values) {
            addCriterion("adminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<String> values) {
            addCriterion("adminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(String value1, String value2) {
            addCriterion("adminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(String value1, String value2) {
            addCriterion("adminId not between", value1, value2, "adminid");
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