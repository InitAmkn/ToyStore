package view;

import enumToys.ToysCommand;

import java.util.ArrayList;
import java.util.List;


public class MenuPlay extends MenuActions {
    String[] action = {"Play Gacha", ToysCommand.PLAY.toString()};

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
