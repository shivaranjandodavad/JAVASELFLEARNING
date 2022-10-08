public class ConstructerClassDemo {

    private String  doors;
    private  String engine;
    private  String driver;
    private  int speed;

    //constructer: name of the method is same as the class name and which has no return type
    //whenever we call object the constructer will be automatically called
    public ConstructerClassDemo(){
        doors="opened";
        speed=0;
        engine="off";
        driver="absent";
    }
    //parameterized constructer


    public ConstructerClassDemo(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getSpeed(){
        return speed;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }


    //adding functionality to a class
    public String run(){
        if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0){
            return "is running";
        }
        else{
            return "is not running";
        }
    }
}
