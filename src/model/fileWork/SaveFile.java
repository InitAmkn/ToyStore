package model.fileWork;

import model.Gachapon;
import model.Toy;

public interface SaveFile {

    void saveWonToys(Toy wonToy);

    void allToys(Gachapon gachapon);
}
