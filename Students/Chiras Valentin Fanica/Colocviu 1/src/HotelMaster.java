
public class HotelMaster {

	public static void main(String[] args) {
			
		Angajat angajat1 = new Angajat();
		Angajat angajat2= new Angajat("10.02.2000",250);
		angajat1.setDataAngajare("15.12.2005");
		angajat1.setNrClientiServiti(150);
		angajat1.setID(923213);
		angajat1.setNume("Aristotel");
		angajat1.setNrDeTelefon("07223278");
		
		System.out.println(angajat1.toString());
		System.out.println(angajat2.toString());
		
		Client client = new Client(25,"25.02.2015","27.02.2015");
		client.setNume("Dragos Slav");
		client.setID(123123124);
		System.out.println(client.toString());
		
		Hotel hotel =  new Hotel();
		hotel.addAngajat(angajat1);
		hotel.addClent(client);
		
		
		
		
	}

}
