package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animals {

	private boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	public boolean getLaysEggs() {
		return this.laysEggs;
	}
}
