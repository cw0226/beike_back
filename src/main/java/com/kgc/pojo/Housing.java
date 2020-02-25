package com.kgc.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Housing {
    private Integer id;

    private Integer cityId;

    private Integer communityId;

    private Integer buildingsId;

    private BigDecimal expectRent;

    private Byte rentType;

    private String name;

    private String phone;

    private Byte checkState;

    private String remark;

    private Date createTime;

    private Integer createUserId;

    private Date checkTime;

    private Integer checkUserId;

    private Integer houseTypeId;

    private Integer area;

    private String orientation;

    private String checkIn;

    private String floor;

    private Byte elevator;

    private String stall;

    private Byte waterType;

    private Byte electricityType;

    private Byte fuelGas;

    private String heatingType;

    private String tenancyTerm;

    private String seeApartment;

    private Byte television;

    private Byte refrigerator;

    private Byte washingMachine;

    private Byte airConditioner;

    private Byte calorifier;

    private Byte bed;

    private Byte heating;

    private String payMethod;

    private String deposit;

    private String serviceCharge;

    private String agencyFee;

    private Date maintainTime;

    private Integer maintainAgentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public Integer getBuildingsId() {
        return buildingsId;
    }

    public void setBuildingsId(Integer buildingsId) {
        this.buildingsId = buildingsId;
    }

    public BigDecimal getExpectRent() {
        return expectRent;
    }

    public void setExpectRent(BigDecimal expectRent) {
        this.expectRent = expectRent;
    }

    public Byte getRentType() {
        return rentType;
    }

    public void setRentType(Byte rentType) {
        this.rentType = rentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Byte getCheckState() {
        return checkState;
    }

    public void setCheckState(Byte checkState) {
        this.checkState = checkState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Integer getHouseTypeId() {
        return houseTypeId;
    }

    public void setHouseTypeId(Integer houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation == null ? null : orientation.trim();
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn == null ? null : checkIn.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public Byte getElevator() {
        return elevator;
    }

    public void setElevator(Byte elevator) {
        this.elevator = elevator;
    }

    public String getStall() {
        return stall;
    }

    public void setStall(String stall) {
        this.stall = stall == null ? null : stall.trim();
    }

    public Byte getWaterType() {
        return waterType;
    }

    public void setWaterType(Byte waterType) {
        this.waterType = waterType;
    }

    public Byte getElectricityType() {
        return electricityType;
    }

    public void setElectricityType(Byte electricityType) {
        this.electricityType = electricityType;
    }

    public Byte getFuelGas() {
        return fuelGas;
    }

    public void setFuelGas(Byte fuelGas) {
        this.fuelGas = fuelGas;
    }

    public String getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(String heatingType) {
        this.heatingType = heatingType == null ? null : heatingType.trim();
    }

    public String getTenancyTerm() {
        return tenancyTerm;
    }

    public void setTenancyTerm(String tenancyTerm) {
        this.tenancyTerm = tenancyTerm == null ? null : tenancyTerm.trim();
    }

    public String getSeeApartment() {
        return seeApartment;
    }

    public void setSeeApartment(String seeApartment) {
        this.seeApartment = seeApartment == null ? null : seeApartment.trim();
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

    public Byte getHeating() {
        return heating;
    }

    public void setHeating(Byte heating) {
        this.heating = heating;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit == null ? null : deposit.trim();
    }

    public String getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(String serviceCharge) {
        this.serviceCharge = serviceCharge == null ? null : serviceCharge.trim();
    }

    public String getAgencyFee() {
        return agencyFee;
    }

    public void setAgencyFee(String agencyFee) {
        this.agencyFee = agencyFee == null ? null : agencyFee.trim();
    }

    public Date getMaintainTime() {
        return maintainTime;
    }

    public void setMaintainTime(Date maintainTime) {
        this.maintainTime = maintainTime;
    }

    public Integer getMaintainAgentId() {
        return maintainAgentId;
    }

    public void setMaintainAgentId(Integer maintainAgentId) {
        this.maintainAgentId = maintainAgentId;
    }
}