package javasmmr.zoowsome.models.animals;

public abstract class Animals {

	private Integer nrOfLegs;
	private String name;
	
	public void setNrOfLegs(Integer nr)
	{
		this.nrOfLegs=nr;
	}
	public Integer getNrOfLegs()
	{
		return this.nrOfLegs;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}
