package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateUser {

	public static void main(String[] args) {
		int a = 0;

		Predicate<Integer> pr = (b) -> false;
		{
			if (a > 18) {
				System.out.println("user eligible");

			}

		}
		;
		System.out.println(pr.test(10));

	}

}
