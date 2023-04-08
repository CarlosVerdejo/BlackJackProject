package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {

	public static void main(String[] args) {
		BlackJackApp bja = new BlackJackApp();
		bja.launch();

	}
	
	public void launch() {
		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();
		deck.shuffleCards();
		Player player = new Player();
		Dealer dealer = new Dealer();
	
		
		System.out.println("Welcome to BlackJack, Press enter to deal...");
		String answ1 = sc.nextLine();
				
		Card p1 = deck.dealCard();
		player.addCard(p1);
		Card d1 = deck.dealCard();
		dealer.addCard(d1);
		Card p2 = deck.dealCard();
		player.addCard(p2);
		Card d2 = deck.dealCard();
		dealer.addCard(d2);
		
		
		dealer.dealerInitialDeal();
		player.Hand();
		
		

	
	
	}
	
}

//Card playerCard1 = deck.dealCard();
//Card dealerCard1 = deck.dealCard();
//dealer.dealerHand.add(dealerCard1);
//Card playerCard2 = deck.dealCard();
//player.playerHand.add(playerCard2);
//Card dealerCard2 = deck.dealCard();
//dealer.dealerHand.add(dealerCard2);
//System.out.println(playerCard1 + " " + playerCard2);
//
//player