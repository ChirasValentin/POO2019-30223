package javasmmr.rechizite;

public class Caiet extends Rechizita {
	public Caiet(String eticheta)
	{
		this.eticheta = eticheta;
	}
	
	public String getName() {
		return super.eticheta + "Caiet";
	}

}