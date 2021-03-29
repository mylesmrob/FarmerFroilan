package FarmPack;

import java.util.List;

public class ChickenCoop extends Farm {

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void store(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    private List<Chicken> chickens;
}
