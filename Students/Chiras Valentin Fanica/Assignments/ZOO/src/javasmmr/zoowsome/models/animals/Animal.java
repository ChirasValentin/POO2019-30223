package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Animal implements Killer, XML_Parsable {
	private String name;
	private Integer nrOfLegs;
	private Double maintenanceCost;
	private Double dangerPerc;
	private boolean takenCareOf = false;

	public Animal(String name, Integer nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		this.name = name;
		this.nrOfLegs = nrOfLegs;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	public boolean kill() {
		Random randomizer = new Random();
		double animalIneraction = randomizer.nextDouble();
		if (animalIneraction < this.dangerPerc)
			return true;
		else
			return false;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
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

	public boolean isTakenCareOf() {
		return this.takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public void setDangerPerc(Double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}

	public double getDangerPerc() {
		return this.dangerPerc;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
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
