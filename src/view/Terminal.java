package view;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {

    Scanner iScanner = new Scanner(System.in);
    public List<String> start(){
        Map<String,MenuActions> menu = new HashMap<>();
        List<String> userReque = new ArrayList<>();
        menu.put("1", new MenuAdd());
        menu.put("2", new MenuDelete());
        menu.put("3", new MenuShow());
        menu.put("4", new MenuPlay());

        userReque.addAll(menuSelection((HashMap<String, MenuActions>) menu));

        System.out.println(userReque);
        return userReque;
    }

    public List<String> menuSelection(HashMap<String,MenuActions> menu) {
        String hello = "Select an action:";
        String incorrect = "Incorrect selection of the menu item.";

        System.out.println(hello);
        for (String numAction: menu.keySet()) {
            System.out.printf("%s. %s\n", numAction, menu.get(numAction));
        }
        String input = iScanner.next();
        if(!menu.keySet().contains(input))
        {
            System.out.println(incorrect);
            return menuSelection(menu);
        }
        return menu.get(input).execute();
    }
    public void printAnswer(String answer){
        System.out.println(answer);
    }
}
