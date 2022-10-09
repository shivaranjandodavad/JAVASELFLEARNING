package Inheritance;

public class Car extends VehicleParent {
    private String steering;
    private String musicsystem;
    private String airconditioner;
    private String fridge;
    private String entertainmentsystem;

    public Car(String steering, String musicsystem, String airconditioner, String fridge, String entertainmentsystem) {
        super();
        this.steering = "steering";
        this.musicsystem = "musicsystem";
        this.airconditioner = "airconditioner";
        this.fridge = "fridge";
        this.entertainmentsystem = "entertainmentsystem";
    }

    public Car(String engine, int wheels, int seats, int fueltank, String lights, String steering, String musicsystem, String airconditioner, String fridge, String entertainmentsystem) {
        super(engine, wheels, seats, fueltank, lights);
        this.steering = steering;
        this.musicsystem = musicsystem;
        this.airconditioner = airconditioner;
        this.fridge = fridge;
        this.entertainmentsystem = entertainmentsystem;
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

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentsystem() {
        return entertainmentsystem;
    }
}

