package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Card {
	
	private Suit suit;
	private Rank rank;
	
	
	public Card(Suit s, Rank r) {
		super();
		this.suit = s;
		this.rank = r;
	}

	public int getValue() {
		return rank.getValue();
	}
	
	@Override
	public String toString() {
		return rank + " Of " + suit;
	}




	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	
	
	
}
