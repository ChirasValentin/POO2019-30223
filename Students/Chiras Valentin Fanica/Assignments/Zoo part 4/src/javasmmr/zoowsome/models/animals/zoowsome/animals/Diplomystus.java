package javasmmr.zoowsome.animals;

public class Diplomystus extends Aquatic{
	
	public Diplomystus(){
		setNrOfLegs(0);
		setWaterType(WaterType.FRESHWATER);
	}
	public Diplomystus(String name,Integer nrOfLegs,Integer avgSwimDepth,WaterType waterType)
	{
		super.setAvgSwimDepth(avgSwimDepth);
		super.setName(name);
		super.setNrOfLegs(nrOfLegs);
		super.setWaterType(waterType);
	}
}
