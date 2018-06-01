package com.sda.spring.springboot.client;

import com.sda.spring.springboot.model.ShipType;
import com.sda.spring.springboot.model.SpaceShip;
import com.sda.spring.springboot.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fleet {

    @Autowired
    ShipService shipService;

    private List<SpaceShip> spaceShips = new ArrayList<>();

    public void getMoreShips(){
        spaceShips.addAll(shipService.createShips(4, ShipType.BATTLECRUISER));
    }

    public void printReport(){
        spaceShips.forEach(System.out::println);
    }
}
