package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
 import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	private double workingHours;

	public Caretaker(String name, BigDecimal salary, boolean isDead, double hours) {
		super(name, salary, isDead);
		this.workingHours = hours;
	}

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double hours) {
		this.workingHours = hours;
	}

	public Caretaker() {
		super("Gaia", new BigDecimal("5000"), false);
		this.workingHours = 8;
	}

	public String takeCareOf(Animals animal) {
		if (animal.kill() == true)
			return Constants.Employees.Caretakers.TCO_KILLED;
		if (this.workingHours < animal.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		else {
			animal.setTakenCareOf(true);
			this.workingHours -= animal.getMaintenanceCost();
			return Constants.Employees.Caretakers.TCO_SUCCESS;
		}
	}

	@Override

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {

		super.encodeToXml(eventWriter);

		createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));

		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.EmployeeTypes.Caretaker);

	}

	@Override

	public void decodeFromXml(Element element) {

		super.decodeFromXml(element);

		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));

	}
}
