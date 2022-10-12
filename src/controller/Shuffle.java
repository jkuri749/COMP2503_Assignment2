package controller;

import java.util.Collections;
import java.util.List;

import model.Card;
import model.CardDeck;
import model.DoublyLinkedList;

public class Shuffle {
	
	private DoublyLinkedList<Card> deck;
	CardDeck cd;
	
	/**
	 * the method that calls the method that shuffles the ArrayList deck of cards
	 */
	public Shuffle() {
		cd = new CardDeck();
		deck = cd.getDeck();
		shuffleDeck();
		
	}
	
	/**
	 * method that shuffles the ArrayList deck of cards
	 */
	private void shuffleDeck() {
		Collections.shuffle((List<?>) deck); 
	}
	
	/**
	 * Card deck getter method
	 * @return new deck
	 */
	public DoublyLinkedList<Card> getDeck() {
		return deck;
	}
}
