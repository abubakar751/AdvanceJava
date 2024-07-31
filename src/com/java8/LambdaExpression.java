package com.java8;
 interface Functional{
	  int show(int a);
	   default void m() {
		   System.out.println(" hii ");
		   
	   }
	 default void  print() {
		 System.out.println("Hello");
	 }
 }
public class LambdaExpression {
	

	public static void main(String[] args) {
		Functional fo= (a)-> a*2; 
		{System.out.println(" kjj "+fo.show(10));
		fo.m();
		fo.print();
		
		}

	}

	
	
}
