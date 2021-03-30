package farmerlab;

public abstract class Person implements IEater, INoiseMaker {


    public String name;


    public Person(String name){
        this.name = name;
    }


    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + "eats ");
    }

    @Override
    public void makeNoise() {
        System.out.println(getClass().getSimpleName() + " goes lol");
    }


    public abstract void eat(EdibleObject tomato);
}
