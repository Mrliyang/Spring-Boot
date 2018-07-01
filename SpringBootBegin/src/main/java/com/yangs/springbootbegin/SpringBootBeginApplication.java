package com.yangs.springbootbegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@Configuration
//@ImportResource(locations = {"classpath:META-INF/spring/application-bean.xml"})
public class SpringBootBeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBeginApplication.class, args);
	}
}
