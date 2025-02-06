package com.java8.stream_api;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamForFilter {
    public static void main(String[] args) {
        List<String> list = List.of("AbuBakar", "Zeeshan", "SRK", "Adnan");
        List<String> a = list.stream().filter(list2 -> list2.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);
        List<Integer> integers = List.of(2, 23, 7, 8, 9, 9);
        List<Integer> collect = integers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);
        integers.stream().forEach(e-> System.out.println(e));
    }
}
