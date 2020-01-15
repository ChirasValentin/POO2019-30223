import java.util.List;
import java.util.Random;



public class Doctor {
	private Afectiune afectiune;
	private Pacient	 pacient;
	public Doctor() {
		}
	
	public void Consultatie(Pacient pacient) {
		pacient.setAfectiune(afectiune);
	}
	public void ListaDeMedicamente(Pacient pacient) {
		
	}
}
