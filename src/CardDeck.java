
import java.util.ArrayList;

public class CardDeck {
	/**
	 * deck holds all of the cards that currently are in the current deck
	 */
	private ArrayList <Card> deck;
	
	/**
	 * This constructor initiate the arraylist and calls the repective methods to create a new deck
	 */
	public CardDeck() {
		deck = new ArrayList<Card>();
		createDeck();
	}

	/**
	 * This method creates the deck
	 */
	private void createDeck() {
		// suits holds the name of the suits
		String[] suits = {"Spades", "Diamond", "Clubs", "Hearts"};
		
		/*
		 * The for loop creates a whole new deck based on their suit and rank
		 */
		for (int i = 0 ; i < 4; i++) {
			for (int j = 1 ; j <=13 ; j++) {
				deck.add(new Card (j,suits[i]));
			}
		}
	}

	/**
	 * The deck getter method
	 * @return the deck
	 */
	public ArrayList<Card> getDeck() {
		return deck;
	}
}
