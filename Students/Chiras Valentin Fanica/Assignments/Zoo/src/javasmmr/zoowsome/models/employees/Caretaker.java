package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	private double workingHours;

	public Caretaker(String name, BigDecimal salary, boolean isDead, double workingHours) {
		super(name, salary, isDead);
		this.workingHours = workingHours;
	}

	public Caretaker() {
		super("El Caretaker", new BigDecimal("7000"), false);
		this.workingHours = 8;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal animal) {
		if (animal.kill() == true)
			return Constants.Employees.Caretakers.TCO_KILLED;
		if (this.workingHours < animal.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		else {
			animal.setTakenCareOf(true);
			this.workingHours = animal.getMaintenanceCost();
			return Constants.Employees.Caretakers.TCO_SUCCESS;
		}
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.EmployeeTypes.Caretaker);

	}


	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));

	}

}
