package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animals implements Killer {

	private Integer nrOfLegs;
	private String name;
	private final double maintenenceCost;
	private final double dangerPerc;
	private boolean takenCareOf = false;

	public Animals(Integer nrOfLegs,String name,double maintenanceCost,double dangerPerc)
	{
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.maintenenceCost=maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	public boolean kill() {
		Random random = new Random();
		double animalInteraction = random.nextDouble();
		if (animalInteraction < this.dangerPerc)
			return true;
		else
			return false;

	}
	public boolean getIsTakenCareOf() {
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takeCare)
	 {
		this.takenCareOf=takeCare;
	 }
	public double getMaintenanceCost() {
		return this.maintenenceCost;
	}
	public double getDancerPerc()
	{
		return this.dangerPerc;
	}
	public void setNrOfLegs(Integer nr) {
		this.nrOfLegs = nr;
	}

	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
