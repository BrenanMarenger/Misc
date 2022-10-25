//Programmer: 	Brenan Marenger
//Date: 		3/3/20
//Assignment: 	Ch6 Count By Three Exercise 
//Description: 	count looping program


 import java.util.Scanner;
 
 public class CountByThrees
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		int outputCounter=0;
		int increment;
		increment = 3;
		System.out.println("                             Counting Program ");
		for (int counter=3;counter<=300;counter+=increment)
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
 