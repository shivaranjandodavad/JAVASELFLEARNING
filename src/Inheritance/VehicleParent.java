package Inheritance;

public class VehicleParent {
    private String engine;
    private int wheels;
    private int seats;
    private int fueltank;
    private String lights;

    public VehicleParent() {
        this.engine = "petrol";
        this.wheels = 4;
        this.seats = 4;
        this.fueltank = 35;
        this.lights = "LED";

    }

    public VehicleParent(String engine, int wheels, int seats, int fueltank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fueltank = fueltank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFueltank() {
        return fueltank;
    }

    public String getLights() {
        return lights;
    }

    public void running(){
        System.out.println("vehicle running");
    }
}
