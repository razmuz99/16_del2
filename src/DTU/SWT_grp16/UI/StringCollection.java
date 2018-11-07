package DTU.SWT_grp16.UI;

import java.io.BufferedReader;
import java.io.FileReader;

public class StringCollection {

    //Todo: refactor methods to avoid duplication.

    private static StringBuilder stringBuilder;
    private static String FIELD_TEXT_PATH = "test.txt";

    static String getFieldMessageByID(int ID){
        stringBuilder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(FIELD_TEXT_PATH))){
            while(reader.ready()){
                String lineRead = reader.readLine();
                if(lineRead.startsWith("id:"+ID))
                    stringBuilder.append(lineRead);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

}
