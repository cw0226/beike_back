package com.kgc.pojo;

public class Building {
    private Integer id;

    private String block;

    private String uint;

    private String roomNumber;

    private Integer communityBuilding;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block == null ? null : block.trim();
    }

    public String getUint() {
        return uint;
    }

    public void setUint(String uint) {
        this.uint = uint == null ? null : uint.trim();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public Integer getCommunityBuilding() {
        return communityBuilding;
    }

    public void setCommunityBuilding(Integer communityBuilding) {
        this.communityBuilding = communityBuilding;
    }
}