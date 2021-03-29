package FarmPack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Farmer farmer = new Farmer(); //Testing Farmer class with edible object
        Edible carrot = new Edible();
        carrot.setName("corn");
        farmer.eat(carrot);

        //Establishing the Plot

        Farm farm = new Farm();

        //Field
        ArrayList<CropRow> cropRows = new ArrayList<>();
        Field fieldA = new Field();
        for(int i = 0; i < 5; i++){
            switch (i){
                case 0:
                    CropRow corn = new CropRow();
                    corn.store("corn");
                    cropRows.add(corn);
                    break;
                case 1:
                    CropRow tomato = new CropRow();
                    tomato.store("tomato");
                    cropRows.add(tomato);
                    break;
                case 2:
                    CropRow potato = new CropRow();
                    potato.store("potato");
                    cropRows.add(potato);
                    break;
                case 3:
                    CropRow pumpkin = new CropRow();
                    pumpkin.store("pumpkin");
                    cropRows.add(pumpkin);
                    break;
                case 4:
                    CropRow beets = new CropRow();
                    beets.store("beets");
                    cropRows.add(beets);
                    break;
            }
        }
        fieldA.field(cropRows);
        System.out.println("Our field has " + fieldA.getField().toString());

        //ChickenCoops
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        ArrayList<Chicken> chickens = new ArrayList<>();
        ChickenCoop coopA = new ChickenCoop();
        ChickenCoop coopB = new ChickenCoop();
        ChickenCoop coopC = new ChickenCoop();
        ChickenCoop coopD = new ChickenCoop();
        for(int i = 0; i <= 15; i++){
            Chicken chicken = new Chicken();
            chicken.setName("chicken "+i);
            chickens.add(chicken);
        }
        coopA.store(chickens.subList(0,4));
        System.out.println("Chickens in coop 1: " + coopA.getChickens().toString());
        chickenCoops.add(coopA);
        coopB.store(chickens.subList(4,8));
        System.out.println("Chickens in coop 2: " + coopB.getChickens().toString());
        chickenCoops.add(coopB);
        coopC.store(chickens.subList(8,12));
        System.out.println("Chickens in coop 3: " + coopC.getChickens().toString());
        chickenCoops.add(coopC);
        coopD.store(chickens.subList(12,15));
        System.out.println("Chickens in coop 4: " + coopD.getChickens().toString());
        chickenCoops.add(coopD);

        //Stables
        ArrayList<Stable> stables = new ArrayList<>();
        ArrayList<Horse> horses  = new ArrayList<>();
        Stable stableA = new Stable();
        Stable stableB = new Stable();
        Stable stableC = new Stable();
        for(int i = 0; i <= 9; i++){
            Horse horse = new Horse();
            horse.setName("horse "+i);
            horses.add(horse);
        }
        stableA.store(horses.subList(0,4));
        System.out.println("Horses in stable 1: " + stableA.getHorses().toString());
        stables.add(stableA);
        stableB.store(horses.subList(4,8));
        System.out.println("Horses in stable 2: " + stableB.getHorses().toString());
        stables.add(stableB);
        stableC.store(horses.subList(8,10));
        System.out.println("Horses in stable 3: " + stableC.getHorses().toString());
        stables.add(stableC);

        //Add to farm
        ArrayList<Vehicle> vehicles = new ArrayList<>(); //Create two vehicles
        Vehicle vehicleA = new Vehicle();
        vehicles.add(vehicleA);
        Vehicle vehicleB = new Vehicle();
        vehicles.add(vehicleB);

        Aircraft aircraft = new Aircraft(); //Create aircraft

        farm.store(fieldA, chickenCoops,stables, vehicles, aircraft);
        System.out.println("Farm has a " + fieldA.getClass().getSimpleName() + ", " + chickenCoops.size() + " chickenCoops, " + stables.size() + " stables, " + vehicles.size() + " vehicles, and a " + aircraft.getClass().getSimpleName());
    }
}
