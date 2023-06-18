package controller;

import controller.executable.CommandExecutableFactory;
import model.Gachapon;
import model.fileWork.SaveFile;
import model.fileWork.SaveFileCSW;
import view.Terminal;
import controller.executable.CommandExecutable;

import java.io.FileWriter;
import java.util.List;

public class Controller {
    private CommandParser commandParser;
    private Gachapon gachaPon;
    CommandExecutable commandExecutable;
    private Terminal terminal = new Terminal();

    public Controller(CommandParser commandParser, Gachapon gachaPon)
    {
        this.commandParser = commandParser;
        this.gachaPon = gachaPon;
    }

    public void start() {
        while (true) {
            List<String> request = terminal.start();
            Command command = this.commandParser.parseCommand(request);
            this.commandExecutable = new CommandExecutableFactory().create(command,gachaPon);
            this.commandExecutable.execute();
            SaveFile saveFile = new SaveFileCSW();
            saveFile.allToys(this.gachaPon);
            terminal.printAnswer(commandExecutable.getAnswer());
        }
    }
}
