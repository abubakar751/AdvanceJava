package com.aamir.abubakar.java8.predicate;

import java.util.function.Predicate;

public class PredicateTestMulti {

	public static void main(String[] args) {
      Predicate<Integer> predicate=(a) -> a*2==34; System.out.println(predicate.test(10));
      
	}

}
