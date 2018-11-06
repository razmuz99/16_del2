package DTU.SWT_grp16.Model;

public class Field {
    private int id;
    private boolean bonusTurn;
    private int points;

    public Field(int id, int points, boolean bonusTurn){
        this.id = id;
        this.points = points;
        this.bonusTurn = bonusTurn;
    }

    public int getPoints() {
        return points;
    }

    public boolean hasBonusTurn(){
        return bonusTurn;
    }


}

