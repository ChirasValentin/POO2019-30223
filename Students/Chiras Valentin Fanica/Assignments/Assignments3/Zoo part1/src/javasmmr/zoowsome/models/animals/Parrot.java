package javasmmr.zoowsome.models.animals;


public class Parrot extends Bird {
	public Parrot()
	{
		setNrOfLegs(2);
		setMigrates(false);
		setName("psittacus");
		setAvgFlightAltitude(250);
	}
	public Parrot(String name, Integer nrOfLegs,boolean migrate,Integer avgAltitude)
	{
		super.setName(name);
		super.setAvgFlightAltitude(avgAltitude);
		super.setNrOfLegs(nrOfLegs);
		super.setMigrates(migrate);
	}

}
