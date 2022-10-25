//Programmer: Brenan Marenger
//Date: 3/20/20
//Assignment: Ch7 Ex12 Pg364
//Description: TaxReturn.java

import java.util.Scanner;
import javax.swing.*;

public class TaxReturn
{
	private String ssn;
	private String lastName;
	private String firstName;
	private String street;
	private String city;
	private String state;
	private int zipCode;
	private double income;
	private char ms;
	private double tax;
	
	public TaxReturn(String ssn, String lastName, String firstName, String street, String city, String state, int zipCode, double income, char ms, double tax)
	{
	this.ssn = ssn;
	this.lastName = lastName;
	this.firstName = firstName;
	this.street= street;
	this.city = city;
	this.state = state;
	this.zipCode = zipCode;
	this.income = income;
	this.ms = ms;
	this.tax = tax;
	}
	
	JFrame f;

	public void displayData()
	{
		f=new JFrame();
		JOptionPane.showMessageDialog(f, "Taxpayer SSN: " + ssn + " " + firstName + " " + lastName + "\n" + street + "\n" + city + 
		", " + state + " " + zipCode+ "\n" + "Marital Status: " + ms+ "\n" + "Income: $" + income + "Tax: $" + tax);
	}
	
}

