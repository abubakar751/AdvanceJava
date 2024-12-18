package com.java8.bipredicate;

import java.util.List;

import java.util.ArrayList;
import java.util.function.BiPredicate;

public class BiPredicateCommonElements {
    public static void main(String[] args) {
        BiPredicate<List<Integer>, List<Integer>> hasCommonElements = (list1, list2) -> {
            for (Integer i : list1) {
                if (list2.contains(i)) {
                    return true;
                }
            }
            return false;
        };
        
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(List.of(3, 4, 5));
        System.out.println(hasCommonElements.test(list1, list2));  // Output: true
    }
}
