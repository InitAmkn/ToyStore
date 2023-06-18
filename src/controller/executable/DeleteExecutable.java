package controller.executable;

import controller.Command;
import model.Gachapon;

public class DeleteExecutable implements CommandExecutable{
    private int id;
    private String answer;
    private Gachapon gachapon;
    public DeleteExecutable(Command command, Gachapon gachapon) {
        this.id = Integer.parseInt(command.getParameters().get(0));
        this.gachapon = gachapon;
    }
    @Override
    public void execute() {
        if (gachapon.deleteToyByIndex(this.id))
        {
            this.answer = "deleted";
        }
        else
        {
            this.answer = "no index";
        }
    }

    @Override
    public String getAnswer() {
        return this.answer;
    }
}
