package FarmPack;

public class Farmer extends Person implements IRider, IBotanist{
    @Override
    public void plantCrop(CropRow cropRow) {

    }

    @Override
    public void eat(Edible edible) {
        System.out.println(getClass().getSimpleName() + " is eating a " + edible.getName());
    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }

    @Override
    public void makeNoise() {

    }
}
