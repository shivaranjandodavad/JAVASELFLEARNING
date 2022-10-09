package variantsofinheritance;

public class Reptiles extends Animal{
private  boolean dryskin;
private boolean backBone;
private boolean softshelledegg;

    public Reptiles() {
        super();
        this.dryskin = true;
        this.backBone = true;
        this.softshelledegg = true;
    }

    public Reptiles(int height, int weight, String animalType, String bloodType, boolean dryskin, boolean backBone, boolean softshelledegg) {
        super(height, weight, animalType, bloodType);
        this.dryskin = dryskin;
        this.backBone = backBone;
        this.softshelledegg = softshelledegg;
    }

    public boolean isDryskin() {
        return dryskin;
    }

    public boolean isBackBone() {
        return backBone;
    }

    public boolean isSoftshelledegg() {
        return softshelledegg;
    }
}
