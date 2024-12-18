package com.aamir.abubakar.java8.function;

import java.util.function.Function;

public class FunctionDevi {

	public static void main(String[] args) {
   Function<Integer,Integer> function= dev -> dev/3;
   Integer apply = function.apply(77);
   System.out.println(apply);
	}

}
