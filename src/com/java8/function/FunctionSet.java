package com.java8.function;

import java.util.Set;
import java.util.function.Function;

public class FunctionSet {

	public static void main(String[] args) {
		Function<Set<String>, Boolean> function = set -> set.isEmpty();
		System.out.println(function.apply(Set.of("As", "Ns", "Av", " Am")));
	}

}
