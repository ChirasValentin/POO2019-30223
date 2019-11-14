
public class Camera extends Hotel {
	private int nrIdentificare;
	private int capacitate;
	private float pret;
	
	Camera()
	{
		this.nrIdentificare=0;
		this.capacitate=0;
		this.pret=0f;
	}
	Camera(int nrIdentificare,int capacitate,float pret)
	{
		this.nrIdentificare=nrIdentificare;
		this.capacitate=capacitate;
		this.pret=pret;
	}
	
	public void regimSingle()
	{
		this.pret=1500f;
	}
	
}
