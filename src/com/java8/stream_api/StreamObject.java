package com.java8.stream_api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(43);
        list.add(34);
        list.add(66);
        list.add(78);
        Stream<Integer> stream = list.stream();
        stream.forEach(list2 -> System.out.println(list2));
    }
}
