package com.Lamda.examples;

public class AddMutliplyLamda {

	public static void main(String[] args) {
		
		operandInterface addition = (int a, int b) -> {
			System.out.println("Addition of two numbers : ");
			return a+b;
		};
		
		operandInterface mutlipication = (int a, int b) -> {
			System.out.println("Mutliplication of two numbers : ");
			return a*b;
		};
		
		
		/*
		 * System.out.println(addition.operation(10, 20));
		 * System.out.println(mutlipication.operation(10, 20));
		 */
		
		AddMutliplyLamda addMutliplyLamda = new AddMutliplyLamda();
		System.out.println(addMutliplyLamda.operate(10, 10, addition));
		System.out.println(addMutliplyLamda.operate(10, 10, mutlipication));
		
		
		
	}
	
	private int  operate(int a, int b, operandInterface interface1) {
		
		
		return interface1.operation(a,b);
		
	}
}
