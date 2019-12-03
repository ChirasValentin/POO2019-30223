package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Snake extends Reptile {
	public Snake()
	{
		super(0,"Piton",true,2.0,0.85);
	}
	public Snake(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name,laysEggs, maintenanceCost, dangerPerc);	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException

	{

		super.encodeToXml(eventWriter);

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.Snake);

	}
}
