package com.aipalbot.secondjava;

public class Human {
double height;
String name;
int age;
String eyeColor;



public Human(double height, String name, int age, String eyeColor) {
	super();
	this.height = height;
	this.name = name;
	this.age = age;
	this.eyeColor = eyeColor;
}
public void speak() {
	System.out.println("My name is " + name);
	System.out.println("I am "+ age +" years old");
	System.out.println("I am "+ height+"ft tall ");
	System.out.println("my eyes color are "+ eyeColor);
}
public void walk() {
	System.out.println("walking");

}
public void eat() {
	System.out.println("Eating");
}


	
}
