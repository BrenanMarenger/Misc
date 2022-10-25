//Programmer: Brenan Marenger
//Date: 4/3/20
//Assignment: ch9 ex9
//Description: Majors.java

import java.util.Scanner;

public class Majors
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		
		String[] majors = {"ACC","CHEM","CIS","ENG","HIS","PHYS"};
		String search;
		
		System.out.println("The majors we offer are: ");
		
		for(int i = 0; i <6; i++)
		{
			System.out.print(majors[i] + " ");
		}
		
		System.out.println();
		System.out.print("Enter your major ");
		search = myObj.nextLine();
		
		if(search.equals(majors[0]) || search.equals(majors[2]))
		{
			System.out.println("Your major is in the Business Division");
		}
		else if(search.equals(majors[1]) || search.equals(majors[5]))
		{
		System.out.println("Your major is in the Science Division");
		}
		else if(search.equals(majors[3]) || search.equals(majors[4]))
		{
		System.out.println("Your major is in the Humanities Division");
		}
		else
		{
		System.out.println("We do not have a " + search + " major");
		}

	}
}