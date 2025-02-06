package com.java8.refrence.method_ref;

import java.util.List;

public class InstanceMethod {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 2, 3, 4, 5, 6, 7, 8);
        integers.stream().forEach(System.out::println);

    }
}
