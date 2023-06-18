import controller.CommandParser;
import controller.CommandParserImpl;
import controller.Controller;
import model.Gachapon;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
        Toy t1 = new Toy("ro0");
        Toy t2 = new Toy("rt1");
        Toy t3 = new Toy("t2");
        GachaponPlace gpp1 = new GachaponPlace(t1,10,20);
        GachaponPlace gpp2 = new GachaponPlace(t2,53,1);
        GachaponPlace gpp3 = new GachaponPlace(t3,1,2);

        Gachapon gp = new Gachapon(new LinkedList<>());
        gp.addPlace(gpp1);
        gp.addPlace(gpp2);
        gp.addPlace(gpp3);

        System.out.println(gp);
        System.out.println("___________");
        System.out.println(gp.releaseTheWonToy());
        System.out.println("___________");
        System.out.println(gp.releaseTheWonToy());
        System.out.println("___________");
        System.out.println(gp);

        SaveFile newFile = new SaveFileCSW();
        newFile.saveWonToys();
*/
        CommandParser parserToy = new CommandParserImpl();
        Gachapon gachapon = new Gachapon(new ArrayList<>());
        Controller controller = new Controller(parserToy,gachapon);
        controller.start();
    }
}