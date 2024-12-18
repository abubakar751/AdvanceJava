package com.aamir.abubakar.java8.biconsumer;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Map<Integer,Integer>, Map<String,String>> biConsumer=(map,map2)-> System.out.println(map+" "+map2);
		biConsumer.accept(Map.of(2,3,4,6,7,8,8,3), Map.of("abu","bakar","Ansarul","haque"));

	}

}
