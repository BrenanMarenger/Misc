//Programmer: Brenan Marenger
//Date: 2/19/20
//Assignment: Ch4 Ex5 Pg225 Part b
//Description: TestSandwichFilling.java

package SandwichFilling;

public class TestSandwichFilling
{
	public static void main(String[] args)
	{
	SandwichFilling test1 = new SandwichFilling("egg salad",220);
	SandwichFilling test2 = new SandwichFilling("ham",240);
	SandwichFilling test3 = new SandwichFilling("peanut butter",280);
	
	System.out.println("The " + test1.getTypeFilling() + " filling has " + test1.getFillingCalories() + " calories.");
	System.out.println("The " + test2.getTypeFilling() + " filling has " + test2.getFillingCalories() + " calories.");
	System.out.println("The " + test3.getTypeFilling() + " filling has " + test3.getFillingCalories() + " calories.");
	}
}