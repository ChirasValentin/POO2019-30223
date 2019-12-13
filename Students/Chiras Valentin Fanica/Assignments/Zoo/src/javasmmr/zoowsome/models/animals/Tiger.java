package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Tiger extends Mammal{

	public Tiger(String name, Double maintenanceCost, Double dangerPerc, float temp, float bodyHair) {
		super(name, 4, maintenanceCost, dangerPerc, temp, bodyHair);
		
	}

	public Tiger() {
		super("White Tiger",4,5.0,0.89,37.6f,0.99f);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Tiger);
	}
}
