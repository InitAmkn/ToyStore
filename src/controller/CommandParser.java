package controller;

import java.util.List;

public interface CommandParser {
    Command parseCommand(List<String> dataInput);
}


