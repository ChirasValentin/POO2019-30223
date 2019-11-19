package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {

	public Owl() {
		super(2, "Bubonis", 4500, false, 3.6, 0.3);
	}

	public Owl(Integer nrOfLegs, String name, Integer avgFlightAltitude, boolean migrates, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, avgFlightAltitude, migrates, maintenanceCost, dangerPerc);

	}
}
