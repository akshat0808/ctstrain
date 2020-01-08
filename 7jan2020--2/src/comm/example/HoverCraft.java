package comm.example;

public class HoverCraft extends Transport 
{
	double claculateDistance(double initialdistance,double finaldistance)
	{
		setDistance(finaldistance-initialdistance);
		return getDistance();
	}
	@Override
	double calculateEfficiency(double initialfuel, double finalfuel)
	{
		setEfficiency(getDistance()/(initialfuel-finalfuel));
		return getEfficiency();
	}
	@Override
	public String toString()
	{
		return"Hover Craft's"+super.toString();
	}
	@Override
	double calculateDistance(double initialdistance, double finaldistance) {
		// TODO Auto-generated method stub
		setDistance(finaldistance-initialdistance);
		return getDistance();
	}
}
