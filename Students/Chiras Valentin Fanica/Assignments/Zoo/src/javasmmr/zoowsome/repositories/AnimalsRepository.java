package javasmmr.zoowsome.repositories;

import org.w3c.dom.Document;

import org.w3c.dom.Element;

import org.w3c.dom.Node;

import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javasmmr.zoowsome.models.animals.Aligator;
import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Coackroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Diplomystus;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Pigeon;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;


public class AnimalsRepository {

	private static final String XML_FILENAME = "Animals.xml";

	public AnimalsRepository() {
	}

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}

	public void save(ArrayList<Animals> Animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));

		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (Animals animal : Animals) {
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			animal.encodeToXml(eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	public ArrayList<Animals> Load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animals> Animals = new ArrayList<Animals>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();

				switch (discriminant) {

				case Constants.Animals.Insect.Butterfly:

					Animals butterfly = new Butterfly();

					butterfly.decodeFromXml(element);

					Animals.add(butterfly);

					break;

				case Constants.Animals.Insect.Coackroach:

					Animals Coackroach = new Coackroach();

					Coackroach.decodeFromXml(element);

					Animals.add(Coackroach);

					break;

				case Constants.Animals.Aquatic.Whale:

					Animals Whale = new Whale();

					Whale.decodeFromXml(element);

					Animals.add(Whale);

					break;

				case Constants.Animals.Aquatic.Shark:

					Animals shark = new Shark();

					shark.decodeFromXml(element);

					Animals.add(shark);

					break;

				case Constants.Animals.Aquatic.Diplomystus:

					Animals diplumystys = new Diplomystus();

					diplumystys.decodeFromXml(element);

					Animals.add(diplumystys);

					break;

				case Constants.Animals.Bird.Owl:

					Animals owl = new Owl();

					owl.decodeFromXml(element);

					Animals.add(owl);

					break;

				case Constants.Animals.Bird.Parrot:

					Animals parrot = new Parrot();

					parrot.decodeFromXml(element);

					Animals.add(parrot);

					break;

				case Constants.Animals.Bird.Pigeon:

					Animals pigeon = new Pigeon();

					pigeon.decodeFromXml(element);

					Animals.add(pigeon);

					break;

				case Constants.Animals.Reptile.Snake:

					Animals snake = new Snake();

					snake.decodeFromXml(element);

					Animals.add(snake);

					break;

				case Constants.Animals.Reptile.Turtle:

					Animals turtle = new Turtle();

					turtle.decodeFromXml(element);

					Animals.add(turtle);

					break;

				case Constants.Animals.Reptile.Aligator:

					Animals aligator = new Aligator();

					aligator.decodeFromXml(element);

					Animals.add(aligator);

					break;

				case Constants.Animals.Mammal.Cow:

					Animals cow = new Cow();

					cow.decodeFromXml(element);

					Animals.add(cow);

					break;

				case Constants.Animals.Mammal.Monkey:

					Animals monkey = new Monkey();

					monkey.decodeFromXml(element);

					Animals.add(monkey);

					break;

				case Constants.Animals.Mammal.Tiger:

					Animals tiger = new Tiger();

					tiger.decodeFromXml(element);

					Animals.add(tiger);

					break;

				default:

					break;

				}

			}

		}
		return Animals;
	}

}