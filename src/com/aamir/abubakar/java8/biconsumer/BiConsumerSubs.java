package com.aamir.abubakar.java8.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerSubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer,Integer> biConsumer=(a,b) -> System.out.println(a-b);
	    biConsumer.accept(110,35);
	}

}
