package farmerlab;

public class Farmer extends Person implements IBotanist, INoiseMaker, IEater, IRider {


    public Farmer(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getClass().getSimpleName() + " goes getty up getty up");
    }

    @Override
    public void mount() {
        System.out.println(getClass().getSimpleName() + " gets on");
    }

    @Override
    public void dismount() {
        System.out.println(getClass().getSimpleName() + " gets off");
    }


    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " eats edible object");
    }


    @Override
    public void plantsCrop() {
        System.out.println(getClass().getSimpleName() + " plants a crop");
    }

}
