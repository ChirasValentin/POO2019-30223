package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Diplomystus extends Aquatic {

	public Diplomystus() {
		super(0, "Diplomystus", 500, WaterType.FRESHWATER, 3.1, 0.10);
	}

	public Diplomystus(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType water, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, water, maintenanceCost, dangerPerc);

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException

	{

		super.encodeToXml(eventWriter);

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Diplomystus);

	}
}
