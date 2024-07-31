package com.aamir.abubakar.function;

import java.util.function.Function;

public class FunctionDevi {

	public static void main(String[] args) {
   Function<Integer,Integer> function= dev -> dev/3;
   System.out.println(function.apply(77));
	}

}
