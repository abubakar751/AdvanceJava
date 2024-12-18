package com.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionAdd {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction= (a,b) -> a+b;
		System.out.println(biFunction.apply(20, 30));

	}

}
