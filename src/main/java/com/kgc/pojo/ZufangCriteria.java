package com.kgc.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZufangCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZufangCriteria() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andRentalIsNull() {
            addCriterion("rental is null");
            return (Criteria) this;
        }

        public Criteria andRentalIsNotNull() {
            addCriterion("rental is not null");
            return (Criteria) this;
        }

        public Criteria andRentalEqualTo(Integer value) {
            addCriterion("rental =", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotEqualTo(Integer value) {
            addCriterion("rental <>", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalGreaterThan(Integer value) {
            addCriterion("rental >", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalGreaterThanOrEqualTo(Integer value) {
            addCriterion("rental >=", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLessThan(Integer value) {
            addCriterion("rental <", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLessThanOrEqualTo(Integer value) {
            addCriterion("rental <=", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalIn(List<Integer> values) {
            addCriterion("rental in", values, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotIn(List<Integer> values) {
            addCriterion("rental not in", values, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalBetween(Integer value1, Integer value2) {
            addCriterion("rental between", value1, value2, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotBetween(Integer value1, Integer value2) {
            addCriterion("rental not between", value1, value2, "rental");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNull() {
            addCriterion("street_id is null");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNotNull() {
            addCriterion("street_id is not null");
            return (Criteria) this;
        }

        public Criteria andStreetIdEqualTo(Integer value) {
            addCriterion("street_id =", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotEqualTo(Integer value) {
            addCriterion("street_id <>", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThan(Integer value) {
            addCriterion("street_id >", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("street_id >=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThan(Integer value) {
            addCriterion("street_id <", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThanOrEqualTo(Integer value) {
            addCriterion("street_id <=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIn(List<Integer> values) {
            addCriterion("street_id in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotIn(List<Integer> values) {
            addCriterion("street_id not in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdBetween(Integer value1, Integer value2) {
            addCriterion("street_id between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("street_id not between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andVillageIsNull() {
            addCriterion("village is null");
            return (Criteria) this;
        }

        public Criteria andVillageIsNotNull() {
            addCriterion("village is not null");
            return (Criteria) this;
        }

        public Criteria andVillageEqualTo(String value) {
            addCriterion("village =", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotEqualTo(String value) {
            addCriterion("village <>", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageGreaterThan(String value) {
            addCriterion("village >", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageGreaterThanOrEqualTo(String value) {
            addCriterion("village >=", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageLessThan(String value) {
            addCriterion("village <", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageLessThanOrEqualTo(String value) {
            addCriterion("village <=", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageLike(String value) {
            addCriterion("village like", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotLike(String value) {
            addCriterion("village not like", value, "village");
            return (Criteria) this;
        }

        public Criteria andVillageIn(List<String> values) {
            addCriterion("village in", values, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotIn(List<String> values) {
            addCriterion("village not in", values, "village");
            return (Criteria) this;
        }

        public Criteria andVillageBetween(String value1, String value2) {
            addCriterion("village between", value1, value2, "village");
            return (Criteria) this;
        }

        public Criteria andVillageNotBetween(String value1, String value2) {
            addCriterion("village not between", value1, value2, "village");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(Integer value) {
            addCriterion("room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(Integer value) {
            addCriterion("room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(Integer value) {
            addCriterion("room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(Integer value) {
            addCriterion("room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(Integer value) {
            addCriterion("room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<Integer> values) {
            addCriterion("room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<Integer> values) {
            addCriterion("room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(Integer value1, Integer value2) {
            addCriterion("room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(Integer value1, Integer value2) {
            addCriterion("room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andHallIsNull() {
            addCriterion("hall is null");
            return (Criteria) this;
        }

        public Criteria andHallIsNotNull() {
            addCriterion("hall is not null");
            return (Criteria) this;
        }

        public Criteria andHallEqualTo(Integer value) {
            addCriterion("hall =", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallNotEqualTo(Integer value) {
            addCriterion("hall <>", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallGreaterThan(Integer value) {
            addCriterion("hall >", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallGreaterThanOrEqualTo(Integer value) {
            addCriterion("hall >=", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallLessThan(Integer value) {
            addCriterion("hall <", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallLessThanOrEqualTo(Integer value) {
            addCriterion("hall <=", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallIn(List<Integer> values) {
            addCriterion("hall in", values, "hall");
            return (Criteria) this;
        }

        public Criteria andHallNotIn(List<Integer> values) {
            addCriterion("hall not in", values, "hall");
            return (Criteria) this;
        }

        public Criteria andHallBetween(Integer value1, Integer value2) {
            addCriterion("hall between", value1, value2, "hall");
            return (Criteria) this;
        }

        public Criteria andHallNotBetween(Integer value1, Integer value2) {
            addCriterion("hall not between", value1, value2, "hall");
            return (Criteria) this;
        }

        public Criteria andToiletIsNull() {
            addCriterion("toilet is null");
            return (Criteria) this;
        }

        public Criteria andToiletIsNotNull() {
            addCriterion("toilet is not null");
            return (Criteria) this;
        }

        public Criteria andToiletEqualTo(Integer value) {
            addCriterion("toilet =", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotEqualTo(Integer value) {
            addCriterion("toilet <>", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletGreaterThan(Integer value) {
            addCriterion("toilet >", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletGreaterThanOrEqualTo(Integer value) {
            addCriterion("toilet >=", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletLessThan(Integer value) {
            addCriterion("toilet <", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletLessThanOrEqualTo(Integer value) {
            addCriterion("toilet <=", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletIn(List<Integer> values) {
            addCriterion("toilet in", values, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotIn(List<Integer> values) {
            addCriterion("toilet not in", values, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletBetween(Integer value1, Integer value2) {
            addCriterion("toilet between", value1, value2, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotBetween(Integer value1, Integer value2) {
            addCriterion("toilet not between", value1, value2, "toilet");
            return (Criteria) this;
        }

        public Criteria andTerraceIsNull() {
            addCriterion("terrace is null");
            return (Criteria) this;
        }

        public Criteria andTerraceIsNotNull() {
            addCriterion("terrace is not null");
            return (Criteria) this;
        }

        public Criteria andTerraceEqualTo(String value) {
            addCriterion("terrace =", value, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceNotEqualTo(String value) {
            addCriterion("terrace <>", value, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceGreaterThan(String value) {
            addCriterion("terrace >", value, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceGreaterThanOrEqualTo(String value) {
            addCriterion("terrace >=", value, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceLessThan(String value) {
            addCriterion("terrace <", value, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceLessThanOrEqualTo(String value) {
            addCriterion("terrace <=", value, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceLike(String value) {
            addCriterion("terrace like", value, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceNotLike(String value) {
            addCriterion("terrace not like", value, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceIn(List<String> values) {
            addCriterion("terrace in", values, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceNotIn(List<String> values) {
            addCriterion("terrace not in", values, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceBetween(String value1, String value2) {
            addCriterion("terrace between", value1, value2, "terrace");
            return (Criteria) this;
        }

        public Criteria andTerraceNotBetween(String value1, String value2) {
            addCriterion("terrace not between", value1, value2, "terrace");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andHostpicIsNull() {
            addCriterion("hostPic is null");
            return (Criteria) this;
        }

        public Criteria andHostpicIsNotNull() {
            addCriterion("hostPic is not null");
            return (Criteria) this;
        }

        public Criteria andHostpicEqualTo(String value) {
            addCriterion("hostPic =", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicNotEqualTo(String value) {
            addCriterion("hostPic <>", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicGreaterThan(String value) {
            addCriterion("hostPic >", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicGreaterThanOrEqualTo(String value) {
            addCriterion("hostPic >=", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicLessThan(String value) {
            addCriterion("hostPic <", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicLessThanOrEqualTo(String value) {
            addCriterion("hostPic <=", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicLike(String value) {
            addCriterion("hostPic like", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicNotLike(String value) {
            addCriterion("hostPic not like", value, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicIn(List<String> values) {
            addCriterion("hostPic in", values, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicNotIn(List<String> values) {
            addCriterion("hostPic not in", values, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicBetween(String value1, String value2) {
            addCriterion("hostPic between", value1, value2, "hostpic");
            return (Criteria) this;
        }

        public Criteria andHostpicNotBetween(String value1, String value2) {
            addCriterion("hostPic not between", value1, value2, "hostpic");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNull() {
            addCriterion("feature is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("feature is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("feature =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("feature <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("feature >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("feature >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("feature <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("feature <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("feature like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("feature not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("feature in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("feature not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("feature between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("feature not between", value1, value2, "feature");
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

        public Criteria andHouseingIdIsNull() {
            addCriterion("houseing_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseingIdIsNotNull() {
            addCriterion("houseing_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseingIdEqualTo(Integer value) {
            addCriterion("houseing_id =", value, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseingIdNotEqualTo(Integer value) {
            addCriterion("houseing_id <>", value, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseingIdGreaterThan(Integer value) {
            addCriterion("houseing_id >", value, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("houseing_id >=", value, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseingIdLessThan(Integer value) {
            addCriterion("houseing_id <", value, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseingIdLessThanOrEqualTo(Integer value) {
            addCriterion("houseing_id <=", value, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseingIdIn(List<Integer> values) {
            addCriterion("houseing_id in", values, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseingIdNotIn(List<Integer> values) {
            addCriterion("houseing_id not in", values, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseingIdBetween(Integer value1, Integer value2) {
            addCriterion("houseing_id between", value1, value2, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("houseing_id not between", value1, value2, "houseingId");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeIsNull() {
            addCriterion("house_check_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeIsNotNull() {
            addCriterion("house_check_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeEqualTo(String value) {
            addCriterion("house_check_code =", value, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeNotEqualTo(String value) {
            addCriterion("house_check_code <>", value, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeGreaterThan(String value) {
            addCriterion("house_check_code >", value, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeGreaterThanOrEqualTo(String value) {
            addCriterion("house_check_code >=", value, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeLessThan(String value) {
            addCriterion("house_check_code <", value, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeLessThanOrEqualTo(String value) {
            addCriterion("house_check_code <=", value, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeLike(String value) {
            addCriterion("house_check_code like", value, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeNotLike(String value) {
            addCriterion("house_check_code not like", value, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeIn(List<String> values) {
            addCriterion("house_check_code in", values, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeNotIn(List<String> values) {
            addCriterion("house_check_code not in", values, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeBetween(String value1, String value2) {
            addCriterion("house_check_code between", value1, value2, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andHouseCheckCodeNotBetween(String value1, String value2) {
            addCriterion("house_check_code not between", value1, value2, "houseCheckCode");
            return (Criteria) this;
        }

        public Criteria andSquareIsNull() {
            addCriterion("square is null");
            return (Criteria) this;
        }

        public Criteria andSquareIsNotNull() {
            addCriterion("square is not null");
            return (Criteria) this;
        }

        public Criteria andSquareEqualTo(Integer value) {
            addCriterion("square =", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotEqualTo(Integer value) {
            addCriterion("square <>", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThan(Integer value) {
            addCriterion("square >", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThanOrEqualTo(Integer value) {
            addCriterion("square >=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThan(Integer value) {
            addCriterion("square <", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThanOrEqualTo(Integer value) {
            addCriterion("square <=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareIn(List<Integer> values) {
            addCriterion("square in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotIn(List<Integer> values) {
            addCriterion("square not in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareBetween(Integer value1, Integer value2) {
            addCriterion("square between", value1, value2, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotBetween(Integer value1, Integer value2) {
            addCriterion("square not between", value1, value2, "square");
            return (Criteria) this;
        }

        public Criteria andOrientationsIsNull() {
            addCriterion("orientations is null");
            return (Criteria) this;
        }

        public Criteria andOrientationsIsNotNull() {
            addCriterion("orientations is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationsEqualTo(String value) {
            addCriterion("orientations =", value, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsNotEqualTo(String value) {
            addCriterion("orientations <>", value, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsGreaterThan(String value) {
            addCriterion("orientations >", value, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsGreaterThanOrEqualTo(String value) {
            addCriterion("orientations >=", value, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsLessThan(String value) {
            addCriterion("orientations <", value, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsLessThanOrEqualTo(String value) {
            addCriterion("orientations <=", value, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsLike(String value) {
            addCriterion("orientations like", value, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsNotLike(String value) {
            addCriterion("orientations not like", value, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsIn(List<String> values) {
            addCriterion("orientations in", values, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsNotIn(List<String> values) {
            addCriterion("orientations not in", values, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsBetween(String value1, String value2) {
            addCriterion("orientations between", value1, value2, "orientations");
            return (Criteria) this;
        }

        public Criteria andOrientationsNotBetween(String value1, String value2) {
            addCriterion("orientations not between", value1, value2, "orientations");
            return (Criteria) this;
        }

        public Criteria andServicingTimeIsNull() {
            addCriterion("servicing_time is null");
            return (Criteria) this;
        }

        public Criteria andServicingTimeIsNotNull() {
            addCriterion("servicing_time is not null");
            return (Criteria) this;
        }

        public Criteria andServicingTimeEqualTo(Date value) {
            addCriterion("servicing_time =", value, "servicingTime");
            return (Criteria) this;
        }

        public Criteria andServicingTimeNotEqualTo(Date value) {
            addCriterion("servicing_time <>", value, "servicingTime");
            return (Criteria) this;
        }

        public Criteria andServicingTimeGreaterThan(Date value) {
            addCriterion("servicing_time >", value, "servicingTime");
            return (Criteria) this;
        }

        public Criteria andServicingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("servicing_time >=", value, "servicingTime");
            return (Criteria) this;
        }

        public Criteria andServicingTimeLessThan(Date value) {
            addCriterion("servicing_time <", value, "servicingTime");
            return (Criteria) this;
        }

        public Criteria andServicingTimeLessThanOrEqualTo(Date value) {
            addCriterion("servicing_time <=", value, "servicingTime");
            return (Criteria) this;
        }

        public Criteria andServicingTimeIn(List<Date> values) {
            addCriterion("servicing_time in", values, "servicingTime");
            return (Criteria) this;
        }

        public Criteria andServicingTimeNotIn(List<Date> values) {
            addCriterion("servicing_time not in", values, "servicingTime");
            return (Criteria) this;
        }

        public Criteria andServicingTimeBetween(Date value1, Date value2) {
            addCriterion("servicing_time between", value1, value2, "servicingTime");
            return (Criteria) this;
        }

        public Criteria andServicingTimeNotBetween(Date value1, Date value2) {
            addCriterion("servicing_time not between", value1, value2, "servicingTime");
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

        public Criteria andFloorEqualTo(Byte value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Byte value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Byte value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Byte value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Byte value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Byte value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Byte> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Byte> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Byte value1, Byte value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Byte value1, Byte value2) {
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

        public Criteria andCarportIsNull() {
            addCriterion("carport is null");
            return (Criteria) this;
        }

        public Criteria andCarportIsNotNull() {
            addCriterion("carport is not null");
            return (Criteria) this;
        }

        public Criteria andCarportEqualTo(Byte value) {
            addCriterion("carport =", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportNotEqualTo(Byte value) {
            addCriterion("carport <>", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportGreaterThan(Byte value) {
            addCriterion("carport >", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportGreaterThanOrEqualTo(Byte value) {
            addCriterion("carport >=", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportLessThan(Byte value) {
            addCriterion("carport <", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportLessThanOrEqualTo(Byte value) {
            addCriterion("carport <=", value, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportIn(List<Byte> values) {
            addCriterion("carport in", values, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportNotIn(List<Byte> values) {
            addCriterion("carport not in", values, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportBetween(Byte value1, Byte value2) {
            addCriterion("carport between", value1, value2, "carport");
            return (Criteria) this;
        }

        public Criteria andCarportNotBetween(Byte value1, Byte value2) {
            addCriterion("carport not between", value1, value2, "carport");
            return (Criteria) this;
        }

        public Criteria andWaterIsNull() {
            addCriterion("water is null");
            return (Criteria) this;
        }

        public Criteria andWaterIsNotNull() {
            addCriterion("water is not null");
            return (Criteria) this;
        }

        public Criteria andWaterEqualTo(Byte value) {
            addCriterion("water =", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotEqualTo(Byte value) {
            addCriterion("water <>", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThan(Byte value) {
            addCriterion("water >", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThanOrEqualTo(Byte value) {
            addCriterion("water >=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThan(Byte value) {
            addCriterion("water <", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThanOrEqualTo(Byte value) {
            addCriterion("water <=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterIn(List<Byte> values) {
            addCriterion("water in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotIn(List<Byte> values) {
            addCriterion("water not in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterBetween(Byte value1, Byte value2) {
            addCriterion("water between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotBetween(Byte value1, Byte value2) {
            addCriterion("water not between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andElectricityIsNull() {
            addCriterion("electricity is null");
            return (Criteria) this;
        }

        public Criteria andElectricityIsNotNull() {
            addCriterion("electricity is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityEqualTo(Byte value) {
            addCriterion("electricity =", value, "electricity");
            return (Criteria) this;
        }

        public Criteria andElectricityNotEqualTo(Byte value) {
            addCriterion("electricity <>", value, "electricity");
            return (Criteria) this;
        }

        public Criteria andElectricityGreaterThan(Byte value) {
            addCriterion("electricity >", value, "electricity");
            return (Criteria) this;
        }

        public Criteria andElectricityGreaterThanOrEqualTo(Byte value) {
            addCriterion("electricity >=", value, "electricity");
            return (Criteria) this;
        }

        public Criteria andElectricityLessThan(Byte value) {
            addCriterion("electricity <", value, "electricity");
            return (Criteria) this;
        }

        public Criteria andElectricityLessThanOrEqualTo(Byte value) {
            addCriterion("electricity <=", value, "electricity");
            return (Criteria) this;
        }

        public Criteria andElectricityIn(List<Byte> values) {
            addCriterion("electricity in", values, "electricity");
            return (Criteria) this;
        }

        public Criteria andElectricityNotIn(List<Byte> values) {
            addCriterion("electricity not in", values, "electricity");
            return (Criteria) this;
        }

        public Criteria andElectricityBetween(Byte value1, Byte value2) {
            addCriterion("electricity between", value1, value2, "electricity");
            return (Criteria) this;
        }

        public Criteria andElectricityNotBetween(Byte value1, Byte value2) {
            addCriterion("electricity not between", value1, value2, "electricity");
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

        public Criteria andHeatingIsNull() {
            addCriterion("heating is null");
            return (Criteria) this;
        }

        public Criteria andHeatingIsNotNull() {
            addCriterion("heating is not null");
            return (Criteria) this;
        }

        public Criteria andHeatingEqualTo(String value) {
            addCriterion("heating =", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotEqualTo(String value) {
            addCriterion("heating <>", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThan(String value) {
            addCriterion("heating >", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThanOrEqualTo(String value) {
            addCriterion("heating >=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThan(String value) {
            addCriterion("heating <", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThanOrEqualTo(String value) {
            addCriterion("heating <=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLike(String value) {
            addCriterion("heating like", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotLike(String value) {
            addCriterion("heating not like", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingIn(List<String> values) {
            addCriterion("heating in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotIn(List<String> values) {
            addCriterion("heating not in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingBetween(String value1, String value2) {
            addCriterion("heating between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotBetween(String value1, String value2) {
            addCriterion("heating not between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andRentIsNull() {
            addCriterion("rent is null");
            return (Criteria) this;
        }

        public Criteria andRentIsNotNull() {
            addCriterion("rent is not null");
            return (Criteria) this;
        }

        public Criteria andRentEqualTo(Integer value) {
            addCriterion("rent =", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotEqualTo(Integer value) {
            addCriterion("rent <>", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThan(Integer value) {
            addCriterion("rent >", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent >=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThan(Integer value) {
            addCriterion("rent <", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentLessThanOrEqualTo(Integer value) {
            addCriterion("rent <=", value, "rent");
            return (Criteria) this;
        }

        public Criteria andRentIn(List<Integer> values) {
            addCriterion("rent in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotIn(List<Integer> values) {
            addCriterion("rent not in", values, "rent");
            return (Criteria) this;
        }

        public Criteria andRentBetween(Integer value1, Integer value2) {
            addCriterion("rent between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andRentNotBetween(Integer value1, Integer value2) {
            addCriterion("rent not between", value1, value2, "rent");
            return (Criteria) this;
        }

        public Criteria andCashPledgeIsNull() {
            addCriterion("cash_pledge is null");
            return (Criteria) this;
        }

        public Criteria andCashPledgeIsNotNull() {
            addCriterion("cash_pledge is not null");
            return (Criteria) this;
        }

        public Criteria andCashPledgeEqualTo(Integer value) {
            addCriterion("cash_pledge =", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotEqualTo(Integer value) {
            addCriterion("cash_pledge <>", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeGreaterThan(Integer value) {
            addCriterion("cash_pledge >", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash_pledge >=", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeLessThan(Integer value) {
            addCriterion("cash_pledge <", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeLessThanOrEqualTo(Integer value) {
            addCriterion("cash_pledge <=", value, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeIn(List<Integer> values) {
            addCriterion("cash_pledge in", values, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotIn(List<Integer> values) {
            addCriterion("cash_pledge not in", values, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeBetween(Integer value1, Integer value2) {
            addCriterion("cash_pledge between", value1, value2, "cashPledge");
            return (Criteria) this;
        }

        public Criteria andCashPledgeNotBetween(Integer value1, Integer value2) {
            addCriterion("cash_pledge not between", value1, value2, "cashPledge");
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

        public Criteria andServiceChargeEqualTo(Integer value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(Integer value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(Integer value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(Integer value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(Integer value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<Integer> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<Integer> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(Integer value1, Integer value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAgencyFeeEqualTo(Integer value) {
            addCriterion("agency_fee =", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeNotEqualTo(Integer value) {
            addCriterion("agency_fee <>", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeGreaterThan(Integer value) {
            addCriterion("agency_fee >", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agency_fee >=", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeLessThan(Integer value) {
            addCriterion("agency_fee <", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeLessThanOrEqualTo(Integer value) {
            addCriterion("agency_fee <=", value, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeIn(List<Integer> values) {
            addCriterion("agency_fee in", values, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeNotIn(List<Integer> values) {
            addCriterion("agency_fee not in", values, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeBetween(Integer value1, Integer value2) {
            addCriterion("agency_fee between", value1, value2, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andAgencyFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("agency_fee not between", value1, value2, "agencyFee");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
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

        public Criteria andSeeHouseIsNull() {
            addCriterion("see_house is null");
            return (Criteria) this;
        }

        public Criteria andSeeHouseIsNotNull() {
            addCriterion("see_house is not null");
            return (Criteria) this;
        }

        public Criteria andSeeHouseEqualTo(String value) {
            addCriterion("see_house =", value, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseNotEqualTo(String value) {
            addCriterion("see_house <>", value, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseGreaterThan(String value) {
            addCriterion("see_house >", value, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseGreaterThanOrEqualTo(String value) {
            addCriterion("see_house >=", value, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseLessThan(String value) {
            addCriterion("see_house <", value, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseLessThanOrEqualTo(String value) {
            addCriterion("see_house <=", value, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseLike(String value) {
            addCriterion("see_house like", value, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseNotLike(String value) {
            addCriterion("see_house not like", value, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseIn(List<String> values) {
            addCriterion("see_house in", values, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseNotIn(List<String> values) {
            addCriterion("see_house not in", values, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseBetween(String value1, String value2) {
            addCriterion("see_house between", value1, value2, "seeHouse");
            return (Criteria) this;
        }

        public Criteria andSeeHouseNotBetween(String value1, String value2) {
            addCriterion("see_house not between", value1, value2, "seeHouse");
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

        public Criteria andHeatGasIsNull() {
            addCriterion("heat_gas is null");
            return (Criteria) this;
        }

        public Criteria andHeatGasIsNotNull() {
            addCriterion("heat_gas is not null");
            return (Criteria) this;
        }

        public Criteria andHeatGasEqualTo(Byte value) {
            addCriterion("heat_gas =", value, "heatGas");
            return (Criteria) this;
        }

        public Criteria andHeatGasNotEqualTo(Byte value) {
            addCriterion("heat_gas <>", value, "heatGas");
            return (Criteria) this;
        }

        public Criteria andHeatGasGreaterThan(Byte value) {
            addCriterion("heat_gas >", value, "heatGas");
            return (Criteria) this;
        }

        public Criteria andHeatGasGreaterThanOrEqualTo(Byte value) {
            addCriterion("heat_gas >=", value, "heatGas");
            return (Criteria) this;
        }

        public Criteria andHeatGasLessThan(Byte value) {
            addCriterion("heat_gas <", value, "heatGas");
            return (Criteria) this;
        }

        public Criteria andHeatGasLessThanOrEqualTo(Byte value) {
            addCriterion("heat_gas <=", value, "heatGas");
            return (Criteria) this;
        }

        public Criteria andHeatGasIn(List<Byte> values) {
            addCriterion("heat_gas in", values, "heatGas");
            return (Criteria) this;
        }

        public Criteria andHeatGasNotIn(List<Byte> values) {
            addCriterion("heat_gas not in", values, "heatGas");
            return (Criteria) this;
        }

        public Criteria andHeatGasBetween(Byte value1, Byte value2) {
            addCriterion("heat_gas between", value1, value2, "heatGas");
            return (Criteria) this;
        }

        public Criteria andHeatGasNotBetween(Byte value1, Byte value2) {
            addCriterion("heat_gas not between", value1, value2, "heatGas");
            return (Criteria) this;
        }

        public Criteria andBroadBandIsNull() {
            addCriterion("broad_band is null");
            return (Criteria) this;
        }

        public Criteria andBroadBandIsNotNull() {
            addCriterion("broad_band is not null");
            return (Criteria) this;
        }

        public Criteria andBroadBandEqualTo(Byte value) {
            addCriterion("broad_band =", value, "broadBand");
            return (Criteria) this;
        }

        public Criteria andBroadBandNotEqualTo(Byte value) {
            addCriterion("broad_band <>", value, "broadBand");
            return (Criteria) this;
        }

        public Criteria andBroadBandGreaterThan(Byte value) {
            addCriterion("broad_band >", value, "broadBand");
            return (Criteria) this;
        }

        public Criteria andBroadBandGreaterThanOrEqualTo(Byte value) {
            addCriterion("broad_band >=", value, "broadBand");
            return (Criteria) this;
        }

        public Criteria andBroadBandLessThan(Byte value) {
            addCriterion("broad_band <", value, "broadBand");
            return (Criteria) this;
        }

        public Criteria andBroadBandLessThanOrEqualTo(Byte value) {
            addCriterion("broad_band <=", value, "broadBand");
            return (Criteria) this;
        }

        public Criteria andBroadBandIn(List<Byte> values) {
            addCriterion("broad_band in", values, "broadBand");
            return (Criteria) this;
        }

        public Criteria andBroadBandNotIn(List<Byte> values) {
            addCriterion("broad_band not in", values, "broadBand");
            return (Criteria) this;
        }

        public Criteria andBroadBandBetween(Byte value1, Byte value2) {
            addCriterion("broad_band between", value1, value2, "broadBand");
            return (Criteria) this;
        }

        public Criteria andBroadBandNotBetween(Byte value1, Byte value2) {
            addCriterion("broad_band not between", value1, value2, "broadBand");
            return (Criteria) this;
        }

        public Criteria andClosetIsNull() {
            addCriterion("closet is null");
            return (Criteria) this;
        }

        public Criteria andClosetIsNotNull() {
            addCriterion("closet is not null");
            return (Criteria) this;
        }

        public Criteria andClosetEqualTo(Byte value) {
            addCriterion("closet =", value, "closet");
            return (Criteria) this;
        }

        public Criteria andClosetNotEqualTo(Byte value) {
            addCriterion("closet <>", value, "closet");
            return (Criteria) this;
        }

        public Criteria andClosetGreaterThan(Byte value) {
            addCriterion("closet >", value, "closet");
            return (Criteria) this;
        }

        public Criteria andClosetGreaterThanOrEqualTo(Byte value) {
            addCriterion("closet >=", value, "closet");
            return (Criteria) this;
        }

        public Criteria andClosetLessThan(Byte value) {
            addCriterion("closet <", value, "closet");
            return (Criteria) this;
        }

        public Criteria andClosetLessThanOrEqualTo(Byte value) {
            addCriterion("closet <=", value, "closet");
            return (Criteria) this;
        }

        public Criteria andClosetIn(List<Byte> values) {
            addCriterion("closet in", values, "closet");
            return (Criteria) this;
        }

        public Criteria andClosetNotIn(List<Byte> values) {
            addCriterion("closet not in", values, "closet");
            return (Criteria) this;
        }

        public Criteria andClosetBetween(Byte value1, Byte value2) {
            addCriterion("closet between", value1, value2, "closet");
            return (Criteria) this;
        }

        public Criteria andClosetNotBetween(Byte value1, Byte value2) {
            addCriterion("closet not between", value1, value2, "closet");
            return (Criteria) this;
        }

        public Criteria andNaturalGasIsNull() {
            addCriterion("natural_gas is null");
            return (Criteria) this;
        }

        public Criteria andNaturalGasIsNotNull() {
            addCriterion("natural_gas is not null");
            return (Criteria) this;
        }

        public Criteria andNaturalGasEqualTo(Byte value) {
            addCriterion("natural_gas =", value, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andNaturalGasNotEqualTo(Byte value) {
            addCriterion("natural_gas <>", value, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andNaturalGasGreaterThan(Byte value) {
            addCriterion("natural_gas >", value, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andNaturalGasGreaterThanOrEqualTo(Byte value) {
            addCriterion("natural_gas >=", value, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andNaturalGasLessThan(Byte value) {
            addCriterion("natural_gas <", value, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andNaturalGasLessThanOrEqualTo(Byte value) {
            addCriterion("natural_gas <=", value, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andNaturalGasIn(List<Byte> values) {
            addCriterion("natural_gas in", values, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andNaturalGasNotIn(List<Byte> values) {
            addCriterion("natural_gas not in", values, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andNaturalGasBetween(Byte value1, Byte value2) {
            addCriterion("natural_gas between", value1, value2, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andNaturalGasNotBetween(Byte value1, Byte value2) {
            addCriterion("natural_gas not between", value1, value2, "naturalGas");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("pay_way like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("pay_way not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
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