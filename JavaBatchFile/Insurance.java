//Programmer: Brenan Marenger
//Date: 4/10/20
//Assigntment: Ch 11, ex9 pg565
//Description: Insurance.java

import java.util.Scanner;
import javax.swing.*;

abstract class Insurance 
{
	Scanner s = new Scanner(System.in);

	public String insuranceType;
	public double monthlyCost;
	
	public Insurance(String insuranceType) 
	{
		this.insuranceType = insuranceType;
	}
	
	public abstract void setCost();
	public abstract void display();


	public String getInsuranceType() 
	{
		return insuranceType;
	}
	public double getMonthlyCost() 
	{
		return monthlyCost;
	}
	
}