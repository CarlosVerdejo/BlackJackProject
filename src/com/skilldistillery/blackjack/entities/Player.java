package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Player extends Hand {
	

	@Override
	public void Hand() {
		System.out.println("Player: " + getHandValue());
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
		for(Card cards : hand) {
			System.out.print(cards + " ");
		}
		super.showHand();
	}

}