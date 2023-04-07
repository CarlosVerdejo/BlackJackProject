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
		return rank + " of " + suit;
	}




	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(rank, other.rank) && Objects.equals(suit, other.suit);
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
