package com.aamir.abubakar.java8.consumer;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class ConsumerSet2 {
	public static void main(String[] args) {
  Set<Integer> treeSet = new TreeSet<>();
  treeSet.add(46);
  treeSet.add(89);
  treeSet.add(38);
  treeSet.add(8);
  treeSet.add(389);
  Consumer<Set> consumer= set ->System.out.println(set);
  consumer.accept(treeSet);
  
	}
}
