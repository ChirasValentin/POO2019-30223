package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Spider extends Insect {

	public Spider(String name, Double maintenanceCost, Double dangerPerc,boolean isDangerous) {
		super(name, 8, maintenanceCost, dangerPerc,false,isDangerous);
		
	}

	public Spider() {
		super("Tarantula",8,1.0,0.78,false,true);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Spider);
	}
}
