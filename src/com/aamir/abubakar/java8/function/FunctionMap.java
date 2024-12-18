package com.aamir.abubakar.java8.function;

import java.util.Map;
import java.util.function.Function;

public class FunctionMap {

	public static void main(String[] args) {
		Function<Map<Integer,String >, String> function=map -> map.toString();
		String apply = function.apply(Map.of(101,"AbuBakar"));
		String apply2 =function.apply(Map.of(102,"Umair"));
		String apply3=function.apply(Map.of(103,"Ansarul"));
		String apply4= function.apply(Map.of(104,"Abu"));
		System.out.println(apply +" "+apply2+" "+apply3+" "+apply4);
		
	}

}
