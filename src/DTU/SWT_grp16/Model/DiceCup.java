package DTU.SWT_grp16.Model;

public class DiceCup {

    private Die[] diceArray;

    public DiceCup(){
        diceArray = new Die[2];
        diceArray[0] = new Die();
        diceArray[1] = new Die();
    }

    public Die[] getDiceArray(){
        return diceArray;
    }

    public void rollAllDice(){
        for (Die die : diceArray) {
            die.rollDie();
        }
    }

    public int getSum(){
        int sum = 0;
        for (Die die : diceArray) {
            sum += die.getValue();
        }
        return sum;
    }



}
