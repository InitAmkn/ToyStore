package model.fileWork;

import java.io.FileWriter;
import java.io.IOException;


public class SaveFileCSW implements SaveFile {


    @Override
    public void saveWonToys()  {
        try {
            FileWriter wonToys = new FileWriter("data/wonToys.csw",true);
            wonToys.append("Add new info1");
            wonToys.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void gachaToys() {
        //File gachaToys = new File("data/gachaToys.csw");
    }
}
