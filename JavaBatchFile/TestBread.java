//Programmer: Brenan Marenger
//Date: 2/19/20
//Assignment: Ch4 Ex5 Pg225 part a
//Description: Create a class that holds data fields for bread type and calories per slice

package Tip_Top_Bakery;

public class TestBread
{
	public static void main(String[] args)
	{
	Bread test1 = new Bread("rye",120);
	Bread test2 = new Bread("wheat",95);
	Bread test3 = new Bread("white",100);
	
	System.out.println("The " + test1.getBreadType() + " bread has " + test1.getBreadCalories() + " calories per slice.");
	System.out.println(Bread.MOTTO);
	System.out.println("The " + test2.getBreadType() + " bread has " + test2.getBreadCalories() + " calories per slice.");
	System.out.println(Bread.MOTTO);
	System.out.println("The " + test3.getBreadType() + " bread has " + test3.getBreadCalories() + " calories per slice.");
	System.out.println(Bread.MOTTO);
	}
}



