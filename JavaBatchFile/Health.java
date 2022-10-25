//Programmer: Brenan Marenger
//Date: 4/10/20
//Assigntment: Ch 11, ex9 pg565
//Description: Health.java

import javax.swing.*;

class Health extends Insurance 
{

	public Health(String insuranceType) 
	{
		super(insuranceType);
		setCost();
	}


	@Override
	public void setCost() 
	{
		this.monthlyCost = 196;
	}
	@Override
	public void display() 
	{
		JOptionPane.showMessageDialog(null, insuranceType + " costs $" + monthlyCost + " per month");
	}
	
}
