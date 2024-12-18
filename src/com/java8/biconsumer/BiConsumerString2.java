package com.java8.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerString2 {
public static void main(String[] args) {
	BiConsumer<String,String> biConsumer=(str,str2) ->System.out.println(str.replaceAll(str, str2));
	biConsumer.accept("Ansarul", "Abubakr");
}
}
