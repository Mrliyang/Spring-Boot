package com.yangs.springbootbegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@Configuration
//@ImportResource(locations = {"classpath:META-INF/spring/application-bean.xml"})
public class SpringBootBeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBeginApplication.class, args);
	}
}
