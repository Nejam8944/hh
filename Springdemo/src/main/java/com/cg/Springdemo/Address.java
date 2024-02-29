package com.cg.Springdemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
	private int houseNmber;
	private String streetName;
	private String location;
	
}
