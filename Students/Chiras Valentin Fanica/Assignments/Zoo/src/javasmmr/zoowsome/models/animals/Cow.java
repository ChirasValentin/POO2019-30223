package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	
	public Cow()
	{
		super(4,"Aurica",38.0f,95.3f,3.5,0.2);
	}
	 public Cow(Integer nrOfLegs, String name,float normalBodyTemp,float percBodyHair, double maintenanceCost, double dangerPerc)
	 {
			super(nrOfLegs, name, normalBodyTemp,percBodyHair,maintenanceCost,dangerPerc);
	 }
}
