//Programmer: Brenan Marenger
//Date: 2/19/20
//Assignment: Ch4 Ex5 Pg225 Part c
//Description: Sandwich.java

package Tip_Top_Bakery;

public class Sandwich
{
	private Bread bread;
	private SandwichFilling sandwichFilling;
	
	public Sandwich(String type, int calories, String filling, int cals)
	{
		bread = new Bread(type, calories);
		sandwichFilling = new SandwichFilling(filling, cals);
	}
	
	//bread
	public String getBreadType()
		{
			return bread.getBreadType();
		}
	public int getBreadCalories()
		{
			return bread.getBreadCalories();
		}
	//filling
	public String getTypeFilling()
		{
			return sandwichFilling.getTypeFilling();
		}
	public int getFillingCalories()
		{
			return sandwichFilling.getFillingCalories();
		}
}	