package model;

import java.util.ArrayList;

import controller.Shuffle;


public class CardDeck {
	/**
	 * deck holds the cards in the current deck
	 */
	private DoublyLinkedList <Card> deck;
	
	/**
	 * This constructor initializes the ArrayList and calls the methods in the class
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
		 * makes a deck of cards based on the suit and the rank
		 */
		for (int i = 0; i < suits.length; i++) {
			
			for (int j = 1; j <=13; j++) {
				
				deck.add(new Card (j, suits[i]));
			}
		}
	}

	public void shuffle() {
		
		Shuffle shuffler = new Shuffle();
		ArrayList<Card> tempList = shuffler.shuffleDeck();
//		deck = new DoublyLinkedList<Card>();
		
		int count = 0;
		
		while (tempList.size() > count) {
			deck.add(tempList.get(count));
			count++;
		}
	}
	
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
