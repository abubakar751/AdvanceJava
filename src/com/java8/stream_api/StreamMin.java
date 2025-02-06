package com.java8.stream_api;

import java.util.List;

public class StreamMin {
    public static void main(String[] args) {
        List<Integer> integers = List.of(4, 6, 7, 29, 2, 2);
        Integer i = integers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(i);
    }
}
