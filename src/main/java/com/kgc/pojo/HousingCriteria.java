package com.kgc.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HousingCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HousingCriteria() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNull() {
            addCriterion("community_id is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNotNull() {
            addCriterion("community_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdEqualTo(Integer value) {
            addCriterion("community_id =", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotEqualTo(Integer value) {
            addCriterion("community_id <>", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThan(Integer value) {
            addCriterion("community_id >", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("community_id >=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThan(Integer value) {
            addCriterion("community_id <", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThanOrEqualTo(Integer value) {
            addCriterion("community_id <=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIn(List<Integer> values) {
            addCriterion("community_id in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotIn(List<Integer> values) {
            addCriterion("community_id not in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdBetween(Integer value1, Integer value2) {
            addCriterion("community_id between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("community_id not between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdIsNull() {
            addCriterion("buildings_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdIsNotNull() {
            addCriterion("buildings_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdEqualTo(Integer value) {
            addCriterion("buildings_id =", value, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdNotEqualTo(Integer value) {
            addCriterion("buildings_id <>", value, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdGreaterThan(Integer value) {
            addCriterion("buildings_id >", value, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buildings_id >=", value, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdLessThan(Integer value) {
            addCriterion("buildings_id <", value, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdLessThanOrEqualTo(Integer value) {
            addCriterion("buildings_id <=", value, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdIn(List<Integer> values) {
            addCriterion("buildings_id in", values, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdNotIn(List<Integer> values) {
            addCriterion("buildings_id not in", values, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdBetween(Integer value1, Integer value2) {
            addCriterion("buildings_id between", value1, value2, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andBuildingsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buildings_id not between", value1, value2, "buildingsId");
            return (Criteria) this;
        }

        public Criteria andExpectRentIsNull() {
            addCriterion("expect_rent is null");
            return (Criteria) this;
        }

        public Criteria andExpectRentIsNotNull() {
            addCriterion("expect_rent is not null");
            return (Criteria) this;
        }

        public Criteria andExpectRentEqualTo(BigDecimal value) {
            addCriterion("expect_rent =", value, "expectRent");
            return (Criteria) this;
        }

        public Criteria andExpectRentNotEqualTo(BigDecimal value) {
            addCriterion("expect_rent <>", value, "expectRent");
            return (Criteria) this;
        }

        public Criteria andExpectRentGreaterThan(BigDecimal value) {
            addCriterion("expect_rent >", value, "expectRent");
            return (Criteria) this;
        }

        public Criteria andExpectRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_rent >=", value, "expectRent");
            return (Criteria) this;
        }

        public Criteria andExpectRentLessThan(BigDecimal value) {
            addCriterion("expect_rent <", value, "expectRent");
            return (Criteria) this;
        }

        public Criteria andExpectRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expect_rent <=", value, "expectRent");
            return (Criteria) this;
        }

        public Criteria andExpectRentIn(List<BigDecimal> values) {
            addCriterion("expect_rent in", values, "expectRent");
            return (Criteria) this;
        }

        public Criteria andExpectRentNotIn(List<BigDecimal> values) {
            addCriterion("expect_rent not in", values, "expectRent");
            return (Criteria) this;
        }

        public Criteria andExpectRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_rent between", value1, value2, "expectRent");
            return (Criteria) this;
        }

        public Criteria andExpectRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expect_rent not between", value1, value2, "expectRent");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNull() {
            addCriterion("rent_type is null");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNotNull() {
            addCriterion("rent_type is not null");
            return (Criteria) this;
        }

        public Criteria andRentTypeEqualTo(Byte value) {
            addCriterion("rent_type =", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotEqualTo(Byte value) {
            addCriterion("rent_type <>", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThan(Byte value) {
            addCriterion("rent_type >", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("rent_type >=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThan(Byte value) {
            addCriterion("rent_type <", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("rent_type <=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeIn(List<Byte> values) {
            addCriterion("rent_type in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotIn(List<Byte> values) {
            addCriterion("rent_type not in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeBetween(Byte value1, Byte value2) {
            addCriterion("rent_type between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("rent_type not between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andCheckStateIsNull() {
            addCriterion("check_state is null");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNotNull() {
            addCriterion("check_state is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStateEqualTo(Byte value) {
            addCriterion("check_state =", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotEqualTo(Byte value) {
            addCriterion("check_state <>", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThan(Byte value) {
            addCriterion("check_state >", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_state >=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThan(Byte value) {
            addCriterion("check_state <", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThanOrEqualTo(Byte value) {
            addCriterion("check_state <=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateIn(List<Byte> values) {
            addCriterion("check_state in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotIn(List<Byte> values) {
            addCriterion("check_state not in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateBetween(Byte value1, Byte value2) {
            addCriterion("check_state between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotBetween(Byte value1, Byte value2) {
            addCriterion("check_state not between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNull() {
            addCriterion("check_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNotNull() {
            addCriterion("check_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdEqualTo(Integer value) {
            addCriterion("check_user_id =", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotEqualTo(Integer value) {
            addCriterion("check_user_id <>", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThan(Integer value) {
            addCriterion("check_user_id >", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_user_id >=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThan(Integer value) {
            addCriterion("check_user_id <", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("check_user_id <=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIn(List<Integer> values) {
            addCriterion("check_user_id in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotIn(List<Integer> values) {
            addCriterion("check_user_id not in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdBetween(Integer value1, Integer value2) {
            addCriterion("check_user_id between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("check_user_id not between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdIsNull() {
            addCriterion("house_type_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdIsNotNull() {
            addCriterion("house_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdEqualTo(Integer value) {
            addCriterion("house_type_id =", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdNotEqualTo(Integer value) {
            addCriterion("house_type_id <>", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdGreaterThan(Integer value) {
            addCriterion("house_type_id >", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_type_id >=", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdLessThan(Integer value) {
            addCriterion("house_type_id <", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_type_id <=", value, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdIn(List<Integer> values) {
            addCriterion("house_type_id in", values, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdNotIn(List<Integer> values) {
            addCriterion("house_type_id not in", values, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("house_type_id between", value1, value2, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_type_id not between", value1, value2, "houseTypeId");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNull() {
            addCriterion("orientation is null");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNotNull() {
            addCriterion("orientation is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationEqualTo(String value) {
            addCriterion("orientation =", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotEqualTo(String value) {
            addCriterion("orientation <>", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThan(String value) {
            addCriterion("orientation >", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("orientation >=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThan(String value) {
            addCriterion("orientation <", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThanOrEqualTo(String value) {
            addCriterion("orientation <=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLike(String value) {
            addCriterion("orientation like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotLike(String value) {
            addCriterion("orientation not like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationIn(List<String> values) {
            addCriterion("orientation in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotIn(List<String> values) {
            addCriterion("orientation not in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationBetween(String value1, String value2) {
            addCriterion("orientation between", value1, value2, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotBetween(String value1, String value2) {
            addCriterion("orientation not between", value1, value2, "orientation");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNull() {
            addCriterion("check_in is null");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNotNull() {
            addCriterion("check_in is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInEqualTo(String value) {
            addCriterion("check_in =", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotEqualTo(String value) {
            addCriterion("check_in <>", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThan(String value) {
            addCriterion("check_in >", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThanOrEqualTo(String value) {
            addCriterion("check_in >=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThan(String value) {
            addCriterion("check_in <", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThanOrEqualTo(String value) {
            addCriterion("check_in <=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLike(String value) {
            addCriterion("check_in like", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotLike(String value) {
            addCriterion("check_in not like", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInIn(List<String> values) {
            addCriterion("check_in in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotIn(List<String> values) {
            addCriterion("check_in not in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInBetween(String value1, String value2) {
            addCriterion("check_in between", value1, value2, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotBetween(String value1, String value2) {
            addCriterion("check_in not between", value1, value2, "checkIn");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(String value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("floor like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("floor not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNull() {
            addCriterion("elevator is null");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNotNull() {
            addCriterion("elevator is not null");
            return (Criteria) this;
        }

        public Criteria andElevatorEqualTo(Byte value) {
            addCriterion("elevator =", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotEqualTo(Byte value) {
            addCriterion("elevator <>", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThan(Byte value) {
            addCriterion("elevator >", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThanOrEqualTo(Byte value) {
            addCriterion("elevator >=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThan(Byte value) {
            addCriterion("elevator <", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThanOrEqualTo(Byte value) {
            addCriterion("elevator <=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorIn(List<Byte> values) {
            addCriterion("elevator in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotIn(List<Byte> values) {
            addCriterion("elevator not in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorBetween(Byte value1, Byte value2) {
            addCriterion("elevator between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotBetween(Byte value1, Byte value2) {
            addCriterion("elevator not between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andStallIsNull() {
            addCriterion("stall is null");
            return (Criteria) this;
        }

        public Criteria andStallIsNotNull() {
            addCriterion("stall is not null");
            return (Criteria) this;
        }

        public Criteria andStallEqualTo(String value) {
            addCriterion("stall =", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallNotEqualTo(String value) {
            addCriterion("stall <>", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallGreaterThan(String value) {
            addCriterion("stall >", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallGreaterThanOrEqualTo(String value) {
            addCriterion("stall >=", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallLessThan(String value) {
            addCriterion("stall <", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallLessThanOrEqualTo(String value) {
            addCriterion("stall <=", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallLike(String value) {
            addCriterion("stall like", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallNotLike(String value) {
            addCriterion("stall not like", value, "stall");
            return (Criteria) this;
        }

        public Criteria andStallIn(List<String> values) {
            addCriterion("stall in", values, "stall");
            return (Criteria) this;
        }

        public Criteria andStallNotIn(List<String> values) {
            addCriterion("stall not in", values, "stall");
            return (Criteria) this;
        }

        public Criteria andStallBetween(String value1, String value2) {
            addCriterion("stall between", value1, value2, "stall");
            return (Criteria) this;
        }

        public Criteria andStallNotBetween(String value1, String value2) {
            addCriterion("stall not between", value1, value2, "stall");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIsNull() {
            addCriterion("water_type is null");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIsNotNull() {
            addCriterion("water_type is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTypeEqualTo(Byte value) {
            addCriterion("water_type =", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeNotEqualTo(Byte value) {
            addCriterion("water_type <>", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeGreaterThan(Byte value) {
            addCriterion("water_type >", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("water_type >=", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeLessThan(Byte value) {
            addCriterion("water_type <", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeLessThanOrEqualTo(Byte value) {
            addCriterion("water_type <=", value, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIn(List<Byte> values) {
            addCriterion("water_type in", values, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeNotIn(List<Byte> values) {
            addCriterion("water_type not in", values, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeBetween(Byte value1, Byte value2) {
            addCriterion("water_type between", value1, value2, "waterType");
            return (Criteria) this;
        }

        public Criteria andWaterTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("water_type not between", value1, value2, "waterType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeIsNull() {
            addCriterion("electricity_type is null");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeIsNotNull() {
            addCriterion("electricity_type is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeEqualTo(Byte value) {
            addCriterion("electricity_type =", value, "electricityType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeNotEqualTo(Byte value) {
            addCriterion("electricity_type <>", value, "electricityType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeGreaterThan(Byte value) {
            addCriterion("electricity_type >", value, "electricityType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("electricity_type >=", value, "electricityType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeLessThan(Byte value) {
            addCriterion("electricity_type <", value, "electricityType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeLessThanOrEqualTo(Byte value) {
            addCriterion("electricity_type <=", value, "electricityType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeIn(List<Byte> values) {
            addCriterion("electricity_type in", values, "electricityType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeNotIn(List<Byte> values) {
            addCriterion("electricity_type not in", values, "electricityType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeBetween(Byte value1, Byte value2) {
            addCriterion("electricity_type between", value1, value2, "electricityType");
            return (Criteria) this;
        }

        public Criteria andElectricityTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("electricity_type not between", value1, value2, "electricityType");
            return (Criteria) this;
        }

        public Criteria andFuelGasIsNull() {
            addCriterion("fuel_gas is null");
            return (Criteria) this;
        }

        public Criteria andFuelGasIsNotNull() {
            addCriterion("fuel_gas is not null");
            return (Criteria) this;
        }

        public Criteria andFuelGasEqualTo(Byte value) {
            addCriterion("fuel_gas =", value, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andFuelGasNotEqualTo(Byte value) {
            addCriterion("fuel_gas <>", value, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andFuelGasGreaterThan(Byte value) {
            addCriterion("fuel_gas >", value, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andFuelGasGreaterThanOrEqualTo(Byte value) {
            addCriterion("fuel_gas >=", value, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andFuelGasLessThan(Byte value) {
            addCriterion("fuel_gas <", value, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andFuelGasLessThanOrEqualTo(Byte value) {
            addCriterion("fuel_gas <=", value, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andFuelGasIn(List<Byte> values) {
            addCriterion("fuel_gas in", values, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andFuelGasNotIn(List<Byte> values) {
            addCriterion("fuel_gas not in", values, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andFuelGasBetween(Byte value1, Byte value2) {
            addCriterion("fuel_gas between", value1, value2, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andFuelGasNotBetween(Byte value1, Byte value2) {
            addCriterion("fuel_gas not between", value1, value2, "fuelGas");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeIsNull() {
            addCriterion("heating_type is null");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeIsNotNull() {
            addCriterion("heating_type is not null");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeEqualTo(String value) {
            addCriterion("heating_type =", value, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeNotEqualTo(String value) {
            addCriterion("heating_type <>", value, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeGreaterThan(String value) {
            addCriterion("heating_type >", value, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("heating_type >=", value, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeLessThan(String value) {
            addCriterion("heating_type <", value, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeLessThanOrEqualTo(String value) {
            addCriterion("heating_type <=", value, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeLike(String value) {
            addCriterion("heating_type like", value, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeNotLike(String value) {
            addCriterion("heating_type not like", value, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeIn(List<String> values) {
            addCriterion("heating_type in", values, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeNotIn(List<String> values) {
            addCriterion("heating_type not in", values, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeBetween(String value1, String value2) {
            addCriterion("heating_type between", value1, value2, "heatingType");
            return (Criteria) this;
        }

        public Criteria andHeatingTypeNotBetween(String value1, String value2) {
            addCriterion("heating_type not between", value1, value2, "heatingType");
            return (Criteria) this;
        }

        public Criteria andTenancyTermIsNull() {
            addCriterion("tenancy_term is null");
            return (Criteria) this;
        }

        public Criteria andTenancyTermIsNotNull() {
            addCriterion("tenancy_term is not null");
            return (Criteria) this;
        }

        public Criteria andTenancyTermEqualTo(String value) {
            addCriterion("tenancy_term =", value, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermNotEqualTo(String value) {
            addCriterion("tenancy_term <>", value, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermGreaterThan(String value) {
            addCriterion("tenancy_term >", value, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermGreaterThanOrEqualTo(String value) {
            addCriterion("tenancy_term >=", value, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermLessThan(String value) {
            addCriterion("tenancy_term <", value, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermLessThanOrEqualTo(String value) {
            addCriterion("tenancy_term <=", value, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermLike(String value) {
            addCriterion("tenancy_term like", value, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermNotLike(String value) {
            addCriterion("tenancy_term not like", value, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermIn(List<String> values) {
            addCriterion("tenancy_term in", values, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermNotIn(List<String> values) {
            addCriterion("tenancy_term not in", values, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermBetween(String value1, String value2) {
            addCriterion("tenancy_term between", value1, value2, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andTenancyTermNotBetween(String value1, String value2) {
            addCriterion("tenancy_term not between", value1, value2, "tenancyTerm");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentIsNull() {
            addCriterion("see_apartment is null");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentIsNotNull() {
            addCriterion("see_apartment is not null");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentEqualTo(String value) {
            addCriterion("see_apartment =", value, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentNotEqualTo(String value) {
            addCriterion("see_apartment <>", value, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentGreaterThan(String value) {
            addCriterion("see_apartment >", value, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentGreaterThanOrEqualTo(String value) {
            addCriterion("see_apartment >=", value, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentLessThan(String value) {
            addCriterion("see_apartment <", value, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentLessThanOrEqualTo(String value) {
            addCriterion("see_apartment <=", value, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentLike(String value) {
            addCriterion("see_apartment like", value, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentNotLike(String value) {
            addCriterion("see_apartment not like", value, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentIn(List<String> values) {
            addCriterion("see_apartment in", values, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentNotIn(List<String> values) {
            addCriterion("see_apartment not in", values, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentBetween(String value1, String value2) {
            addCriterion("see_apartment between", value1, value2, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andSeeApartmentNotBetween(String value1, String value2) {
            addCriterion("see_apartment not between", value1, value2, "seeApartment");
            return (Criteria) this;
        }

        public Criteria andTelevisionIsNull() {
            addCriterion("television is null");
            return (Criteria) this;
        }

        public Criteria andTelevisionIsNotNull() {
            addCriterion("television is not null");
            return (Criteria) this;
        }

        public Criteria andTelevisionEqualTo(Byte value) {
            addCriterion("television =", value, "television");
            return (Criteria) this;
        }

        public Criteria andTelevisionNotEqualTo(Byte value) {
            addCriterion("television <>", value, "television");
            return (Criteria) this;
        }

        public Criteria andTelevisionGreaterThan(Byte value) {
            addCriterion("television >", value, "television");
            return (Criteria) this;
        }

        public Criteria andTelevisionGreaterThanOrEqualTo(Byte value) {
            addCriterion("television >=", value, "television");
            return (Criteria) this;
        }

        public Criteria andTelevisionLessThan(Byte value) {
            addCriterion("television <", value, "television");
            return (Criteria) this;
        }

        public Criteria andTelevisionLessThanOrEqualTo(Byte value) {
            addCriterion("television <=", value, "television");
            return (Criteria) this;
        }

        public Criteria andTelevisionIn(List<Byte> values) {
            addCriterion("television in", values, "television");
            return (Criteria) this;
        }

        public Criteria andTelevisionNotIn(List<Byte> values) {
            addCriterion("television not in", values, "television");
            return (Criteria) this;
        }

        public Criteria andTelevisionBetween(Byte value1, Byte value2) {
            addCriterion("television between", value1, value2, "television");
            return (Criteria) this;
        }

        public Criteria andTelevisionNotBetween(Byte value1, Byte value2) {
            addCriterion("television not between", value1, value2, "television");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorIsNull() {
            addCriterion("refrigerator is null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorIsNotNull() {
            addCriterion("refrigerator is not null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorEqualTo(Byte value) {
            addCriterion("refrigerator =", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorNotEqualTo(Byte value) {
            addCriterion("refrigerator <>", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorGreaterThan(Byte value) {
            addCriterion("refrigerator >", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorGreaterThanOrEqualTo(Byte value) {
            addCriterion("refrigerator >=", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorLessThan(Byte value) {
            addCriterion("refrigerator <", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorLessThanOrEqualTo(Byte value) {
            addCriterion("refrigerator <=", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorIn(List<Byte> values) {
            addCriterion("refrigerator in", values, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorNotIn(List<Byte> values) {
            addCriterion("refrigerator not in", values, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorBetween(Byte value1, Byte value2) {
            addCriterion("refrigerator between", value1, value2, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorNotBetween(Byte value1, Byte value2) {
            addCriterion("refrigerator not between", value1, value2, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andWashingMachineIsNull() {
            addCriterion("washing_machine is null");
            return (Criteria) this;
        }

        public Criteria andWashingMachineIsNotNull() {
            addCriterion("washing_machine is not null");
            return (Criteria) this;
        }

        public Criteria andWashingMachineEqualTo(Byte value) {
            addCriterion("washing_machine =", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineNotEqualTo(Byte value) {
            addCriterion("washing_machine <>", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineGreaterThan(Byte value) {
            addCriterion("washing_machine >", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineGreaterThanOrEqualTo(Byte value) {
            addCriterion("washing_machine >=", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineLessThan(Byte value) {
            addCriterion("washing_machine <", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineLessThanOrEqualTo(Byte value) {
            addCriterion("washing_machine <=", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineIn(List<Byte> values) {
            addCriterion("washing_machine in", values, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineNotIn(List<Byte> values) {
            addCriterion("washing_machine not in", values, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineBetween(Byte value1, Byte value2) {
            addCriterion("washing_machine between", value1, value2, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineNotBetween(Byte value1, Byte value2) {
            addCriterion("washing_machine not between", value1, value2, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andAirConditionerIsNull() {
            addCriterion("air_conditioner is null");
            return (Criteria) this;
        }

        public Criteria andAirConditionerIsNotNull() {
            addCriterion("air_conditioner is not null");
            return (Criteria) this;
        }

        public Criteria andAirConditionerEqualTo(Byte value) {
            addCriterion("air_conditioner =", value, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andAirConditionerNotEqualTo(Byte value) {
            addCriterion("air_conditioner <>", value, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andAirConditionerGreaterThan(Byte value) {
            addCriterion("air_conditioner >", value, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andAirConditionerGreaterThanOrEqualTo(Byte value) {
            addCriterion("air_conditioner >=", value, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andAirConditionerLessThan(Byte value) {
            addCriterion("air_conditioner <", value, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andAirConditionerLessThanOrEqualTo(Byte value) {
            addCriterion("air_conditioner <=", value, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andAirConditionerIn(List<Byte> values) {
            addCriterion("air_conditioner in", values, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andAirConditionerNotIn(List<Byte> values) {
            addCriterion("air_conditioner not in", values, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andAirConditionerBetween(Byte value1, Byte value2) {
            addCriterion("air_conditioner between", value1, value2, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andAirConditionerNotBetween(Byte value1, Byte value2) {
            addCriterion("air_conditioner not between", value1, value2, "airConditioner");
            return (Criteria) this;
        }

        public Criteria andCalorifierIsNull() {
            addCriterion("calorifier is null");
            return (Criteria) this;
        }

        public Criteria andCalorifierIsNotNull() {
            addCriterion("calorifier is not null");
            return (Criteria) this;
        }

        public Criteria andCalorifierEqualTo(Byte value) {
            addCriterion("calorifier =", value, "calorifier");
            return (Criteria) this;
        }

        public Criteria andCalorifierNotEqualTo(Byte value) {
            addCriterion("calorifier <>", value, "calorifier");
            return (Criteria) this;
        }

        public Criteria andCalorifierGreaterThan(Byte value) {
            addCriterion("calorifier >", value, "calorifier");
            return (Criteria) this;
        }

        public Criteria andCalorifierGreaterThanOrEqualTo(Byte value) {
            addCriterion("calorifier >=", value, "calorifier");
            return (Criteria) this;
        }

        public Criteria andCalorifierLessThan(Byte value) {
            addCriterion("calorifier <", value, "calorifier");
            return (Criteria) this;
        }

        public Criteria andCalorifierLessThanOrEqualTo(Byte value) {
            addCriterion("calorifier <=", value, "calorifier");
            return (Criteria) this;
        }

        public Criteria andCalorifierIn(List<Byte> values) {
            addCriterion("calorifier in", values, "calorifier");
            return (Criteria) this;
        }

        public Criteria andCalorifierNotIn(List<Byte> values) {
            addCriterion("calorifier not in", values, "calorifier");
            return (Criteria) this;
        }

        public Criteria andCalorifierBetween(Byte value1, Byte value2) {
            addCriterion("calorifier between", value1, value2, "calorifier");
            return (Criteria) this;
        }

        public Criteria andCalorifierNotBetween(Byte value1, Byte value2) {
            addCriterion("calorifier not between", value1, value2, "calorifier");
            return (Criteria) this;
        }

        public Criteria andBedIsNull() {
            addCriterion("bed is null");
            return (Criteria) this;
        }

        public Criteria andBedIsNotNull() {
            addCriterion("bed is not null");
            return (Criteria) this;
        }

        public Criteria andBedEqualTo(Byte value) {
            addCriterion("bed =", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotEqualTo(Byte value) {
            addCriterion("bed <>", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThan(Byte value) {
            addCriterion("bed >", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThanOrEqualTo(Byte value) {
            addCriterion("bed >=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThan(Byte value) {
            addCriterion("bed <", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThanOrEqualTo(Byte value) {
            addCriterion("bed <=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedIn(List<Byte> values) {
            addCriterion("bed in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotIn(List<Byte> values) {
            addCriterion("bed not in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedBetween(Byte value1, Byte value2) {
            addCriterion("bed between", value1, value2, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotBetween(Byte value1, Byte value2) {
            addCriterion("bed not between", value1, value2, "bed");
            return (Criteria) this;
        }

        public Criteria andHeatingIsNull() {
            addCriterion("heating is null");
            return (Criteria) this;
        }

        public Criteria andHeatingIsNotNull() {
            addCriterion("heating is not null");
            return (Criteria) this;
        }

        public Criteria andHeatingEqualTo(Byte value) {
            addCriterion("heating =", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotEqualTo(Byte value) {
            addCriterion("heating <>", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThan(Byte value) {
            addCriterion("heating >", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThanOrEqualTo(Byte value) {
            addCriterion("heating >=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThan(Byte value) {
            addCriterion("heating <", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThanOrEqualTo(Byte value) {
            addCriterion("heating <=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingIn(List<Byte> values) {
            addCriterion("heating in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotIn(List<Byte> values) {
            addCriterion("heating not in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingBetween(Byte value1, Byte value2) {
            addCriterion("heating between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotBetween(Byte value1, Byte value2) {
            addCriterion("heating not between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("pay_method like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("pay_method not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(String value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(String value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(String value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(String value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(String value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(String value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLike(String value) {
            addCriterion("deposit like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotLike(String value) {
            addCriterion("deposit not like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<String> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<String> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(String value1, String value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(String value1, String value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(String value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(String value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(String value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(String value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(String value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(String value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLike(String value) {
            addCriterion("service_charge like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotLike(String value) {
            addCriterion("service_charge not like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<String> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<String> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(String value1, String value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(String value1, String value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeIsNull() {
            addCriterion("agency_fee is null");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeIsNotNull() {
            addCriterion("agency_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeEqualTo(String value) {
            addCriterion("agency_fee =", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeNotEqualTo(String value) {
            addCriterion("agency_fee <>", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeGreaterThan(String value) {
            addCriterion("agency_fee >", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeGreaterThanOrEqualTo(String value) {
            addCriterion("agency_fee >=", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeLessThan(String value) {
            addCriterion("agency_fee <", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeLessThanOrEqualTo(String value) {
            addCriterion("agency_fee <=", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeLike(String value) {
            addCriterion("agency_fee like", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeNotLike(String value) {
            addCriterion("agency_fee not like", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeIn(List<String> values) {
            addCriterion("agency_fee in", values, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeNotIn(List<String> values) {
            addCriterion("agency_fee not in", values, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeBetween(String value1, String value2) {
            addCriterion("agency_fee between", value1, value2, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeNotBetween(String value1, String value2) {
            addCriterion("agency_fee not between", value1, value2, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeIsNull() {
            addCriterion("maintain_time is null");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeIsNotNull() {
            addCriterion("maintain_time is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeEqualTo(Date value) {
            addCriterion("maintain_time =", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotEqualTo(Date value) {
            addCriterion("maintain_time <>", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeGreaterThan(Date value) {
            addCriterion("maintain_time >", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("maintain_time >=", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeLessThan(Date value) {
            addCriterion("maintain_time <", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeLessThanOrEqualTo(Date value) {
            addCriterion("maintain_time <=", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeIn(List<Date> values) {
            addCriterion("maintain_time in", values, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotIn(List<Date> values) {
            addCriterion("maintain_time not in", values, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeBetween(Date value1, Date value2) {
            addCriterion("maintain_time between", value1, value2, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotBetween(Date value1, Date value2) {
            addCriterion("maintain_time not between", value1, value2, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdIsNull() {
            addCriterion("maintain_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdIsNotNull() {
            addCriterion("maintain_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdEqualTo(Integer value) {
            addCriterion("maintain_agent_id =", value, "maintainAgentId");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdNotEqualTo(Integer value) {
            addCriterion("maintain_agent_id <>", value, "maintainAgentId");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdGreaterThan(Integer value) {
            addCriterion("maintain_agent_id >", value, "maintainAgentId");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintain_agent_id >=", value, "maintainAgentId");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdLessThan(Integer value) {
            addCriterion("maintain_agent_id <", value, "maintainAgentId");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("maintain_agent_id <=", value, "maintainAgentId");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdIn(List<Integer> values) {
            addCriterion("maintain_agent_id in", values, "maintainAgentId");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdNotIn(List<Integer> values) {
            addCriterion("maintain_agent_id not in", values, "maintainAgentId");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("maintain_agent_id between", value1, value2, "maintainAgentId");
            return (Criteria) this;
        }

        public Criteria andMaintainAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("maintain_agent_id not between", value1, value2, "maintainAgentId");
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