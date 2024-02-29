package com.cg.Springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean()
	public Employee getEmployee() {
		return new Employee(1, "Nejam",12000,new Address(12, "Bojboj", "Howrah") );
	}

}
