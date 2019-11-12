
public class SavingsAccount extends Account {
	
	public SavingsAccount(int number) {
		super(number);
	}
	
	private double Rate;
	private int Length;
	private int timesCompounded;
	
	private double setInterest()
	{
		
		double Money = super.getBalance();
		double Interest;
		Interest=(Math.round(Math.pow(Money * (1.0 + Rate/(double)timesCompounded), timesCompounded*Length))*100)/100.0;
		
		return Interest;
	}
	
	public void deposit(double newSuma)
	{
		if(super.getBalance() != 0.0)
			super.deposit(setInterest());
		else
			super.deposit(newSuma);
	}

}
