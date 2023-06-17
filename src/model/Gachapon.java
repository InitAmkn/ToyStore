package model;

import java.util.LinkedList;
import java.util.Random;

public class Gachapon {

    LinkedList<GachaponPlace> gachaList;

    public Gachapon(LinkedList<GachaponPlace> gachaList) {
        this.gachaList = gachaList;
    }

    public void AddGachaponPlace(GachaponPlace gachaponPlace) {
        gachaList.add(gachaponPlace);
    }

    private void removeTheVoid() {
        for (GachaponPlace place : gachaList) {
            if (place.getQuantity() == 0) {
                gachaList.remove(place);
            }
        }
    }

    public Toy releaseTheToy() {
        if (gachaList.size() < 1) return null;
        removeTheVoid();
        Toy winToy = null;
        int sumFallingFrequency = getSumFallingFrequency();

        Random r = new Random();
        int random = r.nextInt(1,sumFallingFrequency);

        System.out.println("sumFallingFrequency " + sumFallingFrequency);
        System.out.println("random " + random);

        for (int i = gachaList.size() - 1; i >= 0; i--) {
            sumFallingFrequency -= gachaList.get(i).getFallingFrequency();
            if (random > sumFallingFrequency) {
                winToy = gachaList.get(i).releaseTheToy();
                break;
            }
        }
        return winToy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (GachaponPlace winPlace : this.gachaList) {
            sb.append(winPlace);
            sb.append("\n");
        }
        return sb.toString();
    }

    public int getSumFallingFrequency() {
        int sumFallingFrequency = 0;
        for (GachaponPlace winPlace : this.gachaList) {
            sumFallingFrequency += winPlace.getFallingFrequency();
        }
        return sumFallingFrequency;
    }
}