package javasmmr.zoowsome.animals;

public abstract class  Aquatic extends Animals {
	private Integer avgSwimDepth;
	private WaterType waterType;

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