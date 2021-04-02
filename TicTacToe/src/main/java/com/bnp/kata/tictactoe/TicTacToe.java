package com.bnp.kata.tictactoe;

public class TicTacToe {

	char[][] board = new char[3][3];
	public Character getPosition(int row, int column) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = 'X';
			}
		}
		return board[row][column];

	}

	public boolean CheckRowsForWin() {

     return false;
		
	}

	public boolean testCheckRowsForWin() {
		boolean result=false;
		char ch1=board[0][1]='X';
		char ch2=board[1][1]='X';
		char ch3=board[2][2]='X';
		if((ch1 == ch2) && (ch2 == ch3))
		{
			result=true;
		}
		return result;
	}
}
