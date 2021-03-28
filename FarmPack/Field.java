package FarmPack;

import java.util.ArrayList;

public class Field extends Farm {

    public static void field(ArrayList<CropRow> cropRow){
        for(CropRow c : cropRow){
            System.out.print(c.toString() + "\n");
        }
    }
}
