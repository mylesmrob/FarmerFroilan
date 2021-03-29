package FarmPack;

import java.util.List;

public class Stable extends Farm{
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public void store(List<Horse> horses){
        this.horses = horses;
    }
}
