//Programmer: Brenan Marenger
//Date: 2/20/20
//Assignemnt: Exercise Pay Program Ch5
//Description: Pay.java

import java.util.Scanner;

public class Pay
{
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 
	 //grosspay
	 System.out.print("Enter your skill level (1, 2, or 3): ");
	 int skillLevel = in.nextInt();
	 
	 System.out.print("Enter hours worked: ");
	 int hoursWorked = in.nextInt();
	 
	 double hourlyRate = 0;
	 
	 if (skillLevel == 1)
		 hourlyRate = 17;
	 if (skillLevel == 2)
		 hourlyRate = 20;
	 if (skillLevel == 3)
		 hourlyRate = 22;
	 
	 double pay = 0;
	 double overtimePay = 0;
	 int amtOver40 = 0;
	 double totalPay = 0;
	 
	 if (hoursWorked <= 40)
	 {
		 pay = hourlyRate * hoursWorked;
		 totalPay = pay;
	 }
	 if (hoursWorked > 40)
	 {
		 pay = 40* hourlyRate;
		 amtOver40 = hoursWorked - 40;
		 overtimePay = 1.5 * amtOver40 * hourlyRate;
		 totalPay = pay + overtimePay;
	 }
	 //deductions
	 
	 double totalDeductions;
	 double medExp = 0;
	 double denExp = 0;
	 double disExp = 0;
	 
	 if (skillLevel == 2 || skillLevel == 3)
	 {
		 //med
		 
		 System.out.println("Do you want medical insurance? ");
		 System.out.println(" Enter 1 for Yes and 2 for No");
		 int medQ = in.nextInt();
		 if(medQ == 1)
		 {
			 medExp = 32.5;
		 }
		 if(medQ == 2)
		 {
			 medExp = 0;
		 }
		 
		 //dental
		 
		 System.out.println("Do you want dental insurance? ");
		 System.out.println(" Enter 1 for Yes and 2 for No");
		 int denQ = in.nextInt();
		 if(denQ == 1)
		 {
			 denExp = 20.0;
		 }
		 if(denQ == 2)
		 {
			 denExp = 0;
		 }
		 
		 //disability
		 
		 System.out.println("Do you want the long term disability insurance? ");
		 System.out.println(" Enter 1 for Yes and 2 for No");
		 int disQ = in.nextInt();
		 if(disQ == 1)
		 {
			 disExp = 10.0;
		 }
		 if(disQ == 2)
		 {
			 disExp = 0;
		 }
		 
		 	
	 } 
	 if (skillLevel == 1)
	 {
		 medExp = 0;
		 denExp = 0;
		 disExp = 0;
	 }
	 
	 totalDeductions = medExp + denExp + disExp;
	 
	 //netpay
		 double netPay;
		 netPay = totalPay - totalDeductions;
		 
	//final output
	System.out.println("******* Gross Pay *******");
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("Hourly Rate: " + hourlyRate);
	System.out.println("Regular Pay: " + pay);
	System.out.println("Overtime Pay: " + overtimePay);
	System.out.println("Total Pay: " + totalPay);
	System.out.println();
	System.out.println("******* Deductions *******");
	System.out.println("Medical: " + medExp);
	System.out.println("Dental: " + denExp);
	System.out.println("Disability: " + disExp);
	System.out.println("Total Deductions: " + totalDeductions);
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("Net Pay: $" + netPay);
 }
}