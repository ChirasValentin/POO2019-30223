package calendar.munca;

public class Zi {
		private String numeZi;
		private boolean ziLucratoare;
		Zi(){
		}
		Zi(String numeZi,boolean ziLucratoare){
			this.numeZi=numeZi;
			this.ziLucratoare=ziLucratoare;
		}
		
		public void setnumeZi(String numeZi)
		{
			this.numeZi=numeZi;
		}
		public void setLucratoare(boolean ziLucratoare) {
			this.ziLucratoare=ziLucratoare;
		}
		public String getZi()
		{
			return this.numeZi;
		}
		public boolean getLucratoare() {
			return this.ziLucratoare;
		}
}
