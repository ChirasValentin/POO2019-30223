package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	@Override
	public Animals getAnimal(String type) {
		if (Constants.Animals.Mammal.Cow.equals(type)) {
			return new Cow();
		} else if (Constants.Animals.Mammal.Monkey.equals(type)) {
			return new Monkey();
		}
		if (Constants.Animals.Mammal.Tiger.equals(type)) {
			return new Tiger();
		} else {
			return null;
		}
	}
}
