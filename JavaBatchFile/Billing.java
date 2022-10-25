//Programmer: Brenan Marenger
//Date: 2/17/20
//Assignment: Ch4 Ex2
//Description: Create  a class that includes 3 overloaded methods for a photo book store

public class Billing {
	
public static void main(String args[]){
   double yourTotal;
    yourTotal = computeBill(24.99);
    displayTotal (yourTotal);
    yourTotal = computeBill (17.50, 4);
    displayTotal(yourTotal);
    yourTotal = computeBill(10, 6, 20); 
    displayTotal (yourTotal);
 }
 public static double computeBill (double price) 
{double total = price * 1.08;
 System.out.print ("For a photobook that costs $" + price);
 return total;}

public static double computeBill (double price, int qty) {
double subtotal = price * qty;
double total = subtotal * 1.08;
System.out.print ("For " + qty + " photobooks that cost $" + price);
return total;
 }

public static double computeBill (double price, int qty, double discount) {
double subtotal = price * qty;
 subtotal = subtotal - (discount);    
 double total = subtotal * 1.08;
System.out.print ("For " + qty + " photobooks that cost $" + price + " with a $" + (discount) + " coupon"); 
return total;
}
public static void displayTotal (double total){
    System.out.print(", the total after tax is $" + total + "\n");
  }
  }  