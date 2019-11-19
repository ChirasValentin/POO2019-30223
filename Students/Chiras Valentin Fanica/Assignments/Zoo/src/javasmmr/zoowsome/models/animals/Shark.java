package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark() {
		super(0, "White Shark", 1500, WaterType.SALTWATER, 4.1, 0.89);
	}

	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType water, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, water, maintenanceCost, dangerPerc);

	}
}
