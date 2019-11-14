
public abstract class Persoana {
	private int ID;
	private String nume;
	private String nrDeTelefon;

	Persoana() {
		this.ID = -1;
		this.nume = null;
		this.nrDeTelefon = null;
	}

	Persoana(int ID, String nume, String nrDeTelefon) {
		this.ID = ID;
		this.nume = nume;
		this.nrDeTelefon = nrDeTelefon;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setNrDeTelefon(String nr) {
		this.nrDeTelefon = nr;
	}
	
	public int getID()
	{
		return this.ID;
	}
	public String getNume()
	{
		return this.nume;
	}
	public String getNrDeTelefon()
	{
		return this.nrDeTelefon;
	}
	
	public String toString()
	{
		return this.ID + " " + this.nume + " " + this.nrDeTelefon;
	}
	

}
