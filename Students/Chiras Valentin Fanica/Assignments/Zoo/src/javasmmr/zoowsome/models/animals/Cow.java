package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Cow extends Mammal {

	public Cow(String name, Double maintenanceCost, Double dangerPerc, float temp, float bodyHair) {
		super(name, 4, maintenanceCost, dangerPerc, temp, bodyHair);
	}

	public Cow() {
		super("B. taurus", 4, 4.0, 0.45, 36.2f, 0.95f);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Cow);
	}
}
