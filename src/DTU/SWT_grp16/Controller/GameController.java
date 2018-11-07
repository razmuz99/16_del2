package DTU.SWT_grp16.Controller;

import DTU.SWT_grp16.Model.Board;
import DTU.SWT_grp16.Model.DiceCup;
import DTU.SWT_grp16.Model.Player;
import DTU.SWT_grp16.UI.Keyboard;

public class GameController{
    Keyboard keyboard = new Keyboard();
    private Player player1;
    private Player player2;
    private DiceCup diceCup;
    private Board board;

    public void setupGame(){
        player1 = new Player(keyboard.askPlayerName(1));
        player2 = new Player(keyboard.askPlayerName(2));

        diceCup = new DiceCup();
        board = new Board();
    }

    public void playGame(){
    }
}
