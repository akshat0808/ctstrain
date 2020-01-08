package comm.example;

public class Truck extends Transport {
	double calculateDistance(double initialdistance,double finaldistance)
	{
		setDistance(finaldistance-initialdistance);
		return getDistance();
	}
	double calculateEfficiency(double initialfuel,double finalfuel)

	{
		setEfficiency(getDistance()/(initialfuel-finalfuel));
		return getEfficiency();
		
	}
	public String toString() {
		return"truck's"+super.toString();	}
}
