package javasmmr.zoowsome.animals;

public class Pigeon extends Bird{
	public Pigeon()
	{
		setNrOfLegs(2);
		setMigrates(false);
		setName("Columba livia domestica");
		setAvgFlightAltitude(1050);
	}
	public Pigeon(String name, Integer nrOfLegs,boolean migrate,Integer avgAltitude)
	{
		super.setName(name);
		super.setAvgFlightAltitude(avgAltitude);
		super.setNrOfLegs(nrOfLegs);
		super.setMigrates(migrate);
	}


}
