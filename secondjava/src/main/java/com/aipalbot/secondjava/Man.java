package com.aipalbot.secondjava;

public class Man extends Human implements Danceable{
	public Man(double height, String name, int age, String eyeColor) {
	super(height,name,age,eyeColor);	
	}
public void sleep() {
	System.out.println("I am sleeping");
}
public void Dance() {
	System.out.println("I can dance...");
}
}
