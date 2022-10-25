public class MetamorphicRock extends Rock
{
	public MetamorphicRock(int number, double weight)
	{
		super(number, weight);
		this.description = "Flat rocks that are formed by heat and pressure changes to Igneous or Sedimantary rocks";
	}
	public void setDescription(String s)
	{
		description = s;
	}
}