package DTU.SWT_grp16.Controller;

import DTU.SWT_grp16.Model.DiceCup;
import DTU.SWT_grp16.Model.Field;
import DTU.SWT_grp16.Model.Player;

public class GameController{

    private Player player1;
    private Player player2;
    private DiceCup diceCup;
    private Field tower;
    private Field crater;
    private Field palaceGates;
    private Field coldDesert;
    private Field walledCity;
    private Field monestary;
    private Field blackCave;
    private Field hutsInTheMountain;
    private Field theWerewall;
    private Field thePit;
    private Field goldmine;

    public void setupGame(){
        player1 = new Player("Alice");
        player2 = new Player("Bob");

        diceCup = new DiceCup();

        tower = new Field(2,250);
        crater = new Field(3,-100);
        palaceGates = new Field(4,100);
        coldDesert = new Field(5,-20);
        walledCity = new Field(6,180);
        monestary = new Field(7,0);
        blackCave = new Field(8,-70);
        hutsInTheMountain = new Field(9,60);
        theWerewall = new Field(10,-80,true);
        thePit = new Field(11,-50);
        goldmine = new Field(12,650);



    }

    public void playGame(){

    }

}
