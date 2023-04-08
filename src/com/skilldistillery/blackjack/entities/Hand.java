package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public abstract class Hand {
	public List<Card> hand = new ArrayList<Card>();

	public void Hand() {
		System.out.println("\n"
				+ "Player: " + getHandValue());
		showHand();
		System.out.println();
		
	}

	public void addCard(Card deal) {
		hand.add(deal);

	}

	public void clearHand() {
		for (int i = 0; i < hand.size(); i++) {
			hand.remove(i);

		}

	}

	public int getHandValue() {
		int SumOfHand = 0;
		for (Card cards : hand) {
			SumOfHand = SumOfHand + cards.getValue();

		}
		 return SumOfHand;
	}
	public void showHand() {
		for(Card cards : hand) {
			System.out.print(cards + " ");
		}

	}
	
	public void dealerInitialDeal() {
		System.out.println("Dealer: " + hand.get(0).getValue());
		System.out.println(hand.get(0).toString() + " *** Of ****");
	}


}
