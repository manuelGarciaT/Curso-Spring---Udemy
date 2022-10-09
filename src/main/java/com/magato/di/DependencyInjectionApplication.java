package com.magato.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.magato.di.autowire.AreaCalculatorService;

@SpringBootApplication
public class DependencyInjectionApplication {

	private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

	//Declaración ecxplícita
	@Bean
	public String getApplicationName() {
		return"Objeto que se devuelve al inyectar un Bean de tipo String";
		}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		AreaCalculatorService calculator = context.getBean(AreaCalculatorService.class);
		log.info("Area Total {} ",calculator.calcAreas());

	}

}
