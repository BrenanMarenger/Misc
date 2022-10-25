public class IgneousRock extends Rock
{
	public IgneousRock(int number, double weight)
	{
		super(number, weight);
		this.description =  "Fire rocks formed by cooled lava";
	}
	public void setDescription(String d)
	{
		description = d;
	}
}