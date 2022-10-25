 //Programmer: 	Brenan Marenger
//Date: 		3/3/20
//Assignment: 	Ch6 Count By Anything Exercise 
//Description: 	count looping program


 import java.util.Scanner;
 
 public class CountByAnything
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		int outputCounter=0;
		int increment;
				System.out.println("                             Count By Anything Program ");
		System.out.print("Enter the Number to Count By: ");
		increment=input.nextInt();
		
		for (int counter=increment;counter<=200;counter+=increment)
		{
			System.out.print(counter+"	");
			outputCounter++;
			if(outputCounter%10==0)
			{
				System.out.print("\n");
			}
			
		}
	}
}
       