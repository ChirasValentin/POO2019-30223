package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
	@Override
	public Animals getAnimal(String type) {
		if (Constants.Animals.Insect.Butterfly.equals(type)) {
			return new Butterfly();
		} else if (Constants.Animals.Insect.Coackroach.equals(type)) {
			return new Coackroach();
		}
		if (Constants.Animals.Insect.Spider.equals(type)) {
			return new Spider();
		} else {
			return null;
		}
	}
}
