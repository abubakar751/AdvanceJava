package com.java8.supplier;

import java.util.Arrays;

public class SupplierArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6};
		int asInt = Arrays.stream(arr).min().getAsInt();
		System.out.println(asInt);
		
	}

}
