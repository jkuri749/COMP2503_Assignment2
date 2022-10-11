package controller;

import java.util.ArrayList;
import java.util.Collections;

import model.Card;
import model.CardDeck;

public class Shuffle {
	
	private ArrayList <Card> deck;
	CardDeck cd;
	
	/**
	 * the method that calls the method that shuffles the ArrayList deck of cards
	 */
	public Shuffle() {
		cd = new CardDeck();
		shuffleDeck();
		
	}
	
	/**
	 * method that shuffles the ArrayList deck of cards
	 */
	private void shuffleDeck() {
		
		deck = cd.getDeck();
		getNewDeck();
		Collections.shuffle(deck); 
	}
	
	/**
	 * Card deck getter method
	 * @return new deck
	 */
	public ArrayList<Card> getNewDeck() {
		return deck;
	}
}
