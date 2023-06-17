package view;

import enumToys.ToysCommand;

import java.util.ArrayList;
import java.util.List;


public class MenuShow extends MenuActions {
    String[]action  = {"Show all", ToysCommand.SHOW.toString()};

    @Override
    public String toString() {
        return action[0];
    }
    @Override
    public List<String> execute() {
        List<String> userReque = new ArrayList<>();
        userReque.add(action[1]);
        return userReque;
    }
}
