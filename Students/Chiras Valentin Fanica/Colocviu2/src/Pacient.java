
public class Pacient {
	private String nume;
	private String prenume;
	private int varsta;
	private Sex sex;
	private Afectiune afectiune;
	public Pacient(String nume,String prenume,int varsta,Sex sex)
	{
		this.nume=nume;
		this.prenume=prenume;
		this.varsta=varsta;
		this.sex=sex;
	}
	public void setAfectiune(Afectiune afectiune) {
		this.afectiune=afectiune;
	}
	public Afectiune getAfectiune() {
		return this.afectiune;
	}	
}
