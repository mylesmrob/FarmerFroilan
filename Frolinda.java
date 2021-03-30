package farmerlab;

public class Frolinda implements IPilot {

    @Override
    public void uses() {
        System.out.println(getClass().getSimpleName() + " uses cropduster to water crops");
    }
    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + "eats ");
    }

}
