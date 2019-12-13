package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Monkey extends Mammal {

	public Monkey(String name, Double maintenanceCost, Double dangerPerc, float temp,
			float bodyHair) {
		super(name, 4, maintenanceCost, dangerPerc, temp, bodyHair);
		
	}
	public Monkey() {
		super("Madril",4,35.0,0.55,36.7f,0.95f);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Monkey);
	}
	
}
