package com.aamir.abubakar.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionString2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
  BiFunction<Integer,String, String> biFunction=(a,g) ->a.toUnsignedString(6);
  System.out.println(biFunction.apply(3, "Abu Bakar"));
	}

}
