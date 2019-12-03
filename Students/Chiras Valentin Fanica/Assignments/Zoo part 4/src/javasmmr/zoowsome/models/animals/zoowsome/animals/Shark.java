package javasmmr.zoowsome.animals;

public class Shark extends Aquatic {
	public Shark()
	{
		setNrOfLegs(0);
		setWaterType(WaterType.SALTWATER);
	}
	public Shark(String name,Integer nrOfLegs,Integer avgSwimDepth,WaterType waterType)
	{
		super.setAvgSwimDepth(avgSwimDepth);
		super.setName(name);
		super.setNrOfLegs(nrOfLegs);
		super.setWaterType(waterType);
	}
}
