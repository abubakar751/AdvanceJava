package com.aamir.abubakar.java8.biconsumer;

import java.util.Set;
import java.util.function.BiConsumer;

public class BiConsumerSet {
	public static void main(String[] args) {
		BiConsumer<Set<Integer>,Set<Integer>> biConsumer=(list,list1) -> System.out.println(list+" "+list1); ;
		biConsumer.accept(Set.of(8,7,6),Set.of(4,5,6,7));
	}

}
