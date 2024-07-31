package com.java8;
interface Lambda{
	int show(int a) ;
}
public class LambdaTest {

	public static void main(String[] args) {
		Lambda lm=(a)-> a; System.out.println("hello "+lm.show(10) );
		;
		
		

	}

}
