package com.aamir.abubakar.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionSubs {
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> biFunction=(a,d )-> a-d;
	
	System.out.println(biFunction.apply(40, 60));
}
}
