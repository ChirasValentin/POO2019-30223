package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainControl {
	public static void main(String[] args) throws Exception {
		/*
		 * AnimalFactory animalFactory = new AnimalFactory(); SpeciesFactory
		 * speciesFactory1 = animalFactory.getSpeciesFactory(Constants.Species.Mammals);
		 * Animals a1 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Monkey);
		 * System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		 */
		Reptile[] Reptiles = new Reptile[40];
		Aquatic[] Aquatics = new Aquatic[40];
		Mammal[] Mammals = new Mammal[40];
		Bird[] Birds = new Bird[40];
		int animalCounter = 150;
		int reptileCounter = 0;
		int birdCounter = 0;
		int mCounter = 0;
		int aquaticCounter = 0;
		EmployeeFactory abstractEmplyeeFactory = new EmployeeFactory();
		EmployeeAbstractFactory employeeFactory1 = abstractEmplyeeFactory
				.getEmployeeFactory(Constants.EmployeeTypes.Caretaker);
		Caretaker caretakers[] = new Caretaker[150];

		for (int i = 0; i < caretakers.length; i++) {
			caretakers[i] = (Caretaker) employeeFactory1.getEmployeeFactory(Constants.EmployeeTypes.Caretaker);
		}

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < reptileCounter; i++)
				if ((caretakers[i].isDead() == false) && Reptiles[i].getIsTakenCareOf() == false) {
					String result = caretakers[i].takeCareOf(Reptiles[i]);
					if (result.contentEquals(Constants.Employees.Caretakers.TCO_KILLED)) {
						caretakers[i].setDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						i++;
					} else
						Reptiles[i].setTakenCareOf(true);
				}
		}
	for(int i =0 ; i<reptileCounter ; i++)
		if(Reptiles[i].getIsTakenCareOf()==true)
			System.out.println("It has been taken care of animal #" + i + ","+Reptiles[i].getName());
		else
			System.out.println("It has NOT been taken care of animal #" + i + ","+Reptiles[i].getName());
			
	for(int i = 0 ; i< caretakers.length;i++)
		if(caretakers[i].isDead() == true)
			System.out.println(caretakers[i].getName() + "is dead");
		else
			System.out.println(caretakers[i].getName() + "is allive");
	
	}
}
