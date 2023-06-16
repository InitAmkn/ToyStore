package model;

public class GachaponPlace {
    private Toy toy;
    private int quantity;
    private int fallingFrequency;


    public GachaponPlace(Toy toy, int quantity, int fallingFrequency) {
        this.toy = toy;
        setQuantity(quantity);
        setFallingFrequency(fallingFrequency);
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) this.quantity = 0;
        else this.quantity = quantity;
    }

    public void setFallingFrequency(int fallingFrequency) {
        if (fallingFrequency > 100) this.fallingFrequency = 100;
        else if (fallingFrequency < 0) this.fallingFrequency = 0;
        else this.fallingFrequency = fallingFrequency;
    }

    public int getFallingFrequency() {
        return fallingFrequency;
    }

    public int getQuantity() {
        return quantity;
    }

    public Toy releaseTheToy() {
        if (this.quantity > 0) {
            this.quantity--;
            return this.toy;
        }
        return null;
    }

}
