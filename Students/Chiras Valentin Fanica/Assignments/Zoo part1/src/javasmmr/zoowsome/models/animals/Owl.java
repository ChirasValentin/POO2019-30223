package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {

	public Owl()
	{
		setNrOfLegs(2);
		setMigrates(false);
		setName("Bubonis");
		setAvgFlightAltitude(4500);
	}
	public Owl(String name, Integer nrOfLegs,boolean migrate,Integer avgAltitude)
	{
		super.setName(name);
		super.setAvgFlightAltitude(avgAltitude);
		super.setNrOfLegs(nrOfLegs);
		super.setMigrates(migrate);
	}
}
