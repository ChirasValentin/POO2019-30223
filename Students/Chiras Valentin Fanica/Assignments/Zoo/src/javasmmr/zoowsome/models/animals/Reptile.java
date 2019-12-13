package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Reptile extends Animal {

	private boolean laysEggs;

	public Reptile(String name, Integer nrOfLegs, Double maintenanceCost, Double dangerPerc, boolean laysEgg) {
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.laysEggs = laysEgg;
	}

	public boolean getLaysEggs() {
		return this.laysEggs;
	}

	public void setLaysEggs(boolean lays) {
		this.laysEggs = lays;

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
	}

	public void decodeFromXml(Element element)

	{
		super.decodeFromXml(element);
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
