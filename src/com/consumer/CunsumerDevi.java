package com.aamir.abubakar.consumer;

import java.util.function.Consumer;

public class CunsumerDevi {
	public static void main(String[] args) {
		Consumer<Integer> consumer=  devi ->System.out.println(devi/3);
		consumer.accept(289);
		
	}

}
