package controller;

import controller.executable.CommandExecutableFactory;
import enumToys.ToysCommand;
import model.Gachapon;
import model.fileWork.ReadCSW;
import model.fileWork.ReadFile;
import model.fileWork.SaveFile;
import model.fileWork.SaveFileCSW;
import view.Terminal;
import controller.executable.CommandExecutable;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    SaveFile saveFile = new SaveFileCSW();
    ReadFile readFile = new ReadCSW();
    private final CommandParser commandParser;
    private final Gachapon gachaPon;
    CommandExecutable commandExecutable;
    private final Terminal terminal = new Terminal();

    public Controller(CommandParser commandParser, Gachapon gachaPon) {
        this.commandParser = commandParser;
        this.gachaPon = gachaPon;
    }

    public void start() {
        readingFile();
        while (true) {
            List<String> request = terminal.start();
            Command command = this.commandParser.parseCommand(request);
            this.commandExecutable = new CommandExecutableFactory().create(command, gachaPon);
            this.commandExecutable.execute();
            saveFile.allToys(this.gachaPon);
            terminal.printAnswer(commandExecutable.getAnswer());
        }
    }

    private void readingFile() {
        List<String[]> commandList = readFile.readAllToys();

        if (commandList != null) {
            for (String[] item : commandList) {
                terminal.printAnswer(String.join(" - ",item));
                Command command = this.commandParser.parseCommand(List.of(item));
                this.commandExecutable = new CommandExecutableFactory().create(command, gachaPon);
                this.commandExecutable.execute();
                terminal.printAnswer(commandExecutable.getAnswer());
            }
        }
    }
}
