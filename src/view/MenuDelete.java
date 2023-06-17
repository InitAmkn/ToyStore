package view;

import enumToys.ToysCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MenuDelete extends MenuActions {
    String[] action = {"Delete", ToysCommand.DELETE.toString()};
    Scanner iScanner = new Scanner(System.in);

    @Override
    public String toString() {
        return action[0];
    }

    @Override
    public List<String> execute() {
        List<String> userReque = new ArrayList<>();
        userReque.add(action[1]);
        userReque.add(checkInputInt("Index toy: "));
        return userReque;
    }
}
