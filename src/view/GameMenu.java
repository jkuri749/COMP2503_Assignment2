package view;

import java.util.Scanner;

/**
 * This class will be used to show the menus and sub menus to the user
 * It also prompts the user for the inputs and validates them 
 */
public class GameMenu {
	Scanner input; 
	

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
		System.out.print("\n******* Welcome to War Game *******"
				+ "\\n How many cards to deal:  ");
		System.out.println();
		int deal = input.nextInt();
		System.out.println("Let the games begin!! \n");
		return deal;
	}
}
