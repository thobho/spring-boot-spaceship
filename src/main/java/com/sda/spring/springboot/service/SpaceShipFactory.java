package com.sda.spring.springboot.service;

import com.sda.spring.springboot.model.ShipType;
import com.sda.spring.springboot.model.SpaceShip;

import java.util.Random;

public class SpaceShipFactory {

    private final String[] names;

    public SpaceShipFactory(String[] names) {
        this.names = names;
    }

    public SpaceShip createSpaceShip(ShipType type){
        Random random = new Random();
        int strength = random.nextInt();
        String name = names[random.nextInt(3)];
        return new SpaceShip(name, strength, type);
    }

}
