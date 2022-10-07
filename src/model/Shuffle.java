package model;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
	
	private ArrayList <Card> deck;
	
	/**
	 * the method that calls the method that shuffles the ArrayList deck of cards
	 */
	public Shuffle() {
		deck = new ArrayList<Card>();
		shuffleDeck();
	}
	
	/**
	 * method that shuffles the ArrayList deck of cards
	 */
	private void shuffleDeck() {
		Collections.shuffle(deck); 
	}
	
	/**
	 * Card deck getter method
	 * @return new deck
	 */
	public ArrayList<Card> getDeck() {
		return deck;
	}
}
