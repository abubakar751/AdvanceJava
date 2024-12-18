package com.java8.consumer;

import java.util.function.Consumer;

public class ConsumerAdd {
	public static void main(String[] args) {
		Consumer<Integer> cn=add -> System.out.print(add+10);
		cn.accept(10);
	}

}
