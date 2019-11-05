package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animals {
	private boolean migrates;
	private Integer avgFlightAltitude;
	
	public void setMigrates(boolean migrates)
	{
		this.migrates=migrates;
	}
	public boolean getMigrates()
	{
		return this.migrates;
	}
	public void setAvgFlightAltitude(Integer altitude)
	{
		this.avgFlightAltitude=altitude;
	}
	public Integer getAvgFlightAltitude()
	{
		return this.avgFlightAltitude;
	}
	
}