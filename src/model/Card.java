package model;

public class Card {

		/**
		 * rank represents the rank of the current card
		 */
		private int rank;
		
		/**
		 * suit represents the suit of the current card
		 */
		private String suit;

		/**
		 * This constructor sets the rank and suit of card
		 * @param rank 
		 * @param suit 
		 */
		public Card(int rank, String suit) {
			this.rank = rank;
			this.suit = suit;
		}

		/**
		 * rank getter method
		 * @return the rank
		 */
		public int getRank() {
			return rank;
		}

		/**
		 * rank setter method
		 * @param rank
		 */
		public void setRank(int rank) {
			this.rank = rank;
		}

		/**
		 * suit getter method
		 * @return suit
		 */
		public String getSuit() {
			return suit;
		}

		/**
		 * suit setter method
		 * @param suit 
		 */
		public void setSuit(String suit) {
			this.suit = suit;
		}

		/**
		 * prints the specific card type
		 */
		public String toString() {
			
			String name = "King of ";
			
			if (rank >= 2 && rank <= 10)
				name = rank + " of ";
			else if (rank == 1)
				name = "Ace of ";
			else if (rank == 11)
				name = "Jack of ";
			else if (rank == 12)
				name = "Queen of ";
			
			return name + suit;
		}

}
