package javasmmr.zoowsome.models.animals;

public class Diplomystus extends Aquatic{
	
	public Diplomystus(){
		super(0,"Diplomystus",500,WaterType.FRESHWATER,3.1,0.10);
	}
	
	public Diplomystus(Integer nrOfLegs,String name,Integer avgSwimDepth,WaterType water
			,double maintenanceCost,double dangerPerc)
	{
		super(nrOfLegs,name,avgSwimDepth,water,maintenanceCost,dangerPerc);
		
	}
}