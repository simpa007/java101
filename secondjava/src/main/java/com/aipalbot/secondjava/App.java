package com.aipalbot.secondjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args) throws FileNotFoundException
    {
      /* System.out.println( "Hello world!" );
        //variable declaration
        int quantity;
        //variable definition or initialization
        double price =56.30;
        //write a program to calculate the cost of selling 3 oranges at the rate of 50
        int quantity1=3;
        int price1=50;
        int totalCost = quantity1 * price1;
        System.out.println("total amount to pay is = " + totalCost);
        */
   /*int totalPrice;
   int quantity = 8;
   int costPerItem = 3;
   int newTotalPrice= 0;
   totalPrice = quantity * costPerItem;
   System.out.println("Total price of the item is = " + totalPrice);
   if(totalPrice > 20)
   {
	 newTotalPrice = totalPrice - (2 * costPerItem);//B0DMAS
	
   }
   System.out.println("The Discounted price is = " + newTotalPrice);
     */
 //ARRAYS
/* double [] values = new double [100];//100 arrays
 values[0] = 1000;//arrays declaration
 values[99] = 93432;
 values[1] = 33.67;
 System.out.println(values[99]); 
 String [] words = new String [] {"my","name","is"};
 System.out.println(words[2]);
 */
  //CONTROL FLOW
   /*boolean hungry = false;
   if(hungry) {
	   System.out.println("I'm hungry....");
   }else {
	   System.out.println("I am not hungry..");
	  
   }
 //SWITCH STATEMENT
   int monthDay;
   String month;
   switch(monthDay=6) {
   case 1: month = "January";
   break;
   case 2: month = "Feburary";
   break;
   case 3: month = "March";
   break;
   case 4: month = "April";
   break;
   case 5: month = "May";
   break;
   case 6: month = "June";
   break;
   case 7: month = "July";
   break;
   case 8: month = "August";
   break;
   case 9: month = "September";
   break;
   case 10: month = "October";
   break;
   case 11: month = "November";
   break;
   case 12: month = "December";
   break;
   default: month ="Unknown";
   break;
   }
    System.out.println(month);
    */
   /* 	
   Human human1=new Human(5.5,"Simpa Emmanuel",16,"black");
   Human human2=new Human(6.0,"Emmanuel Munachi",25,"brown");
   Human human3=new Human(7.2,"Goodness Ebacha",32,"green");
   human1.speak();
   System.out.println("...........");
   human2.speak();
   System.out.println("...........");
   human3.speak();
   Man man1=new Man(2.2,"Tobi Emmanuel",22,"purple");
   man1.speak();
   man1.sleep();
   Man man2=new Man(6.3,"christy",41,"gray");
   man2.Dance();
   
//checking for Equality
   String a ="hello";
   if(a.equalsIgnoreCase("Hello")) {
   System.out.println("print hello");
 //WHILE LOOP
   int count = 0;
   while(count <=20) {
	   System.out.println("Simpa: " + count);
	   count ++;
if(count == 10) {
	break;
}
   }
  
   }
  
  for(int i = 0; i<100; i++) {
	  System.out.println("i : "+ i);
  }
  String name ="kingdomheaven";
  for(int i=name.length()-1; i >=0 ; i--) {
	  System.out.println("char : "+ name.charAt(i));
  }
   for(int i =0; i<=100; i=i +2) {
	   System.out.println("even number : "+ i);
   }
   */
    	
    	
    	
   
 //5,2,4,7,11,12,17 
//	int [] numbers = new int[7];
//	int size =numbers.length;
//	for(int i = 0; i < size; i++) {
//		System.out.println("Enter number for index " + i);
//		Scanner input = new Scanner(System.in);
//		int num =input.nextInt();
//		numbers[i]=num;
//	}
//	System.out.println("print even and odd numbers");
//	for(int j =0; j < size; j++) {
//		if(numbers[j] % 2 ==0) {
//			System.out.println(numbers[j] + " : even number");
//		}else {
//			System.out.println(numbers[j] + " : odd number");
//		}
//	}
	
    	/*Scanner scanner = new Scanner(System.in); 
    	 int [] numbers = new int[0]; 
    	 int number; 
    	 String nextLine; 
    	 do { 
    	 System.out.print("Enter the number : "); 
    	 number = scanner.nextInt(); 
    	 nextLine = scanner.nextLine(); 
    	 if(number != 0) { 
    	 numbers = add(numbers, number); 
    	 } 
    	 } while(number != 0); 
    	 int negativeSum = 0;  
    	 int oddSum = 0;  
    	 int evenSum = 0; 
    	 for(int i = 0; i < numbers.length; i++ ) 
    	 { 
    	 if( numbers[i] < 0 ) 
    	 { 
    	 negativeSum = negativeSum + numbers[i]; 
    	 } 
    	 else if( numbers[i] % 2 == 0 ) 
    	 { 
    	 evenSum = evenSum + numbers[i]; 
    	 } 
    	 else 
    	 { 
    	 oddSum = oddSum + numbers[i]; 
    	 } 
    	 } 
    	 System.out.println( "Sum of negative numbers : " + negativeSum ); 
    	 System.out.println( "Sum of positive even numbers: " + evenSum ); 
    	 System.out.println( "Sum of positive odd numbers: " + oddSum ); 
    	 } 
    	 private static int[] add(int[] numbers, int number) { 
    	 int[] tempArray = new int[numbers.length + 1]; 
    	 for(int i = 0; i < numbers.length; i++) { 
    	 tempArray[i] = numbers[i]; 
    	 } 
    	 tempArray[tempArray.length - 1] = number; 
    	 return tempArray; 
    	 } 
    	*/
    	//Allowing users enter data
    	/*for(int i = 0; i < 3; i++) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Entered some Text:");
    	String text = input.nextLine();
    	System.out.println(text);
    	}
    	*/
    	
    	//Reading from files
    	File file = new File("myfile.txt");
    	Scanner input = new Scanner(file);
    	while(input.hasNextLine()) {
    	String line = input.nextLine();
    	System.out.println(line);
    	}
    	input.close();
    	
    	
    }
}
   
   

