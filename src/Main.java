import controller.CommandParser;
import controller.CommandParserImpl;
import controller.Controller;
import model.Gachapon;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CommandParser parserToy = new CommandParserImpl();
        Gachapon gachapon = new Gachapon(new ArrayList<>());
        Controller controller = new Controller(parserToy,gachapon);
        controller.start();
    }
}