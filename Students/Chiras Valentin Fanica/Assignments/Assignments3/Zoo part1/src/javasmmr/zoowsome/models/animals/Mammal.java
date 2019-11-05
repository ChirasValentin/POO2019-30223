package javasmmr.zoowsome.models.animals;


public abstract class Mammal extends Animals {
  private float normalBodyTemp;
  private float percBodyHair;
  
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