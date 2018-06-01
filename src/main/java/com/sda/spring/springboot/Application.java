package com.sda.spring.springboot;

import com.sda.spring.springboot.client.Fleet;
import com.sda.spring.springboot.configuration.AppConfig;
import com.sda.spring.springboot.service.ShipService;
import com.sda.spring.springboot.service.SpaceShipFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication(scanBasePackageClasses = {AppConfig.class, Fleet.class, ShipService.class})
public class Application implements CommandLineRunner {


	@Autowired
	private ApplicationContext appContext;

	@Autowired
	Fleet fleet;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		SpaceShipFactory shipFactory = appContext.getBean(SpaceShipFactory.class);
		System.out.println(shipFactory);
//
// 		String[] beans = appContext.getBeanDefinitionNames();
//		Arrays.sort(beans);
//		for (String bean : beans) {
//			System.out.println(bean);
//		}

		fleet.getMoreShips();
		fleet.printReport();
		System.out.println("MORE!!!");
		fleet.getMoreShips();
		fleet.printReport();


	}
}
