//Programmer: Brenan Marenger
//Date: 4/22/20
//Assignment: ch13 ex5 pg693
//Description: WriteCustomerList.java, input customer records and save them to a text file

import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import java.text.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;

public class WriteCustomerList
{
   public static void main(String[] args)
   {
      Path file = Paths.get("C:\\Java\\WriteCustomerList\\CustomerList.txt");
      Scanner input = new Scanner(System.in);
	  
      String[] array = new String[3];
	  String id;
	  String firstName;
      String lastName;
	  double balance; 
      String s = "";
      String delimiter = ",";
     
      final String QUIT = "ZZZ";
	  
      try
      {
         OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
		 
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
		 
         System.out.print("Enter ID number or ZZZ to quit >> ");        
         id = input.nextLine();
		 
         while(!id.equals(QUIT))
         {
            System.out.print("Enter first name >> ");
            firstName = input.nextLine();
			
            System.out.print("Enter last name >> ");
            lastName = input.nextLine();
			
            System.out.print("Enter balance >> ");
            balance = input.nextDouble();
            input.nextLine();
			
            s = id + delimiter + firstName + delimiter + lastName + delimiter + balance + System.getProperty("line.separator");
			
            writer.write(s, 0, s.length());
			
            System.out.print("Enter ID number or ZZZ to quit >> ");        
            id = input.nextLine();
         }
         writer.close();
		 
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}
		