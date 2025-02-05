package com.java8.test;
interface InterfaceTest{
    public void m();
}
public class Test {
    public static void main(String[] args) {
        InterfaceTest  test=()-> {
            System.out.println("Hello ");
        };
        test.m();
        Add add= ( a, b)->  a+b;;
        int add1 = add.add(10, 10);
        System.out.println(add1);
        LengthOfString leng=str -> str  ;
        String s = leng.lengthOfString("AbuBakar");
        System.out.println(s.length());
    }
}
