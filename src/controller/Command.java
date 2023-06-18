package controller;

import java.util.List;

public class Command {

    private String action;
    private List<String> parameters;

    public Command(String action, List<String> parameters) {
        this.action = action;
        this.parameters = parameters;
    }

    public String getAction() {
        return this.action;
    }

    public List<String> getParameters() {
        return this.parameters;
    }
}
