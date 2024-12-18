package com.aamir.abubakar.java8.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Map<Integer,String> hashMap = new	HashMap<>();
	 hashMap.put(2, "Zulfiqar");
	 hashMap.put(3, "Bakar");
	 hashMap.put(1, "Abu");
	 hashMap.put(4, "Abu Bakar");
	 Consumer<Map> consumer=map ->System.out.println(map);
	 consumer.accept(hashMap);

	}

}
