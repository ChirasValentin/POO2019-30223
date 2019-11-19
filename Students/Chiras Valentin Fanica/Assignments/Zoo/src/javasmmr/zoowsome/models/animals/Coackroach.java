package javasmmr.zoowsome.models.animals;

public class Coackroach extends Insect{
	public Coackroach()
	{
		super(6,"Gandac de bucatarie",false,true,1.5,0.22);
	}
	
	public Coackroach(Integer nrOfLegs,String name,boolean canFly,boolean isDangerous
			,double maintenanceCost,double dangerPerc)
	{
		super(nrOfLegs,name,canFly,isDangerous,maintenanceCost,dangerPerc);

	}

}
