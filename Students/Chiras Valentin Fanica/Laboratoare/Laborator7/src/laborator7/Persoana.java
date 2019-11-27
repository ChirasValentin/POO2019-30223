package laborator7;

public class Persoana implements Cloneable{
	private String nume;
	private String prenume;
	private int varsta;
	public Persoana(String nume,String prenume,int varsta)
	{
		this.nume=nume;
		this.prenume=prenume;
		this.varsta=varsta;
	}
	public Persoana() {}
	public int getVarsta() {
		return this.varsta;
	}
	public void setVarsta(int varsta)
	{
		this.varsta=varsta;
	}
	public String getPrenume()
	{
		return prenume;
	}
	
	public void setPrenume(String prenume)
	{
		this.prenume=prenume;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume)
	{
		this.nume=nume;
	}
	public int compareTo(Object o)
	{
		if(this.varsta==((Persoana)o).getVarsta()) return 0;
		else if(this.varsta>((Persoana)o).getVarsta()) return 1;
		return -1;
	}
	
	public String toString() {
		return this.nume + " " + this.prenume + "are " + this.varsta + "ani"; 
	}

}
