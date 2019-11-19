package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly()
	{
		super(6,"Adonis Blue",true,false,3.5,0.02);
	}
	
	public Butterfly(Integer nrOfLegs,String name,boolean canFly,boolean isDangerous
			,double maintenanceCost,double dangerPerc)
	{
		super(nrOfLegs,name,canFly,isDangerous,maintenanceCost,dangerPerc);

	}
}
	