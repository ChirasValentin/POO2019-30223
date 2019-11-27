package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Owl extends Bird {

	public Owl() {
		super(2, "Bubonis", 4500, false, 3.6, 0.3);
	}

	public Owl(Integer nrOfLegs, String name, Integer avgFlightAltitude, boolean migrates, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, avgFlightAltitude, migrates, maintenanceCost, dangerPerc);

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException

	{

		super.encodeToXml(eventWriter);

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.Owl);

	}
}
