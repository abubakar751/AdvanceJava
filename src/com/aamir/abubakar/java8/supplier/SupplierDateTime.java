package com.aamir.abubakar.java8.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<LocalDateTime> supplier = LocalDateTime::now;
		LocalDateTime localDate = supplier.get();
		System.out.println("Time is " + localDate);
		int num = 66;
		System.out.println(Integer.bitCount(num));
	}

}
