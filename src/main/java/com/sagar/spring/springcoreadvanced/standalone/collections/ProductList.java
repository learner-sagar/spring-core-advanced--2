package com.sagar.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class ProductList {
	private List ProductNames;

	public List getProductNames() {
		return ProductNames;
	}

	public void setProductNames(List productNames) {
		ProductNames = productNames;
	}

	@Override
	public String toString() {
		return "ProductList [ProductNames=" + ProductNames + "]";
	}
	
	
}
