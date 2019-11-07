package javasmmr.rechizite;

public class Manual extends Rechizita {
	public Manual(String eticheta)
	{
		this.eticheta = eticheta;
	}
	
	public String getName() {
		return super.eticheta + "Manual";
	}

}