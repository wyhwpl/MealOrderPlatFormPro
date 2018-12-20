package com.meal.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
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

        public Criteria andFoodnameIsNull() {
            addCriterion("foodname is null");
            return (Criteria) this;
        }

        public Criteria andFoodnameIsNotNull() {
            addCriterion("foodname is not null");
            return (Criteria) this;
        }

        public Criteria andFoodnameEqualTo(String value) {
            addCriterion("foodname =", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotEqualTo(String value) {
            addCriterion("foodname <>", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThan(String value) {
            addCriterion("foodname >", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("foodname >=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThan(String value) {
            addCriterion("foodname <", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThanOrEqualTo(String value) {
            addCriterion("foodname <=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLike(String value) {
            addCriterion("foodname like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotLike(String value) {
            addCriterion("foodname not like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameIn(List<String> values) {
            addCriterion("foodname in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotIn(List<String> values) {
            addCriterion("foodname not in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameBetween(String value1, String value2) {
            addCriterion("foodname between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotBetween(String value1, String value2) {
            addCriterion("foodname not between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andOriginPriceIsNull() {
            addCriterion("origin_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginPriceIsNotNull() {
            addCriterion("origin_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginPriceEqualTo(Float value) {
            addCriterion("origin_price =", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceNotEqualTo(Float value) {
            addCriterion("origin_price <>", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceGreaterThan(Float value) {
            addCriterion("origin_price >", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("origin_price >=", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceLessThan(Float value) {
            addCriterion("origin_price <", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceLessThanOrEqualTo(Float value) {
            addCriterion("origin_price <=", value, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceIn(List<Float> values) {
            addCriterion("origin_price in", values, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceNotIn(List<Float> values) {
            addCriterion("origin_price not in", values, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceBetween(Float value1, Float value2) {
            addCriterion("origin_price between", value1, value2, "originPrice");
            return (Criteria) this;
        }

        public Criteria andOriginPriceNotBetween(Float value1, Float value2) {
            addCriterion("origin_price not between", value1, value2, "originPrice");
            return (Criteria) this;
        }

        public Criteria andTagidIsNull() {
            addCriterion("tagID is null");
            return (Criteria) this;
        }

        public Criteria andTagidIsNotNull() {
            addCriterion("tagID is not null");
            return (Criteria) this;
        }

        public Criteria andTagidEqualTo(String value) {
            addCriterion("tagID =", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidNotEqualTo(String value) {
            addCriterion("tagID <>", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidGreaterThan(String value) {
            addCriterion("tagID >", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidGreaterThanOrEqualTo(String value) {
            addCriterion("tagID >=", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidLessThan(String value) {
            addCriterion("tagID <", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidLessThanOrEqualTo(String value) {
            addCriterion("tagID <=", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidLike(String value) {
            addCriterion("tagID like", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidNotLike(String value) {
            addCriterion("tagID not like", value, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidIn(List<String> values) {
            addCriterion("tagID in", values, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidNotIn(List<String> values) {
            addCriterion("tagID not in", values, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidBetween(String value1, String value2) {
            addCriterion("tagID between", value1, value2, "tagid");
            return (Criteria) this;
        }

        public Criteria andTagidNotBetween(String value1, String value2) {
            addCriterion("tagID not between", value1, value2, "tagid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNull() {
            addCriterion("sellerID is null");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNotNull() {
            addCriterion("sellerID is not null");
            return (Criteria) this;
        }

        public Criteria andSelleridEqualTo(String value) {
            addCriterion("sellerID =", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotEqualTo(String value) {
            addCriterion("sellerID <>", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThan(String value) {
            addCriterion("sellerID >", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThanOrEqualTo(String value) {
            addCriterion("sellerID >=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThan(String value) {
            addCriterion("sellerID <", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThanOrEqualTo(String value) {
            addCriterion("sellerID <=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLike(String value) {
            addCriterion("sellerID like", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotLike(String value) {
            addCriterion("sellerID not like", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridIn(List<String> values) {
            addCriterion("sellerID in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotIn(List<String> values) {
            addCriterion("sellerID not in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridBetween(String value1, String value2) {
            addCriterion("sellerID between", value1, value2, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotBetween(String value1, String value2) {
            addCriterion("sellerID not between", value1, value2, "sellerid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
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

        public Criteria andApplicationtimeIsNull() {
            addCriterion("applicationtime is null");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeIsNotNull() {
            addCriterion("applicationtime is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeEqualTo(Date value) {
            addCriterion("applicationtime =", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeNotEqualTo(Date value) {
            addCriterion("applicationtime <>", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeGreaterThan(Date value) {
            addCriterion("applicationtime >", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applicationtime >=", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeLessThan(Date value) {
            addCriterion("applicationtime <", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeLessThanOrEqualTo(Date value) {
            addCriterion("applicationtime <=", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeIn(List<Date> values) {
            addCriterion("applicationtime in", values, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeNotIn(List<Date> values) {
            addCriterion("applicationtime not in", values, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeBetween(Date value1, Date value2) {
            addCriterion("applicationtime between", value1, value2, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeNotBetween(Date value1, Date value2) {
            addCriterion("applicationtime not between", value1, value2, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeIsNull() {
            addCriterion("thoughtime is null");
            return (Criteria) this;
        }

        public Criteria andThoughtimeIsNotNull() {
            addCriterion("thoughtime is not null");
            return (Criteria) this;
        }

        public Criteria andThoughtimeEqualTo(Date value) {
            addCriterion("thoughtime =", value, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeNotEqualTo(Date value) {
            addCriterion("thoughtime <>", value, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeGreaterThan(Date value) {
            addCriterion("thoughtime >", value, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("thoughtime >=", value, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeLessThan(Date value) {
            addCriterion("thoughtime <", value, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeLessThanOrEqualTo(Date value) {
            addCriterion("thoughtime <=", value, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeIn(List<Date> values) {
            addCriterion("thoughtime in", values, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeNotIn(List<Date> values) {
            addCriterion("thoughtime not in", values, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeBetween(Date value1, Date value2) {
            addCriterion("thoughtime between", value1, value2, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andThoughtimeNotBetween(Date value1, Date value2) {
            addCriterion("thoughtime not between", value1, value2, "thoughtime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeIsNull() {
            addCriterion("undercarriagetime is null");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeIsNotNull() {
            addCriterion("undercarriagetime is not null");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeEqualTo(Date value) {
            addCriterion("undercarriagetime =", value, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeNotEqualTo(Date value) {
            addCriterion("undercarriagetime <>", value, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeGreaterThan(Date value) {
            addCriterion("undercarriagetime >", value, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("undercarriagetime >=", value, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeLessThan(Date value) {
            addCriterion("undercarriagetime <", value, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeLessThanOrEqualTo(Date value) {
            addCriterion("undercarriagetime <=", value, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeIn(List<Date> values) {
            addCriterion("undercarriagetime in", values, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeNotIn(List<Date> values) {
            addCriterion("undercarriagetime not in", values, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeBetween(Date value1, Date value2) {
            addCriterion("undercarriagetime between", value1, value2, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andUndercarriagetimeNotBetween(Date value1, Date value2) {
            addCriterion("undercarriagetime not between", value1, value2, "undercarriagetime");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_URL is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_URL =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_URL <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_URL >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_URL >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_URL <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_URL <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_URL like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_URL not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_URL in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_URL not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_URL between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_URL not between", value1, value2, "imgUrl");
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