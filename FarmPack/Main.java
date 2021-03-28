package FarmPack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Farmer farmer = new Farmer(); //Testing Farmer class with edible object
        Edible carrot = new Edible();
        carrot.setName("corn");
        farmer.eat(carrot);

        //Establishing the Plot

        //Field
        ArrayList<CropRow> cropRows = new ArrayList<>();
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
        Field.field(cropRows);

        //ChickenCoops
        for(int i = 0; i < 15; i++){
            
        }

    }
}
