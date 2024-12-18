package com.aamir.abubakar.java8.bipredicate;
import java.util.function.BiPredicate;

public class BiPredicateContainsSubstring {
    public static void main(String[] args) {
        BiPredicate<String, String> containsSubstring = (s1, s2) -> (s1 + s2).contains("hello");
        
        String str1 = "he";
        String str2 = "llo world";
        System.out.println(containsSubstring.test(str1, str2));  // Output: true
    }
}
