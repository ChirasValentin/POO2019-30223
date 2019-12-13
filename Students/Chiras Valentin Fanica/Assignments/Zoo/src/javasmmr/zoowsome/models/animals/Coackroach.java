package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.Constants;

public class Coackroach extends Insect {

	public Coackroach(String name, Double maintenanceCost, Double dangerPerc,boolean canFly,boolean isDangerous) {
		super(name, 6, maintenanceCost, dangerPerc,canFly,isDangerous);
	}
	public Coackroach()
	{
		super("Dictyoptera",6,1.0,0.33,true,false);
	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Coackroach);
	}
}

