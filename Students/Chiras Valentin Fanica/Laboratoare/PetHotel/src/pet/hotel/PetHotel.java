package pet.hotel;

import java.util.ArrayList;

public class PetHotel {
	private ArrayList<Caine> registruCaini;
	private int nrCamera;
	PetHotel() {
		registruCaini = new ArrayList<>();
	}

	public void addPet(Caine caine,int nrCamera) {
		registruCaini.add(caine);
		this.nrCamera=nrCamera;
	}
	public void showPet() {
		for (int i = 0; i < registruCaini.size(); i++)
			System.out.print(registruCaini.get(i).toString() + " ->Camera: " + this.nrCamera);
	}
	
	
}
