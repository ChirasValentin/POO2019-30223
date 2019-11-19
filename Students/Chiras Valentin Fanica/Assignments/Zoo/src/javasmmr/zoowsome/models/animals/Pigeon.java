package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird{
	public Pigeon() {
		super(2, "Pigeon", 0, false, 7.6, 0.2);
	}

	public Pigeon(Integer nrOfLegs, String name, Integer avgFlightAltitude, boolean migrates, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, avgFlightAltitude, migrates, maintenanceCost, dangerPerc);

	}

}
