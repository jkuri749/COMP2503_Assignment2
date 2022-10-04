import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
	
	private ArrayList <Card> deck;
	
	public Shuffle() {
		deck = new ArrayList<Card>();
		shuffleDeck();
	}
	
	private void shuffleDeck() {
		Collections.shuffle(deck); 
	}
	
	public ArrayList<Card> getDeck() {
		return deck;
	}
}
