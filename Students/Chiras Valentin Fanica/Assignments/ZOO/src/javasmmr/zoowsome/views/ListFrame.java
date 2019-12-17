package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;

public class ListFrame extends ZooFrame{
	
	private static final long serialVersionUID = 1L;
	
	public ListFrame(String title) throws ParserConfigurationException,SAXException,IOException{
		super(title);
		contentPanel.setLayout(new GridLayout(1,1));
		JPanel jPanel = new JPanel(new GridLayout(1,1));
		JTable animals_table = new JTable();
		JTable employee_table = new JTable();
		JScrollPane animals_scroll = new JScrollPane(animals_table);
		JScrollPane employee_scroll = new JScrollPane(employee_table);
		
		DefaultTableModel animal_model = new DefaultTableModel();
		DefaultTableModel employee_model = new DefaultTableModel();
		 String[] animal_headers = {"Type", "Name","Danger","Hours/$","# legs"};
		 String[] employee_headers= {"Name","Salary","Status"};
		 
		 animal_model.setColumnIdentifiers(animal_headers);
		 employee_model.setColumnIdentifiers(employee_headers);
		 
		 animals_table.setDefaultEditor(Object.class,null);
		 employee_table.setDefaultEditor(Object.class, null);
		 animals_table.getTableHeader().setFont(new Font("Arial",Font.BOLD,15));
		 employee_table.getTableHeader().setFont(new Font("Arial",Font.BOLD,15));
		 
		 AnimalRepository animalRep= new AnimalRepository();
		 ArrayList<Animal> animals = animalRep.load();
		 Object rowData[] = new Object[5];
		 for(int i =0;i<animals.size();i++) {
			 rowData[0]=animals.get(i).getClass().getName().substring(33);
			 rowData[1]=animals.get(i).getName();
			 rowData[2]=animals.get(i).getMaintenanceCost();
			 if(animals.get(i).getNrOfLegs() == 0)
				 rowData[4]= " Nein legs";
			 else
				 rowData[4]=animals.get(i).getNrOfLegs();
			 animal_model.addRow(rowData);
		 }
		 EmployeeRepository employeeRep = new EmployeeRepository();
		 ArrayList<Employee> employees = employeeRep.load();
		 
		 Object employeeRowData[] = new Object[3];
		 for(int i =0;i< employees.size();i++) {
			 employeeRowData[0] = employees.get(i).getName();
			 employeeRowData[1] = employees.get(i).getSalary();
			 if(employees.get(i).isDead())
				 employeeRowData[2] = "Dead";
			 else
				 employeeRowData[2]="Alive";
			 employee_model.addRow(employeeRowData);
		 }
		 animals_table.setModel(animal_model);
		 employee_table.setModel(employee_model);
		 jPanel.add(animals_scroll,BorderLayout.NORTH);
		 jPanel.add(employee_scroll,BorderLayout.SOUTH);
		 contentPanel.add(jPanel);
	}

}
