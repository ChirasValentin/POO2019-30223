package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammal {

	public Monkey() {
		super(4, "Babuin", 37.0f, 90.3f, 3.5, 0.2);
	}

	public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException

	{

		super.encodeToXml(eventWriter);

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammal.Monkey);

	}
}
