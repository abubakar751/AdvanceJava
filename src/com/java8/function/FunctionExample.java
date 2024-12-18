package com.java8.function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer, Integer> function = (name) -> name * 10;
		System.out.println(function.apply(10));
		;

	}
}
