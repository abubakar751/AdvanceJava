package com.aamir.abubakar.java8.supplier;

import java.util.function.Supplier;

public class SupplierAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> supplier = () -> 109+19;

        Integer integer= supplier.get();
        System.out.println(integer);
	}

}
