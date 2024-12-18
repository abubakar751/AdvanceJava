package com.java8.function;

import java.util.function.Function;

public class FunctionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> function = leng -> leng.length();
		System.out.println(function.apply("Abubakar"));
	}

}

