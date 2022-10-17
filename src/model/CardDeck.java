package model;

import java.util.ArrayList;

import controller.Shuffle;

/**
 * This class represents a card deck
 * @author joshuakuriakose
 */
public class CardDeck {
	/**
	 * deck holds the cards in the current deck
	 */
	private DoublyLinkedList <Card> deck;
	
	/**
	 * This constructor initializes the DoublyLinkedList
	 * calls the create deck function
	 */
	public CardDeck() {
		deck = new DoublyLinkedList<Card>();
		createDeck();
	}

	/**
	 * method that creates a deck
	 */
	private void createDeck() {
		// suits holds the name of the suits
		String[] suits = {"Spades", "Diamond", "Clubs", "Hearts"};
		
		/*
		 * makes a deck of cards based on the suit and rank
		 */
		for (int i = 0; i < suits.length; i++) {
			
			for (int j = 1; j <=13; j++) {
				
				deck.add(new Card (j, suits[i]));
			}
		}
	}
	
	/**
	 * this method shuffle the deck after creating a new deck
	 */
	public void shuffle() {
		
		Shuffle shuffler = new Shuffle();
		ArrayList<Card> tempList = shuffler.shuffleDeck();
		
		int count = 0;
		
		while (tempList.size() > count) {
			deck.add(tempList.get(count));
			count++;
		}
	}
	
	/**
	 * this method prints the deck
	 */
	public void printDeck() {
		deck.print();
	}
	
	/**
	 * The deck getter method
	 * @return the deck
	 */
	public DoublyLinkedList<Card> getDeck() {
		return deck;
	}
}
