package com.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionMul {

	public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> biFunction=(c,d) -> c*d;
    System.out.println(biFunction.apply(10, 125));
	}

}
