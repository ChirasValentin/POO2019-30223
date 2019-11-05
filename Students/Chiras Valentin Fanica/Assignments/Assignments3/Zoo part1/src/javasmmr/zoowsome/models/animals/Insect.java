package javasmmr.zoowsome.models.animals;


public abstract class Insect extends Animals {
	private boolean canFly;
	private boolean isDangerous;
	
	public void setCanFly(boolean canFly)
	{
		this.canFly=canFly;
	}
	public boolean getCanFly()
	{
		return this.canFly;
	}
	public void setIsDangerous(boolean isDangeorus)
	{
		this.isDangerous=isDangeorus;
	}
	public boolean getIsDangerous()
	{
		return this.isDangerous;
	}
}