package FarmPack;

public class CropRow extends Farm{
    private String crop;

    public void store(String crop){
        this.crop = crop;
    }

    @Override
    public String toString() {
        return crop;
    }
}
