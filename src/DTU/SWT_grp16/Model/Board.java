package DTU.SWT_grp16.Model;

import DTU.SWT_grp16.View.Input;
import java.util.List;

import static java.lang.String.valueOf;

public class Board {

    Input wr = new Input();
    public Board(){

    }
    public String[][] setUpFields(){

        List<String> test= wr.mReader("Fields.txt");
        String[] fields = test.toArray(new String[0]);
        String[] endFields = new String[fields.length+2];

        for (int i = 0; i < (endFields.length) ; i++) {
            if(i<2){
                endFields[i] = "nathing:0";
            }
            else{
                endFields[i] = fields[i-2];
            }
        }
        String[][] finalFields = new String[fields.length+2][3];

        for (int i = 0; i < finalFields.length; i++) {
            finalFields[i] = endFields[i].split(":");
            for (int j = 0; j <finalFields[i].length ; j++) {
                finalFields[i][j] = endFields[i].split(":")[0];

            }
            finalFields[i] = endFields[i].split(":");

        }
        return finalFields;
    }

}
