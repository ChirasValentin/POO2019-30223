package javasmmr.zoowsome.animals;

public abstract class Reptile extends Animals{
		
	private boolean laysEggs;
	
	public void setLaysEggs(boolean laysEggs)
	{
		this.laysEggs=laysEggs;
	}
	public boolean getLaysEggs()
	{
		return this.laysEggs;
	}
}
