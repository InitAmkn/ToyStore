package model;

public class GachaponPlace {
    private Toy toy;
    private int quantity;
    private int frequency;


    public GachaponPlace(Toy toy, int frequency, int quantity) {
        this.toy = toy;
        setQuantity(quantity);
        setFrequency(frequency);
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) this.quantity = 0;
        else this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFrequency(int frequency) {
        if (frequency > 100) this.frequency = 100;
        else if (frequency < 0) this.frequency = 0;
        else this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
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
        return String.format("%s frequency :%d; quantity :%d",this.toy, this.frequency, this.quantity);

    }
}
