
public class BankControl {
		public static void main(String[] args)
		{
			Bank newBank= new Bank();
			newBank.createAccounts();
			Account account=newBank.openAccount(1,40);
			account.deposit(50);
			System.out.println("Inaintea platii dividentelor"+ "\n"+ "balance:" + account.getBalance());
			
			newBank.payDividends(10000, 0.5);
			System.out.println("Dupa platirea divdentelor"+ "\n"+ "balance:" + account.getBalance());
			
		}
}
