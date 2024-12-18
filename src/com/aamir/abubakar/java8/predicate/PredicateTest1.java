package com.aamir.abubakar.java8.predicate;

import java.util.function.Predicate;

public class PredicateTest1 {

	public static void main(String[] args) {
		Predicate<Integer> predicate=(a)  ->a%2==0; 

		System.out.println("Even ");
	predicate.test(3);
	}

}
