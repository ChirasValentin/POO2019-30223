package javasmmr.zoowsome.animals;

public class Cow extends Mammal {
	
	public Cow()
	{
			setNrOfLegs(4);
			setNormalBlodyTemp(36.4f);
			setPercBodyHair(99.4f);
	}
	public Cow(String name,float temp,Integer nrLegs,float percBlood)
	{
		super.setName(name);
		super.setNormalBlodyTemp(temp);
		super.setNrOfLegs(nrLegs);
		super.setPercBodyHair(percBlood);
	}	
}
