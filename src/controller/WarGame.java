package controller;

import model.Card;
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
	
	// Constructor that handles, instantiates, and calls all the methods and classes
	public WarGame() {
		gameMen = new GameMenu();
		stack = new LinkedListStack<>();
		launchApplication();
	}

	private void launchApplication() {
		boolean flag = true;
		int option;
		while (flag) {
			option = gameMen.showMainMenu();
			
			switch (option) {
			case 1: 
				if (option == 1) {
					playGame();
				} else {
					System.out.println("Invalid");
				}
				break;
			case 2: 
				if (option == 2) {
//					
//					shuffle
//				
				} else {
					System.out.println("Invalid");
				}
				break;
			case 3: 
				System.out.println("Please visit us again!");
				flag = false;
			}
			System.out.println("\n"+"Invalid! Try again");
		}
	}

	private void playGame() {
		
		int deal = gameMen.deal();
		System.out.println();
	}
}
