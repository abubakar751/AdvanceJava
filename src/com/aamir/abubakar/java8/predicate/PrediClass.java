package com.aamir.abubakar.java8.predicate;

import java.util.function.Predicate;

public class PrediClass  {

	public static void main(String[] args) {
		Predicate<Integer> prediInterface=(Predicate<Integer>) new PrediClass();
		prediInterface.test(10);

	}

	public boolean test(Integer integer) {
		if (integer %2==0) {
		System.out.println(" is even");
		return  true;
		}
		return false;
		
	}

}
