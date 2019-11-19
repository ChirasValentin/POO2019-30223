package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee {
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
}
