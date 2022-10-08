public class CarCLassObjectDemo {
    public static void main(String args[]){
        //creating object
        CarClassDemo car =new CarClassDemo();
        car.setSpeed(10);
        System.out.println("Speed of the car is "+car.getSpeed()+"Km/h");
        car.setDoors("closed");
        System.out.println("Car door is "+car.getDoors());

    }

}
