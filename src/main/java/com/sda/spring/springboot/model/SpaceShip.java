package com.sda.spring.springboot.model;

public class SpaceShip {
    private String name;
    private int shield;
    private ShipType shipType;

    public SpaceShip(String name, int shield, ShipType shipType) {
        this.name = name;
        this.shield = shield;
        this.shipType = shipType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", shield=" + shield +
                ", shipType=" + shipType +
                '}';
    }
}
