package javasmmr.zoowsome.models.animals;


public class Tiger extends Mammal{
	public Tiger()
	{
		super(4,"Tigru",38.0f,99.3f,3.5,0.2);
	}
	 public Tiger(Integer nrOfLegs, String name,float normalBodyTemp,float percBodyHair, double maintenanceCost, double dangerPerc)
	 {
			super(nrOfLegs, name, normalBodyTemp,percBodyHair,maintenanceCost,dangerPerc);
	 }
}
