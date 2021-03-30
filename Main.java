package farmerlab;

public class Main {
    public static void main(String[] args) {

     EdibleObject tomato = new EdibleObject();

     Frolian frolian = new Frolian("Frolain");
     Frolinda frolinda = new Frolinda();

     frolinda.uses();


     frolian.dismount();
     frolian.mount();

     frolian.makeNoise();
     frolian.plantsCrop();

     frolian.eat(tomato);












    }
}
