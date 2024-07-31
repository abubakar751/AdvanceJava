package com.java8;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> pr=x-> x%2==0;
		System.out.println(pr.test(9));
		

	}

}
