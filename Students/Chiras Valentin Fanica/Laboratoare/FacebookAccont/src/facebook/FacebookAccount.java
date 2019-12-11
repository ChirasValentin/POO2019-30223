package facebook;

import java.util.ArrayList;

public class FacebookAccount {
	private String nume;
	private int varsta;
	private String locatieCurenta;
	private ArrayList<FacebookAccount> listaDePrieteni;

	FacebookAccount() {

		this.nume = null;
		this.varsta = -1;
		this.locatieCurenta = null;
		listaDePrieteni = new ArrayList<>();
	}

	FacebookAccount(String nume, int varsta, String locatieCurenta) {
		this.nume = nume;
		this.varsta = varsta;
		this.locatieCurenta = locatieCurenta;
		listaDePrieteni = new ArrayList<>();
	}

	public void addFriend(FacebookAccount prieten) {
		listaDePrieteni.add(prieten);
	}

	public void deletFriend(FacebookAccount prieten) {
		listaDePrieteni.remove(listaDePrieteni.indexOf(prieten));
	}

	public void showFriends() {
		for (int i = 0; i < listaDePrieteni.size(); i++) {
			System.out.print(listaDePrieteni.get(i).nume + " || ");
		}

	}

	public void searchFriend(String numeLocatie) {
		for (int i = 0; i < listaDePrieteni.size(); i++) {
			if (numeLocatie.equals(listaDePrieteni.get(i).locatieCurenta)) {
				System.out.print(listaDePrieteni.get(i).nume + " || ");
			}

		}

	}

}
