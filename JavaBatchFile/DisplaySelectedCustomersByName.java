//Programmer: Brenan Marenger
//Date: 4/22/20
//Assignment: ch13 ex5 pg693
//Description: DisplaySelectedCustomersByName.java

import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.AccessMode.*;


public class DisplaySelectedCustomersByName
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Path file = Paths.get("C:\\Java\\WriteCustomerList\\CustomerList.txt");
	  
      String[] array = new String[4];
      String s = "";
      String delimiter = ",";
	  
      String searchByLName;
      boolean found = false;
	  
      final int lNamePos = 2;
	  
      try
      {
         InputStream input2 = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input2));
         System.out.println();        

         System.out.print("Enter a last name to search for >> ");
         searchByLName = input.nextLine();
		 
         s = reader.readLine();
		 
         while(s != null)
         {
            array = s.split(delimiter);
            if(searchByLName.equals(array[lNamePos]))
            {
               found = true;
               for(int x = 0; x < array.length; ++x)
                  System.out.print(array[x] + "  ");
               System.out.println();
            }
            s = reader.readLine();           
         }
		 
         if(!found)
           System.out.println("Error, no data found for" + searchByLName);
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}