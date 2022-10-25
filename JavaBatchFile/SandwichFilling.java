//Programmer: Brenan Marenger
//Date: 2/19/20
//Assignment: Ch4 Ex5 Pg225 Part b
//Description: SandwichFilling.java

package SandwichFilling;

public class SandwichFilling{
	private String fillingType;
	private int fillingCalories;
	
	public SandwichFilling(String fType, int cal)
	{
	this.fillingType = fType;
	this.fillingCalories = cal;
	}
	
	public String getTypeFilling()
	{
		return fillingType;
	}
	
	public int getFillingCalories()
	{
		return fillingCalories;
	}
}