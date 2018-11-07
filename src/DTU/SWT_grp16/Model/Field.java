package DTU.SWT_grp16.Model;

public class Field {

    private int id;
    private String name;
    private boolean bonusTurn;
    private int points;

    public Field(String name, int points){

        this.name = name;
        this.points = points;
    }

    public Field(String name, int points, boolean bonusTurn){

        this.name = name;
        this.points = points;
        this.bonusTurn = bonusTurn;
    }

    public int getID(){
        return this.id;
    }
    public String getName(){return  this.name; }
    public int getPoints() {
        return this.points;
    }
    public boolean hasBonusTurn(){ return this.bonusTurn; }


}

