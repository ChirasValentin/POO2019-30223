package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animals getAnimal(String type) {
		if (Constants.Animals.Bird.Parrot.equals(type)) {
			return new Parrot();
		} else if (Constants.Animals.Bird.Owl.equals(type)) {
			return new Owl();
		}
		if (Constants.Animals.Bird.Pigeon.equals(type)) {
			return new Pigeon();
		} else {
			return null;
		}
	}
}
