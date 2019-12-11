package pet.hotel;

public class ManagementPetHotel {
	public static void main(String[] args) {
		PetHotel hotel = new PetHotel();
		Caine caine1 = new Caine("Rudolf","Pitbull",3);
		hotel.addPet(caine1,1);
		hotel.showPet();
	}
}
