//Programmer: Brenan Marenger
//Date: 4/22/20
//Assignment: ch13 ex5 pg693
//Description: DisplaySelectedCustomersByBalance.java

import java.util.Scanner;
import static java.nio.file.AccessMode.*;
import java.nio.file.*;
import java.io.*;

public class DisplaySelectedCustomersByBalance{
	
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Path file = Paths.get("C:\\Java\\WriteCustomerList\\CustomerList.txt");
	  
      String[] array = new String[4];
      String s = "";
      String delimiter = ",";
	  
      double balance;
      boolean found = false;
      final int balancePos = 3;
	  
      try
      {
         InputStream input2 = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input2));
         System.out.println();  

		 
         System.out.print("Enter a minimum balance >> ");
         balance = input.nextDouble();
		 
         s = reader.readLine();
		 
         while(s != null)
         {
            array = s.split(delimiter);
            double cBalance = Double.parseDouble(array[balancePos]);
			
            if(cBalance >= balance)
            {
               found = true;
               for(int x = 0; x < array.length; ++x)
                  System.out.print(array[x] + "  ");
               System.out.println();
            }
			
            s = reader.readLine();           
         }
		 
         if(!found)
           System.out.println("Error, no data with a balance of at least $" + balance);
         reader.close();
		 
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}