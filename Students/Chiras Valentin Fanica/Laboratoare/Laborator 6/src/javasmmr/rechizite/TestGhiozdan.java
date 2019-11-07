package javasmmr.rechizite;

public class TestGhiozdan {
	public static void main(String[] args) {
		Rechizita[] rechizite = new Rechizita[20];
		rechizite[0] = new Caiet("Matematica");
		rechizite[1] = new Manual("Informatica");
		rechizite[2] = new Manual("Matematica");
		rechizite[3] = new Caiet("Istorie");
		rechizite[4] = new Caiet("Biologie");
		Caiet caietAlgebra = new Caiet("Algebra");
		Manual manualInforamtica = new Manual("Informatica");
		Caiet caietInfo = new Caiet("Info");
		Manual manualIstorie = new Manual("Istorie");
		Ghiozdan ghiozdan = new Ghiozdan();
		ghiozdan.addCaiet(caietAlgebra);
		ghiozdan.addManual(manualInforamtica);
		ghiozdan.addCaiet(caietInfo);
		ghiozdan.addManual(manualIstorie);

		
		System.out.println("Numar rechizite: " + ghiozdan.getNrRechizite());
		System.out.println("Numar caiete: " + ghiozdan.getNrCaiete());
		System.out.println("Numar manuale: " + ghiozdan.getNrManuale());
		ghiozdan.listItems();
		System.out.println();
		System.out.print("Manuale: ");
		ghiozdan.listManual();
		System.out.println();
		System.out.print("Caiete: ");
		ghiozdan.listCaiet();
	}

}
