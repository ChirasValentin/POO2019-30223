package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Whale extends Aquatic {

	public Whale(String name, Double maintenanceCost, Double dangerPerc, Integer avg, waterType waterType) {
		super(name, 0, maintenanceCost, dangerPerc, avg, waterType);

	}

	public Whale() {
		super("White", 0, 9.0, 0.95, 4000, waterType.saltwater);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {

		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Whale);
	}
}
