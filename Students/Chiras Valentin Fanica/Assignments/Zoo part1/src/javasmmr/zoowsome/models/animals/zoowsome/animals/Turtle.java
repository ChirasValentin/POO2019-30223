package javasmmr.zoowsome.animals;

public class Turtle extends Reptile{
	public Turtle()
	{
		setNrOfLegs(0);	
	}
	public Turtle(String name,boolean laysEggs,Integer nrLegs)
	{
		super.setName(name);
		super.setLaysEggs(laysEggs);
		super.setNrOfLegs(nrLegs);
	}

}
