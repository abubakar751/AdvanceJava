package com.aamir.abubakar.supplier;

import java.util.function.Supplier;

public class SupplierString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Supplier<String> supplier= ()-> "Hello Functional Programming";
    String string = supplier.get();
    System.out.println(string);
	}

}
	