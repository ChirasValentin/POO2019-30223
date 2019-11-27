package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect {
	public Butterfly()
	{
		super(6,"Adonis Blue",true,false,3.5,0.02);
	}
	
	public Butterfly(Integer nrOfLegs,String name,boolean canFly,boolean isDangerous
			,double maintenanceCost,double dangerPerc)
	{
		super(nrOfLegs,name,canFly,isDangerous,maintenanceCost,dangerPerc);

	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insect.Butterfly);
	}
}
	