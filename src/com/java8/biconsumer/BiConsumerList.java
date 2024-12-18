package com.java8.biconsumer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		BiConsumer<List<Integer>,List<Integer>> biConsumer=(list,list1) -> System.out.println(list+" "+list1); ;
	biConsumer.accept(List.of(678,78),List.of(4,5,6,7));
	}

}
