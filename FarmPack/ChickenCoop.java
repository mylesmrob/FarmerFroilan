package FarmPack;

import java.util.ArrayList;

public class ChickenCoop extends Farm {

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    private ArrayList<Chicken> chickens;

    public void store(ArrayList chicken){

    }
}
