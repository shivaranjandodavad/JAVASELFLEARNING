package Inheritance;

public class Bike extends VehicleParent {

    private String handle;

    public Bike() {
        super();
        this.handle="short";
    }

    public Bike(String handle,String engine, int wheels, int seats, int fueltank, String lights) {
        super(engine,wheels,seats,fueltank,lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike[getHandle()="+getHandle()+",getEngine="+getEngine()+"]";
    }
    public void running(){
        System.out.println("vehicle running");
        System.out.println(toString());

    }
}
