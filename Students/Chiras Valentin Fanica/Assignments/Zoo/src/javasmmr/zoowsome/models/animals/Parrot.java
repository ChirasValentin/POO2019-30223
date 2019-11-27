package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Parrot extends Bird {

	public Parrot() {
		super(2, "Parrot", 1500, false, 3.6, 0.2);
	}

	public Parrot(Integer nrOfLegs, String name, Integer avgFlightAltitude, boolean migrates, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, avgFlightAltitude, migrates, maintenanceCost, dangerPerc);

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException

	{

		super.encodeToXml(eventWriter);

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.Parrot);

	}

}
