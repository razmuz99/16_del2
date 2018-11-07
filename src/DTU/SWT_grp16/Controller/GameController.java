package DTU.SWT_grp16.Controller;

import DTU.SWT_grp16.Model.*;
import DTU.SWT_grp16.UI.Input;
import DTU.SWT_grp16.UI.Output;

public class GameController{

    private static int WIN_AMOUNT = 3000;
    private static Player player1;
    private static Player player2;
    private static Playerlist playerlist;
    private static DiceCup diceCup;
    private static BoardSimple board;

    public static void setupGame(){
        player1 = new Player("Alice");
        player2 = new Player("Bob");
        playerlist = new Playerlist(player1, player2);

        diceCup = new DiceCup();
        board = new BoardSimple();
    }

    public static void playGame(){

        Player currentPlayer = playerlist.getNextPlayer();
        //ViewController.nextTurnMessage(currentPlayer);
        //ViewController.waitForEnter();

        diceCup.roll();
        int sum = diceCup.getSum();
        Field currentField = getFieldByID(sum);

        int pointChange = currentField.getPoints();
        currentPlayer.addToBalance(pointChange);

        if(currentField.hasBonusTurn())
            currentPlayer.setBonusTurn(true);

        if(currentPlayer.getBalance() >= WIN_AMOUNT){
            currentPlayer.setWinner(true);
        }

        //ViewController.turnResultMessage(currentPlayer);

        boolean gameIsNotOver = !currentPlayer.isWinner();
        if(gameIsNotOver){
            playGame();
        }
    }

    private static Field getFieldByID(int ID){
        Field field = new Field(0,0);
        for(Field f : board.getFields()){
            if(ID == field.getID())
                field = f;
        }
        return field;
    }

}
