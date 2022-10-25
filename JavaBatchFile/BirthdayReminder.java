//Programmer: Brenan Marenger
//Date: 3/31/20
//Assignment: Ch8 Ex8 Pg410
//Description: BirthdayReminder.java

import java.util.Scanner;
import javax.swing.*;

public class BirthdayReminder
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		JFrame f;
		f = new JFrame();
		
		String[] name;
		name = new String[20];
		
		String[] birthDate;
		birthDate = new String[20];
		
		//input
		int x = 0;
		int counter = 0;
		
		do
		{
		name[x] = JOptionPane.showInputDialog(f,"Enter a Name or ZZZ to quit");
		
		if(name[x].equals("ZZZ"))
		 {
			name[x] = "";
			break;
		 }
	
		birthDate[x] = JOptionPane.showInputDialog(f,"Enter their birth date with slashes between the month, day, and year");

		x= x+1;
		counter = counter +1;
		}
		while(x < 10);
		//end of do-while
		
		//num of names
		JOptionPane.showMessageDialog(f, "Count of names entered: " + counter);
		//display names
		if(counter == 0)
		{
			JOptionPane.showMessageDialog(f, "Error, No Data Entered");
		}
		if(counter == 1)
		{
			JOptionPane.showMessageDialog(f, name[0]);
		}
		if(counter == 2)
		{
			JOptionPane.showMessageDialog(f, name[0] + "\n" + name[1]);
		}
		if(counter == 3)
		{
			JOptionPane.showMessageDialog(f, name[0] + "\n" + name[1]+ "\n" + name[2]);
		}		
		if(counter == 4)
		{
			JOptionPane.showMessageDialog(f, name[0] + "\n" + name[1]+ "\n" + name[2]+ "\n" + name[3]);
		}
		if(counter == 5)
		{
			JOptionPane.showMessageDialog(f, name[0] + "\n" + name[1]+ "\n" + name[2]+ "\n" + name[3]+ "\n" + name[4]);
		}
		if(counter == 6)
		{
			JOptionPane.showMessageDialog(f, name[0] + "\n" + name[1]+ "\n" + name[2]+ "\n" + name[3]+ "\n" + name[4]+ "\n" + name[5]);
		}
		if(counter == 7)
		{
			JOptionPane.showMessageDialog(f, name[0] + "\n" + name[1]+ "\n" + name[2]+ "\n" + name[3]+ "\n" + name[4]+ "\n" + name[5]+ "\n" + name[6]);
		}
		if(counter == 8)
		{
			JOptionPane.showMessageDialog(f, name[0] + "\n" + name[1]+ "\n" + name[2]+ "\n" + name[3]+ "\n" + name[4]+ "\n" + name[5]+ "\n" + name[6]+ "\n" + name[7]);
		}
		if(counter == 9)
		{
			JOptionPane.showMessageDialog(f, name[0] + "\n" + name[1]+ "\n" + name[2]+ "\n" + name[3]+ "\n" + name[4]+ "\n" + name[5]+ "\n" + name[6]+ "\n" + name[7]+ "\n" + name[8]);
		}
		if(counter == 10)
		{
			JOptionPane.showMessageDialog(f, name[0] + "\n" + name[1]+ "\n" + name[2]+ "\n" + name[3]+ "\n" + name[4]+ "\n" + name[5]+ "\n" + name[6]+ "\n" + name[7]+ "\n" + name[8]+ "\n" + name[9]);
		}
		
		//search for a name
		String search;
		do
		{
			if(counter==0)
			{
			break;
			}
		
		 search = JOptionPane.showInputDialog(f, "Enter a name to search for or ZZZ to quit");
			if(search.equals("ZZZ"))
			{
			break;
			}
			
			
			{
			if(search.equals(name[0]))
			{
			JOptionPane.showMessageDialog(f, name[0] +"'s birth date is " + birthDate[0]);	
			}
			if(search.equals(name[1]))
			{
			JOptionPane.showMessageDialog(f, name[1] +"'s birth date is " + birthDate[1]);	
			}
			if(search.equals(name[2]))
			{
			JOptionPane.showMessageDialog(f, name[2] +"'s birth date is " + birthDate[2]);	
			}
			if(search.equals(name[3]))
			{
			JOptionPane.showMessageDialog(f, name[3] +"'s birth date is " + birthDate[3]);	
			}
			if(search.equals(name[4]))
			{
			JOptionPane.showMessageDialog(f, name[4] +"'s birth date is " + birthDate[4]);	
			}
			if(search.equals(name[5]))
			{
			JOptionPane.showMessageDialog(f, name[5] +"'s birth date is " + birthDate[5]);	
			}
			if(search.equals(name[6]))
			{
			JOptionPane.showMessageDialog(f, name[6] +"'s birth date is " + birthDate[6]);	
			}
			if(search.equals(name[7]))
			{
			JOptionPane.showMessageDialog(f, name[7] +"'s birth date is " + birthDate[7]);	
			}
			if(search.equals(name[8]))
			{
			JOptionPane.showMessageDialog(f, name[8] +"'s birth date is " + birthDate[8]);	
			}
			if(search.equals(name[9]))
			{
			JOptionPane.showMessageDialog(f, name[9] +"'s birth date is " + birthDate[9]);	
			}
			}
			else
			{
				 JOptionPane.showMessageDialog(f, "Sorry, no entry for " + search);
			}
		}while(search != "ZZZ");
	//end of do-while
	}
	//end
}