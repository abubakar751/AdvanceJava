package com.java8.bipredicate;
import java.util.function.BiPredicate;

public class BiPredicateEqualLength {
    public static void main(String[] args) {
        BiPredicate<String, String> isEqualLength = (s1, s2) -> s1.length() == s2.length();
        
        String str1 = "hello";
        String str2 = "world";
        System.out.println(isEqualLength.test(str1, str2));  // Output: true
    }
}
