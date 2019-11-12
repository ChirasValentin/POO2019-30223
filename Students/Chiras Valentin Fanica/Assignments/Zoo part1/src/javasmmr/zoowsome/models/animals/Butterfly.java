package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly()
	{
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(false);	
	}
	public Butterfly(String name,boolean isDangerous,boolean canFly,Integer nrOfLegs)
	{
		super.setName(name);
		super.setIsDangerous(isDangerous);
		super.setCanFly(canFly);
		super.setNrOfLegs(nrOfLegs);
	}
}
