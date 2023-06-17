package model;

import java.util.List;
import java.util.Random;

public class Gachapon {

    private final List<GachaponPlace> toysList;

    public Gachapon(List<GachaponPlace> gachaList) {
        this.toysList = gachaList;
    }

    public void addPlace(GachaponPlace gachaponPlace) {
        toysList.add(gachaponPlace);
    }

    private void removeTheVoid() {
        for (GachaponPlace place : toysList) {
            if (place.getQuantity() == 0) {
                toysList.remove(place);
            }
        }
    }

    public Toy releaseTheWonToy() {
        if (toysList.size() < 1) return null;
        removeTheVoid();
        Toy winToy = null;
        int sumFallingFrequency = getSumFrequency();
        Random r = new Random();
        int random = r.nextInt(1, sumFallingFrequency);
        for (int i = toysList.size() - 1; i >= 0; i--) {
            sumFallingFrequency -= toysList.get(i).getFrequency();
            if (random > sumFallingFrequency) {
                winToy = toysList.get(i).releaseTheToy();
                break;
            }
        }
        return winToy;
    }

    public int getSumFrequency() {
        int sumFrequency = 0;
        for (GachaponPlace winPlace : this.toysList) {
            sumFrequency += winPlace.getFrequency();
        }
        return sumFrequency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (GachaponPlace winPlace : this.toysList) {
            sb.append(winPlace);
            sb.append("\n");
        }
        return sb.toString();
    }

}