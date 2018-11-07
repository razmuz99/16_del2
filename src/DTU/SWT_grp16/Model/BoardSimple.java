package DTU.SWT_grp16.Model;

public class BoardSimple {

    private Field[] fields;

    public BoardSimple(){
        setupFields();
    }

    private void setupFields(){
        //Better implementation uses a file and gives Fields a name variable.
        fields = new Field[13];
        fields[0] = new Field(0,0);
        fields[1] = new Field(1,0);
        fields[2] = new Field(2,250);
        fields[3] = new Field(3,-100);
        fields[4] = new Field(4,100);
        fields[5] = new Field(5,-20);
        fields[6] = new Field(6,180);
        fields[7] = new Field(7,0);
        fields[8] = new Field(8,-70);
        fields[9] = new Field(9,60);
        fields[10] = new Field(10,-80,true);
        fields[11] = new Field(11,-50);
        fields[12] = new Field(12,650);
    }

    public Field[] getFields(){
        return this.fields;
    }

}
