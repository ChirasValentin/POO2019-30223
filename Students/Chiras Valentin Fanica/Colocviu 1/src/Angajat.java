
public class Angajat extends Persoana {

	private String dataAngajare;
	private int nrClientiServiti;

	Angajat() {
		this.dataAngajare = null;
		this.nrClientiServiti = 0;
	}

	Angajat(String data, int nrClientiServiti) {
		this.dataAngajare = data;
		this.nrClientiServiti = nrClientiServiti;
	}

	public void cazare(String numeClient) {

	}

	public void setNrClientiServiti(int nr) {
		this.nrClientiServiti = nr;
	}

	public void setDataAngajare(String data) {
		this.dataAngajare = data;
	}

	public int getNrClientiServiti() {
		return this.nrClientiServiti;
	}

	public String getDataAngajare()

	{
		return this.dataAngajare;
	}
	
	public String toString()
	{
		return this.getNume() + " " + super.getID() + "-> Data angajare:  " + this.dataAngajare + ", Numar clienti serviti: " + this.nrClientiServiti;
	}

}
