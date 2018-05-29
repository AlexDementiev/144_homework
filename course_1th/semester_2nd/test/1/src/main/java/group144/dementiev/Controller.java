package group144.dementiev;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.util.Random;

import static java.lang.Math.abs;

public class Controller {

    private Button[][] buttons;
    private Tictactoe game;
    Random random = new Random();

    /**
     * Initialization method.
     */
    public void initialize() {
        buttons = new Button[][]{{button00, button01, button02},
                                 {button10, button11, button12},
                                 {button20, button21, button22}};
        wins = 0;
        defeat = 0;
        bDefeat = 0;
        bWins = 0;
        newGame();
    }

    /**
     * Method which start new game.
     *
     * @param event button "New Game" was clicked.
     */
    public void newGameEvent(ActionEvent event) {
        withBot= false;
        newGame();
    }

    /**
     * Method which start new game with bot.
     *
     * @param event button "New Game bot" was clicked.
     */
    public void newBotGameEvent(ActionEvent event) {
        withBot = true;
        newGame();
    }

    /**
     * Method which start new party.
     *
     * @param event button "New party" was clicked.
     */
    public void newPartyEvent(ActionEvent event) {
        wins = 0;
        defeat = 0;
        bWins = 0;
        bDefeat = 0;
        newGame();
    }

    /**
     * Sets the text to the button that was clicked
     *
     * @param actionEvent the button that was clicked
     */
    public void nextMove(ActionEvent actionEvent) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if(actionEvent.getSource().equals(buttons[i][j]))
                    buttons[i][j].setText(game.nextMove(i, j));
        updateLabel();

        if (withBot && !game.isGameFinished()) {
            int x = abs(random.nextInt() % 3);
            int y = abs(random.nextInt() % 3);
            while (!buttons[x][y].getText().equals("")) {
                x = abs(random.nextInt() % 3);
                y = abs(random.nextInt() % 3);
            }
            buttons[x][y].setText(game.nextMove(x, y));

            updateLabel();
        }
        finishGame();
    }

    private void finishGame() {
        if (game.hasWinner()) {
            if (withBot) {
                if (game.getCurrentPlayer().equals("X")) {
                    bWins++;
                } else {
                    bDefeat++;
                }
                botStat.setText(bWins + " / " + bDefeat);
            } else {
                if (game.getCurrentPlayer().equals("O")) {
                    wins++;
                } else {
                    defeat++;
                }
                userStat.setText(wins + " / " + defeat);
            }
            newGame();
            updateLabel();
        }

        if (game.isGameFinished()) {
            newGame();
            updateLabel();
    }
    }

    private void setButtons() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                buttons[i][j].setText("");
    }

    private void newGame() {
        game = new Tictactoe();
        setButtons();
    }

    private void updateLabel() {
        nextMoveLabel.setText("Now " + game.getCurrentPlayer() + " move");
    }


    private boolean withBot = false;
    private int wins = 0;
    private int defeat = 0;
    private int bWins = 0;
    private int bDefeat = 0;
    @FXML
    private Label nextMoveLabel;
    @FXML
    private Label botStat;
    @FXML
    private Label userStat;
    @FXML
    private Button button00;
    @FXML
    private Button button01;
    @FXML
    private Button button02;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button20;
    @FXML
    private Button button21;
    @FXML
    private Button button22;
}
