package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Lizard extends Reptile {

	public Lizard(String name, Double maintenanceCost, Double dangerPerc, boolean laysEgg) {
		super(name, 4, maintenanceCost, dangerPerc, laysEgg);

	}
	public Lizard() {
		super("African Fat-Tailed Gecko",4,4.0,0.55,true);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Lizard);
	}
}
