package com.aamir.abubakar.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerList2 {
public static void main(String[] args) {
	List<Integer> arrayList = new ArrayList<>();
	arrayList.add(2);
	arrayList.add(9);
	arrayList.add(7);
	 Consumer<List> consumer=list -> System.out.println(list.remove(0));
   consumer.accept(arrayList);
} 
}
