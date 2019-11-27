package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic {
	public Shark() {
		super(0, "White Shark", 1500, WaterType.SALTWATER, 4.1, 0.89);
	}

	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType water, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, water, maintenanceCost, dangerPerc);

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException

	{

		super.encodeToXml(eventWriter);

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Shark);

	}
}
