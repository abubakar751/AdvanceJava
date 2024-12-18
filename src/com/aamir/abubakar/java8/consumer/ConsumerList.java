package com.aamir.abubakar.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerList {
public static void main(String[] args) {
	List<String> arrayList = new ArrayList<>();
	arrayList.add("i");
	arrayList.add("am");
	arrayList.add("Abu Bakar");
	
	Consumer< List> consumer= list -> System.out.println(list.toString());
	consumer.accept(arrayList);
}
}
