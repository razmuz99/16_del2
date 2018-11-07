package DTU.SWT_grp16.Model;
import DTU.SWT_grp16.UI.Input;

public class Board {
    Input input = new Input();
    private Field[] fields;

    public Board(){
        setupFields(input.readFileField());
    }

    private void setupFields(String[][] input){
        //Better implementation uses a file and gives Fields a name variable.
        fields = new Field[13];
        for (int i = 0; i <fields.length ; i++) {
            fields[i] = new Field(input[i][0], Integer.valueOf(input[i][1]), Boolean.valueOf(input[i][2]));
        }
    }

    public Field[] getFields(){
        return this.fields;
    }
}
