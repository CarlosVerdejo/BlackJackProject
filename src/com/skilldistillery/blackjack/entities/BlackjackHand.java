package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand extends Hand {

	
	public void isBust() {
			System.out.println("Bust!");
		
		
	}
	
	public void isBlackJack() {
			System.out.println("Black Jack!");
		
		
	}
	
	public void qualifyHand(BlackJackHand hand) {
		if(hand.getHandValue() > 21) {
			System.out.println("Bust!!");
		} else if (hand.getHandValue() == 21) {
			System.out.println("BlackJack");
			
		}
	}
	

	@Override
	public void Hand() {
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
