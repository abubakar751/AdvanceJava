package com.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDev {

	public static void main(String[] args) {
    BiFunction<Integer,Integer, String> biFunction=(a,s) -> s.toString()+" "+ a.toString();System.out.println();;
   
    System.out.println(biFunction.apply(30, 45));
	}

}
