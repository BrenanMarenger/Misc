public class SedimentaryRock extends Rock
{
	public SedimentaryRock( int number, double weight)
	{
		super(number, weight);
		this.description = "Rocks formed from sediment or fossils that fuse together";
	}
	public void setDescription(String a)
	{
		description = a;
	}
}