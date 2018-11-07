package DTU.SWT_grp16.UI;

import DTU.SWT_grp16.Model.Field;

public class Output {

    public Output(){
    }

    public void fieldMessage(int fieldID){
        String fieldMessage = StringCollection.getFieldMessageByID(fieldID);
        System.out.println(fieldMessage);
    }

}
