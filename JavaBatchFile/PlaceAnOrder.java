//Programmer: Brenan Marenger
//Date 4/16/20
//Assignment: ch12 ex11 pg632
//Description: PlaceAnOrder.java

import java.util.*;

public class PlaceAnOrder{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int maxQuantity = 12;
		final int maxItem = 9999;
		boolean itemFound;
		final int[] item = {111,222,333,444};
		final double[] price = {.89,1.47,2.43,5.99};
		int inputItem;
		int inputQuantity;
		double cost=0.0;
		double totalCost=0.0;
		int spot;
		
		try
		{
			spot = 0;
			System.out.print("Enter Item Number: ");
			inputItem = input.nextInt();
			
			spot = 1;
			System.out.print("Enter Quantity:    ");
			inputQuantity = input.nextInt();			
			
			spot = 2;
			if (inputItem < 0)
				throw (new OrderException(OrderMessages.message[spot]));
			
			spot = 3;
			if(inputItem > maxItem)
				throw (new OrderException(OrderMessages.message[spot]));
			
			spot = 4;
			if(inputQuantity < 1)
				throw (new OrderException(OrderMessages.message[spot]));
			
			spot=5;
			if(inputQuantity>maxQuantity)
				throw (new OrderException(OrderMessages.message[spot]));
			
			itemFound=false;
			
			for(int x=0; x <item.length; ++x)
				if(inputItem == item[x])
				{
					itemFound = true;
					totalCost = price[x] * inputQuantity;
					totalCost *=100;
					int temp = (int)totalCost;
					totalCost = temp / 100.0;
					cost = price[x];
					x = item.length;
				}
				if(itemFound)
				{
					System.out.println("Item and Quantity are Correct");
					System.out.println();
					System.out.println("Order Total: $" + totalCost + " [" +
					inputQuantity + " at $" + cost + " each]");
				}
				else
				{
					spot=6;
					throw (new OrderException(OrderMessages.message[spot]));
				}
		}		
		catch(Exception ex)
		{
			System.out.print("Message is: ");
			System.out.println(ex.getMessage());
		}
	}
}



		