package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private static ArrayList<Card> cardList = new ArrayList<Card>();

	// Initialize the deck

	public static void initializeDeck(){
		for(int i = 0; i < 52; i++){
			cardList.add(new Card(i));
		}
			}

	  //Shuffling the deck of cards
	  
	  public static void shuffleCards(){ 
		  java.util.Collections.shuffle(cardList);
	  }
		  
	  
	  // Drawling a card from the deck method
	  
	 public static Card drawCard(){
		 return cardList.remove(0);
	 }
	 
	 // Displaying the total amount of cards that are left in the deck
	 
	 public static int cardsLeft(){
		 return cardList.size();
	 }
	 
	  
	 
	public static void main(String[] args) {
		initializeDeck();
		System.out.println(cardList.size());
		shuffleCards();
		System.out.println(cardList);
		System.out.println(drawCard());
		System.out.println(cardsLeft());
	}

}