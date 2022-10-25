//Programmer: Brenan Marenger
//Date: 4/22/20
//Assignment: ch13 ex5 pg693
//Description: DisplaySelectedCustomer.java


import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.AccessMode.*;

public class DisplaySelectedCustomer
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Path file = Paths.get("C:\\Java\\WriteCustomerList\\CustomerList.txt");
      
	  String[] array = new String[4];
	  
	  String searchByID;
      String s = "";
      String delimiter = ",";
      boolean found = false;
	  
      try
      {
         InputStream input2 = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input2));
		 
         System.out.println();

         System.out.print("Enter an ID number to search for >> ");
         searchByID = input.nextLine();
         s = reader.readLine();
		 
         while(s != null)
         {
            array = s.split(delimiter);
			
            if(searchByID.equals(array[0]))
            {
               found = true;
               for(int x = 0; x < array.length; ++x)
                  System.out.print(array[x] + "  ");
               System.out.println();
            }
            s = reader.readLine();  
			
         }
         if(!found)
           System.out.println("Error, no data found for " + searchByID);
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}