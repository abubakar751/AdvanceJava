package com.java8.supplier;

import java.util.function.Supplier;

public class SupplierMdls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> supplier = () -> 22%2;
		Integer integer = supplier.get();
		System.out.println(integer);
	}

}
