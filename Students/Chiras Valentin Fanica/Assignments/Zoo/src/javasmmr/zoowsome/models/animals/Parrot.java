package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Parrot extends Bird {

	public Parrot(String name, Double maintenanceCost, Double dangerPerc, boolean migrates,
			Integer avg) {
		super(name, 2, maintenanceCost, dangerPerc, migrates, avg);
		
	}
	public Parrot() {
		super("Grey parrot",2,3.0,0.1,false,500);
		
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Parrot);
	}
	
}
