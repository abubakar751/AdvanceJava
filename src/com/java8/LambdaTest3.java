package com.java8;
interface Lbda{
	int show(int a,int b);
	 default void show2() { 

		System.out.println("jdoajo");
	}
	
}
public class LambdaTest3 {

	public static void main(String[] args) {

		Lbda l=(c,d) ->  c*d;;
		      System.out.println(l.show(10,1));
		l.show2();
		
	}

}
