package facebook;

public class ControllFacebookAccount {
	public static void main(String[] args)
	{
		FacebookAccount account1 = new FacebookAccount("Ch. Valentin",21,"Cluj Napoca");
		FacebookAccount account2 = new FacebookAccount("B. Radu",21,"Cluj Napoca");
		FacebookAccount account3 = new FacebookAccount("Ch. Mirela",15,"Suceava");
		FacebookAccount account4 = new FacebookAccount("I. Andrei",15,"Suceava");
		account1.addFriend(account2);
		account1.addFriend(account3);
		account1.addFriend(account4);
		account1.showFriends();
		System.out.println();
		account1.searchFriend("Suceava");
	}

}
