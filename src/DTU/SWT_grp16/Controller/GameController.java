package DTU.SWT_grp16.Controller;

import DTU.SWT_grp16.Model.BoardSimple;
import DTU.SWT_grp16.Model.DiceCup;
import DTU.SWT_grp16.Model.Field;
import DTU.SWT_grp16.Model.Player;

public class GameController{

    private Player player1;
    private Player player2;
    private DiceCup diceCup;
    private BoardSimple board;

    public void setupGame(){
        player1 = new Player("Alice");
        player2 = new Player("Bob");

        diceCup = new DiceCup();
        board = new BoardSimple();
    }

    public void playGame(){

    }

}
