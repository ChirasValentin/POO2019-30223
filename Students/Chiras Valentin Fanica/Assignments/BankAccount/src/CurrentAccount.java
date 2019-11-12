
public class CurrentAccount extends Account {
	private int limit;

	public CurrentAccount(int number)
	{
		super(number);
	}
	
	public void setLimit(int limit)
	{
		this.limit=limit;
	}
	public int getLimit()
	{
		return this.limit;
	}
	
	public void withdraw(double suma)
	{
		if(suma > 0)
		{
			
			if(super.getBalance() - suma < 0)
			{
				if(Math.abs(super.getBalance()) + suma < limit)
				{
					super.balance -= suma;
					System.out.println("Balance < OverDrafLimit ");
				}else
					System.out.println("Limit: " + limit);
			}
		}else
		{
			System.err.println("Account.withdraw(...): cannot withdraw negative amount");
		}
		
	}
}

