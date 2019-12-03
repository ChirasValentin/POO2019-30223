package javasmmr.zoowsome.models.animals;

public  class Aligator extends Reptile {
	
	public Aligator()
	{
		super(4,"Aligator",true,5.0,0.75);
	}
	public Aligator(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name,laysEggs, maintenanceCost, dangerPerc);	
	}
}
