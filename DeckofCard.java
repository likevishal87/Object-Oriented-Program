package com.bridgelabz;

import java.util.Random;

public class DeckofCard {
	public static String[][] cardDistribute() {
		String array[][] = new String[4][13];
		cardInsert(array);
		cardShuffle(array);
		String playercard[][] = new String[4][9];
		for (int i = 0; i < playercard.length; i++) {
			for (int j = 0; j < playercard[i].length; j++) {
				playercard[i][j] = array[i][j];
			}
		}
		return playercard;
	}

	public static void cardInsert(String array[][]) {
		String Suits[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String Rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Suits[i] + " " + Rank[j];
			}
		}
	}

	public static void swap(String arr[][], int x1, int x2, int x3, int x4) {
		String temp = arr[x1][x2];
		arr[x1][x2] = arr[x3][x4];
		arr[x3][x4] = temp;
	}

	public static void cardShuffle(String arr[][]) {
		Random random = new Random();
		for (int i = 0; i < 150; i++) {
			int x1 = random.nextInt(4);
			int x2 = random.nextInt(13);
			int x3 = random.nextInt(4);
			int x4 = random.nextInt(13);
			swap(arr, x1, x2, x3, x4);

		}
	}

	public static void main(String[] args) {
		String playercard[][] = cardDistribute();
		System.out.println("Player 1   |||   Player 2   |||    Player 3   |||     Player 4");
		System.out.println();
		int x = 0;
		int y = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(playercard[x][y] + "         ");
				y++;
				if (y == 9) {
					y = 0;
					x++;
				}
			}
			System.out.println();
		}
	}
}
