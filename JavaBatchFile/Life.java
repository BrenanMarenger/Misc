//Programmer: Brenan Marenger
//Date: 4/10/20
//Assigntment: Ch 11, ex9 pg565
//Description: Life.java

import javax.swing.*;

class Life extends Insurance 
{
	
	public Life(String insuranceType) 
	{
		super(insuranceType);
		setCost();
	}


	@Override
	public void setCost() 
	{
		this.monthlyCost = 36;
	}
	@Override
	public void display() 
	{
		JOptionPane.showMessageDialog(null, insuranceType + " costs $" + monthlyCost + " per month");
	}
	
} 