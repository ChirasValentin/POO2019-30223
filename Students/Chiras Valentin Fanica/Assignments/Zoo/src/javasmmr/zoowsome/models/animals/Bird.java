package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animals {
	private boolean migrates;
	private Integer avgFlightAltitude;
	public Bird(Integer nrOfLegs,String name,Integer avgFlightAltitude,boolean migrates
			,double maintenanceCost,double dangerPerc)
	{
		super(nrOfLegs,name,maintenanceCost,dangerPerc);
		
		this.avgFlightAltitude = avgFlightAltitude;
		this.migrates=migrates;
	}
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