package Inheritance;

public class Truck extends VehicleParent{
    private String steering;
    private String musicsystem;
    private String airconditioner;
    private int container;

    public Truck(String steering, String musicsystem, String airconditioner, int container) {
        super();
        this.steering = "steering";
        this.musicsystem = "musicsystem";
        this.airconditioner = "airconditioner";
        this.container = 10;
    }

    public Truck(String engine, int wheels, int seats, int fueltank, String lights, String steering, String musicsystem, String airconditioner, int container) {
        super(engine, wheels, seats, fueltank, lights);
        this.steering = steering;
        this.musicsystem = musicsystem;
        this.airconditioner = airconditioner;
        this.container = container;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicsystem() {
        return musicsystem;
    }

    public String getAirconditioner() {
        return airconditioner;
    }

    public int getContainer() {
        return container;
    }
}
