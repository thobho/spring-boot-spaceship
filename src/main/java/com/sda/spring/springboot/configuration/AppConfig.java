package com.sda.spring.springboot.configuration;


import com.sda.spring.springboot.service.SpaceShipFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:shipfactory.properties")
public class AppConfig {

    @Value("${ship.example.names}")
    private String[] elementToSearch;

    @Bean(name = "MySpaceShipFactory")
    public SpaceShipFactory createSpaceShipFactory(){
        return new SpaceShipFactory(elementToSearch);
    }
}
