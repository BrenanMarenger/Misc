//Programmer: Brenan Marenger
//Date: 3/19/20
//Assignment: Ch7 Ex6 Pg363
//Description:  Alphabetize2.java

import java.util.Scanner;
public class Alphabetize2
{
    public static void main(String[] args) 
    {
		//variables
        int numNames;
        String holder;
		
        Scanner s = new Scanner(System.in);
		
		//input
        System.out.print("Enter the number of names:");
        numNames = s.nextInt();
		
        String names[] = new String[numNames];
		
        Scanner s1 = new Scanner(System.in);
		
        System.out.println("Enter names:");
        for(int i = 0; i < numNames; i++)
        {
            names[i] = s1.nextLine();
        }
		//sorting
        for (int i = 0; i < numNames; i++) 
        {
            for (int j = i + 1; j < numNames; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    holder = names[i];
                    names[i] = names[j];
                    names[j] = holder;
                }
            }
        }
		System
		//output
        for (int i = 0; i < numNames - 1; i++) 
        {
            System.out.print(names[i] + " ");
        }
        System.out.print(names[numNames - 1]);
    }
}