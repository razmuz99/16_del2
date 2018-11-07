package DTU.SWT_grp16.View;

import java.util.Scanner;

public class Keyboard {
    Scanner input;

    public Keyboard(){

        input = new Scanner(System.in);
    }

    public String askPlayerName(int playerNumber){
        String playerName = "";

        while(waitForInput()){
            playerName = input.nextLine();
            break;
        }
        return playerName;
    }

    public boolean waitForInput(){
        boolean doNext = input.hasNext();
        return doNext;
    }
}
