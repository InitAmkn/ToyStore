package view;

import enumToys.ToysCommand;

import java.util.ArrayList;
import java.util.List;


public class MenuAdd extends MenuActions {
    String[] action = {"Add Toy", ToysCommand.ADD.toString()};
    @Override
    public String toString() {
        return action[0];
    }
    @Override
    public List<String> execute() {
        List<String> userReque = new ArrayList<>();
        userReque.add(action[1]);
        userReque.addAll(inputData());
        return userReque;
    }

    public List<String> inputData() {
        List<String> input = new ArrayList<>();
        System.out.print("Name toy: ");
        input.add(iScanner.next());
        input.add(checkInputInt("Quantity: "));
        input.add(checkInputInt("Execution frequency: "));
        return input;
    }
}
