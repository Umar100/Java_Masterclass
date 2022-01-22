package com.megapinions.house;

import com.megapinions.house.components.Room;

public class House {

    private String houseType;
    private Room room1;

    public House(Room room1, String houseType) {
        this.room1 = room1;
        this.houseType = houseType;
    }

    public String getHouseType() {
        return houseType;
    }

    public Room getRoom1() {
        return room1;
    }
}
