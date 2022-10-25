//Programmer: Brenan Marenger
//Date: 4/3/20
//Assignment: ch9 ex6
//Description: Schedule.java store 4 different course names, days, and times in a 2-d array

import java.util.Scanner;
import javax.swing.*;


public class Schedule
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		JFrame f;
		f = new JFrame();

		String inputCourse;
		
		
		//[course name][course day/time]
		String[][] courseInfo = new String[10][10];
		courseInfo[0][0]="CIS 110";
		courseInfo[0][1]="Th 3:30";
		
		courseInfo[1][0]="COM 209";
		courseInfo[1][1]="Mon 11:00";
		
		courseInfo[2][0]="ENG 220";
		courseInfo[2][1]="Wed 8:30";
		
		courseInfo[3][0]="MAT 201";
		courseInfo[3][1]="Tues 12:00";
		
			//new String []{"CIS 110", "COM 209", "ENG 220", "MAT 201" }, 
			//new String []{"Th 3:30", "Mon 11:00", "Wed 8:30", "Tues 12:00"} 
	
					
		do
		{
			
			//input
			inputCourse = JOptionPane.showInputDialog(f, "Enter a course code or ZZZ to quit");
			//possible outputs
			
			if(inputCourse.equals("ZZZ"))
			{
				break;
			}
			
			
			if(inputCourse.equals(courseInfo[0][0]))
			{
				JOptionPane.showMessageDialog(f, inputCourse + " meets "+ courseInfo[0][1]);
			
			}
			else if(inputCourse.equals(courseInfo[1][0]))
			{
				JOptionPane.showMessageDialog(f, inputCourse + " meets " +courseInfo[1][1]);
				
			}
		
			else if(inputCourse.equals(courseInfo[2][0]))
			{
				JOptionPane.showMessageDialog(f, inputCourse + " meets "+ courseInfo[2][1]);
				
			}
			else if(inputCourse.equals(courseInfo[3][0]))
			{
				JOptionPane.showMessageDialog(f, inputCourse + " meets " +courseInfo[3][1]);
				
			}
			else
			{
			JOptionPane.showMessageDialog(f, "Error, invalid course name");
			}
		
		}
		while(inputCourse != "ZZZ");
	}
}