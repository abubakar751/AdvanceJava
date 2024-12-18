package com.java8.consumer;

import java.util.function.Consumer;

public class ConsumerMulti {
public static void main(String[] args) {
	Consumer <Integer> cn=multi ->System.out.println(multi*30);
	cn.accept(20);
}
}
