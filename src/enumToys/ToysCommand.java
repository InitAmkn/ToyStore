package enumToys;

public enum ToysCommand {
    DELETE("delete"),
    ADD("add"),
    SHOW("show"),
    PLAY("play");
    private String name;

    ToysCommand(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
