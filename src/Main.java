import model.Gachapon;
import model.GachaponPlace;
import model.Toy;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Toy t = new Toy("robot0");
        Toy t2 = new Toy("rt1");
        Toy t3 = new Toy("t2");
        GachaponPlace gpp1 = new GachaponPlace(t,10,20);
        GachaponPlace gpp2 = new GachaponPlace(t2,53,0);
        GachaponPlace gpp3 = new GachaponPlace(t3,1,2);

        Gachapon gp = new Gachapon(new LinkedList<GachaponPlace>());
        gp.AddGachaponPlace(gpp1);
        gp.AddGachaponPlace(gpp2);
        gp.AddGachaponPlace(gpp3);

        System.out.println(gp);
        System.out.println("___________");
        System.out.println(gp.releaseTheToy());
        System.out.println("___________");
        System.out.println(gp);

    }
}