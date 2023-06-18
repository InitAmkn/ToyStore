package controller.executable;

import controller.Command;
import enumToys.ToysCommand;
import model.Gachapon;
import view.MenuActions;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutableFactory {

    public CommandExecutable create(Command command, Gachapon gachapon) {
        Map<String, CommandExecutable> commands = new HashMap<>();

        if(command.getAction().equals(ToysCommand.ADD.toString()))
        commands.put(ToysCommand.ADD.toString(), new AddExecutable(command, gachapon));

        if(command.getAction().equals(ToysCommand.DELETE.toString()))
        commands.put(ToysCommand.DELETE.toString(), new DeleteExecutable(command, gachapon));

        if(command.getAction().equals(ToysCommand.SHOW.toString()))
        commands.put(ToysCommand.SHOW.toString(), new ShowExecutable(command, gachapon));

        if(command.getAction().equals(ToysCommand.PLAY.toString()))
        commands.put(ToysCommand.PLAY.toString(), new PlayExecutable(command, gachapon));
        return commands.get(command.getAction());
    }
}

