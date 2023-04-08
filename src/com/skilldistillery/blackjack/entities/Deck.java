package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {	
	private List<Card> deckOfCards;
	
	public Deck() {
		createDeck();
	}

	private List<Card> createDeck() {
		deckOfCards = new ArrayList<Card>();
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deckOfCards.add(new Card(s, r));
			}
		}
		return deckOfCards;	
	}
	
	public int deckSize() {
		return deckOfCards.size();
	}
	
	
	public Card dealCard() {
		Card dealtCard = deckOfCards.remove(0);
		return dealtCard; 
	}
	
	public void shuffleCards() {
		Collections.shuffle(deckOfCards);
	}
	
	public int checkSize() {
		int cardsLeft = deckOfCards.size();
		
		
		return cardsLeft; 
	}
	
	public void printCards() {
		for (Card cards : deckOfCards) {
			System.out.println(cards);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
