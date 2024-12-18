package com.java8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supplier<Integer> supplier=()-> new Random().nextInt(19);
for(int i=0;i<10;i++) {
	System.out.println(supplier.get());
}
	}

}
