package com.java8.consumer;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class ConsumerSet {
public static void main(String[] args) {
    Set<Integer> hashSet = new HashSet<>();
    hashSet.add(8);
    hashSet.add(06);
    hashSet.add(2002);
    Consumer<Set> consumer= set ->System.out.println(set.toString());
    consumer.accept(hashSet);
}
}
