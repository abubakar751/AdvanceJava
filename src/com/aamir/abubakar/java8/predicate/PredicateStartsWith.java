package com.aamir.abubakar.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateStartsWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (startsWithA.test(name)) {
                filteredNames.add(name);
            }
        }
        
        System.out.println(filteredNames);  // Output: [Alice]
    }
}
