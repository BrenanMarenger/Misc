//Programmer: Brenan Marenger
//Date: 3/19/20
//Assignment: Ch7 Ex6 Pg363
//Description:  Alphabetize.java

import java.util.Scanner;

public class Alphabetize
{
	public static void main(String[] args)
	{
		String name1;
		String name2;
		String name3;
		
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Please Enter the First Name: ");
		name1=keyboard.nextLine();
		System.out.print("Please Enter the Second Name: ");
		name2=keyboard.nextLine();
		System.out.print("Please Enter the Third Name: ");
		name3=keyboard.nextLine();
		
		if((name1.compareToIgnoreCase(name2)<0)&&(name2.compareToIgnoreCase(name3)<0)&&(name1.compareToIgnoreCase(name3)<0))
		{
			System.out.println("Strings are in alphabetical order");
		}
		else
		{
			System.out.println("Strings are not in alphabetical order");
		}
		
	}
}
	