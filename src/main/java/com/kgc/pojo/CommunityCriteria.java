package com.kgc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommunityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommunityCriteria() {
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

        public Criteria andCommunityNameIsNull() {
            addCriterion("community_name is null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIsNotNull() {
            addCriterion("community_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameEqualTo(String value) {
            addCriterion("community_name =", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotEqualTo(String value) {
            addCriterion("community_name <>", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThan(String value) {
            addCriterion("community_name >", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThanOrEqualTo(String value) {
            addCriterion("community_name >=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThan(String value) {
            addCriterion("community_name <", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThanOrEqualTo(String value) {
            addCriterion("community_name <=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLike(String value) {
            addCriterion("community_name like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotLike(String value) {
            addCriterion("community_name not like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIn(List<String> values) {
            addCriterion("community_name in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotIn(List<String> values) {
            addCriterion("community_name not in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameBetween(String value1, String value2) {
            addCriterion("community_name between", value1, value2, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotBetween(String value1, String value2) {
            addCriterion("community_name not between", value1, value2, "communityName");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creation_date is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterionForJDBCDate("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterionForJDBCDate("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterionForJDBCDate("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creation_date not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIsNull() {
            addCriterion("building_type is null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIsNotNull() {
            addCriterion("building_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeEqualTo(String value) {
            addCriterion("building_type =", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotEqualTo(String value) {
            addCriterion("building_type <>", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThan(String value) {
            addCriterion("building_type >", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("building_type >=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThan(String value) {
            addCriterion("building_type <", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLessThanOrEqualTo(String value) {
            addCriterion("building_type <=", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeLike(String value) {
            addCriterion("building_type like", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotLike(String value) {
            addCriterion("building_type not like", value, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeIn(List<String> values) {
            addCriterion("building_type in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotIn(List<String> values) {
            addCriterion("building_type not in", values, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeBetween(String value1, String value2) {
            addCriterion("building_type between", value1, value2, "buildingType");
            return (Criteria) this;
        }

        public Criteria andBuildingTypeNotBetween(String value1, String value2) {
            addCriterion("building_type not between", value1, value2, "buildingType");
            return (Criteria) this;
        }

        public Criteria andManagementFeeIsNull() {
            addCriterion("management_fee is null");
            return (Criteria) this;
        }

        public Criteria andManagementFeeIsNotNull() {
            addCriterion("management_fee is not null");
            return (Criteria) this;
        }

        public Criteria andManagementFeeEqualTo(Double value) {
            addCriterion("management_fee =", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotEqualTo(Double value) {
            addCriterion("management_fee <>", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeGreaterThan(Double value) {
            addCriterion("management_fee >", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("management_fee >=", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeLessThan(Double value) {
            addCriterion("management_fee <", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeLessThanOrEqualTo(Double value) {
            addCriterion("management_fee <=", value, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeIn(List<Double> values) {
            addCriterion("management_fee in", values, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotIn(List<Double> values) {
            addCriterion("management_fee not in", values, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeBetween(Double value1, Double value2) {
            addCriterion("management_fee between", value1, value2, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementFeeNotBetween(Double value1, Double value2) {
            addCriterion("management_fee not between", value1, value2, "managementFee");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyIsNull() {
            addCriterion("management_company is null");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyIsNotNull() {
            addCriterion("management_company is not null");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyEqualTo(String value) {
            addCriterion("management_company =", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyNotEqualTo(String value) {
            addCriterion("management_company <>", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyGreaterThan(String value) {
            addCriterion("management_company >", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("management_company >=", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyLessThan(String value) {
            addCriterion("management_company <", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyLessThanOrEqualTo(String value) {
            addCriterion("management_company <=", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyLike(String value) {
            addCriterion("management_company like", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyNotLike(String value) {
            addCriterion("management_company not like", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyIn(List<String> values) {
            addCriterion("management_company in", values, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyNotIn(List<String> values) {
            addCriterion("management_company not in", values, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyBetween(String value1, String value2) {
            addCriterion("management_company between", value1, value2, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andManagementCompanyNotBetween(String value1, String value2) {
            addCriterion("management_company not between", value1, value2, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andContactAgentIsNull() {
            addCriterion("contact_agent is null");
            return (Criteria) this;
        }

        public Criteria andContactAgentIsNotNull() {
            addCriterion("contact_agent is not null");
            return (Criteria) this;
        }

        public Criteria andContactAgentEqualTo(Integer value) {
            addCriterion("contact_agent =", value, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andContactAgentNotEqualTo(Integer value) {
            addCriterion("contact_agent <>", value, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andContactAgentGreaterThan(Integer value) {
            addCriterion("contact_agent >", value, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andContactAgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_agent >=", value, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andContactAgentLessThan(Integer value) {
            addCriterion("contact_agent <", value, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andContactAgentLessThanOrEqualTo(Integer value) {
            addCriterion("contact_agent <=", value, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andContactAgentIn(List<Integer> values) {
            addCriterion("contact_agent in", values, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andContactAgentNotIn(List<Integer> values) {
            addCriterion("contact_agent not in", values, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andContactAgentBetween(Integer value1, Integer value2) {
            addCriterion("contact_agent between", value1, value2, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andContactAgentNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_agent not between", value1, value2, "contactAgent");
            return (Criteria) this;
        }

        public Criteria andBuildingsIsNull() {
            addCriterion("buildings is null");
            return (Criteria) this;
        }

        public Criteria andBuildingsIsNotNull() {
            addCriterion("buildings is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingsEqualTo(Integer value) {
            addCriterion("buildings =", value, "buildings");
            return (Criteria) this;
        }

        public Criteria andBuildingsNotEqualTo(Integer value) {
            addCriterion("buildings <>", value, "buildings");
            return (Criteria) this;
        }

        public Criteria andBuildingsGreaterThan(Integer value) {
            addCriterion("buildings >", value, "buildings");
            return (Criteria) this;
        }

        public Criteria andBuildingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("buildings >=", value, "buildings");
            return (Criteria) this;
        }

        public Criteria andBuildingsLessThan(Integer value) {
            addCriterion("buildings <", value, "buildings");
            return (Criteria) this;
        }

        public Criteria andBuildingsLessThanOrEqualTo(Integer value) {
            addCriterion("buildings <=", value, "buildings");
            return (Criteria) this;
        }

        public Criteria andBuildingsIn(List<Integer> values) {
            addCriterion("buildings in", values, "buildings");
            return (Criteria) this;
        }

        public Criteria andBuildingsNotIn(List<Integer> values) {
            addCriterion("buildings not in", values, "buildings");
            return (Criteria) this;
        }

        public Criteria andBuildingsBetween(Integer value1, Integer value2) {
            addCriterion("buildings between", value1, value2, "buildings");
            return (Criteria) this;
        }

        public Criteria andBuildingsNotBetween(Integer value1, Integer value2) {
            addCriterion("buildings not between", value1, value2, "buildings");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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