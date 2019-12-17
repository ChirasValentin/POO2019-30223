package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cow;

import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.views.utilities.MainMenuFrame;



public class MainController {

	public static void main(String[] args) throws Exception {
		new MainMenuController(new MainMenuFrame("Main Menu"),false);

	}

}
