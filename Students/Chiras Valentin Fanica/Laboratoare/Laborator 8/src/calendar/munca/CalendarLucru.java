package calendar.munca;

public class CalendarLucru {
	private Zi[] saptamana = new Zi[7]; 
	
	CalendarLucru(){
		saptamana[0]=new Zi("Luni",true);
		saptamana[1]=new Zi("Marti",true);
		saptamana[2]=new Zi("Miercuri",true);
		saptamana[3]=new Zi("Joi",true);
		saptamana[4]=new Zi("Vineri",true);
		saptamana[5]=new Zi("Sambata",false);
		saptamana[6]=new Zi("Duminica",false);
	}
	public Zi[] getZile()
	{
		return saptamana;
	}
	public void setZile(Zi[] zile)
	{
		this.saptamana=zile;
	}
}
