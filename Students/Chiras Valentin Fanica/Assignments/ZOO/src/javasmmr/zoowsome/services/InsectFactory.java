package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Coackroach;
import javasmmr.zoowsome.models.animals.Spider;


public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider();
		} else if (Constants.Animals.Insects.Coackroach.equals(type)) {
			return new Coackroach();
		} else {
			throw new Exception("Invalid animal exception");
		}
	}

}
