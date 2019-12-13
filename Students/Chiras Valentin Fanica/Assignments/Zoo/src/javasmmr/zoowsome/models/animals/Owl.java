package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Owl extends Bird {

	public Owl(String name, Double maintenanceCost, Double dangerPerc, boolean migrates, Integer avg) {
		super(name, 2, maintenanceCost, dangerPerc, migrates, avg);

	}
	public Owl() {
		super("Long-eared ",2,4.0,0.05,false,1000);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Owl);
	}

}
