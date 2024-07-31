package com.java8;

interface PrediInterface<T> {

	boolean test(Integer integer);
}

public class PrediClass implements PrediInterface<Integer> {

	public static void main(String[] args) {
		PrediInterface<Integer> prediInterface = new PrediClass();
		prediInterface.test(10);

	}

	@Override
	public boolean test(Integer integer) {
		if (integer % 2 == 0) {
			System.out.println(" is even");
			return true;
		}
		return false;

	}

}
