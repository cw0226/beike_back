package com.kgc.pojo;

/**
 * 房源拓展类
 */
public class HousingEx extends Housing {
    private String communityName;   // 小区名
    private String block;   // 楼栋号
    private String uint;    // 单元号
    private String roomNumber;  // 门牌号

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getUint() {
        return uint;
    }

    public void setUint(String uint) {
        this.uint = uint;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
