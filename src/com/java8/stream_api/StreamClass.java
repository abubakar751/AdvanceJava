package com.java8.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 45, 6, 7, 8);
        Stream<Integer> stream = list.stream();
        List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        Stream<Integer> stream1 = list.stream();
        List<Integer> collect1 = stream1.filter(i -> i > 5).collect(Collectors.toList());


        System.out.println(collect1);
    }
}
