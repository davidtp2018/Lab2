package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck  {
	 
	
	
	public static void main(String[] args){
	
		int[] cards = new int[52];
	
		// Initialize the deck
	
		for(int c = 0; c < cards.length; c++)
			cards[c]= c;
			
		//Shuffling the deck of cards
		
		for(int x = 0; x < cards.length; x++){
			int order = (int)(Math.random() * cards.length);
			int origVal = cards[x];
			cards[x] = cards[order];
			cards[order] = origVal;		
		}
		
	
}
}
