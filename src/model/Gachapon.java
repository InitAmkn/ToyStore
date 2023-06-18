package model;

import java.util.List;
import java.util.Random;

public class Gachapon {

    private List<GachaponPlace> toysList;

    public Gachapon(List<GachaponPlace> toysList){
        this.toysList = toysList;
    }
    public void addPlace(GachaponPlace gachaponPlace) {
        this.toysList.add(gachaponPlace);
    }



    public boolean deleteToyByIndex(int id) {
        for (GachaponPlace place : toysList) {
            if (place.getToy().getId() == id) {
                toysList.remove(place);
                return true;
            }
        }
        return false;
    }
    private boolean removeTheVoid() {
        for (GachaponPlace place : this.toysList) {
            if (place.getQuantity() <= 0) {
                this.toysList.remove(place);
                return true;
            }
        }
        return false;
    }
    public Toy releaseTheWonToy() {
        if (toysList.size() < 1) return null;
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
        removeTheVoid();
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