package controller.executable;

import controller.Command;
import model.Gachapon;

public class PlayExecutable implements CommandExecutable {
    private Gachapon gachapon;
    private String answer;

    public PlayExecutable(Command command, Gachapon gachapon) {
        this.gachapon = gachapon;
    }

    @Override
    public void execute() {
        this.answer = gachapon.releaseTheWonToy().toString();

    }

    public String getAnswer() {
        return this.answer;
    }
}

