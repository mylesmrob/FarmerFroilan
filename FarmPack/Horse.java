package FarmPack;

public class Horse extends Animal implements IRideable{

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void ride() {

    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public String toString() {
        return name;
    }
}
