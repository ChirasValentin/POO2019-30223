package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {

	private boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(String name, Integer nrOfLegs, Double maintenanceCost, Double dangerPerc, boolean migrates,
			Integer avg) {
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avg;
	}

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public boolean getMigrates() {
		return this.migrates;
	}

	public void setAvgFlightAltitude(Integer avg) {
		this.avgFlightAltitude = avg;
	}

	public Integer GetAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.migrates));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);

		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(
				Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
