package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Chicken extends Bird {

	public Chicken(String name, Double maintenanceCost, Double dangerPerc, boolean migrates, Integer avg) {
		super(name, 2, maintenanceCost, dangerPerc, migrates, avg);
	}
	public Chicken() {
		super("Gallus gallus",2,3.0,0.10,false,10);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Chicken);
	}
}
