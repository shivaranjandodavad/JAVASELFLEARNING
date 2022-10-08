public class AddingFunctionalityDemo {
    public static void main(String args[]){
        CarClassDemo car=new CarClassDemo();
        car.setDoors("closed");
        car.setDriver("seated");
        car.setEngine("on");
        car.setSpeed(10);
        System.out.println("Car is "+car.run()+"....");
        System.out.println("********************************");
        CarClassDemo car2=new CarClassDemo();
        car2.setDoors("open");
        car2.setDriver("seated");
        car2.setEngine("on");
        car2.setSpeed(10);
        System.out.println("Car2 is "+car2.run()+"....");
    }
}
