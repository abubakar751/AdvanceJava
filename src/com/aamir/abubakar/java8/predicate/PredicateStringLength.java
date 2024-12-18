package com.aamir.abubakar.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateStringLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
        Predicate<String> lengthGreaterThan3 = name -> name.length() > 3;
        
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (lengthGreaterThan3.test(name)) {
                filteredNames.add(name);
            }
        }
        
        System.out.println(filteredNames);  // Output: [John, Jane, Jack]
    }
}
