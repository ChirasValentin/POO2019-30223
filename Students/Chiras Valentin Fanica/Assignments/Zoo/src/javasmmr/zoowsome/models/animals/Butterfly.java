package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.Constants;

public class Butterfly extends Insect{

	public Butterfly(String name, Double maintenanceCost, Double dangerPerc,boolean canFly,boolean isDangerous) {
		super(name, 6, maintenanceCost, dangerPerc,canFly,isDangerous);
		
	}
	public Butterfly() {
		super("Butterfly",6,5.0,0.78,true,false);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Butterfly);
	}

}
