package view;

import java.util.Scanner;

/**
 * shows menus for the user, returns and validates inputs
 * 
 * @author joshuakuriakose
 *
 */
public class GameMenu {
	Scanner input; 
	

	/**
	 * constructor initializes the Scanner
	 */
	public GameMenu() {
		input = new Scanner(System.in);
	}
	
	/**
	 * Displays the main menu of the game
	 * @return user option as an integer
	 */
	public int showMainMenu() {
		System.out.println("\nSelect one of these options:\n");
		System.out.println("\t1. Play War Game");
		System.out.println("\t2. Shuffle Cards");
		System.out.println("\t3. Exit\n");
		System.out.print("Enter the number here: ");
		int option = input.nextInt();
		//Flushing the scanner
		input.nextLine();
		return option;
	}
	/**
	 * prompts user for amount of cards to deal
	 * @return deal
	 */
	public int deal() {
		System.out.println("\n******* Welcome to War Game *******");
		System.out.println();
		System.out.print("How many cards to deal: ");
		System.out.println();
		int deal = input.nextInt();
		System.out.println("Let the games begin!! \n");
		return deal;
	}
}
