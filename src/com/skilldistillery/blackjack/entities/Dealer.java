package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Hand {

	@Override
	public void Hand() {
		System.out.println("Dealer: " + getHandValue());
		showHand();
		super.Hand();
	}

	@Override
	public void addCard(Card deal) {
		super.addCard(deal);
	}

	@Override
	public void clearHand() {
		super.clearHand();
	}

	@Override
	public int getHandValue() {
		return super.getHandValue();
	}

	@Override
	public void showHand() {
		super.showHand();
	}

	@Override
	public void dealerInitialDeal() {
		super.dealerInitialDeal();
	}
	

}
