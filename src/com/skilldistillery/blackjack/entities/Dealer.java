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
		// TODO Auto-generated method stub
		super.addCard(deal);
	}

	@Override
	public void clearHand() {
		// TODO Auto-generated method stub
		super.clearHand();
	}

	@Override
	public int getHandValue() {
		// TODO Auto-generated method stub
		return super.getHandValue();
	}

	@Override
	public void showHand() {
		// TODO Auto-generated method stub
		super.showHand();
	}

	@Override
	public void dealerInitialDeal() {
		// TODO Auto-generated method stub
		super.dealerInitialDeal();
	}
	

}
