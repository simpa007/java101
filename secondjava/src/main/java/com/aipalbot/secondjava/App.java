package com.aipalbot.secondjava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
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
   boolean hungry = false;
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
    }
  
}
