package com.java8.optional_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        String string = null;
        Optional<String> string1 = Optional.ofNullable(string);
        System.out.println(string1.isEmpty());
        System.out.println(string1.isPresent());
       //  System.out.println(string1.get());
        System.out.println(string1.orElse("No value is present"));
    
    }
}
