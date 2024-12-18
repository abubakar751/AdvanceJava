package com.java8.function;

import java.util.List;
import java.util.function.Function;

public class FunctionList {

	public static void main(String[] args) {
		
		Function<List<String>, Integer>  function  = list -> list.size();
		System.out.println(function.apply(List.of("sd", "sdw", "ass")));
		
		
		
	};
	
	

}
