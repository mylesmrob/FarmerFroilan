package FarmPack;

public class Chicken extends Animal implements IProduce{

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void yield(Edible edible) {

    }

    @Override
    public void check(boolean hasBeenFertilized) {

    }

    @Override
    public String toString() {
        return name;
    }
}
