package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Chicken;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Parrot;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		} else if (Constants.Animals.Birds.Owl.equals(type)) {
			return new Owl();
		} else if (Constants.Animals.Birds.Chicken.equals(type)) {
			return new Chicken();
		} else {
			throw new Exception("Invalid animal exception");

		}
	}

}
