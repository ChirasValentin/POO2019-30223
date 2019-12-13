package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.waterType;
import javasmmr.zoowsome.services.Constants;

public class Dolphin extends Aquatic {

	public Dolphin(String name, Double maintenanceCost, Double dangerPerc, Integer avg) {
		super(name, 0, maintenanceCost, dangerPerc, avg, waterType.freshwater);

	}
	public Dolphin() {
		super("La Plata dolphin",0,5.0,0.30,1500,waterType.freshwater);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.Dolphin);
	}
}
