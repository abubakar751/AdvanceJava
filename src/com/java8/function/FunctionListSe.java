package com.java8.function;

import java.util.List;
import java.util.function.Function;

public class FunctionListSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<List<String>, String> function=list ->list.toString();
System.out.println(function.apply(List.of("sha","sf","dqwr")));
	}

}
