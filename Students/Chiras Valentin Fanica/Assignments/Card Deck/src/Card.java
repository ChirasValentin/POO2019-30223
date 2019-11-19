
public class Card {
	private String suit;
	private int numberOfCard;

	public Card(String suit, int number) {
		this.suit = suit;
		this.numberOfCard = number;
	}

	public String getSuit() {
		return this.suit;
	}

	public int getNumberOfCard() {
		return this.numberOfCard;
	}
}
