package FarmPack;

import java.util.ArrayList;

public class Farm {
    private Field field;
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<Stable> stables;
    private ArrayList<Vehicle> vehicles;
    private Aircraft aircraft;

    public void store(Field field, ArrayList<ChickenCoop> chickenCoops, ArrayList<Stable> stables, ArrayList<Vehicle> vehicles, Aircraft aircraft){
        this.field = field;
        this.chickenCoops = chickenCoops;
        this.stables = stables;
        this.vehicles = vehicles;
        this.aircraft = aircraft;
    }
}
