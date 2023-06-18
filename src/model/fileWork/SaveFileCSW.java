package model.fileWork;

import model.Gachapon;
import model.GachaponPlace;
import model.Toy;

import java.io.FileWriter;
import java.io.IOException;

public class SaveFileCSW implements SaveFile {


    @Override
    public void saveWonToys(Toy wonToy) {
        try {
            FileWriter wonToys = new FileWriter("data/wonToys.csw", true);
            wonToys.write(String.format("%s\n", wonToy.toStringCSW()));
            wonToys.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void allToys(Gachapon gachapon) {
        try {
            FileWriter allToys = new FileWriter("data/allToys.csw");
            for (GachaponPlace place : gachapon.getToysList()) {
                allToys.write(String.format("%s\n", place.toStringCSV()));
            }
            allToys.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
