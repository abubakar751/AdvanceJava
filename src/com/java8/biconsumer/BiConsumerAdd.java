package com.java8.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BiConsumer<Integer,Integer> biConsumer=(a,b) -> System.out.println(a+b);
    biConsumer.accept(10,35);
	}

}
