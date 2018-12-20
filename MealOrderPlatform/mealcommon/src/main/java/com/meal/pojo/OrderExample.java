package com.meal.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andSellernameIsNull() {
            addCriterion("sellerName is null");
            return (Criteria) this;
        }

        public Criteria andSellernameIsNotNull() {
            addCriterion("sellerName is not null");
            return (Criteria) this;
        }

        public Criteria andSellernameEqualTo(String value) {
            addCriterion("sellerName =", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotEqualTo(String value) {
            addCriterion("sellerName <>", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameGreaterThan(String value) {
            addCriterion("sellerName >", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameGreaterThanOrEqualTo(String value) {
            addCriterion("sellerName >=", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLessThan(String value) {
            addCriterion("sellerName <", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLessThanOrEqualTo(String value) {
            addCriterion("sellerName <=", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLike(String value) {
            addCriterion("sellerName like", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotLike(String value) {
            addCriterion("sellerName not like", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameIn(List<String> values) {
            addCriterion("sellerName in", values, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotIn(List<String> values) {
            addCriterion("sellerName not in", values, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameBetween(String value1, String value2) {
            addCriterion("sellerName between", value1, value2, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotBetween(String value1, String value2) {
            addCriterion("sellerName not between", value1, value2, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellerphoneIsNull() {
            addCriterion("sellerPhone is null");
            return (Criteria) this;
        }

        public Criteria andSellerphoneIsNotNull() {
            addCriterion("sellerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSellerphoneEqualTo(String value) {
            addCriterion("sellerPhone =", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneNotEqualTo(String value) {
            addCriterion("sellerPhone <>", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneGreaterThan(String value) {
            addCriterion("sellerPhone >", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sellerPhone >=", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneLessThan(String value) {
            addCriterion("sellerPhone <", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneLessThanOrEqualTo(String value) {
            addCriterion("sellerPhone <=", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneLike(String value) {
            addCriterion("sellerPhone like", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneNotLike(String value) {
            addCriterion("sellerPhone not like", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneIn(List<String> values) {
            addCriterion("sellerPhone in", values, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneNotIn(List<String> values) {
            addCriterion("sellerPhone not in", values, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneBetween(String value1, String value2) {
            addCriterion("sellerPhone between", value1, value2, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneNotBetween(String value1, String value2) {
            addCriterion("sellerPhone not between", value1, value2, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andRideridIsNull() {
            addCriterion("riderID is null");
            return (Criteria) this;
        }

        public Criteria andRideridIsNotNull() {
            addCriterion("riderID is not null");
            return (Criteria) this;
        }

        public Criteria andRideridEqualTo(String value) {
            addCriterion("riderID =", value, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridNotEqualTo(String value) {
            addCriterion("riderID <>", value, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridGreaterThan(String value) {
            addCriterion("riderID >", value, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridGreaterThanOrEqualTo(String value) {
            addCriterion("riderID >=", value, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridLessThan(String value) {
            addCriterion("riderID <", value, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridLessThanOrEqualTo(String value) {
            addCriterion("riderID <=", value, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridLike(String value) {
            addCriterion("riderID like", value, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridNotLike(String value) {
            addCriterion("riderID not like", value, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridIn(List<String> values) {
            addCriterion("riderID in", values, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridNotIn(List<String> values) {
            addCriterion("riderID not in", values, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridBetween(String value1, String value2) {
            addCriterion("riderID between", value1, value2, "riderid");
            return (Criteria) this;
        }

        public Criteria andRideridNotBetween(String value1, String value2) {
            addCriterion("riderID not between", value1, value2, "riderid");
            return (Criteria) this;
        }

        public Criteria andRiderphoneIsNull() {
            addCriterion("riderPhone is null");
            return (Criteria) this;
        }

        public Criteria andRiderphoneIsNotNull() {
            addCriterion("riderPhone is not null");
            return (Criteria) this;
        }

        public Criteria andRiderphoneEqualTo(String value) {
            addCriterion("riderPhone =", value, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneNotEqualTo(String value) {
            addCriterion("riderPhone <>", value, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneGreaterThan(String value) {
            addCriterion("riderPhone >", value, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneGreaterThanOrEqualTo(String value) {
            addCriterion("riderPhone >=", value, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneLessThan(String value) {
            addCriterion("riderPhone <", value, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneLessThanOrEqualTo(String value) {
            addCriterion("riderPhone <=", value, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneLike(String value) {
            addCriterion("riderPhone like", value, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneNotLike(String value) {
            addCriterion("riderPhone not like", value, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneIn(List<String> values) {
            addCriterion("riderPhone in", values, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneNotIn(List<String> values) {
            addCriterion("riderPhone not in", values, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneBetween(String value1, String value2) {
            addCriterion("riderPhone between", value1, value2, "riderphone");
            return (Criteria) this;
        }

        public Criteria andRiderphoneNotBetween(String value1, String value2) {
            addCriterion("riderPhone not between", value1, value2, "riderphone");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Float value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Float value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Float value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Float value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Float value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Float> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Float> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Float value1, Float value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Float value1, Float value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andSellersorceIsNull() {
            addCriterion("sellersorce is null");
            return (Criteria) this;
        }

        public Criteria andSellersorceIsNotNull() {
            addCriterion("sellersorce is not null");
            return (Criteria) this;
        }

        public Criteria andSellersorceEqualTo(Float value) {
            addCriterion("sellersorce =", value, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andSellersorceNotEqualTo(Float value) {
            addCriterion("sellersorce <>", value, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andSellersorceGreaterThan(Float value) {
            addCriterion("sellersorce >", value, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andSellersorceGreaterThanOrEqualTo(Float value) {
            addCriterion("sellersorce >=", value, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andSellersorceLessThan(Float value) {
            addCriterion("sellersorce <", value, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andSellersorceLessThanOrEqualTo(Float value) {
            addCriterion("sellersorce <=", value, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andSellersorceIn(List<Float> values) {
            addCriterion("sellersorce in", values, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andSellersorceNotIn(List<Float> values) {
            addCriterion("sellersorce not in", values, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andSellersorceBetween(Float value1, Float value2) {
            addCriterion("sellersorce between", value1, value2, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andSellersorceNotBetween(Float value1, Float value2) {
            addCriterion("sellersorce not between", value1, value2, "sellersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceIsNull() {
            addCriterion("ridersorce is null");
            return (Criteria) this;
        }

        public Criteria andRidersorceIsNotNull() {
            addCriterion("ridersorce is not null");
            return (Criteria) this;
        }

        public Criteria andRidersorceEqualTo(Float value) {
            addCriterion("ridersorce =", value, "ridersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceNotEqualTo(Float value) {
            addCriterion("ridersorce <>", value, "ridersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceGreaterThan(Float value) {
            addCriterion("ridersorce >", value, "ridersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceGreaterThanOrEqualTo(Float value) {
            addCriterion("ridersorce >=", value, "ridersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceLessThan(Float value) {
            addCriterion("ridersorce <", value, "ridersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceLessThanOrEqualTo(Float value) {
            addCriterion("ridersorce <=", value, "ridersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceIn(List<Float> values) {
            addCriterion("ridersorce in", values, "ridersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceNotIn(List<Float> values) {
            addCriterion("ridersorce not in", values, "ridersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceBetween(Float value1, Float value2) {
            addCriterion("ridersorce between", value1, value2, "ridersorce");
            return (Criteria) this;
        }

        public Criteria andRidersorceNotBetween(Float value1, Float value2) {
            addCriterion("ridersorce not between", value1, value2, "ridersorce");
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

        public Criteria andFoodscoreIsNull() {
            addCriterion("foodscore is null");
            return (Criteria) this;
        }

        public Criteria andFoodscoreIsNotNull() {
            addCriterion("foodscore is not null");
            return (Criteria) this;
        }

        public Criteria andFoodscoreEqualTo(Float value) {
            addCriterion("foodscore =", value, "foodscore");
            return (Criteria) this;
        }

        public Criteria andFoodscoreNotEqualTo(Float value) {
            addCriterion("foodscore <>", value, "foodscore");
            return (Criteria) this;
        }

        public Criteria andFoodscoreGreaterThan(Float value) {
            addCriterion("foodscore >", value, "foodscore");
            return (Criteria) this;
        }

        public Criteria andFoodscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("foodscore >=", value, "foodscore");
            return (Criteria) this;
        }

        public Criteria andFoodscoreLessThan(Float value) {
            addCriterion("foodscore <", value, "foodscore");
            return (Criteria) this;
        }

        public Criteria andFoodscoreLessThanOrEqualTo(Float value) {
            addCriterion("foodscore <=", value, "foodscore");
            return (Criteria) this;
        }

        public Criteria andFoodscoreIn(List<Float> values) {
            addCriterion("foodscore in", values, "foodscore");
            return (Criteria) this;
        }

        public Criteria andFoodscoreNotIn(List<Float> values) {
            addCriterion("foodscore not in", values, "foodscore");
            return (Criteria) this;
        }

        public Criteria andFoodscoreBetween(Float value1, Float value2) {
            addCriterion("foodscore between", value1, value2, "foodscore");
            return (Criteria) this;
        }

        public Criteria andFoodscoreNotBetween(Float value1, Float value2) {
            addCriterion("foodscore not between", value1, value2, "foodscore");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("ordertime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("ordertime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("ordertime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("ordertime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("ordertime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ordertime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("ordertime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("ordertime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("ordertime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("ordertime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("ordertime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("ordertime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andTaketimeIsNull() {
            addCriterion("taketime is null");
            return (Criteria) this;
        }

        public Criteria andTaketimeIsNotNull() {
            addCriterion("taketime is not null");
            return (Criteria) this;
        }

        public Criteria andTaketimeEqualTo(Date value) {
            addCriterion("taketime =", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeNotEqualTo(Date value) {
            addCriterion("taketime <>", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeGreaterThan(Date value) {
            addCriterion("taketime >", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeGreaterThanOrEqualTo(Date value) {
            addCriterion("taketime >=", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeLessThan(Date value) {
            addCriterion("taketime <", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeLessThanOrEqualTo(Date value) {
            addCriterion("taketime <=", value, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeIn(List<Date> values) {
            addCriterion("taketime in", values, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeNotIn(List<Date> values) {
            addCriterion("taketime not in", values, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeBetween(Date value1, Date value2) {
            addCriterion("taketime between", value1, value2, "taketime");
            return (Criteria) this;
        }

        public Criteria andTaketimeNotBetween(Date value1, Date value2) {
            addCriterion("taketime not between", value1, value2, "taketime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNull() {
            addCriterion("arrivetime is null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNotNull() {
            addCriterion("arrivetime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeEqualTo(Date value) {
            addCriterion("arrivetime =", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotEqualTo(Date value) {
            addCriterion("arrivetime <>", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThan(Date value) {
            addCriterion("arrivetime >", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrivetime >=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThan(Date value) {
            addCriterion("arrivetime <", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThanOrEqualTo(Date value) {
            addCriterion("arrivetime <=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIn(List<Date> values) {
            addCriterion("arrivetime in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotIn(List<Date> values) {
            addCriterion("arrivetime not in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeBetween(Date value1, Date value2) {
            addCriterion("arrivetime between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotBetween(Date value1, Date value2) {
            addCriterion("arrivetime not between", value1, value2, "arrivetime");
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