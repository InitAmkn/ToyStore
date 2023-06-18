package controller.executable;

import controller.Command;
import model.Gachapon;
import model.GachaponPlace;
import model.Toy;
public class AddExecutable implements CommandExecutable {

    private String name;
    private int quantity;
    private int frequency;
    private Gachapon gachapon;
    private String answer;

    public AddExecutable(Command command, Gachapon gachapon) {
        this.name = command.getParameters().get(0);
        this.quantity = Integer.parseInt(command.getParameters().get(1));
        this.frequency = Integer.parseInt(command.getParameters().get(2));
        this.gachapon = gachapon;
    }

    @Override
    public void execute() {
        this.gachapon.addPlace(
                new GachaponPlace(new Toy(this.name), this.frequency, this.quantity));
        this.answer = "added";
    }

    @Override
    public String getAnswer() {
        return this.answer;
    }
}
