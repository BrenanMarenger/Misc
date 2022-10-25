//Programmer: Brenan Marenger
//Date: 3/30/20
//Assignment: Ch8 Ex4 Pg409
//Description: ArrayMethodDemo.java

import java.util.Scanner;

public class ArrayMethodDemo
{
	public static void main(String[] args)
	{
	Scanner myObj = new Scanner(System.in);
	int[] number;
	number = new int[10];
	
	//inputs
	System.out.println("Input 8 numbers: ");
	int counter = 1;
	int x = 0;
	
	for (int i = 0; i < 8; i++) 
	{
	System.out.print( counter + ". ");
	number[x] = myObj.nextInt();
	counter = counter + 1;
	x = x + 1;
	}
	int limit = 12;
	
	//call functions
	numbersReverse(number);
	numberSum(number);
	limit(number, limit);
	average(number);
	gThanAvg(number);
	}
	
	
	
	//functions
	public static void numbersReverse(int[] arr)
	{
		System.out.println("The numbers in reverse order are: " +arr[7]+" " +arr[6]+" " +arr[5]+" " +arr[4]+" "
		+arr[3]+" " +arr[2]+" " +arr[1]+" " +arr[0]);
	}
	
	public static void numberSum(int[] number)
	{
		int sum;
		sum = number[0] + number[1] + number[2] + number[3] + number[4] + number[5] + number[6] + number[7];
		System.out.println("The sum of all the numbers are: " + sum);
	}
	
	public static void limit(int[] number, int limit)
	{
	int x = 0;
	for (int i = 0; i < 8; i++)
	{
		if(number[x] < limit)
		{
			System.out.print(number[x] + " ");
		}
		
		x = x + 1;
	}
	System.out.println("are less than the limit: " + limit);
	}
	
	public static void average(int[] number)
	{
		int sum; 
		sum = number[0] + number[1] + number[2] + number[3] + number[4] + number[5] + number[6] + number[7];
		Double dSum = Double.valueOf(sum);
		double average = dSum / 8;
		System.out.println("The avgerage is: " + average);
	}
	
	public static void gThanAvg(int[] number)
	{
		int sum; 
		sum = number[0] + number[1] + number[2] + number[3] + number[4] + number[5] + number[6] + number[7];
		Double dSum = Double.valueOf(sum);
		double average = dSum / 8;
		
		int x = 0;
		for(int i = 0; i < 8; i++)
		{
			if (number[x] > average)
			{
				System.out.print(number[x] + " ");
			}
			
			x = x + 1;
		}
		System.out.println("are greater than the average");
	}
	
}

