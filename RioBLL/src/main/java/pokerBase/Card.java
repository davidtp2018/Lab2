package pokerBase;

import java.util.Comparator;

public class Card {
	
	private int cardNumber;
	private String suit;
	private String rank;
	private Hand Number;
	private Deck deckNumber;
	private String[] ranks = {"A", "2", "3","4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
	
	public Card(int cardNumber){
		this.cardNumber = cardNumber;
		this.suit = suits[cardNumber/13];
		this.rank = ranks[cardNumber % 13];
	}
	
	public double getCardNumber(){
		return cardNumber;
	}
	
	public String getRank(){
		return rank;
	}
	
	public String getCardSuit(){
		return suit;
	}
	
	public String toString(){
		return rank + " " + "of" + " " + suit;
	}
	
}
