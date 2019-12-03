package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Turtle extends Reptile {
	public Turtle() {
		super(4, "Turtle", true, 6.0, 0.35);
	}

	public Turtle(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, maintenanceCost, dangerPerc);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException

	{

		super.encodeToXml(eventWriter);

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.Turtle);

	}
}
