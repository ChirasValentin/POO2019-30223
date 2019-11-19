package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;

	public Employee() {
	}

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

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getSalary() {
		return this.salary;
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
}
