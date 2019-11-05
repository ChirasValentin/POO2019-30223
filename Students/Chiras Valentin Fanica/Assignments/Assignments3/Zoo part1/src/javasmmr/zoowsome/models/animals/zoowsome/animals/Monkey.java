package javasmmr.zoowsome.animals;

public class Monkey extends Mammal {

	public Monkey() 
		{
			setNrOfLegs(4);
			setNormalBlodyTemp(36.4f);
			setPercBodyHair(90.5f);
		}
		public Monkey(String name,float temp,Integer nrLegs,float percBlood)
		{
			super.setName(name);
			super.setNormalBlodyTemp(temp);
			super.setNrOfLegs(nrLegs);
			super.setPercBodyHair(percBlood);
		}	
	
}
