package com.aamir.abubakar.java8.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  BiConsumer<String,String> biConsumer=(str,str2) -> System.out.println(str + " "+str2);
	biConsumer.accept("abu", "bakar");
	}

}
