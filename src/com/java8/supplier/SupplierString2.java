package com.java8.supplier;

import java.util.function.Supplier;

public class SupplierString2 {
public static void main(String[] args) {
	 Supplier<String> supplier=()-> "Hello Sakinaka";
	 String string = supplier.get();
	 System.out.println(string.length());
}
}
