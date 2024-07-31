package com.aamir.abubakar.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDev {

	public static void main(String[] args) {
    BiFunction<Integer,Integer, Integer> biFunction=(a,s) ->a/s;
    System.out.println(biFunction.apply(30, 45));
	}

}
