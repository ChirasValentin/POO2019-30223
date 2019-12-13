package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;

	public Insect(String name, Integer nrOfLegs, Double maintenanceCost, Double dangerPerc, boolean canFly,
			boolean isDangerous) {
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean getCanFly() {
		return this.canFly;
	}

	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public boolean getIsDangerous() {
		return this.isDangerous;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.canFly));
		createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
	}

	public void decodeFromXml(Element element) 
	{ 
		super.decodeFromXml(element); 
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent())); 
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent())); 
	}
}	

