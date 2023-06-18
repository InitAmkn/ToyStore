package controller.executable;

import controller.Command;
import model.Gachapon;
import model.Toy;
import model.fileWork.SaveFile;
import model.fileWork.SaveFileCSW;

public class PlayExecutable implements CommandExecutable {
    private Gachapon gachapon;
    private String answer;

    public PlayExecutable(Command command, Gachapon gachapon) {
        this.gachapon = gachapon;
    }

    @Override
    public void execute() {
        Toy toy = gachapon.releaseTheWonToy();
        this.answer = toy.toString();
        SaveFile saveFileWon = new SaveFileCSW();
        saveFileWon.saveWonToys(toy);

    }

    public String getAnswer() {
        return this.answer;
    }
}

