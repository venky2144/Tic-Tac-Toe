package com.bnp.kata.tictactoe;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testPlayerPlaceXInBoard() {
		TicTacToe ticTacToeTestObj = new TicTacToe();

		assertThat(ticTacToeTestObj.getPosition(2, 1), CoreMatchers.is('X'));
	}
	@Test
	public void testPlayerPlaceXOnBoard() {
		TicTacToe ticTacToeTestObj = new TicTacToe();
		assertThat(ticTacToeTestObj.getPosition(1, 2), CoreMatchers.is('X'));
	}
	@Test
	public void testPlayerShoulPlaceAnywhereOBoard()
	{
		TicTacToe ticTacToeTestObj = new TicTacToe();
		ticTacToeTestObj.getPosition(0, 1);
	}
	@Test
	public void checkRowsForWin()
	{
		TicTacToe ticTacToeTestObj = new TicTacToe();
		assertTrue(ticTacToeTestObj.testCheckRowsForWin());
		
	}
}
