package com.tanveer.spring.springadvanced.standalone.collections;

import java.util.List;

public class ProductList {
	public List<String> productNames;
	
	
	@Override
	public String toString() {
		return "ProductList [productNames=" + productNames + "]";
	}

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}


	
}
