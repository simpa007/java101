package com.aipalbot.secondjava;

public class Method {

	public static void main(String[] args) {
	System.out.println("Hello World");
	printSomeJunk(22);
   
	}
	public static void printSomeJunk(String argument) {
		System.out.println("some bla bla bla "+ argument);
	}
	public static void printSomeJunk(int argument) {
		System.out.println("integer passed "+ argument);
	}

		

	
}


