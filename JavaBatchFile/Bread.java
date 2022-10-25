//Programmer: Brenan Marenger
//Date: 2/19/20
//Assignment: Ch4 Ex5 Pg225 part a
//Description: Create a class that holds data fields for bread type and calories per slice

package Tip_Top_Bakery;
public class Bread 
{
	private String breadType;
	private int breadCalories;
	public final static String MOTTO = "The staff of life";
	
	public Bread(String bType, int cal)
	{
	this.breadType = bType;
	this.breadCalories = cal;
	}
	
	public String getBreadType()
	{
		return breadType;
	}
	
	public int getBreadCalories()
	{
		return breadCalories;
	}
}
	