package controller.executable;

import controller.Command;
import model.Gachapon;

public class ShowExecutable implements CommandExecutable{
    private Gachapon gachapon;
    private String answer;
    public ShowExecutable(Command command, Gachapon gachapon) {
        this.gachapon = gachapon;
    }
    @Override
    public void execute() {
        this.answer = this.gachapon.toString();
    }

    @Override
    public String getAnswer() {
        return this.answer;
    }
}
