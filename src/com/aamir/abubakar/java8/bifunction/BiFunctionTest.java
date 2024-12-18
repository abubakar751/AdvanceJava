package com.aamir.abubakar.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String, String, Integer> biFunction=(s,s1) -> s.compareToIgnoreCase(s1);
System.out.println(biFunction.apply("Abubakar", "abu bakar"));
	}

}
