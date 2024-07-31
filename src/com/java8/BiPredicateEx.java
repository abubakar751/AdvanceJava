package com.java8;

import java.util.function.BiPredicate;

public class BiPredicateEx implements BiPredicate<Integer, Integer>{

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> bp=(a,b) -> a*b==24;
		
		System.out.println(bp.test(8,8) 
				);
	}

}
