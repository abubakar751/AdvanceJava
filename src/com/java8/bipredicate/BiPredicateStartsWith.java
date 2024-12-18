package com.java8.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateStartsWith {
    public static void main(String[] args) {
        BiPredicate<String, String> startsWith = (s1, s2) -> s1.startsWith(s2);
        
        String str1 = "hello";
        String str2 = "he";
        System.out.println(startsWith.test(str1, str2));  // Output: true
    }
}
