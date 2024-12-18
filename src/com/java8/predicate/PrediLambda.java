package com.java8.predicate;

import java.util.function.Predicate;

public class PrediLambda  {

	public static void main(String[] args) {
		Predicate<Integer> isPredicate =(value)-> value%2==0;
		System.out.println(isPredicate.test(11		));
		

	}

}
