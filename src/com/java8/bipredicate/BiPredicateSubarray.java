package com.java8.bipredicate;
import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateSubarray {
    public static void main(String[] args) {
        BiPredicate<int[], int[]> isSubarray = (arr1, arr2) -> {
            for (int i = 0; i <= arr2.length - arr1.length; i++) {
                if (Arrays.equals(Arrays.copyOfRange(arr2, i, i + arr1.length), arr1)) {
                    return true;
                }
            }
            return false;
        };
        
        int[] arr1 = {2, 3};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(isSubarray.test(arr1, arr2));  // Output: true
    }
}
