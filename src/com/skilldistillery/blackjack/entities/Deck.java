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
	

	public void setDeckOfCards(List<Card> deckOfCards) {
		this.deckOfCards = deckOfCards;
	}
	
	public int checkSize() {
		int cardsLeft = deckOfCards.size();
		
		
		return cardsLeft; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
