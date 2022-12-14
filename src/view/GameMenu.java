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
	
	public int deal() {
		System.out.print("\nHow many cards to deal: ");
		int deal = input.nextInt();
		return deal;
	}
}