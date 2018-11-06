package DTU.SWT_grp16.Model;

public class Field {

    private int id;
    private boolean bonusTurn;
    private int points;

    public Field(int id, int points){
        this.id = id;
        this.points = points;
    }

    public Field(int id, int points, boolean bonusTurn){
        this.id = id;
        this.points = points;
        this.bonusTurn = bonusTurn;
    }

    public int getID(){
        return this.id;
    }
    public int getPoints() {
        return this.points;
    }
    public boolean hasBonusTurn(){
        return this.bonusTurn;
    }


}

