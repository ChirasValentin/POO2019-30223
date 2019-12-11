package pet.hotel;

public class Caine {
		private String nume;
		private String rasa;
		private int varsta;
		
		Caine(){}
		
		Caine(String nume,String rasa,int varsta)
		{
			this.nume=nume;
			this.rasa=rasa;
			this.varsta=varsta;
		}
		public String toString() {

			return this.nume + " Rasa:" + this.rasa + " Varsta: " + this.varsta;
		}
}
