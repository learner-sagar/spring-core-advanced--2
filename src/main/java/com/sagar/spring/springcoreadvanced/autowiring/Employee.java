package com.sagar.spring.springcoreadvanced.autowiring;

public class Employee {
	private Address address;
	
	Employee(Address address){
		System.out.println("constructor based injection");
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setter based injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
