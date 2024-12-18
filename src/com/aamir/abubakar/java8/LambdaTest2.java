package com.aamir.abubakar.java8;
 interface LambdaInterface{
  int  show(int a, int b);
 }
public class LambdaTest2 {

	public static void main(String[] args) {
		
 LambdaInterface lambdaInterface=(a,b)-> { return a+b;};
 
 System.out.println(lambdaInterface.show(10,30));
 }
	}


