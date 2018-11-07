package DTU.SWT_grp16.UI;

import java.util.List;
import java.io.*;
import java.util.ArrayList;

public class Input {
    public void mWriter(String input, String filePath)  {

        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(input);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public List<String> mReader(String filePath)  {
        BufferedReader reader;
        String currentLine="";
        List<String> list = new ArrayList<String>();
        try {
            reader = new BufferedReader(new FileReader(filePath));
            while((currentLine = reader.readLine()) != null){
                list.add(currentLine);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
    public String[][] readFileField(){

        List<String> test= mReader("src/Fields.txt");
        String[] fields = test.toArray(new String[0]);
        String[] endFields = new String[fields.length+2];

        for (int i = 0; i < (endFields.length) ; i++) {
            if(i<2){
                endFields[i] = "nathing:0:false";
            }
            else{
                endFields[i] = fields[i-2];
            }
        }
        String[][] finalFields = new String[fields.length+2][3];

        for (int i = 0; i < finalFields.length; i++) {
            //finalFields[i] = endFields[i].split(":");
            for (int j = 0; j <finalFields[i].length ; j++) {
                finalFields[i][j] = endFields[i].split(":")[0];
            }
            finalFields[i] = endFields[i].split(":");

        }
        return finalFields;
    }

}
