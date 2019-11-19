package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	public Turtle()
	{
		super(4,"Turtle",true,6.0,0.35);
	}
	public Turtle(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name,laysEggs, maintenanceCost, dangerPerc);	
	}
}
