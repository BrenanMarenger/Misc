//Programmer: Brenan Marenger
//Date: 4/9/20
//Assignment Ch10 Ex9 Pg508-509
//Description:

public class Rock
{
	private int sampleNumber;
	protected String description;
	private double weight;
	
	public Rock(int sNumber, double weight)
	{
		sampleNumber = sNumber;
		this.weight = weight;
		this.description = description;
	}
	
	public int getSampleNum()
	{
		return sampleNumber;
	}
	public String getDescription()
	{
		return description;
	}
	public double getWeight()
	{
		return weight;
	}
}