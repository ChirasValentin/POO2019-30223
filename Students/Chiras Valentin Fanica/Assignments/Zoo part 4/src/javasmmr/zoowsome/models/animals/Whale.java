package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Whale extends Aquatic {

	public Whale() {
		super(0, "Blue Whale", 2500, WaterType.SALTWATER, 4.1, 0.79);
	}

	public Whale(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType water, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, water, maintenanceCost, dangerPerc);

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException

	{

		super.encodeToXml(eventWriter);

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Whale);

	}

}
