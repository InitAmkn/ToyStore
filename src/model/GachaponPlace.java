package model;

public class GachaponPlace {
    private Toy toy;
    private int quantity;
    private int fallingFrequency;


    public GachaponPlace(Toy toy, int fallingFrequency, int quantity) {
        this.toy = toy;
        setQuantity(quantity);
        setFallingFrequency(fallingFrequency);
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) this.quantity = 0;
        else this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFallingFrequency(int fallingFrequency) {
        if (fallingFrequency > 100) this.fallingFrequency = 100;
        else if (fallingFrequency < 0) this.fallingFrequency = 0;
        else this.fallingFrequency = fallingFrequency;
    }

    public int getFallingFrequency() {
        return fallingFrequency;
    }

    public Toy releaseTheToy() {
        if (this.quantity > 0) {
            this.quantity--;
            return toy;
        }
        return null;
    }

    @Override
    public String toString() {

        return "" + this.toy + " - " + this.fallingFrequency + " - " + this.quantity;
    }
}
