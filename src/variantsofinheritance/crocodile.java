package variantsofinheritance;

public class crocodile extends Reptiles {
    private boolean hardsheleed;

    public crocodile() {
        super();
        this.hardsheleed = true;
    }

    public crocodile(int height, int weight, String animalType, String bloodType, boolean dryskin, boolean backBone, boolean softshelledegg, boolean hardsheleed) {
        super(height, weight, animalType, bloodType, dryskin, backBone, softshelledegg);
        this.hardsheleed = hardsheleed;
    }

    public boolean isHardsheleed() {
        return hardsheleed;
    }

    public void display(){
        System.out.println(this.getAnimalType()+this.getHeight());
    }
}
