

public interface AtributiiAngajat {
	
	public void AdaugaMedicament(Medicament medicament);
	public void EliminaMedicament(Medicament medicament);
	public int VerificaStoc(Medicament medicament);
	public boolean VanzareMedicament(Medicament medicament);
	public void ModificaStoc(Medicament medicament,int stoc);
	public void ProcesareReteta(Pacient pacient);
	
	
}
