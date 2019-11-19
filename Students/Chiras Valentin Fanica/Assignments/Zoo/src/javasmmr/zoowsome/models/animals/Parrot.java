package javasmmr.zoowsome.models.animals;


public class Parrot extends Bird {

	public Parrot() {
		super(2, "Parrot", 1500, false, 3.6, 0.2);
	}

	public Parrot(Integer nrOfLegs, String name, Integer avgFlightAltitude, boolean migrates, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, avgFlightAltitude, migrates, maintenanceCost, dangerPerc);

	}

}
