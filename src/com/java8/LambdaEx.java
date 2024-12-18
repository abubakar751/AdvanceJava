package com.java8;
interface LambdaInt{
	void show (int a );
}

public class LambdaEx {

	public static void main(String[] args) {
		LambdaInt lambdaInt=(aa)-> System.out.println(" hello   "+aa);
		 lambdaInt.show(766);

	}

}
