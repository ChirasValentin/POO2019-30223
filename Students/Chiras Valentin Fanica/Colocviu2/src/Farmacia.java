import java.util.ArrayList;
import java.util.HashMap;

public class Farmacia {
	private HashMap<Medicament,Integer> medicamente_stoc;
	private HashMap<Angajat,Integer> angajat_retete;
	private String denumire;
	private String adresa;
	private String numarDeTelefon;
	private String website;
	private ArrayList<Angajat> angajati;
	public Farmacia(String denumire,String adresa,String numarDeTelfon,String website)
	{
		this.denumire=denumire;
		this.adresa=adresa;
		this.numarDeTelefon=numarDeTelefon;
		this.website=website;
	}
	public void setAngajati(ArrayList<Angajat> angajati) {
		this.angajati=angajati;
	}
	public ArrayList<Angajat> getAngajati(){
		return this.angajati;
	}
	
	
	
}
