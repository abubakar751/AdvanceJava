package com.java8;

interface DoublePram {
	int test(int a, int b);
}

public class DoubleParam {

	public static void main(String[] args) {
		DoublePram doublePram = (a, b) -> {
			if (a < b)
				throw new RuntimeException(" a > b not must be  ");

			return a;
		};

	System.out.println(doublePram.test(10, 20));

	}
}
