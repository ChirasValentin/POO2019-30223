package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cow;

import javasmmr.zoowsome.repositories.AnimalRepository;



public class MainController {

	public static void main(String[] args) throws Exception {
	Animal cow= new Cow();
	Animal butterfly = new Butterfly();
	
	AnimalRepository animalRepository = new AnimalRepository();
	ArrayList<Animal> animals = new ArrayList<Animal>();
	animals.add(cow);
	animals.add(butterfly);
	animalRepository.save(animals);
	ArrayList<Animal> animalsToLoad = new ArrayList<Animal>();
	animalsToLoad=animalRepository.load();

	}

}
