package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {

	private float normalBodyTemp;
	private float percBodyHair;

	public Mammal(String name, Integer nrOfLegs, Double maintenanceCost, Double dangerPerc, float temp,
			float bodyHair) {
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.normalBodyTemp = temp;
		this.percBodyHair = bodyHair;
	}

	public void setNormalBodyTemp(float temp) {
		this.normalBodyTemp = temp;
	}

	public float getNormalBodyTemp() {
		return this.normalBodyTemp;
	}

	public void setPercBodyHair(float perc) {
		this.percBodyHair = perc;
	}

	public float getPercBOdyHair() {
		return this.percBodyHair;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
	}
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
