package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand extends Hand {

	
	public boolean isBust(BlackJackHand hand) {
		if (hand.getHandValue() > 21) {
		}
		return true;
		
	}
	
	public boolean isBlackJack(BlackJackHand hand) {
			if (hand.getHandValue() == 21);
			return true;
		
	}
	
	public void qualifyHand(BlackJackHand hand) {
		if(hand.getHandValue() > 21) {
			System.out.println("Bust!!");
		} else if (hand.getHandValue() == 21) {
			System.out.println("BlackJack");
			
		}
	}
	

	

	@Override
	public void playerHand() {
		// TODO Auto-generated method stub
		super.playerHand();
	}

	@Override
	public void dealerHand() {
		// TODO Auto-generated method stub
		super.dealerHand();
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
