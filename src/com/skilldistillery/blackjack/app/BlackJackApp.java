package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class BlackJackApp {

	public static void main(String[] args) {
		BlackJackApp bja = new BlackJackApp();
		bja.launch();

	}

	public void launch() {
		Scanner sc = new Scanner(System.in);
		BlackJackHand player = new BlackJackHand();
		BlackJackHand dealer = new BlackJackHand();

		Deck deck = new Deck();
		deck.shuffleCards();

		System.out.println("Welcome to BlackJack, Press enter to deal...");
		String answ1 = sc.nextLine();

		boolean playBlackJack = true;
		while (playBlackJack) {
			deck.checkSize();
			if (deck.deckSize() < 7) {
				deck = new Deck();
				deck.shuffleCards();
			}


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

			while (player.getHandValue() < 23) {
				if (player.getHandValue() > 21) {
					System.out.println("\nPlayer Bust! Dealer Wins.");
					break;
				} else if (player.getHandValue() == 21) {
					System.out.println("\nBlackJack! Player Wins.");
					break;
				}

				while (player.getHandValue() < 21) {
					System.out.println("\nHit or Stand?");
					String hOrS = sc.nextLine();

					// STAND
					if (hOrS.toUpperCase().contains("STAND")) {
						dealer.dealerHand();
						while (dealer.getHandValue() < 17 && dealer.getHandValue() < 21) {
							Card dealerHit = deck.dealCard();
							dealer.addCard(dealerHit);
							dealer.dealerHand();
						}

						if (dealer.getHandValue() > 21) {
							System.out.println("\nDealer Bust! Player Wins.");
							break;
						} else if (dealer.getHandValue() == 21) {
							System.out.println("\nBlackJack! Dealer Wins");
						} else if (dealer.getHandValue() >= 17 && dealer.getHandValue() < 21) {
							break;
						}
						break;
					}

					// HIT
					else if (hOrS.toUpperCase().contains("HIT")) {
						Card hitCard = deck.dealCard();
						player.addCard(hitCard);
						player.playerHand();
						if (player.getHandValue() > 21) {
							System.out.println("\nPlayer Bust! Dealer Wins.");
							break;
						} else if (player.getHandValue() == 21) {
							System.out.println("\nBlackJack! Player Wins.");
							break;
						}
					}
				}
				if (player.getHandValue() < 21 && dealer.getHandValue() < 21) {
					player.playerHand();
					determineWinner(player.getHandValue(), dealer.getHandValue());
					break;
				} else {
					break;
				}
			}
			System.out.println("\nWould You Like To Play Another Round? \n Yes or No?");
			String yOrN = sc.nextLine();

			if (yOrN.toUpperCase().contains("NO")) {
				playBlackJack = false;
			}

			else if (yOrN.toUpperCase().contains("YES")) {
				player.clearHand();
				dealer.clearHand();

				System.out.println("\nDealer Deals..\n");

			}
		}
		System.out.println("Thank You For Playing");
		sc.close();
	}

	public void determineWinner(int playerHand, int dealerHand) {
		if (playerHand > dealerHand) {
			System.out.println("\n" + playerHand + " Beats " + dealerHand + " Player Wins.");
		} else if (playerHand < dealerHand) {
			System.out.println("\n" + dealerHand + " Beats " + playerHand + " Dealer Wins.");
		} else if (playerHand == dealerHand) {
			System.out.println("\nTIE!");
		}
	}
}
