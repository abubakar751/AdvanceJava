package com.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String, String, String> biFunction=(a,b) -> a.replaceFirst(a, b);
		System.out.println(biFunction.apply("abubakar", "Abu Bakar"));

	}

}
