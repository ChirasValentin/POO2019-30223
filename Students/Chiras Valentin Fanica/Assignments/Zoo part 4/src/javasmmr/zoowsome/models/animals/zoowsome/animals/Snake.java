package javasmmr.zoowsome.animals;

public class Snake extends Reptile {
	public Snake()
	{
		setNrOfLegs(0);	
	}
	public Snake(String name,boolean laysEggs,Integer nrLegs)
	{
		super.setName(name);
		super.setLaysEggs(laysEggs);
		super.setNrOfLegs(nrLegs);
	}

}
