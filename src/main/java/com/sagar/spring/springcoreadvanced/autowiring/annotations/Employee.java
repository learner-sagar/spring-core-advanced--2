package com.sagar.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired(required=false)
	@Qualifier("address1")
	private Address address;
	
//	@Autowired
//	Employee(Address address){
//		System.out.println("constructor based injection");
//		this.address = address;
//	}
	
	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("setter based injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
