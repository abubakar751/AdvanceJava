package com.aamir.abubakar.java8.bifunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<String> list=new ArrayList<>(); list.add("bsa"); list.add("sa");
		 * list.add("ba"); List<String> list1=new ArrayList<>(); list1.add("dhdi");
		 * list1.add("di"); list1.add("dh");
		 */
		BiFunction<List<String>, List<String>, List<String>> biFunction=(list,list2) -> {
			List<String> listcomb=new ArrayList<>(list);
			listcomb.addAll(list2);
			return listcomb;
			};
		System.out.println(biFunction.apply(Arrays.asList("as","sd","dsad"),(Arrays.asList("ds","es" ," gd"))));
		}
	

}
