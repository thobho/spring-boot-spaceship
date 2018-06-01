package com.sda.spring.springboot.service;

import com.sda.spring.springboot.model.ShipType;
import com.sda.spring.springboot.model.SpaceShip;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShipService {
    private final SpaceShipFactory spaceShipFactory;

    public ShipService(SpaceShipFactory spaceShipFactory) {
        this.spaceShipFactory = spaceShipFactory;
    }

    public List<SpaceShip> createShips(int howMany, ShipType shipType){
        List<SpaceShip> result = new ArrayList<>(howMany);
        for (int i = 0; i < howMany; i++) {
            result.add(spaceShipFactory.createSpaceShip(shipType));
        }
        return result;
    }
}
