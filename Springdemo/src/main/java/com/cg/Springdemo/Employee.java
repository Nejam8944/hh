package com.cg.Springdemo;


import java.net.Inet4Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	private int employeeId;
	private String Name; 
	private double salary;
	private Address address;
	
	
}
