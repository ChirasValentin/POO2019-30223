package javasmmr.zoowsome.animals;

public class Spider extends Insect {
	public Spider()
	{
		setNrOfLegs(8);
		setCanFly(false);
	}
	public Spider(String name,boolean isDangerous,boolean canFly,Integer nrOfLegs)
	{
		super.setName(name);
		super.setIsDangerous(isDangerous);
		super.setCanFly(canFly);
		super.setNrOfLegs(nrOfLegs);
	}

}
