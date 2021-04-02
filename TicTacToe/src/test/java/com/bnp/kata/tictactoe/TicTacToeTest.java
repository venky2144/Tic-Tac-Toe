package com.bnp.kata.tictactoe;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testPlayerPlaceXInBoard() {
		TicTacToe ticTacToeTestObj = new TicTacToe();

		assertThat(ticTacToeTestObj.getPosition(2, 1), CoreMatchers.is('X'));
	}
}
