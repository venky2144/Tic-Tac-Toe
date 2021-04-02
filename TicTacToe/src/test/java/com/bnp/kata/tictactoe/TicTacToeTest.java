package com.bnp.kata.tictactoe;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testPlayerPlaceXInBoard() {
		TicTacToe ticTacToeTestObj = new TicTacToe();

		assertThat(ticTacToeTestObj.getPosition(2, 1,'X'), CoreMatchers.is('X'));
	}
	@Test
	public void testPlayerPlaceOInBoard() {
		TicTacToe ticTacToeTestObj = new TicTacToe();
		assertThat(ticTacToeTestObj.getPosition(1, 2,'O'), CoreMatchers.is('O'));
	}
}
