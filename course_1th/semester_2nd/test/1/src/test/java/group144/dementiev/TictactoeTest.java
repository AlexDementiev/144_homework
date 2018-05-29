package group144.dementiev;

import org.junit.Test;

import static org.junit.Assert.*;

public class TictactoeTest {

    @Test
    public void getCurrentPlayer() {
        Tictactoe game = new Tictactoe();
        assertEquals("X", game.getCurrentPlayer());
        game.nextMove(0, 0);
        assertEquals("O",game.getCurrentPlayer());
    }

    @Test
    public void nextMove() {
        Tictactoe game = new Tictactoe();
        assertEquals("X", game.getCurrentPlayer());
        game.nextMove(0, 0);
        assertEquals("O",game.getCurrentPlayer());
        game.nextMove(0, 0);
        assertEquals("O", game.getCurrentPlayer());
    }

    @Test
    public void gameFinishedTest() {
        Tictactoe game = new Tictactoe();
        assertFalse(game.isGameFinished());
        game.nextMove(0, 0);
        game.nextMove(0, 1);
        game.nextMove(0, 2);
        game.nextMove(1, 0);
        game.nextMove(1, 1);
        game.nextMove(1, 2);
        game.nextMove(2, 0);
        game.nextMove(2, 1);
        game.nextMove(2, 2);
        assertTrue(game.isGameFinished());
    }
}