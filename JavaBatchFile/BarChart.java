//Programmer: Brenan Marenger
//Date: 3/6/20
//Assignment: Ch6 Ex13 Bar Chart Program
//Description: 

import java.util.Scanner;

public class BarChart
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int artVotes = 0;
		int bobVotes = 0;
		int calVotes = 0;
		int danVotes = 0;
		int eliVotes = 0;
		
		System.out.println("Enter points earned by Art");
		artVotes=input.nextInt();
		System.out.println("Enter points earned by Bob");
		bobVotes=input.nextInt();
		System.out.println("Enter points earned by Cal");
		calVotes=input.nextInt();
		System.out.println("Enter points earned by Dan");
		danVotes=input.nextInt();
		System.out.println("Enter points earned by Eli");
		eliVotes=input.nextInt();
		
		System.out.println();
		System.out.println("Points for Game");
		System.out.println();
		
		int counter =0;
		
		counter = 1;
		System.out.print("Art ");
		do
		{
			System.out.print("*");
			counter= counter +1;
		}
		while(counter<=artVotes);
		System.out.println();

		counter = 1;
		System.out.print("Bob ");
		do
		{
			System.out.print("*");
			counter= counter +1;
		}
		while(counter<=bobVotes);		
		System.out.println();
		
		counter = 1;
		System.out.print("Cal ");
		do
		{
			System.out.print("*");
			counter= counter +1;
		}
		while(counter<=calVotes);
		System.out.println();
			
		counter = 1;
		System.out.print("Dan ");
		do
		{
			System.out.print("*");
			counter= counter +1;
		}
		while(counter<=danVotes);
		System.out.println();
		
		counter = 1;
		System.out.print("Eli ");
		do
		{
			System.out.print("*");
			counter= counter +1;
		}
		while(counter<=eliVotes);
	}
}