package model;

public class Toy {

    private static int NOW_ID;
    private int id;
    private String name;


    public Toy(String name) {
        setId();
        this.name = name;

    }

    private void setId() {
        this.id = NOW_ID;
        NOW_ID = NOW_ID + 1;
    }

    @Override
    public String toString() {

        return String.format("id:%d; name:%s;", this.id, this.name);
    }
    public String toStringCSW() {

        return String.format("%d;%s", this.id, this.name);
    }
}
