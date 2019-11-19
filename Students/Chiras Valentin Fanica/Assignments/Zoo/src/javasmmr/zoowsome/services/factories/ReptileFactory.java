package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	@Override
	public Animals getAnimal(String type) {
		if (Constants.Animals.Reptile.Aligator.equals(type)) {
			return new Aligator();
		} else if (Constants.Animals.Reptile.Snake.equals(type)) {
			return new Snake();
		}
		if (Constants.Animals.Reptile.Turtle.equals(type)) {
			return new Turtle();
		} else {
			return null;
		}
	}
}
