package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Snake extends Reptile {

	public Snake(String name, Double maintenanceCost, Double dangerPerc, boolean laysEgg) {
		super(name, 0, maintenanceCost, dangerPerc, laysEgg);

	}

	public Snake() {
		super("Piton", 0, 3.0, 0.78, true);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Snake);
	}
}
