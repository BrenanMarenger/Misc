//Programmer: Brenan Marenger
//Date: 2/19/20
//Assignment: Ch4 Ex5 Pg225 Part c
//Description: TestSandwich.java

package Tip_Top_Bakery;

public class TestSandwich
{
	public static void main(String[] args)
	{
		Sandwich test1 = new Sandwich("pumpernickel", 180, "egg salad", 220);
		Sandwich test2 = new Sandwich("multigrain", 200, "bologna", 260);
		Sandwich test3 = new Sandwich("whole wheat", 150, "grape jelly", 180);
		
		System.out.println("Bread Type: " + test1.getBreadType());
		System.out.println("Bread Calories: " + test1.getBreadCalories());
		System.out.println("Filling Type: " + test1.getTypeFilling());
		System.out.println("Filling Calories: " + test1.getFillingCalories());
		System.out.println("Sub Total Calorie: " + ((test1.getBreadCalories() * 2) + test1.getFillingCalories()));
		System.out.println();
		System.out.println("Bread Type: " + test2.getBreadType());
		System.out.println("Bread Calories: " + test2.getBreadCalories());
		System.out.println("Filling Type: " + test2.getTypeFilling());
		System.out.println("Filling Calories: " + test2.getFillingCalories());
		System.out.println("Sub Total Calorie: " + ((test2.getBreadCalories() * 2) + test2.getFillingCalories()));
		System.out.println();
		System.out.println("Bread Type: " + test3.getBreadType());
		System.out.println("Bread Calories: " + test3.getBreadCalories());
		System.out.println("Filling Type: " + test3.getTypeFilling());
		System.out.println("Filling Calories: " + test3.getFillingCalories());
		System.out.println("Sub Total Calorie: " + ((test3.getBreadCalories() * 2) + test3.getFillingCalories()));
		}
		}