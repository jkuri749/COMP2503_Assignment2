package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Card;
import model.CardDeck;
import model.DNode;
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
//		shuffleDeck();
		
	}
	
	/**
	 * method that shuffles the ArrayList deck of cards
	 */
	public  ArrayList<Card> shuffleDeck() {
		DNode<Card> last = null;
		ArrayList<Card> temp = new ArrayList<Card>();
		
		DNode<Card> head = deck.getStart();
		
		while (head != null) {
			temp.add(head.getData());
			last = head;
			head = head.getNext();
		}
		
		Collections.shuffle(temp);
		return temp;
	}
	
	/**
	 * Card deck getter method
	 * @return new deck
	 */
	public DoublyLinkedList<Card> getDeck() {
		return deck;
	}
}
