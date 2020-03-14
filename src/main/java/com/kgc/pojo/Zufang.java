package com.kgc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Zufang {
    private Integer id;

    private String title;

    private Integer rental;

    private Integer streetId;

    private String village;

    private Integer room;

    private Integer hall;

    private Integer toilet;

    private String terrace;

    private Byte rentStatus;

    private Integer housingId;

    private Integer agentId;

    private String houseDescribe;

    private String hostpic;

    private String picFirst;

    private String picSecond;

    private String picThird;

    private String picFourth;

    private String planPic;

    private String feature;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    private Integer houseingId;

    private String houseCheckCode;

    private Integer square;

    private String orientations;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date servicingTime;

    private String checkIn;

    private Byte floor;

    private Byte elevator;

    private Byte carport;

    private Byte water;

    private Byte electricity;

    private Byte fuelGas;

    private String heating;

    private String tenancyTerm;

    private String seeHouse;

    private Byte television;

    private Byte refrigerator;

    private Byte washingMachine;

    private Byte airConditioner;

    private Byte calorifier;

    private Byte bed;

    private Byte heatGas;

    private Byte broadBand;

    private Byte closet;

    private Byte naturalGas;

    private String payWay;

    private Integer rent;

    private Integer cashPledge;

    private Integer serviceCharge;

    private Integer agencyFee;

    private BigDecimal longitude;

    private BigDecimal latitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getRental() {
        return rental;
    }

    public void setRental(Integer rental) {
        this.rental = rental;
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village == null ? null : village.trim();
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getHall() {
        return hall;
    }

    public void setHall(Integer hall) {
        this.hall = hall;
    }

    public Integer getToilet() {
        return toilet;
    }

    public void setToilet(Integer toilet) {
        this.toilet = toilet;
    }

    public String getTerrace() {
        return terrace;
    }

    public void setTerrace(String terrace) {
        this.terrace = terrace == null ? null : terrace.trim();
    }

    public Byte getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(Byte rentStatus) {
        this.rentStatus = rentStatus;
    }

    public Integer getHousingId() {
        return housingId;
    }

    public void setHousingId(Integer housingId) {
        this.housingId = housingId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getHouseDescribe() {
        return houseDescribe;
    }

    public void setHouseDescribe(String houseDescribe) {
        this.houseDescribe = houseDescribe == null ? null : houseDescribe.trim();
    }

    public String getHostpic() {
        return hostpic;
    }

    public void setHostpic(String hostpic) {
        this.hostpic = hostpic == null ? null : hostpic.trim();
    }

    public String getPicFirst() {
        return picFirst;
    }

    public void setPicFirst(String picFirst) {
        this.picFirst = picFirst == null ? null : picFirst.trim();
    }

    public String getPicSecond() {
        return picSecond;
    }

    public void setPicSecond(String picSecond) {
        this.picSecond = picSecond == null ? null : picSecond.trim();
    }

    public String getPicThird() {
        return picThird;
    }

    public void setPicThird(String picThird) {
        this.picThird = picThird == null ? null : picThird.trim();
    }

    public String getPicFourth() {
        return picFourth;
    }

    public void setPicFourth(String picFourth) {
        this.picFourth = picFourth == null ? null : picFourth.trim();
    }

    public String getPlanPic() {
        return planPic;
    }

    public void setPlanPic(String planPic) {
        this.planPic = planPic == null ? null : planPic.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getHouseingId() {
        return houseingId;
    }

    public void setHouseingId(Integer houseingId) {
        this.houseingId = houseingId;
    }

    public String getHouseCheckCode() {
        return houseCheckCode;
    }

    public void setHouseCheckCode(String houseCheckCode) {
        this.houseCheckCode = houseCheckCode == null ? null : houseCheckCode.trim();
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public String getOrientations() {
        return orientations;
    }

    public void setOrientations(String orientations) {
        this.orientations = orientations == null ? null : orientations.trim();
    }

    public Date getServicingTime() {
        return servicingTime;
    }

    public void setServicingTime(Date servicingTime) {
        this.servicingTime = servicingTime;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn == null ? null : checkIn.trim();
    }

    public Byte getFloor() {
        return floor;
    }

    public void setFloor(Byte floor) {
        this.floor = floor;
    }

    public Byte getElevator() {
        return elevator;
    }

    public void setElevator(Byte elevator) {
        this.elevator = elevator;
    }

    public Byte getCarport() {
        return carport;
    }

    public void setCarport(Byte carport) {
        this.carport = carport;
    }

    public Byte getWater() {
        return water;
    }

    public void setWater(Byte water) {
        this.water = water;
    }

    public Byte getElectricity() {
        return electricity;
    }

    public void setElectricity(Byte electricity) {
        this.electricity = electricity;
    }

    public Byte getFuelGas() {
        return fuelGas;
    }

    public void setFuelGas(Byte fuelGas) {
        this.fuelGas = fuelGas;
    }

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
        this.heating = heating == null ? null : heating.trim();
    }

    public String getTenancyTerm() {
        return tenancyTerm;
    }

    public void setTenancyTerm(String tenancyTerm) {
        this.tenancyTerm = tenancyTerm == null ? null : tenancyTerm.trim();
    }

    public String getSeeHouse() {
        return seeHouse;
    }

    public void setSeeHouse(String seeHouse) {
        this.seeHouse = seeHouse == null ? null : seeHouse.trim();
    }

    public Byte getTelevision() {
        return television;
    }

    public void setTelevision(Byte television) {
        this.television = television;
    }

    public Byte getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Byte refrigerator) {
        this.refrigerator = refrigerator;
    }

    public Byte getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(Byte washingMachine) {
        this.washingMachine = washingMachine;
    }

    public Byte getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(Byte airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Byte getCalorifier() {
        return calorifier;
    }

    public void setCalorifier(Byte calorifier) {
        this.calorifier = calorifier;
    }

    public Byte getBed() {
        return bed;
    }

    public void setBed(Byte bed) {
        this.bed = bed;
    }

    public Byte getHeatGas() {
        return heatGas;
    }

    public void setHeatGas(Byte heatGas) {
        this.heatGas = heatGas;
    }

    public Byte getBroadBand() {
        return broadBand;
    }

    public void setBroadBand(Byte broadBand) {
        this.broadBand = broadBand;
    }

    public Byte getCloset() {
        return closet;
    }

    public void setCloset(Byte closet) {
        this.closet = closet;
    }

    public Byte getNaturalGas() {
        return naturalGas;
    }

    public void setNaturalGas(Byte naturalGas) {
        this.naturalGas = naturalGas;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public Integer getCashPledge() {
        return cashPledge;
    }

    public void setCashPledge(Integer cashPledge) {
        this.cashPledge = cashPledge;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Integer getAgencyFee() {
        return agencyFee;
    }

    public void setAgencyFee(Integer agencyFee) {
        this.agencyFee = agencyFee;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}