package com.kgc.pojo;

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