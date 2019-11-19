package javasmmr.zoowsome.models.animals;


public abstract class Mammal extends Animals {
  private float normalBodyTemp;
  private float percBodyHair;
  
  public Mammal(Integer nrOfLegs, String name,float normalBodyTemp,float percBodyHair, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}

  public float getNormalBlodyTemp()
  {
	  return this.normalBodyTemp;
  }
  public void setNormalBlodyTemp(float BodyTemp)
  {
	  this.normalBodyTemp=BodyTemp;
  }
  public float getPercBodyHair()
  {
	  return this.percBodyHair;
  }
  public void setPercBodyHair(float Perc)
  {
	  this.percBodyHair = Perc;
  }
}