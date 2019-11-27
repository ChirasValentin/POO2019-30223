package javasmmr.zoowsome.models.animals;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.models.interfaces.Killer;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;

public abstract class Animals implements Killer {

	private Integer nrOfLegs;
	private String name;
	private double maintenenceCost;
	private double dangerPerc;
	private boolean takenCareOf = false;

	public Animals(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenenceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	public boolean kill() {
		Random random = new Random();
		double animalInteraction = random.nextDouble();
		if (animalInteraction < this.dangerPerc)
			return true;
		else
			return false;

	}

	public boolean getIsTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takeCare) {
		this.takenCareOf = takeCare;
	}

	public void setMaintenanceCost(double cost) {
		this.maintenenceCost = cost;
	}

	public double getMaintenanceCost() {
		return this.maintenenceCost;
	}

	public void setDangerPerc(double danger) {
		this.dangerPerc = danger;
	}

	public double getDangerPerc() {
		return this.dangerPerc;
	}

	public void setNrOfLegs(Integer nr) {
		this.nrOfLegs = nr;
	}

	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));

		createNode(eventWriter, "name", String.valueOf(this.name));

		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenenceCost));

		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));

		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));

	}

	public void decodeFromXml(Element element) {

		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));

		setName(element.getElementsByTagName("name").item(0).getTextContent());

		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));

		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));

		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));

	}

}
