package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	@Override
	public Animals getAnimal(String type) {
		if (Constants.Animals.Aquatic.Shark.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatic.Whale.equals(type)) {
			return new Whale();
		}
		if (Constants.Animals.Aquatic.Diplomystus.equals(type)) {
			return new Diplomystus();
		} else {
			return null;
		}
	}
}
