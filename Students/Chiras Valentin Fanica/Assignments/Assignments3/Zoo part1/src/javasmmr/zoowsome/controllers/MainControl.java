package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainControl {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = animalFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animals a1 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Monkey);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
	}

}
