package controller;

import java.util.ArrayList;
import java.util.List;

public class CommandParserImpl implements CommandParser {

    @Override
    public Command parseCommand(List<String> dataInput) {
        String action = dataInput.get(0);
        List<String> parameters = new ArrayList<>();
        for (int i = 1; i < dataInput.size(); i++) {
            parameters.add(dataInput.get(i));
        }
        return new Command(action, parameters);

    }

}