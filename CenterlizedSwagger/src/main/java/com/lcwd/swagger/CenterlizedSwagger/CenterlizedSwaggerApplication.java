package com.lcwd.swagger.CenterlizedSwagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
@EnableScheduling
public class CenterlizedSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CenterlizedSwaggerApplication.class, args);
	}

}
