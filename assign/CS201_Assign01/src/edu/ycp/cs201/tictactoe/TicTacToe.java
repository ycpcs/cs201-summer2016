package edu.ycp.cs201.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	public static final int PLAYER_X = 1;
	public static final int PLAYER_O = 2;
	
	public static void main(String[] args) {
		int[][] board = new int[3][3];
		
		Scanner keyboard = new Scanner(System.in);
		
		int player = PLAYER_X;
		boolean done = false;
		while (!done) {
			System.out.println();
			printBoard(board);
			
			System.out.printf("\nPlayer %c's turn:\n", (player == PLAYER_X) ? 'X' : 'O');
			int row = getRow(keyboard);
			int col = getCol(keyboard);
			
			if (!isLegalMove(board, row, col)) {
				System.out.println("Invalid move, try again");
			} else {
				placeMarker(board, row, col, player);
				if (playerWins(board, player)) {
					// Current player wins
					System.out.printf("Player %s wins!\n", player == PLAYER_X ? "X" : "O");
					done = true;
				} else if (isDraw(board)) {
					// Game is a draw
					System.out.println("It's a draw!");
					done = true;
				} else {
					// Switch player
					player = (player == PLAYER_X) ? PLAYER_O : PLAYER_X;
				}
			}
		}
		System.out.println("Thanks for playing!");
	}

	public static void printBoard(int[][] board) {
		throw new UnsupportedOperationException("not implemented yet");
	}
	
	
	public static int getRow(Scanner keyboard) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	public static int getCol(Scanner keyboard) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	public static boolean isLegalMove(int[][] board, int row, int col) {
		throw new UnsupportedOperationException("not implemented yet");
	}
	
	public static void placeMarker(int[][] board, int row, int col, int player) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	public static boolean playerWins(int[][] board, int player) {
		// TODO: implement this for real
		return false;
	}

	public static boolean isDraw(int[][] board) {
		// TODO: implement this for real
		return false;
	}
}
