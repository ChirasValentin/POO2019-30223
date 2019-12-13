package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

import java.math.BigDecimal;
import java.util.UUID;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable {
	private String name;
	private Long id;
	private BigDecimal salary;
	private boolean isDead;

	public Employee(String name, BigDecimal salary, boolean isDead) {
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
		this.id = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean isDead() {
		return this.isDead;
	}

	public void setDead(boolean dead) {
		this.isDead = dead;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}

	public void decodeFromXml(Element element) {
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(new BigDecimal(element.getElementsByTagName("salary").item(0).getTextContent()));
		setDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}
