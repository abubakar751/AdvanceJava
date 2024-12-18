package com.java8.bipredicate;
import java.util.function.BiPredicate;

class Rectangle {
    int x, y, width, height;
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

public class BiPredicateRectangleOverlap {
    public static void main(String[] args) {
        BiPredicate<Rectangle, Rectangle> doOverlap = (rect1, rect2) -> {
            return rect1.x < rect2.x + rect2.width &&
                   rect1.x + rect1.width > rect2.x &&
                   rect1.y < rect2.y + rect2.height &&
                   rect1.y + rect1.height > rect2.y;
        };
        
        Rectangle rect1 = new Rectangle(0, 0, 4, 4);
        Rectangle rect2 = new Rectangle(2, 2, 4, 4);
        System.out.println(doOverlap.test(rect1, rect2));  // Output: true
    }
}
