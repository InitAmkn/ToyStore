package model;

import java.util.LinkedList;
import java.util.Random;

public class Gachapon {

    LinkedList<GachaponPlace> gachaList;

    public Gachapon(LinkedList<GachaponPlace> gachaList) {
        this.gachaList = gachaList;
    }


    public Toy releaseTheToy() {
        if (gachaList.size() < 1) return null;
        Random r = new Random();
        int random = r.nextInt(this.gachaList.size());

        Toy winToy = null;

        while (winToy == null) {
            int sumFallingFrequency = this.gachaList.get(0).getFallingFrequency();
            for (GachaponPlace winPlace : this.gachaList) {
                if (random > sumFallingFrequency) {
                    sumFallingFrequency += winPlace.getFallingFrequency();
                }
                else {
                    winToy = winPlace.releaseTheToy();

                    if (winToy == null)
                    {
                        this.gachaList.remove(winPlace);
                        break;
                    }
                    return winToy;
                }
            }

        } return null;
    }

}