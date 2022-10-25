//Programmer: 	Brenan Marenger
//Date: 		3/2/20
//Assignment: 	Ch6 Ex9 Pg325
//Description: 	Production looping program

public class IncreaseProduction
{
	public static void main (String[] args)
	{
		int month		  				 = 0;
		int monthMetGoal  				 = 0;
		double production 				 = 4000;
		double netProfit  				 = 0;
		final double PRODUCTION_INCREASE = 0.06;
		final double GOAL 				 = 7000;
		final int MONTHS 				 = 24;
		boolean isGoalmet				 = false;
		
		for (month=1; month<= MONTHS; ++month)
		{
			production += production * PRODUCTION_INCREASE;
			
			if(production > GOAL && !isGoalmet)
			{
				monthMetGoal = month;
				isGoalmet = true;
			}
			
			System.out.println("Month " + month + " 	Predicted production is " + production);
		}
			
			System.out.println("\nThe month in which the production exceeds " + GOAL + " is month " + monthMetGoal);
			
	}
}
		
		