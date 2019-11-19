package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake()
	{
		super(0,"Piton",true,2.0,0.85);
	}
	public Snake(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name,laysEggs, maintenanceCost, dangerPerc);	
	}

}
