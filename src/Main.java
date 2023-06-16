import model.Toy;

public class Main {
    public static void main(String[] args) {

        Toy t = new Toy("robot0");
        Toy t2 = new Toy("rt1");
        Toy t3 = new Toy("t2");

        System.out.println(t.getId());
        System.out.println(t2.getId());
        System.out.println(t3.getId());
    }
}