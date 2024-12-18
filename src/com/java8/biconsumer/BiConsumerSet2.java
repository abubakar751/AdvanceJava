package com.java8.biconsumer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		BiConsumer<List<Integer>,List<Integer>> biConsumer=(list,list1) ->
		System.out.println(list+" "+list1); ;
		biConsumer.accept(List.of(3,2,4),List.of(6,7,5,2,3));

	}

}
