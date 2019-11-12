package javasmmr.zoowsome.models.animals;

public  class Aligator extends Reptile {
	
	public Aligator()
	{
		setNrOfLegs(4);	
	}
	public Aligator(String name,boolean laysEggs,Integer nrLegs)
	{
		super.setName(name);
		super.setLaysEggs(laysEggs);
		super.setNrOfLegs(nrLegs);
	}
}
