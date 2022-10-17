package controller;

import model.Card;
import model.CardDeck;
import model.DoublyLinkedList;
import model.LinkedListStack;
import view.GameMenu;

import java.util.Scanner;


/**
 * Manages and plays the whole game.
 * The main processing class
 * @author joshuakuriakose
 *
 */
public class WarGame {
	
	DoublyLinkedList<Card> cards;
	GameMenu gameMen;
	Scanner input;
	LinkedListStack<Card> stack;
	Shuffle shuffle;
	CardDeck cd;
	
	/**
	 * Constructor that handles, instantiates, and calls all the methods and classes
	 */
	public WarGame() {
		cd = new CardDeck();
		cards = new DoublyLinkedList<Card>();
		gameMen = new GameMenu();
		stack = new LinkedListStack<Card>();
		launchApplication();
	}
	/**
	 * launches the program and controls for the different options
	 */
	private void launchApplication() {
		boolean flag = true;
		int option;
		while (flag) {
			option = gameMen.showMainMenu();
			
			switch (option) {
			case 1: 
				if (option == 1) {
					cd.shuffle();
					cards = cd.getDeck();
					for (int i = 0; i < 52; i++) {
						stack.push(cards.remove());
					}
					playGame();
				} else {
					System.out.println("Invalid");
				}
				break;
			case 2: 
				if (option == 2) {
					cd.shuffle();
					cards = cd.getDeck();
					for (int i = 0; i < 52; i++) {
						stack.push(cards.remove());
					}
					
					System.out.println("\n Shuffled!");
				} else {
					System.out.println("Invalid");
				}
				break;
			case 3: 
				System.out.println("Please visit us again!");
				flag = false;
			}
			if (option > 3 || option < 1) {
				System.out.println("\n"+"Invalid! Try again");
			}
		}
	}
	/**
	 * plays the game 
	 * deals the user amount of cards to two players and calculates the wins
	 */
	private void playGame() {
				
		LinkedListStack<Card> player1 = new LinkedListStack<>();
		LinkedListStack<Card> player2 = new LinkedListStack<>();		
		
		int deal = gameMen.deal();
		int firstp = 0;
		int secondp = 0;
		int win1= 0;
		int win2= 0;

		if (deal > 26 || deal < 1) {
			System.out.println("Invalid! try a number between 1-26");
		}

		for (int i = 0; i < deal; i++) {
			
			player1.push(stack.pop());
			
			player2.push(stack.pop());
			
			String playerOneCard = player1.pop().toString();
			Scanner p1 = new Scanner(playerOneCard);
			
			if(p1.hasNextInt()) {
				firstp += p1.nextInt();
			} else if (playerOneCard.contains("King")) {
				firstp += 13;
			} else if (playerOneCard.contains("Jack")) {
				firstp += 12;
			} else if (playerOneCard.contains("Queen")) {
				firstp += 11;
			}
			else if (playerOneCard.contains("Ace")) {
				firstp += 1;
			}
			p1.close();
			
			String playerTwoCard = player2.pop().toString();
			Scanner p2 = new Scanner(playerTwoCard);
			
			if(p2.hasNextInt()) {
				secondp += p2.nextInt();
			} else if (playerTwoCard.contains("King")) {
				secondp += 13;
			} else if (playerTwoCard.contains("Jack")) {
				firstp += 12;
			} else if (playerTwoCard.contains("Queen")) {
				firstp += 11;
			} else if (playerTwoCard.contains("Ace")) {
				secondp += 1;
			}
			p2.close();
			
			System.out.println("Player 1 has card:  " + playerOneCard);
			System.out.println("Player 2 has card:  " + playerTwoCard + "\n");
			
			if (firstp > secondp || secondp < firstp) {
				win1++;
			} else if (secondp > firstp || firstp < secondp) {
				win2++;
			} else {
				win1++;
				win2++;
			}
			firstp = 0;
			secondp = 0;
		}
		
		System.out.println("+==============================+");
		System.out.println("|Player 1 has a score of: " + "["+win1+"]  |");
		System.out.println("+------------------------------+");
		System.out.println("|Player 2 has a score of: " + "["+win2+"]  |");
		System.out.println("+==============================+" + "\n");
		
		if (win1 > win2 || win2 < win1) {
			System.out.println("PLAYER 1 WINS!!");
		} else if (win2 > win1 || win1 < win2) {
			System.out.println("PLAYER 2 WINS!!");
		} else {
			win1 = win2;
			System.out.println("IT'S A TIE!!");
		}
		
	}
}
