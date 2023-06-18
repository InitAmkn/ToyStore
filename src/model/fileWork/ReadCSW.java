package model.fileWork;

import controller.Command;
import enumToys.ToysCommand;

import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class ReadCSW implements ReadFile {

    @Override
    public List<String[]> readAllToys() {
        try {
            FileReader allToysFile = new FileReader("data/allToys.csw");
            if (!allToysFile.ready()) return null;

            int readSymbols;
            StringBuilder sb = new StringBuilder();
            while ((readSymbols = allToysFile.read()) != -1) {
                sb.append((char) readSymbols);
            }
            allToysFile.close();
            return parserCSW(sb.toString());
        } catch (IOException e) {
            return null;
            //throw new RuntimeException(e);
        }
    }

    private List<String[]> parserCSW(String readSymbols) {
        if(readSymbols == "") return null;
        List<String[]> addToys = new ArrayList<>();
        List<String> splittingByLine = List.of(readSymbols.split("\n"));
        for (String item : splittingByLine) {
            String[] splittingByItem = item.split(";");
            splittingByItem[0] = ToysCommand.ADD.toString();
            addToys.add(splittingByItem);
        }
        return addToys;
    }
}
