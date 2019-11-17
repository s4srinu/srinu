package com.Lamda.examples;

import java.util.ArrayList;

public class LamdaExample1 {
	
	
	public static void main(String[] args) {
		
		AddInterface login  = (String userId) -> { 
			boolean validUser= false;
			System.out.println("Enter into the method" + userId);
			System.out.println("validin the user id");
			System.out.println("Connecting with DB"); 
			System.out.println("Connected with DB"); 
			
			if(userId.equals("Lazy")) {
				validUser = true;
			}
			return validUser;
			
			
			};
			ArrayList<Integer> list = new  ArrayList<>();
			createList(list);
			System.out.println("================= All Number ++++++++++++++++++++++++++++++");
			showValues(list);
			
			System.out.println("================= Even Number ++++++++++++++++++++++++++++++");
			showEvenValues(list);
			System.out.println("================= Odd Number ++++++++++++++++++++++++++++++");
			showOddValues(list);
			
			if(login.validLogin("Lazy1")) {
				System.out.println("Valid user !!!!!!");
			} else {
				
				System.out.println("INValid user !!!!!!");
			}
		
	}

	private static void showValues(ArrayList<Integer> list) {
		
		list.stream().forEach(n -> System.out.println(n));
	}
	
private static void showEvenValues(ArrayList<Integer> list) {
		
		list.stream().forEach(n -> {
			if(n % 2 == 0) System.out.println(n);
		});
	}

private static void showOddValues(ArrayList<Integer> list) {
	
	list.stream().forEach(n -> {
		if(!(n % 2 == 0)) System.out.println(n);
	});
}

	private static void createList(ArrayList<Integer> list) {
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
	}
	

}
