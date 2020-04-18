package com.datetest.userprofile;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.datetest.userprofile.mappers")
public class UserProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProfileApplication.class, args);
	}

}
