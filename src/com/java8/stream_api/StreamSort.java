package com.java8.stream_api;

import java.util.List;

public class StreamSort {
    public static void main(String[] args) {
        List<Integer> integers = List.of(4, 6, 7, 29, 2, 2);
        integers.stream().sorted().forEach(System.out::println);
    }
}
