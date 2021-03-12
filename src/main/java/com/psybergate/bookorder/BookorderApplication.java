package com.psybergate.bookorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.psybergate" +
		""})
public class BookorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookorderApplication.class, args);
	}

}
