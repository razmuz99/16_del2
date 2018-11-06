package DTU.SWT_grp16.UI;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

}
