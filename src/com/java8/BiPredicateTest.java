package com.java8;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<String ,String> bi=(s,s1) ->(s+s1).contains("q");
		String s="Hel";
		String s1="lo world";
		System.out.println(bi.test(s, s1));
	}

}
