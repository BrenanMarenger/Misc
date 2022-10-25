 import java.util.Scanner;
 
 public class CountByAnything
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		int outputCounter=0;
		int increment;
		
		System.out.print("Input whole value increment: ");
		increment=input.nextInt();
		
		for (int counter=0;counter<=200;counter+=increment)
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
 