package javasmmr.zoowsome.animals;

public class Alligators extends Reptile {
		
	public Alligators()
	{
		setNrOfLegs(4);	
	}
	public Alligators(String name,boolean laysEggs,Integer nrLegs)
	{
		super.setName(name);
		super.setLaysEggs(laysEggs);
		super.setNrOfLegs(nrLegs);
	}
}
