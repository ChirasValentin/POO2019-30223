package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Coackroach extends Insect {
	public Coackroach() {
		super(6, "Gandac de bucatarie", false, true, 1.5, 0.22);
	}

	public Coackroach(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, canFly, isDangerous, maintenanceCost, dangerPerc);

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException

	{

		super.encodeToXml(eventWriter);

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insect.Coackroach);

	}

}
