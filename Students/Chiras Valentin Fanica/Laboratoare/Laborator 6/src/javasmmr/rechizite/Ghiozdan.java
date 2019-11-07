package javasmmr.rechizite;

public class Ghiozdan {
	private Rechizita[] listaDeRechizite;
	private int nrRechizite;

	public Ghiozdan() {
		this.nrRechizite = 0;
		this.listaDeRechizite = new Rechizita[1000];
	}

	public void addCaiet(Caiet caiet) {
		this.listaDeRechizite[this.nrRechizite++] = caiet;

	}

	public void addManual(Manual manual) {
		this.listaDeRechizite[this.nrRechizite++] = manual;
	}

	public void listItems() {
		for (int i = 0; i < this.nrRechizite; i++) {
			System.out.print(this.listaDeRechizite[i].eticheta + ", ");
		}
	}

	public void listManual() {
		for (int i = 0; i < this.nrRechizite; i++) {
			if (this.listaDeRechizite[i] instanceof Manual)
				System.out.print(this.listaDeRechizite[i].eticheta + ", ");
		}
	}

	public void listCaiet() {
		for (int i = 0; i < this.nrRechizite; i++) {
			if (this.listaDeRechizite[i] instanceof Caiet)
				System.out.print(this.listaDeRechizite[i].eticheta + ", ");
		}
	}

	public int getNrRechizite() {
		return this.nrRechizite;
	}

	public int getNrManuale() {
		int nrManuale = 0;
		for (int i = 0; i < this.nrRechizite; i++) {
			if (this.listaDeRechizite[i] instanceof Manual) {
				nrManuale++;
			}
		}
		return nrManuale;
	}

	public int getNrCaiete() {
		int nrCaiete = 0;
		for (int i = 0; i < this.nrRechizite; i++) {
			if (this.listaDeRechizite[i] instanceof Caiet) {
				nrCaiete++;
			}
		}
		return nrCaiete;
	}
}
