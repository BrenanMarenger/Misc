//Programmer: Brenan Marenger
//Date: 3/20/20
//Assignment: Ch7 Ex12 pg364
//Description: PrepareTax.java

import java.util.Scanner;
import javax.swing.*;

public class PrepareTax
{	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String ssn = JOptionPane.showInputDialog("Enter Social Security Number: ");
		
		while(ssn.length()!= 11)
		{
			ssn = JOptionPane.showInputDialog("Enter the valid Social Security Number: ");
		}
		
		String lastName = JOptionPane.showInputDialog("Enter the Last Name: ");
		
		String firstName = JOptionPane.showInputDialog("Enter The First Name: ");
		
		String street = JOptionPane.showInputDialog("Enter the Street Name: ");
		
		String city = JOptionPane.showInputDialog("Enter the City Name: ");
		
		String state = JOptionPane.showInputDialog("Enter the State Name: ");
		
		//zipCode
		int zipCode = Integer.parseInt(JOptionPane.showInputDialog("Enter the Zip Code: "));
		
		while(zipCode < 10000 || zipCode > 99999)
		{
			zipCode = Integer.parseInt(JOptionPane.showInputDialog("Enter the valid Zip Code: ")) ;
		}
		
		//Income
		double income = Double.parseDouble(JOptionPane.showInputDialog("Enter the Annual Income: "));
		
		while(income<0)
		{
			income = Double.parseDouble(JOptionPane.showInputDialog("Enter the valid Annual Income: "));
		}
		
		//MS
		char ms = JOptionPane.showInputDialog("Enter the Marital Status: ").charAt(0);
		
		while(ms != 'S' && ms != 's' && ms != 'M' &&  ms != 'm')
		{
			ms = JOptionPane.showInputDialog("Enter the valid Marital Status: ").charAt(0);
		}
		
	
	//single
	double tax=0;
	if((ms == 's' || ms == 'S') && income <= 20000)
	{
		tax = income * .15;
	}
	if((ms == 's' || ms == 'S') && income > 20000 && income <= 50000)
	{
		tax = income * .22;
	}
	if((ms == 's' || ms == 'S') && income >= 50001)
	{
		tax = income * .3;
	}
	
	//married
		if((ms == 'm' || ms == 'M') && income <= 20000)
	{
		tax = income * .14;
	}
	if((ms == 'm' || ms == 'M') && income > 20000 && income <= 50000)
	{
		tax = income * .20;
	}
	if((ms == 'm' || ms == 'M') && income >= 50001)
	{
		tax = income * .28;
	}
		
		TaxReturn tr = new TaxReturn(ssn, lastName, firstName, street, city, state, zipCode, income, ms, tax);
		
		tr.displayData();
	}
			
}	
	