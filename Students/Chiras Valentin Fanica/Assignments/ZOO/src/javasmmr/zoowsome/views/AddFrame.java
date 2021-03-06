package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddFrame extends ZooFrame{
	private static final long serialVersionUID  = 1l;
	JPanel creationPanel;
	JPanel animalPanel;
	JPanel subtypePanel;
	
	public AddFrame(String title) {
		super(title);
		
		contentPanel.setLayout(new GridLayout(0,3));
		
		creationPanel = new JPanel();
		subtypePanel = new JPanel();
		subtypePanel.setLayout(new GridLayout(5,0));
		contentPanel.add(creationPanel);
		
		SpringLayout s1Panel= new SpringLayout();
		creationPanel.setLayout(s1Panel);
		
		JLabel chooseText = new JLabel("What do you want to add?");
		s1Panel.putConstraint(SpringLayout.HORIZONTAL_CENTER, chooseText, 0, SpringLayout.HORIZONTAL_CENTER, creationPanel);
		creationPanel.add(chooseText);
		
		JButton addAnimal = new JButton(new AbstractAction("Add Animal") {
			private static final long serialVersionUID  = 1l;
			
			public void actionPerformed(ActionEvent e) {
				animalForm();
				subtypePanel.revalidate();
			}
		});
		s1Panel.putConstraint(SpringLayout.VERTICAL_CENTER, addAnimal,50, SpringLayout.VERTICAL_CENTER, creationPanel);
	
			creationPanel.add(addAnimal);
			JButton addEmployee = new JButton(new AbstractAction("Add Employee") {
				private static final long serialVersionUID  = 1l;
				@Override
				public void actionPerformed(ActionEvent e) {
					employeeForm();
					subtypePanel.revalidate();
				}
			});
			
		s1Panel.putConstraint(SpringLayout.VERTICAL_CENTER,addEmployee,50,SpringLayout.VERTICAL_CENTER,creationPanel);
		creationPanel.add(addEmployee);
			
	}
		public void animalForm() {
			subtypePanel.removeAll();
			JButton[] buttonMatrix = new JButton[5];
			String[] buttonNames = {"Add mammal","Add bird","Add reptile","Add aquatic","Add insect"};
			for(int i =0 ; i<5;i++) {
				buttonMatrix[i] = new JButton(buttonNames[i]);
				subtypePanel.add(buttonMatrix[i]);
			}
			contentPanel.add(subtypePanel);
			subtypePanel.validate();
			subtypePanel.repaint();
		}
		public void employeeForm() {
			subtypePanel.removeAll();
			JButton addCaretaker = new JButton("Add caretaker");
			subtypePanel.add(addCaretaker);
			contentPanel.add(subtypePanel);
			
			subtypePanel.validate();
			subtypePanel.repaint();
		}
		
		
	}
