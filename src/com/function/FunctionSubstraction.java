package com.aamir.abubakar.function;

import java.util.function.Function;

public class FunctionSubstraction {

	public static void main(String[] args) {
	Function<Integer,Integer> function= subs -> subs-4;
	System.out.println(function.apply(45));
	}

}
