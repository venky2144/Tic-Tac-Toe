package com.bnp.kata.tictactoe;

public class TicTacToe {

	public Character getPosition(int row, int column) {

		char[][] board = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = 'X';
			}
		}
		return board[row][column];

	}
}
