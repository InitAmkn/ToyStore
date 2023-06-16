package model;

public class Toy {

    private static int NOW_ID;
    private int id;
    private String name;


    public Toy(String name)
    {
        setId();
        this.name = name;

    }

    private void setId() {
        this.id = NOW_ID;
        NOW_ID = NOW_ID + 1;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }


}
