package com.aamir.abubakar.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BiFunction<String, Integer, String> biFunction=(a,s) -> a.repeat(10); 
      System.out.println(biFunction.apply("Abubakar ", 2));
	}

}
