import java.util.*;

public class DemoRocks
{
	public static void main (String[] args)
	{
		
		IgneousRock rock2 = new IgneousRock(3, 7.0);
		System.out.println("Sample Number: " + rock2.getSampleNum());
		System.out.println("Weight: " + rock2.getWeight());
		System.out.println("Description: " + rock2.getDescription());
		
		SedimentaryRock rock3 = new SedimentaryRock(4, 9.0);
		System.out.println("Sample Number: " + rock3.getSampleNum());
		System.out.println("Weight: " + rock3.getWeight());
		System.out.println("Description: " + rock3.getDescription());
		
		MetamorphicRock rock4 = new MetamorphicRock(5, 11.0);
		System.out.println("Sample Number: " + rock4.getSampleNum());
		System.out.println("Weight: " + rock4.getWeight());
		System.out.println("Description: " + rock4.getDescription());
	}
}
		