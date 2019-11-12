package javasmmr.zoowsome.models.animals;


public class Whale extends Aquatic{

	public Whale()
	{
		setNrOfLegs(0);
		setWaterType(WaterType.SALTWATER);
	}
	public Whale(String name,Integer nrOfLegs,Integer avgSwimDepth,WaterType waterType)
	{
		super.setAvgSwimDepth(avgSwimDepth);
		super.setName(name);
		super.setNrOfLegs(nrOfLegs);
		super.setWaterType(waterType);
	}
}
