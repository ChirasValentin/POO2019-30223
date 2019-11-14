
public  class  Hotel {
	private String[] angajati;
	private String[] clienti;
	private int[] camere;
	private int nrAngajati;
	private int nrClienti;
	private int nrCamere;
	private float factura;
	
	Hotel()
	{
		this.angajati=null;
		this.camere=null;
		this.clienti=null;
		this.nrAngajati=0;
		this.nrClienti=0;
	}
	Hotel(int nrClienti,int nrAngajati,int nrCamere)
	{
		this.nrClienti=nrClienti;
		this.nrAngajati=nrAngajati;
		this.nrCamere=nrCamere;
	}
	public void addAngajat(Angajat angajat)
	{
		this.angajati[nrAngajati++]=angajat.getNume();
	}
	public void addClent(Client client)
	{
		this.clienti[nrClienti++]=client.getNume();
	}
	public void emtiereFactura(float pret)
	{
		this.factura=pret;
	}
}
