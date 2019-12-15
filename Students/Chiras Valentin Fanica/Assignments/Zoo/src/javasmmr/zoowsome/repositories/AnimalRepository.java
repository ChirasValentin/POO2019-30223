package javasmmr.zoowsome.repositories;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.*;

import javasmmr.zoowsome.services.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() throws ParserConfigurationException {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Mammals.Cow:
			Animal newCow = new Cow();
			newCow.decodeFromXml(element);
			return newCow;

		case Constants.Animals.Mammals.Monkey:
			Animal newMonkey = new Monkey();
			newMonkey.decodeFromXml(element);
			return newMonkey;

		case Constants.Animals.Mammals.Tiger:
			Animal newTiger = new Tiger();
			newTiger.decodeFromXml(element);
			return newTiger;

		case Constants.Animals.Aquatics.Dolphin:
			Animal newDolphin = new Dolphin();
			newDolphin.decodeFromXml(element);
			return newDolphin;

		case Constants.Animals.Aquatics.Shark:
			Animal newShark = new Shark();
			newShark.decodeFromXml(element);
			return newShark;

		case Constants.Animals.Aquatics.Whale:
			Animal newWhale = new Whale();
			newWhale.decodeFromXml(element);
			return newWhale;

		case Constants.Animals.Birds.Chicken:
			Animal newChicken = new Chicken();
			newChicken.decodeFromXml(element);
			return newChicken;

		case Constants.Animals.Birds.Owl:
			Animal newOwl = new Owl();
			newOwl.decodeFromXml(element);
			return newOwl;

		case Constants.Animals.Birds.Parrot:
			Animal newParrot = new Parrot();
			newParrot.decodeFromXml(element);
			return newParrot;

		case Constants.Animals.Insects.Butterfly:
			Animal newButterfly = new Butterfly();
			newButterfly.decodeFromXml(element);
			return newButterfly;

		case Constants.Animals.Insects.Coackroach:
			Animal newCoackroach = new Coackroach();
			newCoackroach.decodeFromXml(element);
			return newCoackroach;

		case Constants.Animals.Insects.Spider:
			Animal newSpider = new Spider();
			newSpider.decodeFromXml(element);
			return newSpider;

		case Constants.Animals.Reptiles.Lizard:
			Animal newLizard = new Lizard();
			newLizard.decodeFromXml(element);
			return newLizard;

		case Constants.Animals.Reptiles.Snake:
			Animal newSnake = new Snake();
			newSnake.decodeFromXml(element);
			return newSnake;

		case Constants.Animals.Reptiles.Turtle:
			Animal newTurtle = new Turtle();
			newTurtle.decodeFromXml(element);
			return newTurtle;

		default:
			break;

		}
		return null;
	}
}
