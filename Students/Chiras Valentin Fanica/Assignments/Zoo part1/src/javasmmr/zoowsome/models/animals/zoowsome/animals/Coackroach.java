package javasmmr.zoowsome.animals;

public class Coackroach extends Insect{
	public Coackroach()
	{
		setNrOfLegs(6);
		setIsDangerous(false);	
	}
	public Coackroach(String name,boolean isDangerous,boolean canFly,Integer nrOfLegs)
	{
		super.setName(name);
		super.setIsDangerous(isDangerous);
		super.setCanFly(canFly);
		super.setNrOfLegs(nrOfLegs);
	}

}
