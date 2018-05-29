package group144.dementiev;

/**
 * Class realizing Tic-tac-toe game logic
 */
public class Tictactoe {
    private enum Player{X, O};
    private enum ButtonState{X, O, NON};

    private Player currentPlayer = Player.X;
    private ButtonState[][] buttons;

    /**
     * Constructor method
     */
    Tictactoe() {
        currentPlayer = Player.X;
        buttons = new ButtonState[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                buttons[i][j] = ButtonState.NON;
    }

    /**
     * Returns symbol of current player
     *
     * @return symbol of current player
     */
    public String getCurrentPlayer() {
        return (currentPlayer == Player.X ? "X" : "O");
    }

    /**
     * Returns the character of the player whose move will be
     *
     * @param row a number that contains a variable position
     * @param column a number that contains a variable position
     * @return the character of the player whose move will be
     */
    public String nextMove(int row, int column) {
        String result;
        if (buttons[row][column] == ButtonState.NON) {
            result = currentPlayer == Player.X ? "X" : "O";
            buttons[row][column] = currentPlayer == Player.X ? ButtonState.X : ButtonState.O;
            currentPlayer = currentPlayer == Player.X ? Player.O : Player.X;
        } else {
            result = buttons[row][column] == ButtonState.X ? "X" : "O";
        }
        return result;
    }

    /**
     * Returns true if all fields are filling
     *
     * @return is all fields filling
     */
    public boolean isGameFinished() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (buttons[i][j] == ButtonState.NON)
                    return false;
        return true;
    }

    /**
     * Return the player who won.
     * @return the player who won.
     */
    public boolean hasWinner() {
        boolean result = false;

        for (int row = 0; row < 3; row++) {
            result |= buttons[row][0] == buttons[row][1] &&
                    buttons[row][1] == buttons[row][2] &&
                    buttons[row][0] != ButtonState.NON;
        }

        for (int column = 0; column < 3; column++) {
            result |= buttons[0][column] == buttons[1][column] &&
                    buttons[1][column] == buttons[2][column] &&
                    buttons[0][column] != ButtonState.NON;
        }

        result |= buttons[0][0] == buttons[1][1] &&
                buttons[1][1] == buttons[2][2] &&
                buttons[0][0] != ButtonState.NON;

        result |= buttons[0][2] == buttons[1][1] &&
                buttons[1][1] == buttons[2][0] &&
                buttons[0][2] != ButtonState.NON;

        return result;
    }
}
