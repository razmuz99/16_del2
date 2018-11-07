package DTU.SWT_grp16.View;

import DTU.SWT_grp16.View.StringCollection;

public class Output {

    public Output(){
    }

    public void printFieldMessage(int fieldID){
        String fieldMessage = StringCollection.getFieldMessageByID(fieldID);
        System.out.println(fieldMessage);
    }

}
