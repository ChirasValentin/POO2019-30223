package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider()
	{
		super(8,"Vaduva Neagra",true,true,2.5,0.95);
	}
	
	public Spider(Integer nrOfLegs,String name,boolean canFly,boolean isDangerous
			,double maintenanceCost,double dangerPerc)
	{
		super(nrOfLegs,name,canFly,isDangerous,maintenanceCost,dangerPerc);

	}

}
