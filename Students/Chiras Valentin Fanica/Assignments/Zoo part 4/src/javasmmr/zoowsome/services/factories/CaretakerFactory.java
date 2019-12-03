package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;
import java.util.Random;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeAbstractFactory  {
	
	public Employee getEmployeeFactory(String type) throws
	Exception{
		String[] caretakerNames = new String[] {"Riuka","Tudor","Rares"};
		BigDecimal[] salaries = new BigDecimal[] { new BigDecimal("1000"),new BigDecimal("1500"),new BigDecimal("3000")};
		
		Random random=new Random();
		int chooseName = random.nextInt(caretakerNames.length);
		double workingHours = 10* random.nextDouble();
		int chooseSalary = random.nextInt(salaries.length);
		return new Caretaker(caretakerNames[chooseName],salaries[chooseSalary],false,workingHours);
	}
	
}
