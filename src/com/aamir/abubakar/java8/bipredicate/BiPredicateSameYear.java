package com.aamir.abubakar.java8.bipredicate;

import java.util.Date;
import java.util.function.BiPredicate;
import java.util.Calendar;

public class BiPredicateSameYear {
    public static void main(String[] args) {
        BiPredicate<Date, Date> isSameYear = (date1, date2) -> {
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.setTime(date1);
            cal2.setTime(date2);
            return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
        };
        
        Date date1 = new Date(2022, Calendar.JANUARY, 1);
        Date date2 = new Date(2022, Calendar.DECEMBER, 31);
        System.out.println(isSameYear.test(date1, date2));  // Output: true
    }
}
