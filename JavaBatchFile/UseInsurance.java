//Programmer: Brenan Marenger
//Date: 4/10/20
//Assigntment: Ch 11, ex9 pg565
//Description: UseInsurance.java

import java.util.Scanner;
import javax.swing.*;

public class UseInsurance 
{

	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		Insurance insurance;
		
		String input = JOptionPane.showInputDialog(null, "Enter 1 for Life Insurance or 2 for Health Insurance");
		if(input.equals("1"))
		{
			insurance = new Life("Life Insurance");
			insurance.display();
			
		} 
		else if(input.equals("2"))
		{
			insurance = new Health("Health Insurance");
			insurance.display();
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Error, incorrect input");
		}
	}
}