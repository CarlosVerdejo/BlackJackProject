package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackHand;
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
		BlackJackHand player = new BlackJackHand();
		BlackJackHand dealer = new BlackJackHand();

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
		dealer.qualifyHand(dealer);
		player.Hand();
		player.qualifyHand(player);

		if (player.getHandValue() > 21) {
			System.out.println("Bust! Dealer Wins.");
			;
		} else if (player.getHandValue() == 21) {
			System.out.println("BlackJack! Player Wins.");

		}
		
		while (player.getHandValue() < 21) {
			System.out.println("Hit or Stand?");
			String hOrS = sc.nextLine();
			if (hOrS.toUpperCase().contains("HIT")) {
				Card hitCard = deck.dealCard();
				player.addCard(hitCard);
				player.qualifyHand(dealer);
				player.Hand();
				if(player.getHandValue() > 21) {
					System.out.println("Bust! Dealer Wins.");
				}
				else if (player.getHandValue() == 21) {
					System.out.println("BlackJack! Player Wins.");
				}
			}
		}

	}

}

//player