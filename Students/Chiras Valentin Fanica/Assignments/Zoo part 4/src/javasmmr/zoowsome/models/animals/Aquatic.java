package javasmmr.zoowsome.models.animals;

public abstract class  Aquatic extends Animals {
	private Integer avgSwimDepth;
	private WaterType waterType;
	public Aquatic(Integer nrOfLegs,String name,Integer avgSwimDepth,WaterType water
			,double maintenanceCost,double dangerPerc)
	{
		super(nrOfLegs,name,maintenanceCost,dangerPerc);
		this.avgSwimDepth=avgSwimDepth;
		this.waterType = water;
	}

public void setWaterType(WaterType waterType)
	{
		this.waterType=waterType;
	}
public WaterType getWaterType()
	{
		return this.waterType;
	}
public void setAvgSwimDepth(Integer Depth)
	{
		this.avgSwimDepth=Depth;
	}
public Integer getAvgSwimDepth()
	{
		return this.avgSwimDepth;
	}
}