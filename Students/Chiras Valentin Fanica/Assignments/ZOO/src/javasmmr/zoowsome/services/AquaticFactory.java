package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Whale;



public class AquaticFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.Whale.equals(type)) {
			return new Whale();
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin();
		} else {
			throw new Exception("Invalid animal exception");
		}
	}

}
