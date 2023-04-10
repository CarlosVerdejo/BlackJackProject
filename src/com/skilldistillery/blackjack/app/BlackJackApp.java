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

		// INITIAL DEAL
		Card p1 = deck.dealCard();
		player.addCard(p1);
		Card d1 = deck.dealCard();
		dealer.addCard(d1);
		Card p2 = deck.dealCard();
		player.addCard(p2);
		Card d2 = deck.dealCard();
		dealer.addCard(d2);

		// SHOW TABLE
		dealer.dealerInitialDeal();
		player.playerHand();

		while (player.getHandValue() < 22) {
			if (player.getHandValue() > 21) {
				System.out.println("\nPlayer Bust! Dealer Wins.");
				break;
			}
			else if (player.getHandValue() == 21) {
				System.out.println("\nBlackJack! Player Wins.");
				break;
			}
			
			boolean dealerHasNotPlayed = true;
			while (player.getHandValue() < 21) {
				System.out.println("\nHit or Stand?");
				String hOrS = sc.nextLine();
				
				//STAND
				if (hOrS.toUpperCase().contains("STAND")) {
					dealer.dealerHand();
	
					if (dealer.getHandValue() > 21) {
						System.out.println("\nDealer Bust! Player Wins.");
						break;
					} 
					else if (dealer.getHandValue() == 21) {
						System.out.println("Dealer BlackJack!");
					}
					else if(dealer.getHandValue() >= 17 && dealer.getHandValue() < 22) {
						break;
					}
					else if(dealer.getHandValue() >= 17 && dealer.getHandValue() < 21) {
						break;
					}
					while (dealer.getHandValue() < 17 && dealer.getHandValue() < 21) {
							Card dealerHit = deck.dealCard();
							dealer.addCard(dealerHit);
							dealer.dealerHand();
					}
					break;
				//HIT
				} else if (hOrS.toUpperCase().contains("HIT")) {
					Card hitCard = deck.dealCard();
					player.addCard(hitCard);
					player.playerHand();
					if (player.getHandValue() > 21) {
						System.out.println("Player Bust! Dealer Wins.");
						break;
					} else if (player.getHandValue() == 21) {
						System.out.println("BlackJack! Player Wins.");
						break;
					}
				}
			}
			System.out.println("test");
			if(player.getHandValue() < 21 && dealer.getHandValue() < 21) {
				determineWinner(player.getHandValue(), dealer.getHandValue());
				break;
			}
			else {
				break;
			}
		}
		System.out.println("\nWould You Like To Play Another Round");
		String yOrN = sc.nextLine();
	}

	public void determineWinner(int playerHand, int dealerHand) {
		if (playerHand > dealerHand) {
			System.out.println("Player Wins.");
		} else if (playerHand < dealerHand) {
			System.out.println("Dealer Wins.");
		}
	}
}
