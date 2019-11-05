import java.util.Random;
public class Bank {
	private Account[] bankAccount = new Account[15];

	public Account openAccount(int chooseAccount, int accountNumber) {
		if (chooseAccount == 1) {
			Account newAccount = new Account(accountNumber);
			return newAccount;
		} else if (chooseAccount == 2) {
			Account newAccount = new SavingsAccount(accountNumber);
			return newAccount;
		} else if (chooseAccount == 1) {
			Account newAccount = new CurrentAccount(accountNumber);
			return newAccount;
		} else
			return null;

	}

	public void closeAccount(int accountNumber) {
		bankAccount[accountNumber].withdraw(bankAccount[accountNumber].getBalance());
		System.out.println("Close Account");
	}

	public void payDividends(double totalShares, double dividendPerShare) {
		double payout = totalShares * dividendPerShare;
		for (int i = 0; i < bankAccount.length; i++)
			bankAccount[i].deposit(payout);
	}

	public void createAccounts() {

		int i = 0;

		while (i < bankAccount.length) {

			Random randomizeAccounts = new Random();

			if (randomizeAccounts.nextInt(3) == 0) {

				bankAccount[i] = new SavingsAccount(i);

				bankAccount[i].deposit(Math.round((Math.abs(randomizeAccounts.nextDouble() * 100) * 100)) / 100.0);

				i++;

			} else if (randomizeAccounts.nextInt(3) == 1) {

				bankAccount[i] = new CurrentAccount(i);

				bankAccount[i].deposit(Math.round((Math.abs(randomizeAccounts.nextDouble() * 100) * 100)) / 100.0);

				i++;

			} else if (randomizeAccounts.nextInt(3) == 2) {

				bankAccount[i] = new Account(i);

				bankAccount[i].deposit(Math.round((Math.abs(randomizeAccounts.nextDouble() * 100) * 100)) / 100.0);

				i++;

			}

		}

	}
}
