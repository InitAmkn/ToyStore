package view;

import java.util.List;
import java.util.Scanner;

public abstract class MenuActions {

    abstract List<String> execute();
    protected Scanner iScanner = new Scanner(System.in);
    protected String checkInputInt(String menu) {
        Integer digit = 0;
        try {
            System.out.print(menu);
            digit = Integer.valueOf(iScanner.next());
        } catch (NumberFormatException e) {
            return checkInputInt(menu);
        }        return digit.toString();
    }

}
