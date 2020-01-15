import java.util.ArrayList;

public class Angajat implements AtributiiAngajat {
	private String nume;
	private String ID;
	private String dataAngajare;
	private float bonusSalariu;
	Medicament medicament;
	private ArrayList<Medicament> medicamente;

	public Angajat(String nume, String ID, String dataAngajare) {
		this.nume = nume;
		this.ID = ID;
		this.dataAngajare = dataAngajare;
	}

	public float getBonusSalariu() {
		return this.bonusSalariu;
	}

	public void procesareReteta(float cost) {
		this.bonusSalariu = 0.0015f * cost;

	}

	@Override
	public void AdaugaMedicament(Medicament medicament) {
		this.medicamente.add(medicament);
	}

	@Override
	public void EliminaMedicament(Medicament medicament) {
		this.medicamente.remove(medicament);
	}

	@Override
	public int VerificaStoc(Medicament medicament) {

		return medicament.getStoc();
	}

	@Override
	public boolean VanzareMedicament(Medicament medicament) {

		return false;
	}

	@Override
	public void ModificaStoc(Medicament medicament, int stoc) {
		medicament.setStoc(stoc);
	}

	@Override
	public void ProcesareReteta(Pacient pacient) {

	}

}
